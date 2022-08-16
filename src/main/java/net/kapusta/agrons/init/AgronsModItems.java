
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.kapusta.agrons.item.TrashitemItem;
import net.kapusta.agrons.item.PifPufLaserItem;
import net.kapusta.agrons.item.OzubeneKoloItem;
import net.kapusta.agrons.item.MetalingotItem;
import net.kapusta.agrons.item.LaserGunItem;
import net.kapusta.agrons.item.JetPackItem;
import net.kapusta.agrons.AgronsMod;

public class AgronsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AgronsMod.MODID);
	public static final RegistryObject<Item> TRASH = block(AgronsModBlocks.TRASH, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TETSTBLOCKDA = block(AgronsModBlocks.TETSTBLOCKDA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COMPUTER = block(AgronsModBlocks.COMPUTER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> METALBLOCK = block(AgronsModBlocks.METALBLOCK, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> TRASHBLOCK = block(AgronsModBlocks.TRASHBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LASER_GUN = REGISTRY.register("laser_gun", () -> new LaserGunItem());
	public static final RegistryObject<Item> TRASHITEM = REGISTRY.register("trashitem", () -> new TrashitemItem());
	public static final RegistryObject<Item> PIF_PUF_LASER = REGISTRY.register("pif_puf_laser", () -> new PifPufLaserItem());
	public static final RegistryObject<Item> ROBO_KOHOUT = REGISTRY.register("robo_kohout_spawn_egg",
			() -> new ForgeSpawnEggItem(AgronsModEntities.ROBO_KOHOUT, -16777216, -1, new Item.Properties().tab(AgronsModTabs.TAB_AGRONS)));
	public static final RegistryObject<Item> OZUBENE_KOLO = REGISTRY.register("ozubene_kolo", () -> new OzubeneKoloItem());
	public static final RegistryObject<Item> ROBO_FARMAR = REGISTRY.register("robo_farmar_spawn_egg",
			() -> new ForgeSpawnEggItem(AgronsModEntities.ROBO_FARMAR, -12303292, -5287680, new Item.Properties().tab(AgronsModTabs.TAB_AGRONS)));
	public static final RegistryObject<Item> ROBO_PRASE = REGISTRY.register("robo_prase_spawn_egg",
			() -> new ForgeSpawnEggItem(AgronsModEntities.ROBO_PRASE, -12040120, -65310, new Item.Properties().tab(AgronsModTabs.TAB_AGRONS)));
	public static final RegistryObject<Item> METALINGOT = REGISTRY.register("metalingot", () -> new MetalingotItem());
	public static final RegistryObject<Item> JET_PACK_CHESTPLATE = REGISTRY.register("jet_pack_chestplate", () -> new JetPackItem.Chestplate());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
