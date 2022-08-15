
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.kapusta.agrons.item.PifPufLaserItem;
import net.kapusta.agrons.item.LaserGunItem;
import net.kapusta.agrons.AgronsMod;

public class AgronsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AgronsMod.MODID);
	public static final RegistryObject<Item> TRASH = block(AgronsModBlocks.TRASH, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TETSTBLOCKDA = block(AgronsModBlocks.TETSTBLOCKDA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COMPUTER = block(AgronsModBlocks.COMPUTER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> METALBLOCK = block(AgronsModBlocks.METALBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TRASHBLOCK = block(AgronsModBlocks.TRASHBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LASER_GUN = REGISTRY.register("laser_gun", () -> new LaserGunItem());
	public static final RegistryObject<Item> PIF_PUF_LASER = REGISTRY.register("pif_puf_laser", () -> new PifPufLaserItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
