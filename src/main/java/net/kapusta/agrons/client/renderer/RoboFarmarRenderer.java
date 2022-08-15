
package net.kapusta.agrons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.kapusta.agrons.entity.RoboFarmarEntity;

public class RoboFarmarRenderer extends MobRenderer<RoboFarmarEntity, VillagerModel<RoboFarmarEntity>> {
	public RoboFarmarRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoboFarmarEntity entity) {
		return new ResourceLocation("agrons:textures/entities/agrons-_roboticky_farmar_textura.png");
	}
}
