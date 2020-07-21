package com.blocAquatika.blocAquatikaMod.world.biome;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class trench_biome extends Biome {

    public static void addTrenchCarver(Biome biomeIn) {

        biomeIn.addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CANYON, new ProbabilityConfig(0.5F)));
        biomeIn.addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CAVE, new ProbabilityConfig(0.2F)));
    }

    public trench_biome(Builder builder){

        //this sucked, stuck on func.
        //send help

        //depth -.1 and scale .1 is tripppyyyy
        super((new Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.SAND_SAND_GRAVEL_CONFIG)).precipitation(RainType.RAIN).category(Category.OCEAN).depth(-1.0F).scale(-.05F).temperature(0.5F).downfall(0.5F).func_235097_a_((new BiomeAmbience.Builder()).func_235246_b_(4159204).func_235248_c_(000000).func_235239_a_(12638463).func_235243_a_(MoodSoundAmbience.field_235027_b_).func_235238_a_()).parent(("ocean")));

        this.func_235063_a_(DefaultBiomeFeatures.field_235171_i_);
        this.func_235063_a_(DefaultBiomeFeatures.field_235134_a_);

        //Cawvas

        addTrenchCarver(this);

        DefaultBiomeFeatures.addOceanCarvers(this);

        DefaultBiomeFeatures.addLakes(this);

        DefaultBiomeFeatures.addMonsterRooms(this);

        DefaultBiomeFeatures.addStoneVariants(this);

        DefaultBiomeFeatures.addOres(this);

        DefaultBiomeFeatures.addSedimentDisks(this);

        DefaultBiomeFeatures.addSprings(this);


        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(ImmutableList.of(Feature.CORAL_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG), Feature.CORAL_CLAW.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG), Feature.CORAL_MUSHROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)))).withPlacement(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(20, 400.0D, 0.0D, Heightmap.Type.OCEAN_FLOOR_WG))));
        DefaultBiomeFeatures.addTallSeagrassSparse(this);

        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEA_PICKLE.withConfiguration(new CountConfig(20)).withPlacement(Placement.CHANCE_TOP_SOLID_HEIGHTMAP.configure(new ChanceConfig(16))));
        DefaultBiomeFeatures.addFreezeTopLayer(this);

        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.withConfiguration(new SeaGrassConfig(48, 0.3D)).withPlacement(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
        DefaultBiomeFeatures.addSeagrass(this);

        DefaultBiomeFeatures.addKelp(this);

        //Mansters
        this.addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SQUID, 10, 4, 4));

        this.addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.PUFFERFISH, 15, 1, 3));

        this.addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.TROPICAL_FISH, 25, 8, 8));

        this.addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.DOLPHIN, 2, 1, 2));

        this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 10, 8, 8));

        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SPIDER, 100, 4, 4));


    }


}