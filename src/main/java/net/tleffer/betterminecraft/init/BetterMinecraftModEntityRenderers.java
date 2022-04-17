
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tleffer.betterminecraft.init;

import net.tleffer.betterminecraft.client.renderer.TrueAlunitMasterRenderer;
import net.tleffer.betterminecraft.client.renderer.AlunitZombieRenderer;
import net.tleffer.betterminecraft.client.renderer.ActiniumBossRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterMinecraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BetterMinecraftModEntities.ALUNIT_SCYTHE, ThrownItemRenderer::new);
		event.registerEntityRenderer(BetterMinecraftModEntities.INVISIBLE, ThrownItemRenderer::new);
		event.registerEntityRenderer(BetterMinecraftModEntities.ALUNIT_ZOMBIE, AlunitZombieRenderer::new);
		event.registerEntityRenderer(BetterMinecraftModEntities.INVIS_PROJECTILE, ThrownItemRenderer::new);
		event.registerEntityRenderer(BetterMinecraftModEntities.TRUE_ALUNIT_MASTER, TrueAlunitMasterRenderer::new);
		event.registerEntityRenderer(BetterMinecraftModEntities.ACTINIUM_SHORTBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(BetterMinecraftModEntities.ACTINIUM_BOSS, ActiniumBossRenderer::new);
		event.registerEntityRenderer(BetterMinecraftModEntities.ACTINIUM_BOSS_RANGED_ITEM, ThrownItemRenderer::new);
	}
}
