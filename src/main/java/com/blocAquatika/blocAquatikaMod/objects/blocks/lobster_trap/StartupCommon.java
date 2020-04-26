package com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;

public class StartupCommon {
    public static lobster_trap lobster_trap;  // this holds the unique instance of your block
    public static BlockItem itemBlockLobsterTrap; // this holds the unique instance of the itemblock corresponding to the block
    public static TileEntityType<TileEntitylobster_trap> tileEntityDataTypeLobster;  // Holds the type of our tile entity; needed for the TileEntityData constructor

    @SubscribeEvent
    public static void onBlocksRegistration(final DeferredRegister<Block> blockRegisterEvent) {
        RegistryObject<Block> lobster_trap = blockRegisterEvent.register("lobster_trap", lobster_trap::new);
    }

    @SubscribeEvent
    public static void onItemsRegistration(final DeferredRegister<Item> itemRegisterEvent) {
        // We need to create a BlockItem so the player can carry this block in their hand and it can appear in the inventory

        Item.Properties itemSimpleProperties = new Item.Properties();
        RegistryObject<Item> LOBSTER_TRAP = itemRegisterEvent.register("lobster_trap", ()-> new BlockItem(lobster_trap, itemSimpleProperties));
    }
}
