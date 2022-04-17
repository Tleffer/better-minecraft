package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.init.BetterMinecraftModMobEffects;
import net.tleffer.betterminecraft.init.BetterMinecraftModItems;
import net.tleffer.betterminecraft.init.BetterMinecraftModBlocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BetterMinecraftModMobEffects.KEEP_INV_EFFECT) : false) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set((true), _level.getServer());
		} else {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set((false), _level.getServer());
		}
		if (!((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_HELMET))
				: false)
				&& ((entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_CHESTPLATE))
						: false)
						|| (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ELYTRA_CHESTPLATE))
								: false))
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_LEGGINGS))
						: false)
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_BOOTS))
						: false))) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 0));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModBlocks.ACTINIUM_ORE))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.RAW_ACTINIUM))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_PICKAXE))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModBlocks.ACTINIUM_BLOCK))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARROW))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_SHORTBOW))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.IMPURE_ACTINIUM_INGOT))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_SWORD))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_AXE))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_HELMET))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_CHESTPLATE))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_LEGGINGS))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(BetterMinecraftModItems.ACTINIUM_ARMOR_BOOTS))
					: false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BetterMinecraftModMobEffects.RADIATION, 25, 1));
			}
		}
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (BetterMinecraftModItems.ACTINIUM_ELYTRA_CHESTPLATE == (entity instanceof LivingEntity _entGetArmor
						? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
						: ItemStack.EMPTY).getItem());
				_player.onUpdateAbilities();
			}
		}
	}
}
