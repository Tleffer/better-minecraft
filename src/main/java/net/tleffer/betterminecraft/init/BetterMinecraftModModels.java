
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tleffer.betterminecraft.init;

import net.tleffer.betterminecraft.client.model.Modelvex;
import net.tleffer.betterminecraft.client.model.Modelirongolem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BetterMinecraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelirongolem.LAYER_LOCATION, Modelirongolem::createBodyLayer);
		event.registerLayerDefinition(Modelvex.LAYER_LOCATION, Modelvex::createBodyLayer);
	}
}
