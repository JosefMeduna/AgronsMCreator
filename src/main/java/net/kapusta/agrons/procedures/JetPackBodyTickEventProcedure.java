package net.kapusta.agrons.procedures;

import net.minecraft.world.entity.Entity;

public class JetPackBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setNoGravity((true));
	}
}
