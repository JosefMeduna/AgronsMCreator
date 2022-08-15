
package net.kapusta.agrons.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.kapusta.agrons.init.AgronsModItems;

import java.util.List;
import java.util.Collections;

public class TrashblockBlock extends Block {
	public TrashblockBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRAVEL).strength(0.95f, 6.5f).speedFactor(0.8f).jumpFactor(0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(AgronsModItems.TRASHITEM.get(), 4));
	}
}
