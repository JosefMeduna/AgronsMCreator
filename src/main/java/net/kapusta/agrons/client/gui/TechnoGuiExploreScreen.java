
package net.kapusta.agrons.client.gui;

public class TechnoGuiExploreScreen extends AbstractContainerScreen<TechnoGuiExploreMenu> {

	private final static HashMap<String, Object> guistate = TechnoGuiExploreMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TechnoGuiExploreScreen(TechnoGuiExploreMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 377;
		this.imageHeight = 202;
	}

	private static final ResourceLocation texture = new ResourceLocation("agrons:textures/screens/techno_gui_explore.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("agrons:textures/screens/techno.png"));
		this.blit(ms, this.leftPos + 137, this.topPos + 58, 0, 0, 68, 127, 68, 127);

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
		this.font.draw(poseStack, "Technoblade never dies!!!", 22, 8, -12829636);
		this.font.draw(poseStack, "Technoblade never dies!!!", 108, 39, -65536);
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
				AgronsMod.PACKET_HANDLER.sendToServer(new TechnoGuiExploreButtonMessage(0, x, y, z));
				TechnoGuiExploreButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}

}
