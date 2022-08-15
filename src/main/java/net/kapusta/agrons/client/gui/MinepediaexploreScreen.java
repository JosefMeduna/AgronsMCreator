
package net.kapusta.agrons.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.kapusta.agrons.world.inventory.MinepediaexploreMenu;
import net.kapusta.agrons.network.MinepediaexploreButtonMessage;
import net.kapusta.agrons.AgronsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MinepediaexploreScreen extends AbstractContainerScreen<MinepediaexploreMenu> {
	private final static HashMap<String, Object> guistate = MinepediaexploreMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MinepediaexploreScreen(MinepediaexploreMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 377;
		this.imageHeight = 202;
	}

	private static final ResourceLocation texture = new ResourceLocation("agrons:textures/screens/minepediaexplore.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("agrons:textures/screens/webbrowser.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 5, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("agrons:textures/screens/grass_block_side.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 122, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Minepedia - Minenet explorer", 22, 8, -12829636);
		this.font.draw(poseStack, "Minecraft is a 3D sandbox game developed by Mojang Studios ", 8, 26, -12829636);
		this.font.draw(poseStack, "where players interact with a fully modifiable three-dimensional ", 9, 42, -12829636);
		this.font.draw(poseStack, "environment made of blocks and entities. Its diverse gameplay", 7, 57, -12829636);
		this.font.draw(poseStack, "lets players choose the way they play, allowing for countless", 6, 72, -12829636);
		this.font.draw(poseStack, "possibilities. There are four actively maintained", 7, 84, -12829636);
		this.font.draw(poseStack, "editions of Minecraft: Java Edition, Bedrock Edition,", 7, 97, -12829636);
		this.font.draw(poseStack, "Education Edition, and China Edition.", 7, 109, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 341, this.topPos + 4, 30, 20, new TextComponent("<-"), e -> {
			if (true) {
				AgronsMod.PACKET_HANDLER.sendToServer(new MinepediaexploreButtonMessage(0, x, y, z));
				MinepediaexploreButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
