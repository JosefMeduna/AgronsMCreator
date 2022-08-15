/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.kapusta.agrons;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.kapusta.agrons.init.AgronsModTabs;
import net.kapusta.agrons.init.AgronsModParticleTypes;
import net.kapusta.agrons.init.AgronsModItems;
import net.kapusta.agrons.init.AgronsModEntities;
import net.kapusta.agrons.init.AgronsModBlocks;
import net.kapusta.agrons.init.AgronsModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("agrons")
public class AgronsMod {
	public static final Logger LOGGER = LogManager.getLogger(AgronsMod.class);
	public static final String MODID = "agrons";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public AgronsMod() {
		AgronsModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		AgronsModBlocks.REGISTRY.register(bus);
		AgronsModItems.REGISTRY.register(bus);
		AgronsModEntities.REGISTRY.register(bus);

		AgronsModBiomes.REGISTRY.register(bus);
		AgronsModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
