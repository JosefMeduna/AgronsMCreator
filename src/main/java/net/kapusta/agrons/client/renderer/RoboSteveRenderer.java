
package net.kapusta.agrons.client.renderer;

public class RoboSteveRenderer extends HumanoidMobRenderer<RoboSteveEntity, HumanoidModel<RoboSteveEntity>> {

	public RoboSteveRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(RoboSteveEntity entity) {
		return new ResourceLocation("agrons:textures/entities/steve.png");
	}

}
