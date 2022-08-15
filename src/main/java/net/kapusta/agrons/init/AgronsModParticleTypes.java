
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kapusta.agrons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.kapusta.agrons.AgronsMod;

public class AgronsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AgronsMod.MODID);
	public static final RegistryObject<ParticleType<?>> FUJ = REGISTRY.register("fuj", () -> new SimpleParticleType(false));
}
