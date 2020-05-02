package com.blocAquatika.blocAquatikaMod;

import com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;
import com.blocAquatika.blocAquatikaMod.objects.blocks.palm_sapling;
import com.blocAquatika.blocAquatikaMod.util.RegistryHandler;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static net.minecraft.client.renderer.RenderType.getCutout;

@Mod("bloc_aquatika")
public class BlocAquatika
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bloc_aquatika";
    public static BlocAquatika instance;

    public BlocAquatika() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);


        instance = this;
        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
      //  lobster_trap.INST.isOpaque(lobster_trap.BOTTOM_SHAPE);
        RenderTypeLookup.setRenderLayer(lobster_trap.INST, getCutout());
        //RenderTypeLookup.setRenderLayer(palm_sapling, getCutout());
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event){

    }

}
