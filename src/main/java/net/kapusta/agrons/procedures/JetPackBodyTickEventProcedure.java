package net.kapusta.agrons.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class JetPackBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 2, (false), (false)));
		}
		if (entity.isShiftKeyDown() == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 2, 1, (false), (false)));
		}
	}
}
