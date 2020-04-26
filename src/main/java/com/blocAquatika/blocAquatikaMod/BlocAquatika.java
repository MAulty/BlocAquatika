package com.blocAquatika.blocAquatikaMod;

import com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap.StartupClientOnly;
import com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap.StartupCommon;
import com.blocAquatika.blocAquatikaMod.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
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

        //OBJLoader.INSTANCE.loadModel(new OBJModel.ModelSettings(new ResourceLocation(MOD_ID + "block/lobster_trap.obj"), true,false,false,false, null));
        instance = this;
        RegistryHandler.init();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        new StartupClientOnly().onClientSetupEvent(event);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event){

    }

}
