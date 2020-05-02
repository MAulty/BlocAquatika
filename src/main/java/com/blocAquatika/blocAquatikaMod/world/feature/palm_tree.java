package com.blocAquatika.blocAquatikaMod.world.feature;

import com.blocAquatika.blocAquatikaMod.util.RegistryHandler;
import com.blocAquatika.blocAquatikaMod.world.biome.island_biome_features;
import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import javax.annotation.Nullable;
import java.util.Random;

public class palm_tree extends Tree {

    @Nullable
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(island_biome_features.PALM_TREE_CONFIG);
    }
}