package com.blocAquatika.blocAquatikaMod.util;

import com.blocAquatika.blocAquatikaMod.BlocAquatika;
//import com.blocAquatika.blocAquatikaMod.world.features.palm_tree;
import com.blocAquatika.blocAquatikaMod.objects.blocks.ModBlocks;
import com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;
//import com.blocAquatika.blocAquatikaMod.objects.blocks.palm_sapling;
import com.blocAquatika.blocAquatikaMod.objects.items.ItemBase;
//import com.blocAquatika.blocAquatikaMod.world.biome.island_biome;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocAquatika.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocAquatika.MOD_ID);
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, BlocAquatika.MOD_ID);
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, BlocAquatika.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    //Features
    //public static final RegistryObject<Feature<?>> PALM_TREE = FEATURES.register("palm_tree", () -> new palm_tree());

    //Biomes
    //public static final RegistryObject<Biome> ISLAND_BIOME = BIOMES.register("island_biome", () -> new island_biome(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.SAND_CONFIG).precipitation(Biome.RainType.RAIN).category(Biome.Category.OCEAN).depth(-1.0F).scale(0.1F).temperature(0.5F).downfall(0.5F).waterColor(4445678).waterFogColor(270131).parent((String)null)));

    //Blocks
    public static final RegistryObject<Block> SHELL_SAND = BLOCKS.register("shell_sand", () -> ModBlocks.shell_sand);
    public static final RegistryObject<Block> LOBSTER_TRAP = BLOCKS.register("lobster_trap", () -> lobster_trap.INST);
    public static final RegistryObject<Block> PALM_LOG = BLOCKS.register("palm_log", () -> ModBlocks.palm_log);
    public static final RegistryObject<Block> PALM_LEAVES = BLOCKS.register("palm_leaves", () -> ModBlocks.palm_leaves);
    //public static final RegistryObject<Block> PALM_SAPLING = BLOCKS.register("palm_sapling", () -> new palm_sapling(() -> new com.blocAquatika.blocAquatikaMod.world.feature.palm_tree(), Block.Properties.from(Blocks.OAK_SAPLING)));


    //Items

    //public static final RegistryObject<Item> PALM_SAPLING_ITEM = ITEMS.register("palm_sapling", () -> new BlockItem(new palm_sapling(() -> new com.blocAquatika.blocAquatikaMod.world.feature.palm_tree(), Block.Properties.from(Blocks.OAK_SAPLING)), new Item.Properties()));
    public static final RegistryObject<Item> SHELL_SAND_BLOCK = ITEMS.register("shell_sand", () -> new BlockItem(ModBlocks.shell_sand, new Item.Properties()));
    public static final RegistryObject<Item> LOBSTER_TRAP_BLOCK = ITEMS.register("lobster_trap", () -> new BlockItem(lobster_trap.INST , new Item.Properties()));
    public static final RegistryObject<Item> LOBSTER = ITEMS.register("lobster", ItemBase::new);
    public static final RegistryObject<Item> PALM_LOG_BLOCK = ITEMS.register("palm_log", () -> new BlockItem(ModBlocks.palm_log, new Item.Properties()));
    public static final RegistryObject<Item> PALM_LEAVES_BLOCK = ITEMS.register("palm_leaves", () -> new BlockItem(ModBlocks.palm_leaves, new Item.Properties()));


}
