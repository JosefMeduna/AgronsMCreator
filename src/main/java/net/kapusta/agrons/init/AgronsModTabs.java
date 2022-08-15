
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AgronsModTabs {
	public static CreativeModeTab TAB_AGRONS;
	public static CreativeModeTab TAB_AGRONS_GUNS;

	public static void load() {
		TAB_AGRONS = new CreativeModeTab("tabagrons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AgronsModBlocks.METALBLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AGRONS_GUNS = new CreativeModeTab("tabagrons_guns") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AgronsModBlocks.TRASH.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
