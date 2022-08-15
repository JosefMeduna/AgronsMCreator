
package net.kapusta.agrons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.kapusta.agrons.entity.RoboPraseEntity;

public class RoboPraseRenderer extends MobRenderer<RoboPraseEntity, PigModel<RoboPraseEntity>> {
	public RoboPraseRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoboPraseEntity entity) {
		return new ResourceLocation("agrons:textures/entities/pig.png");
	}
}
