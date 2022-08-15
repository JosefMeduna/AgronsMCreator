
package net.kapusta.agrons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.kapusta.agrons.init.AgronsModTabs;

public class OzubeneKoloItem extends Item {
	public OzubeneKoloItem() {
		super(new Item.Properties().tab(AgronsModTabs.TAB_AGRONS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
