/*
// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports
package com.blocAquatika.blocAquatikaMod.block;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Lobster_Trap_Model extends ModelBase {
	private final ModelRenderer Trap;
	private final ModelRenderer Details;

	public Lobster_Trap_Model() {
		textureWidth = 128;
		textureHeight = 128;

		Trap = new ModelRenderer(this);
		Trap.setRotationPoint(0.0F, 24.0F, 0.0F);
		Trap.cubeList.add(new ModelBox(Trap, 0, 25, 0.0F, -8.0F, -8.0F, 8, 8, 16, 0.0F, false));
		Trap.cubeList.add(new ModelBox(Trap, 0, 0, -8.0F, -1.0F, -8.0F, 16, 1, 16, 0.0F, false));
		Trap.cubeList.add(new ModelBox(Trap, 32, 41, -8.0F, -8.0F, -8.0F, 8, 8, 16, 0.0F, false));

		Details = new ModelRenderer(this);
		Details.setRotationPoint(0.0F, 24.0F, 0.0F);
		Details.cubeList.add(new ModelBox(Details, 32, 17, -6.0F, -2.0F, 1.0F, 4, 2, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Trap.render(f5);
		Details.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
*/