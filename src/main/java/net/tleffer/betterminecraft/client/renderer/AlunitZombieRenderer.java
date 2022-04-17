package net.tleffer.betterminecraft.client.renderer;

import net.tleffer.betterminecraft.entity.AlunitZombieEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class AlunitZombieRenderer extends HumanoidMobRenderer<AlunitZombieEntity, HumanoidModel<AlunitZombieEntity>> {
	public AlunitZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(AlunitZombieEntity entity) {
		return new ResourceLocation("better_minecraft:textures/alunit_zombiev2.png");
	}
}
