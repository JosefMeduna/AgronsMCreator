
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.kapusta.agrons.world.inventory.Pcos1Menu;
import net.kapusta.agrons.world.inventory.ModExploreMenu;
import net.kapusta.agrons.world.inventory.MinepediaexploreMenu;
import net.kapusta.agrons.world.inventory.MinenetExploreMenu;
import net.kapusta.agrons.world.inventory.CalcMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AgronsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<MinenetExploreMenu> MINENET_EXPLORE = register("minenet_explore",
			(id, inv, extraData) -> new MinenetExploreMenu(id, inv, extraData));
	public static final MenuType<Pcos1Menu> PCOS_1 = register("pcos_1", (id, inv, extraData) -> new Pcos1Menu(id, inv, extraData));
	public static final MenuType<MinepediaexploreMenu> MINEPEDIAEXPLORE = register("minepediaexplore",
			(id, inv, extraData) -> new MinepediaexploreMenu(id, inv, extraData));
	public static final MenuType<ModExploreMenu> MOD_EXPLORE = register("mod_explore",
			(id, inv, extraData) -> new ModExploreMenu(id, inv, extraData));
	public static final MenuType<CalcMenu> CALC = register("calc", (id, inv, extraData) -> new CalcMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
