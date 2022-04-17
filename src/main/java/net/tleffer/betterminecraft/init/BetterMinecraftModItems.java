
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tleffer.betterminecraft.init;

import net.tleffer.betterminecraft.item.ReinforcedAlunitPickaxeItem;
import net.tleffer.betterminecraft.item.RawActiniumItem;
import net.tleffer.betterminecraft.item.MythicalAlunitLandsItem;
import net.tleffer.betterminecraft.item.MysteriousBrewingItemItem;
import net.tleffer.betterminecraft.item.InvisibleItem;
import net.tleffer.betterminecraft.item.InvisProjectileItem;
import net.tleffer.betterminecraft.item.ImpureActiniumIngotItem;
import net.tleffer.betterminecraft.item.AlunitSwordItem;
import net.tleffer.betterminecraft.item.AlunitSledgehammerItem;
import net.tleffer.betterminecraft.item.AlunitScytheItem;
import net.tleffer.betterminecraft.item.AlunitPickaxeItem;
import net.tleffer.betterminecraft.item.AlunitKeyItem;
import net.tleffer.betterminecraft.item.AlunitItem;
import net.tleffer.betterminecraft.item.AlunitIngotItem;
import net.tleffer.betterminecraft.item.AlunitBulletItem;
import net.tleffer.betterminecraft.item.AlunitAxeItem;
import net.tleffer.betterminecraft.item.AlunitArmorItem;
import net.tleffer.betterminecraft.item.ActiniumSwordItem;
import net.tleffer.betterminecraft.item.ActiniumShortbowItem;
import net.tleffer.betterminecraft.item.ActiniumPickaxeItem;
import net.tleffer.betterminecraft.item.ActiniumPearlItem;
import net.tleffer.betterminecraft.item.ActiniumItem;
import net.tleffer.betterminecraft.item.ActiniumBossRangedItemItem;
import net.tleffer.betterminecraft.item.ActiniumAxeItem;
import net.tleffer.betterminecraft.item.ActiniumArrowItem;
import net.tleffer.betterminecraft.item.ActiniumArmorItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterMinecraftModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MYSTERIOUS_NETHER_BLOCK = register(BetterMinecraftModBlocks.MYSTERIOUS_NETHER_BLOCK, null);
	public static final Item ALUNIT = register(new AlunitItem());
	public static final Item ALUNIT_ORE = register(BetterMinecraftModBlocks.ALUNIT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ALUNIT_BLOCK = register(BetterMinecraftModBlocks.ALUNIT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ALUNIT_SWORD = register(new AlunitSwordItem());
	public static final Item ALUNIT_SCYTHE = register(new AlunitScytheItem());
	public static final Item INVISIBLE = register(new InvisibleItem());
	public static final Item ALUNIT_BULLET = register(new AlunitBulletItem());
	public static final Item ALUNIT_INGOT = register(new AlunitIngotItem());
	public static final Item ALUNIT_ARMOR_HELMET = register(new AlunitArmorItem.Helmet());
	public static final Item ALUNIT_ARMOR_CHESTPLATE = register(new AlunitArmorItem.Chestplate());
	public static final Item ALUNIT_ARMOR_LEGGINGS = register(new AlunitArmorItem.Leggings());
	public static final Item ALUNIT_ARMOR_BOOTS = register(new AlunitArmorItem.Boots());
	public static final Item ALUNIT_PICKAXE = register(new AlunitPickaxeItem());
	public static final Item ALUNIT_AXE = register(new AlunitAxeItem());
	public static final Item ALUNIT_ENRICHED_STONE = register(BetterMinecraftModBlocks.ALUNIT_ENRICHED_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ALUNIT_OAK_LOG = register(BetterMinecraftModBlocks.ALUNIT_OAK_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MYTHICAL_ALUNIT_LANDS = register(new MythicalAlunitLandsItem());
	public static final Item ALUNIT_ZOMBIE = register(
			new SpawnEggItem(BetterMinecraftModEntities.ALUNIT_ZOMBIE, -65536, -15070966, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("alunit_zombie_spawn_egg"));
	public static final Item ALUNIT_KEY = register(new AlunitKeyItem());
	public static final Item INVIS_PROJECTILE = register(new InvisProjectileItem());
	public static final Item ALUNIT_ZOMBIE_BOSS_BLOCK = register(BetterMinecraftModBlocks.ALUNIT_ZOMBIE_BOSS_BLOCK, null);
	public static final Item ALUNIT_ALTAR = register(BetterMinecraftModBlocks.ALUNIT_ALTAR, CreativeModeTab.TAB_MISC);
	public static final Item ALUNIT_DUNGEON_BLOCK = register(BetterMinecraftModBlocks.ALUNIT_DUNGEON_BLOCK, null);
	public static final Item ACTINIUM = register(new ActiniumItem());
	public static final Item MYSTERIOUS_BREWING_ITEM = register(new MysteriousBrewingItemItem());
	public static final Item ACTINIUM_ORE = register(BetterMinecraftModBlocks.ACTINIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item RAW_ACTINIUM = register(new RawActiniumItem());
	public static final Item ACTINIUM_PICKAXE = register(new ActiniumPickaxeItem());
	public static final Item ACTINIUM_BLOCK = register(BetterMinecraftModBlocks.ACTINIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ACTINIUM_ARROW = register(new ActiniumArrowItem());
	public static final Item ACTINIUM_SHORTBOW = register(new ActiniumShortbowItem());
	public static final Item IMPURE_ACTINIUM_INGOT = register(new ImpureActiniumIngotItem());
	public static final Item ALUNIT_SLEDGEHAMMER = register(new AlunitSledgehammerItem());
	public static final Item ACTINIUM_SWORD = register(new ActiniumSwordItem());
	public static final Item ACTINIUM_ARMOR_HELMET = register(new ActiniumArmorItem.Helmet());
	public static final Item ACTINIUM_ARMOR_CHESTPLATE = register(new ActiniumArmorItem.Chestplate());
	public static final Item ACTINIUM_ARMOR_LEGGINGS = register(new ActiniumArmorItem.Leggings());
	public static final Item ACTINIUM_ARMOR_BOOTS = register(new ActiniumArmorItem.Boots());
	public static final Item ACTINIUM_AXE = register(new ActiniumAxeItem());
	public static final Item REINFORCED_ALUNIT_PICKAXE = register(new ReinforcedAlunitPickaxeItem());
	public static final Item ACTINIUM_BOSS = register(
			new SpawnEggItem(BetterMinecraftModEntities.ACTINIUM_BOSS, -16750849, -6710785, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("actinium_boss_spawn_egg"));
	public static final Item ACTINIUM_BOSS_RANGED_ITEM = register(new ActiniumBossRangedItemItem());
	public static final Item ACTINIUM_PEARL = register(new ActiniumPearlItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
