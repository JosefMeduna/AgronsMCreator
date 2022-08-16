
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

import net.kapusta.agrons.world.inventory.CalcMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CalcScreen extends AbstractContainerScreen<CalcMenu> {
	private final static HashMap<String, Object> guistate = CalcMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Csl1;
	EditBox Csl2;

	public CalcScreen(CalcMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 377;
		this.imageHeight = 202;
	}

	private static final ResourceLocation texture = new ResourceLocation("agrons:textures/screens/calc.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		Csl1.render(ms, mouseX, mouseY, partialTicks);
		Csl2.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Csl1.isFocused())
			return Csl1.keyPressed(key, b, c);
		if (Csl2.isFocused())
			return Csl2.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Csl1.tick();
		Csl2.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "MineCalc 1.0", 6, 184, -12829636);
		this.font.draw(poseStack, "Cislo 1", 109, 26, -12829636);
		this.font.draw(poseStack, "Cislo 2", 109, 53, -12829636);
		this.font.draw(poseStack, "Vysledek", 189, 132, -12829636);
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
		Csl1 = new EditBox(this.font, this.leftPos + 152, this.topPos + 21, 120, 20, new TextComponent(""));
		guistate.put("text:Csl1", Csl1);
		Csl1.setMaxLength(32767);
		this.addWidget(this.Csl1);
		Csl2 = new EditBox(this.font, this.leftPos + 152, this.topPos + 50, 120, 20, new TextComponent(""));
		guistate.put("text:Csl2", Csl2);
		Csl2.setMaxLength(32767);
		this.addWidget(this.Csl2);
		this.addRenderableWidget(new Button(this.leftPos + 146, this.topPos + 100, 30, 20, new TextComponent("+"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 179, this.topPos + 100, 30, 20, new TextComponent("-"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 212, this.topPos + 100, 30, 20, new TextComponent("x"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 245, this.topPos + 100, 30, 20, new TextComponent("/"), e -> {
		}));
	}
}
