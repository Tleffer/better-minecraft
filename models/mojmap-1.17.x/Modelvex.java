// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelvex<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "vex"),
			"main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart leg0;
	private final ModelPart leftwing;
	private final ModelPart rightwing;

	public Modelvex(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.leg0 = root.getChild("leg0");
		this.leftwing = root.getChild("leftwing");
		this.rightwing = root.getChild("rightwing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-16.0F, 40.0F, -16.0F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -72.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(64, 64)
				.addBox(-16.0F, 72.0F, -8.0F, 32.0F, 48.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -72.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(160, 64)
				.addBox(-12.0F, 64.0F, -8.0F, 16.0F, 48.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-20.0F, -64.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(160, 64).mirror()
						.addBox(-4.0F, 64.0F, -8.0F, 16.0F, 48.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(20.0F, -64.0F, 0.0F));

		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0",
				CubeListBuilder.create().texOffs(0, 64)
						.addBox(-8.0F, 72.0F, -8.0F, 16.0F, 48.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(128, 0)
						.addBox(-4.0F, 68.0F, -8.0F, 24.0F, 40.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.6F, -24.0F, 0.0F));

		PartDefinition leftwing = partdefinition.addOrReplaceChild("leftwing",
				CubeListBuilder.create().texOffs(0, 128).mirror()
						.addBox(0.0F, 72.0F, 0.0F, 80.0F, 48.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -72.0F, 0.0F));

		PartDefinition rightwing = partdefinition.addOrReplaceChild("rightwing", CubeListBuilder.create()
				.texOffs(0, 128).addBox(-80.0F, 72.0F, 0.0F, 80.0F, 48.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -72.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		RightArm.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
		leg0.render(poseStack, buffer, packedLight, packedOverlay);
		leftwing.render(poseStack, buffer, packedLight, packedOverlay);
		rightwing.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}