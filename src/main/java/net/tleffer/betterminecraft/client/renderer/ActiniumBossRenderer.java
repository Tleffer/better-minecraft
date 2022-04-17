package net.tleffer.betterminecraft.client.renderer;

import net.tleffer.betterminecraft.entity.ActiniumBossEntity;
import net.tleffer.betterminecraft.client.model.Modelvex;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ActiniumBossRenderer extends MobRenderer<ActiniumBossEntity, Modelvex<ActiniumBossEntity>> {
	public ActiniumBossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvex(context.bakeLayer(Modelvex.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ActiniumBossEntity entity) {
		return new ResourceLocation("better_minecraft:textures/actinium_boss_new.png");
	}
}
