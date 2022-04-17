package net.tleffer.betterminecraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelguardian<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("better_minecraft", "modelguardian"), "main");
	public final ModelPart head;

	public Modelguardian(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -56.0F, -32.0F, 48.0F, 48.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(1, 112)
						.addBox(-32.0F, -56.0F, -24.0F, 8.0F, 48.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(1, 112).mirror()
						.addBox(24.0F, -56.0F, -24.0F, 8.0F, 48.0F, 48.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 159).mirror()
						.addBox(-24.0F, -64.0F, -24.0F, 48.0F, 8.0F, 48.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 160).mirror()
						.addBox(-24.0F, -8.0F, -24.0F, 48.0F, 8.0F, 48.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition eye = head.addOrReplaceChild("eye",
				CubeListBuilder.create().texOffs(33, 0).addBox(-4.0F, 60.0F, -33.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -96.0F, 0.0F));
		PartDefinition spikepart0 = head.addOrReplaceChild("spikepart0",
				CubeListBuilder.create().texOffs(0, 0).addBox(41.0F, -18.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition spikepart1 = head.addOrReplaceChild("spikepart1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-49.0F, -18.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition spikepart2 = head.addOrReplaceChild("spikepart2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -18.0F, -49.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition spikepart3 = head.addOrReplaceChild("spikepart3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -18.0F, 42.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition spikepart4 = head.addOrReplaceChild("spikepart4",
				CubeListBuilder.create().texOffs(0, 0).addBox(41.0F, -110.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition spikepart5 = head.addOrReplaceChild("spikepart5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-49.0F, -110.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 0.0F, 0.0F, -2.3562F));
		PartDefinition spikepart6 = head.addOrReplaceChild("spikepart6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -114.0F, -49.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition spikepart7 = head.addOrReplaceChild("spikepart7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -110.0F, 41.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition spikepart8 = head.addOrReplaceChild("spikepart8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -70.0F, -68.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 1.5708F, -0.7854F, 0.0F));
		PartDefinition spikepart9 = head.addOrReplaceChild("spikepart9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -70.0F, -68.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 1.5708F, 0.7854F, 0.0F));
		PartDefinition spikepart10 = head.addOrReplaceChild("spikepart10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -70.0F, -68.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 1.5708F, -2.3562F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
