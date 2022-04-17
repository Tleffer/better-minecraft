package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.entity.InvisProjectileEntity;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;

public class InvisibleProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 12, 12, 12),
				e -> true).isEmpty()) {
			if (5 == EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS,
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))) {
				if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
					InvisProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 200, (float) 0.04, 0);
				}
			} else {
				if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
					InvisProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 200, (float) 0.025, 0);
				}
			}
		} else {
			entity.setDeltaMovement(0, 0, 0);
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A7cX"), (true));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent(" "), (true));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		}
	}
}
