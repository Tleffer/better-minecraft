
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tleffer.betterminecraft.init;

import net.tleffer.betterminecraft.entity.TrueAlunitMasterEntity;
import net.tleffer.betterminecraft.entity.InvisibleEntity;
import net.tleffer.betterminecraft.entity.InvisProjectileEntity;
import net.tleffer.betterminecraft.entity.AlunitZombieEntity;
import net.tleffer.betterminecraft.entity.AlunitScytheEntity;
import net.tleffer.betterminecraft.entity.ActiniumShortbowEntity;
import net.tleffer.betterminecraft.entity.ActiniumBossRangedItemEntity;
import net.tleffer.betterminecraft.entity.ActiniumBossEntity;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterMinecraftModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<AlunitScytheEntity> ALUNIT_SCYTHE = register("projectile_alunit_scythe",
			EntityType.Builder.<AlunitScytheEntity>of(AlunitScytheEntity::new, MobCategory.MISC).setCustomClientFactory(AlunitScytheEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<InvisibleEntity> INVISIBLE = register("projectile_invisible",
			EntityType.Builder.<InvisibleEntity>of(InvisibleEntity::new, MobCategory.MISC).setCustomClientFactory(InvisibleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AlunitZombieEntity> ALUNIT_ZOMBIE = register("alunit_zombie",
			EntityType.Builder.<AlunitZombieEntity>of(AlunitZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlunitZombieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<InvisProjectileEntity> INVIS_PROJECTILE = register("projectile_invis_projectile",
			EntityType.Builder.<InvisProjectileEntity>of(InvisProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(InvisProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TrueAlunitMasterEntity> TRUE_ALUNIT_MASTER = register("true_alunit_master",
			EntityType.Builder.<TrueAlunitMasterEntity>of(TrueAlunitMasterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrueAlunitMasterEntity::new).fireImmune().sized(1.5f, 2f));
	public static final EntityType<ActiniumShortbowEntity> ACTINIUM_SHORTBOW = register("projectile_actinium_shortbow",
			EntityType.Builder.<ActiniumShortbowEntity>of(ActiniumShortbowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ActiniumShortbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ActiniumBossEntity> ACTINIUM_BOSS = register("actinium_boss",
			EntityType.Builder.<ActiniumBossEntity>of(ActiniumBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ActiniumBossEntity::new).fireImmune().sized(3f, 5f));
	public static final EntityType<ActiniumBossRangedItemEntity> ACTINIUM_BOSS_RANGED_ITEM = register("projectile_actinium_boss_ranged_item",
			EntityType.Builder.<ActiniumBossRangedItemEntity>of(ActiniumBossRangedItemEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ActiniumBossRangedItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AlunitZombieEntity.init();
			TrueAlunitMasterEntity.init();
			ActiniumBossEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ALUNIT_ZOMBIE, AlunitZombieEntity.createAttributes().build());
		event.put(TRUE_ALUNIT_MASTER, TrueAlunitMasterEntity.createAttributes().build());
		event.put(ACTINIUM_BOSS, ActiniumBossEntity.createAttributes().build());
	}
}
