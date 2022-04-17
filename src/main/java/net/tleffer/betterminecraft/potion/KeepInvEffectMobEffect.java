
package net.tleffer.betterminecraft.potion;

import net.tleffer.betterminecraft.procedures.KeepInvEffectEffectStartedappliedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class KeepInvEffectMobEffect extends MobEffect {
	public KeepInvEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16751104);
		setRegistryName("keep_inv_effect");
	}

	@Override
	public String getDescriptionId() {
		return "effect.better_minecraft.keep_inv_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		KeepInvEffectEffectStartedappliedProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
