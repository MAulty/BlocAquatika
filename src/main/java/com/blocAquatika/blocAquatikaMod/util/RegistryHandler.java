package com.blocAquatika.blocAquatikaMod.util;

import com.blocAquatika.blocAquatikaMod.BlocAquatika;
import com.blocAquatika.blocAquatikaMod.block.lobsterTrap;
import com.blocAquatika.blocAquatikaMod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BlocAquatika.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BlocAquatika.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> LOBSTER_CAGE = BLOCKS.register("lobster_cage", lobsterTrap::new);
    public static final RegistryObject<Item> LOBSTER = ITEMS.register("lobster", ItemBase::new);
}
