
package net.tleffer.betterminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class AlunitItem extends Item {
	public AlunitItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("alunit");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
