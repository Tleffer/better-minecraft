package net.tleffer.betterminecraft.procedures;

import net.tleffer.betterminecraft.entity.InvisibleEntity;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.Random;

public class RangedAlunitSwordSwingItemProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double diestance = 0;
		Entity projectile = null;
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			InvisibleEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 200, -2, 0);
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
