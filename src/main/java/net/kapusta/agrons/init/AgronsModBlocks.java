
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.kapusta.agrons.block.ZatocpasBlock;
import net.kapusta.agrons.block.TrashblockBlock;
import net.kapusta.agrons.block.TrashBlock;
import net.kapusta.agrons.block.TraktorSpawnCrateBlock;
import net.kapusta.agrons.block.TetstblockdaBlock;
import net.kapusta.agrons.block.PasBlock;
import net.kapusta.agrons.block.MetaloreBlock;
import net.kapusta.agrons.block.MetalblockBlock;
import net.kapusta.agrons.block.KrabicBlock;
import net.kapusta.agrons.block.HruskaBlokBlock;
import net.kapusta.agrons.block.EmanNoFuncBlock;
import net.kapusta.agrons.block.EmanBlock;
import net.kapusta.agrons.block.ComputerBlock;
import net.kapusta.agrons.AgronsMod;

public class AgronsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AgronsMod.MODID);
	public static final RegistryObject<Block> TRASH = REGISTRY.register("trash", () -> new TrashBlock());
	public static final RegistryObject<Block> TETSTBLOCKDA = REGISTRY.register("tetstblockda", () -> new TetstblockdaBlock());
	public static final RegistryObject<Block> COMPUTER = REGISTRY.register("computer", () -> new ComputerBlock());
	public static final RegistryObject<Block> METALBLOCK = REGISTRY.register("metalblock", () -> new MetalblockBlock());
	public static final RegistryObject<Block> TRASHBLOCK = REGISTRY.register("trashblock", () -> new TrashblockBlock());
	public static final RegistryObject<Block> METALORE = REGISTRY.register("metalore", () -> new MetaloreBlock());
	public static final RegistryObject<Block> HRUSKA_BLOK = REGISTRY.register("hruska_blok", () -> new HruskaBlokBlock());
	public static final RegistryObject<Block> KRABIC = REGISTRY.register("krabic", () -> new KrabicBlock());
	public static final RegistryObject<Block> PAS = REGISTRY.register("pas", () -> new PasBlock());
	public static final RegistryObject<Block> ZATOCPAS = REGISTRY.register("zatocpas", () -> new ZatocpasBlock());
	public static final RegistryObject<Block> TRAKTOR_SPAWN_CRATE = REGISTRY.register("traktor_spawn_crate", () -> new TraktorSpawnCrateBlock());
	public static final RegistryObject<Block> EMAN = REGISTRY.register("eman", () -> new EmanBlock());
	public static final RegistryObject<Block> EMAN_NO_FUNC = REGISTRY.register("eman_no_func", () -> new EmanNoFuncBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			HruskaBlokBlock.registerRenderLayer();
		}
	}
}
