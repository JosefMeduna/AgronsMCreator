// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(116, 41)
						.addBox(-6.0F, -11.0F, -10.0F, 11.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(73, 48)
						.addBox(-13.0F, -20.0F, -21.0F, 2.0F, 11.0F, 39.0F, new CubeDeformation(0.0F)).texOffs(77, 41)
						.addBox(30.0F, -32.0F, -16.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(116, 76)
						.addBox(13.0F, -18.0F, 16.0F, 23.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(36.0F, -18.0F, -21.0F, 2.0F, 9.0F, 39.0F, new CubeDeformation(0.0F)).texOffs(133, 111)
						.addBox(13.0F, -18.0F, -21.0F, 23.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 63)
						.addBox(-13.0F, -20.0F, -21.0F, 28.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(133, 98)
						.addBox(-13.0F, -20.0F, 16.0F, 28.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(15.0F, -20.0F, -19.0F, 21.0F, 11.0F, 35.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -9.0F, -21.0F, 51.0F, 2.0F, 39.0F, new CubeDeformation(0.0F)).texOffs(43, 98)
						.addBox(-9.0F, -7.0F, -21.0F, 3.0F, 3.0F, 39.0F, new CubeDeformation(0.0F)).texOffs(88, 101)
						.addBox(35.0F, -7.0F, -21.0F, 3.0F, 3.0F, 39.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(30.0F, -9.0F, -24.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(28.0F, -11.0F, -23.0F, 12.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(77, 58)
						.addBox(-12.0F, -9.0F, -24.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-14.0F, -11.0F, -23.0F, 12.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-13.0F, -11.0F, 18.0F, 12.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(77, 67)
						.addBox(-11.0F, -9.0F, 19.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(31.0F, -9.0F, 19.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(29.0F, -11.0F, 18.0F, 12.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(12.0F, -23.0F, -6.0F, 5.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.3526F, -1.5708F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(28, 13).addBox(14.0F, -21.0F, -1.0F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.309F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}