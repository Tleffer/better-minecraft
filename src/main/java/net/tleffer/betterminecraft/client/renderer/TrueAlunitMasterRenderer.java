package net.tleffer.betterminecraft.client.renderer;

import net.tleffer.betterminecraft.entity.TrueAlunitMasterEntity;
import net.tleffer.betterminecraft.client.model.Modelirongolem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TrueAlunitMasterRenderer extends MobRenderer<TrueAlunitMasterEntity, Modelirongolem<TrueAlunitMasterEntity>> {
	public TrueAlunitMasterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem(context.bakeLayer(Modelirongolem.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrueAlunitMasterEntity entity) {
		return new ResourceLocation("better_minecraft:textures/alunit_golem.png");
	}
}
