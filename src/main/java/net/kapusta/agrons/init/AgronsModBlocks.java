
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.kapusta.agrons.block.TrashblockBlock;
import net.kapusta.agrons.block.TrashBlock;
import net.kapusta.agrons.block.TetstblockdaBlock;
import net.kapusta.agrons.block.MetaloreBlock;
import net.kapusta.agrons.block.MetalblockBlock;
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
}
