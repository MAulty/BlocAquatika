package com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class StartupClientOnly {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        // Tell the renderer that the base is rendered using CUTOUT (but the base is actually invisible so it doesn't really matter...)
        RenderTypeLookup.setRenderLayer(StartupCommon.lobster_trap, RenderType.getEntityCutout(new ResourceLocation("bloc_aquatika","blocks/lobster_trap")));
        // Register the custom renderer for our tile entity
        ClientRegistry.bindTileEntityRenderer(StartupCommon.tileEntityDataTypeLobster, LobsterModelTileEntityRenderer::new);
    }
}
