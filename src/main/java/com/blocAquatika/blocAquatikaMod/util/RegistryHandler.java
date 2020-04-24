package com.blocAquatika.blocAquatikaMod.util;

import com.blocAquatika.blocAquatikaMod.BlocAquatika;
import com.blocAquatika.blocAquatikaMod.objects.blocks.ModBlocks;
//import com.blocAquatika.blocAquatikaMod.objects.blocks.lobsterTrap;
import com.blocAquatika.blocAquatikaMod.objects.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
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
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
    //public static final RegistryObject<Block> LOBSTER_CAGE = BLOCKS.register("lobster_cage", lobsterTrap::new);
    public static final RegistryObject<Block> SHELL_SAND = BLOCKS.register("shell_sand", () -> ModBlocks.shell_sand);

    //Items
    public static final RegistryObject<Item> SHELL_SAND_BLOCK = ITEMS.register("shell_sand", () -> new BlockItem(ModBlocks.shell_sand, new Item.Properties()));
    public static final RegistryObject<Item> LOBSTER = ITEMS.register("lobster", ItemBase::new);
}
