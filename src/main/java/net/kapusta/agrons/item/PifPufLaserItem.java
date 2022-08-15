
package net.kapusta.agrons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PifPufLaserItem extends Item {
	public PifPufLaserItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
