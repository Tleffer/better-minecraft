
package net.tleffer.betterminecraft.item;

import net.tleffer.betterminecraft.init.BetterMinecraftModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class ActiniumAxeItem extends AxeItem {
	public ActiniumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3126;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 19f;
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
		}, 1, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("actinium_axe");
	}
}
