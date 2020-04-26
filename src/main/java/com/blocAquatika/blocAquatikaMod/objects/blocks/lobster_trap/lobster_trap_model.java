package com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;// Made with Blockbench 3.5.0
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class lobster_trap_model extends Model {
	private final ModelRenderer trap;
	private final ModelRenderer details;

	public lobster_trap_model() {
		super(RenderType::getEntityCutout);
		textureWidth = 128;
		textureHeight = 128;

		trap = new ModelRenderer(this);
		trap.setRotationPoint(0.0F, 24.0F, 0.0F);
		trap.setTextureOffset(0, 25).addBox(0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 16.0F, 0.0F, false);
		trap.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
		trap.setTextureOffset(32, 41).addBox(-8.0F, -8.0F, -8.0F, 8.0F, 8.0F, 16.0F, 0.0F, false);

		details = new ModelRenderer(this);
		details.setRotationPoint(0.0F, 24.0F, 0.0F);
		details.setTextureOffset(32, 17).addBox(-6.0F, -2.0F, 1.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
	}


	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		trap.render(matrixStack, buffer, packedLight, packedOverlay);
		details.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}