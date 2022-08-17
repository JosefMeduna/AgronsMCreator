
package net.kapusta.agrons.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.kapusta.agrons.world.inventory.MinenetExploreMenu;
import net.kapusta.agrons.network.MinenetExploreButtonMessage;
import net.kapusta.agrons.AgronsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MinenetExploreScreen extends AbstractContainerScreen<MinenetExploreMenu> {
	private final static HashMap<String, Object> guistate = MinenetExploreMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox SearchBox;

	public MinenetExploreScreen(MinenetExploreMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 377;
		this.imageHeight = 202;
	}

	private static final ResourceLocation texture = new ResourceLocation("agrons:textures/screens/minenet_explore.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		SearchBox.render(ms, mouseX, mouseY, partialTicks);
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

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (SearchBox.isFocused())
			return SearchBox.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		SearchBox.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Minenet explorer", 22, 8, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 341, this.topPos + 5, 30, 20, new TextComponent("X"), e -> {
			if (true) {
				AgronsMod.PACKET_HANDLER.sendToServer(new MinenetExploreButtonMessage(0, x, y, z));
				MinenetExploreButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		SearchBox = new EditBox(this.font, this.leftPos + 101, this.topPos + 67, 120, 20, new TextComponent(""));
		guistate.put("text:SearchBox", SearchBox);
		SearchBox.setMaxLength(32767);
		this.addWidget(this.SearchBox);
		this.addRenderableWidget(new Button(this.leftPos + 221, this.topPos + 67, 35, 20, new TextComponent("Go"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 90, 72, 20, new TextComponent("MinePedia"), e -> {
			if (true) {
				AgronsMod.PACKET_HANDLER.sendToServer(new MinenetExploreButtonMessage(2, x, y, z));
				MinenetExploreButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 177, this.topPos + 90, 72, 20, new TextComponent("About mod"), e -> {
			if (true) {
				AgronsMod.PACKET_HANDLER.sendToServer(new MinenetExploreButtonMessage(3, x, y, z));
				MinenetExploreButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
