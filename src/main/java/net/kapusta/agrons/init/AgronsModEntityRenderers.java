
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.kapusta.agrons.client.renderer.RoboPraseRenderer;
import net.kapusta.agrons.client.renderer.RoboKohoutRenderer;
import net.kapusta.agrons.client.renderer.RoboFarmarRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AgronsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AgronsModEntities.LASER_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AgronsModEntities.ROBO_KOHOUT.get(), RoboKohoutRenderer::new);
		event.registerEntityRenderer(AgronsModEntities.ROBO_FARMAR.get(), RoboFarmarRenderer::new);
		event.registerEntityRenderer(AgronsModEntities.ROBO_PRASE.get(), RoboPraseRenderer::new);
	}
}
