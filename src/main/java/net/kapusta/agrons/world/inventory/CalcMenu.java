
package net.kapusta.agrons.world.inventory;

import net.kapusta.agrons.AgronsMod;

public class CalcMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {

	public final static HashMap<String, Object> guistate = new HashMap<>();

	public final Level world;
	public final Player entity;
	public int x, y, z;

	private IItemHandler internal;

	private final Map<Integer, Slot> customSlots = new HashMap<>();

	private boolean bound = false;

	public CalcMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AgronsModMenus.CALC, id);

		this.entity = inv.player;
		this.world = inv.player.level;

		this.internal = new ItemStackHandler(0);

		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}

	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}

}
