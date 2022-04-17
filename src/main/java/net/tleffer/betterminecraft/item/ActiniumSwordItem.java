
package net.tleffer.betterminecraft.item;

import net.tleffer.betterminecraft.init.BetterMinecraftModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ActiniumSwordItem extends SwordItem {
	public ActiniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3126;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetterMinecraftModItems.ACTINIUM));
			}
		}, 3, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("actinium_sword");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7c16 base Damage"));
		list.add(new TextComponent("\u00A7enormal Range"));
	}
}
