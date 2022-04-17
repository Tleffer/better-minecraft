
package net.tleffer.betterminecraft.entity;

import net.tleffer.betterminecraft.procedures.ActiniumBossRangedItemProjectileHitsBlockProcedure;
import net.tleffer.betterminecraft.init.BetterMinecraftModEntities;
import net.tleffer.betterminecraft.init.BetterMinecraftModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ActiniumBossRangedItemEntity extends AbstractArrow implements ItemSupplier {
	public ActiniumBossRangedItemEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(BetterMinecraftModEntities.ACTINIUM_BOSS_RANGED_ITEM, world);
	}

	public ActiniumBossRangedItemEntity(EntityType<? extends ActiniumBossRangedItemEntity> type, Level world) {
		super(type, world);
	}

	public ActiniumBossRangedItemEntity(EntityType<? extends ActiniumBossRangedItemEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ActiniumBossRangedItemEntity(EntityType<? extends ActiniumBossRangedItemEntity> type, LivingEntity entity, Level world) {
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
		return null;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		Entity sourceentity = this.getOwner();
		Entity imediatesourceentity = this;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;

		ActiniumBossRangedItemProjectileHitsBlockProcedure.execute(world, x, y, z);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		Entity entity = entityHitResult.getEntity();
		Entity sourceentity = this.getOwner();
		Entity imediatesourceentity = this;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;

		ActiniumBossRangedItemProjectileHitsBlockProcedure.execute(world, x, y, z);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		double x = blockHitResult.getBlockPos().getX();
		double y = blockHitResult.getBlockPos().getY();
		double z = blockHitResult.getBlockPos().getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity imediatesourceentity = this;

		ActiniumBossRangedItemProjectileHitsBlockProcedure.execute(world, x, y, z);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static ActiniumBossRangedItemEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ActiniumBossRangedItemEntity entityarrow = new ActiniumBossRangedItemEntity(BetterMinecraftModEntities.ACTINIUM_BOSS_RANGED_ITEM, entity,
				world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static ActiniumBossRangedItemEntity shoot(LivingEntity entity, LivingEntity target) {
		ActiniumBossRangedItemEntity entityarrow = new ActiniumBossRangedItemEntity(BetterMinecraftModEntities.ACTINIUM_BOSS_RANGED_ITEM, entity,
				entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(10);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
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
