package com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;

import com.blocAquatika.blocAquatikaMod.BlocAquatika;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;

public class LobsterModelTileEntityRenderer extends TileEntityRenderer<TileEntitylobster_trap> {

    public LobsterModelTileEntityRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(TileEntitylobster_trap tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStackIn.push();
        Model model = new lobster_trap_model();
        boolean USE_ENTITY_MODEL_TRANSFORMATIONS = true;

        if (USE_ENTITY_MODEL_TRANSFORMATIONS) {
            matrixStackIn.scale(-1, -1, 1);
            matrixStackIn.translate(0.0D, (double) -1.501F, 0.0D);
        }
        IVertexBuilder renderBuffer = bufferIn.getBuffer(model.getRenderType(new ResourceLocation(BlocAquatika.MOD_ID+":blocks/lobster_trap.png")));
        model.render(matrixStackIn, renderBuffer, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.pop();
    }

    @Override
    public boolean isGlobalRenderer(TileEntitylobster_trap te) {
        return true;
    }
}
