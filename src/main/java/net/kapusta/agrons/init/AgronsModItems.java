
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
import net.kapusta.agrons.item.OhryzekHruskaItem;
import net.kapusta.agrons.item.MetalingotItem;
import net.kapusta.agrons.item.LaserGunItem;
import net.kapusta.agrons.item.JetPackItem;
import net.kapusta.agrons.item.HruskaitemItem;
import net.kapusta.agrons.AgronsMod;

public class AgronsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AgronsMod.MODID);
	public static final RegistryObject<Item> TRASH = block(AgronsModBlocks.TRASH, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> TETSTBLOCKDA = block(AgronsModBlocks.TETSTBLOCKDA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COMPUTER = block(AgronsModBlocks.COMPUTER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> METALBLOCK = block(AgronsModBlocks.METALBLOCK, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> TRASHBLOCK = block(AgronsModBlocks.TRASHBLOCK, AgronsModTabs.TAB_AGRONS);
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
	public static final RegistryObject<Item> OHRYZEK_HRUSKA = REGISTRY.register("ohryzek_hruska", () -> new OhryzekHruskaItem());
	public static final RegistryObject<Item> HRUSKAITEM = REGISTRY.register("hruskaitem", () -> new HruskaitemItem());
	public static final RegistryObject<Item> METALORE = block(AgronsModBlocks.METALORE, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> HRUSKA_BLOK = block(AgronsModBlocks.HRUSKA_BLOK, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> ROBO_STEVE = REGISTRY.register("robo_steve_spawn_egg",
			() -> new ForgeSpawnEggItem(AgronsModEntities.ROBO_STEVE, -1, -1, new Item.Properties().tab(AgronsModTabs.TAB_AGRONS)));
	public static final RegistryObject<Item> KRABIC = block(AgronsModBlocks.KRABIC, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> PAS = block(AgronsModBlocks.PAS, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> TRAKTOR = REGISTRY.register("traktor_spawn_egg",
			() -> new ForgeSpawnEggItem(AgronsModEntities.TRAKTOR, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ZATOCPAS = block(AgronsModBlocks.ZATOCPAS, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> TRAKTOR_SPAWN_CRATE = block(AgronsModBlocks.TRAKTOR_SPAWN_CRATE, AgronsModTabs.TAB_AGRONS);
	public static final RegistryObject<Item> EMAN = block(AgronsModBlocks.EMAN, AgronsModTabs.TAB_AGRONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
