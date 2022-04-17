
package net.tleffer.betterminecraft.item;

import net.tleffer.betterminecraft.init.BetterMinecraftModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ActiniumPickaxeItem extends PickaxeItem {
	public ActiniumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3126;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetterMinecraftModItems.ACTINIUM));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("actinium_pickaxe");
	}
}
