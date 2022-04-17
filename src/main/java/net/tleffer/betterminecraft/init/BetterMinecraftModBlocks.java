
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tleffer.betterminecraft.init;

import net.tleffer.betterminecraft.block.MythicalAlunitLandsPortalBlock;
import net.tleffer.betterminecraft.block.MysteriousNetherBlockBlock;
import net.tleffer.betterminecraft.block.AlunitZombieBossBlockBlock;
import net.tleffer.betterminecraft.block.AlunitOreBlock;
import net.tleffer.betterminecraft.block.AlunitOakLogBlock;
import net.tleffer.betterminecraft.block.AlunitEnrichedStoneBlock;
import net.tleffer.betterminecraft.block.AlunitDungeonBlockBlock;
import net.tleffer.betterminecraft.block.AlunitBlockBlock;
import net.tleffer.betterminecraft.block.AlunitAltarBlock;
import net.tleffer.betterminecraft.block.ActiniumOreBlock;
import net.tleffer.betterminecraft.block.ActiniumBlockBlock;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterMinecraftModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MYSTERIOUS_NETHER_BLOCK = register(new MysteriousNetherBlockBlock());
	public static final Block ALUNIT_ORE = register(new AlunitOreBlock());
	public static final Block ALUNIT_BLOCK = register(new AlunitBlockBlock());
	public static final Block ALUNIT_ENRICHED_STONE = register(new AlunitEnrichedStoneBlock());
	public static final Block ALUNIT_OAK_LOG = register(new AlunitOakLogBlock());
	public static final Block MYTHICAL_ALUNIT_LANDS_PORTAL = register(new MythicalAlunitLandsPortalBlock());
	public static final Block ALUNIT_ZOMBIE_BOSS_BLOCK = register(new AlunitZombieBossBlockBlock());
	public static final Block ALUNIT_ALTAR = register(new AlunitAltarBlock());
	public static final Block ALUNIT_DUNGEON_BLOCK = register(new AlunitDungeonBlockBlock());
	public static final Block ACTINIUM_ORE = register(new ActiniumOreBlock());
	public static final Block ACTINIUM_BLOCK = register(new ActiniumBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AlunitAltarBlock.registerRenderLayer();
		}
	}
}
