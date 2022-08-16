
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.kapusta.agrons.entity.RoboSteveEntity;
import net.kapusta.agrons.entity.RoboPraseEntity;
import net.kapusta.agrons.entity.RoboKohoutEntity;
import net.kapusta.agrons.entity.RoboFarmarEntity;
import net.kapusta.agrons.entity.LaserGunEntity;
import net.kapusta.agrons.AgronsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AgronsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AgronsMod.MODID);
	public static final RegistryObject<EntityType<LaserGunEntity>> LASER_GUN = register("projectile_laser_gun",
			EntityType.Builder.<LaserGunEntity>of(LaserGunEntity::new, MobCategory.MISC).setCustomClientFactory(LaserGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RoboKohoutEntity>> ROBO_KOHOUT = register("robo_kohout",
			EntityType.Builder.<RoboKohoutEntity>of(RoboKohoutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoboKohoutEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<RoboFarmarEntity>> ROBO_FARMAR = register("robo_farmar",
			EntityType.Builder.<RoboFarmarEntity>of(RoboFarmarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoboFarmarEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<RoboPraseEntity>> ROBO_PRASE = register("robo_prase",
			EntityType.Builder.<RoboPraseEntity>of(RoboPraseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoboPraseEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<RoboSteveEntity>> ROBO_STEVE = register("robo_steve",
			EntityType.Builder.<RoboSteveEntity>of(RoboSteveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoboSteveEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RoboKohoutEntity.init();
			RoboFarmarEntity.init();
			RoboPraseEntity.init();
			RoboSteveEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ROBO_KOHOUT.get(), RoboKohoutEntity.createAttributes().build());
		event.put(ROBO_FARMAR.get(), RoboFarmarEntity.createAttributes().build());
		event.put(ROBO_PRASE.get(), RoboPraseEntity.createAttributes().build());
		event.put(ROBO_STEVE.get(), RoboSteveEntity.createAttributes().build());
	}
}
