
package net.kapusta.agrons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.kapusta.agrons.entity.RoboKohoutEntity;

public class RoboKohoutRenderer extends MobRenderer<RoboKohoutEntity, ChickenModel<RoboKohoutEntity>> {
	public RoboKohoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoboKohoutEntity entity) {
		return new ResourceLocation("agrons:textures/entities/agrons-_roboslepice_textura.png");
	}
}
