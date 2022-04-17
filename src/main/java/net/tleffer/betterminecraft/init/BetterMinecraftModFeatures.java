
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tleffer.betterminecraft.init;

import net.tleffer.betterminecraft.world.features.ores.AlunitOreFeature;
import net.tleffer.betterminecraft.world.features.ores.AlunitBlockFeature;
import net.tleffer.betterminecraft.world.features.ores.ActiniumOreFeature;
import net.tleffer.betterminecraft.world.features.AlunitZombieBossAirFeature;
import net.tleffer.betterminecraft.world.features.AlunitDungeonAirFeature;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterMinecraftModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(AlunitOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AlunitOreFeature.GENERATE_BIOMES,
				AlunitOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlunitBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AlunitBlockFeature.GENERATE_BIOMES, AlunitBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlunitZombieBossAirFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AlunitZombieBossAirFeature.GENERATE_BIOMES, AlunitZombieBossAirFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlunitDungeonAirFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				AlunitDungeonAirFeature.GENERATE_BIOMES, AlunitDungeonAirFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ActiniumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ActiniumOreFeature.GENERATE_BIOMES, ActiniumOreFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
