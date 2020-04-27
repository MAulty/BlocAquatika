package com.blocAquatika.blocAquatikaMod.util;

import com.blocAquatika.blocAquatikaMod.BlocAquatika;
import com.blocAquatika.blocAquatikaMod.objects.blocks.ModBlocks;
import com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;
import com.blocAquatika.blocAquatikaMod.objects.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BlocAquatika.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BlocAquatika.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        RenderTypeLookup.setRenderLayer(ModBlocks.lobster_trap, RenderType.getCutoutMipped());
        //new StartupCommon().onBlocksRegistration(BLOCKS);
        //new StartupCommon().onItemsRegistration(ITEMS);
    }

    //Blocks
    public static final RegistryObject<Block> SHELL_SAND = BLOCKS.register("shell_sand", () -> ModBlocks.shell_sand);
    public static final RegistryObject<Block> LOBSTER_TRAP = BLOCKS.register("lobster_trap", () -> lobster_trap.INST);

    //Items
    public static final RegistryObject<Item> SHELL_SAND_BLOCK = ITEMS.register("shell_sand", () -> new BlockItem(ModBlocks.shell_sand, new Item.Properties()));
    public static final RegistryObject<Item> LOBSTER_TRAP_BLOCK = ITEMS.register("lobster_trap", () -> new BlockItem(lobster_trap.INST , new Item.Properties()));
    public static final RegistryObject<Item> LOBSTER = ITEMS.register("lobster", ItemBase::new);

}
