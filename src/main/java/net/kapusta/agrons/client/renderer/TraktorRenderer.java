
package net.kapusta.agrons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.kapusta.agrons.entity.TraktorEntity;
import net.kapusta.agrons.client.model.Modelcustom_model;

public class TraktorRenderer extends MobRenderer<TraktorEntity, Modelcustom_model<TraktorEntity>> {
	public TraktorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TraktorEntity entity) {
		return new ResourceLocation("agrons:textures/entities/traktor.png");
	}
}
