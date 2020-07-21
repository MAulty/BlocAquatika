// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.blocAquatika.blocAquatikaMod.model;

import com.blocAquatika.blocAquatikaMod.entities.MoorishIdolEntity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;

public class MoorishIdolEntityModel<T extends Entity> extends SegmentedModel<T> {
	private final ModelRenderer Body;
	private final ModelRenderer Dorsal;
	private final ModelRenderer Tail;
	private final ModelRenderer LeftFin;
	private final ModelRenderer RightFin;

	public MoorishIdolEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-2.0F, -7.0F, -2.0F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		Dorsal = new ModelRenderer(this);
		Dorsal.setRotationPoint(0.0F, 24.0F, 0.0F);
		Dorsal.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, -8.0F, 0.0F, 2.0F, 10.0F, 0.0F, false);
		Dorsal.setTextureOffset(0, 7).addBox(-1.0F, -2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		Tail.setTextureOffset(14, 2).addBox(-1.0F, -7.0F, -5.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);

		LeftFin = new ModelRenderer(this);
		LeftFin.setRotationPoint(-2.0F, 20.0F, 2.0F);
		setRotationAngle(LeftFin, 0.0F, 0.4363F, 0.0F);
		LeftFin.setTextureOffset(20, 3).addBox(0.0F, -2.0F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		RightFin = new ModelRenderer(this);
		RightFin.setRotationPoint(0.0F, 20.0F, 2.0F);
		setRotationAngle(RightFin, 0.0F, -0.4363F, 0.0F);
		RightFin.setTextureOffset(26, 3).addBox(0.0F, -2.0F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
	}

	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(this.Body, this.Dorsal, this.Tail, this.LeftFin, this.RightFin);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Dorsal.render(matrixStack, buffer, packedLight, packedOverlay);
		Tail.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftFin.render(matrixStack, buffer, packedLight, packedOverlay);
		RightFin.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}