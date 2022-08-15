
package net.kapusta.agrons.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.kapusta.agrons.init.AgronsModTabs;

public class MetalingotItem extends Item {
	public MetalingotItem() {
		super(new Item.Properties().tab(AgronsModTabs.TAB_AGRONS).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 2F;
	}
}
