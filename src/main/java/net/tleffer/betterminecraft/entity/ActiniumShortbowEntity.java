
package net.tleffer.betterminecraft.entity;

import net.tleffer.betterminecraft.init.BetterMinecraftModItems;
import net.tleffer.betterminecraft.init.BetterMinecraftModEntities;
import net.tleffer.betterminecraft.init.BetterMinecraftModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ActiniumShortbowEntity extends AbstractArrow implements ItemSupplier {
	public ActiniumShortbowEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(BetterMinecraftModEntities.ACTINIUM_SHORTBOW, world);
	}

	public ActiniumShortbowEntity(EntityType<? extends ActiniumShortbowEntity> type, Level world) {
		super(type, world);
	}

	public ActiniumShortbowEntity(EntityType<? extends ActiniumShortbowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ActiniumShortbowEntity(EntityType<? extends ActiniumShortbowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(BetterMinecraftModBlocks.ACTINIUM_BLOCK);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(BetterMinecraftModItems.ACTINIUM_ARROW);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static ActiniumShortbowEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ActiniumShortbowEntity entityarrow = new ActiniumShortbowEntity(BetterMinecraftModEntities.ACTINIUM_SHORTBOW, entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static ActiniumShortbowEntity shoot(LivingEntity entity, LivingEntity target) {
		ActiniumShortbowEntity entityarrow = new ActiniumShortbowEntity(BetterMinecraftModEntities.ACTINIUM_SHORTBOW, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z,
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
