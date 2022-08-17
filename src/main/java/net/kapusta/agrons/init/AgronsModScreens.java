
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.kapusta.agrons.client.gui.TecnoeeggexploreScreen;
import net.kapusta.agrons.client.gui.Pcos1Screen;
import net.kapusta.agrons.client.gui.ModExploreScreen;
import net.kapusta.agrons.client.gui.MinepediaexploreScreen;
import net.kapusta.agrons.client.gui.MinenetExploreScreen;
import net.kapusta.agrons.client.gui.CalcScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AgronsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AgronsModMenus.MINENET_EXPLORE, MinenetExploreScreen::new);
			MenuScreens.register(AgronsModMenus.PCOS_1, Pcos1Screen::new);
			MenuScreens.register(AgronsModMenus.MINEPEDIAEXPLORE, MinepediaexploreScreen::new);
			MenuScreens.register(AgronsModMenus.MOD_EXPLORE, ModExploreScreen::new);
			MenuScreens.register(AgronsModMenus.CALC, CalcScreen::new);
			MenuScreens.register(AgronsModMenus.TECNOEEGGEXPLORE, TecnoeeggexploreScreen::new);
		});
	}
}
