
package com.blocAquatika.blocAquatikaMod.world.biome;
/*
import com.blocAquatika.blocAquatikaMod.util.RegistryHandler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.PineFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.*;
import net.minecraftforge.common.IPlantable;

public class island_biome_features {

    private static final BlockState GRASS = Blocks.GRASS.getDefaultState();
    private static final BlockState FERN = Blocks.FERN.getDefaultState();
    private static final BlockState PODZOL = Blocks.PODZOL.getDefaultState();
    private static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
    private static final BlockState OAK_LEAVES = Blocks.OAK_LEAVES.getDefaultState();
    private static final BlockState JUNGLE_LOG = Blocks.JUNGLE_LOG.getDefaultState();
    private static final BlockState JUNGLE_LEAVES = Blocks.JUNGLE_LEAVES.getDefaultState();
    private static final BlockState SPRUCE_LOG = Blocks.SPRUCE_LOG.getDefaultState();
    private static final BlockState SPRUCE_LEAVES = Blocks.SPRUCE_LEAVES.getDefaultState();
    private static final BlockState ACACIA_LOG = Blocks.ACACIA_LOG.getDefaultState();
    private static final BlockState ACACIA_LEAVES = Blocks.ACACIA_LEAVES.getDefaultState();
    private static final BlockState BIRCH_LOG = Blocks.BIRCH_LOG.getDefaultState();
    private static final BlockState BIRCH_LEAVES = Blocks.BIRCH_LEAVES.getDefaultState();
    private static final BlockState DARK_OAK_LOG = Blocks.DARK_OAK_LOG.getDefaultState();
    private static final BlockState DARK_OAK_LEAVES = Blocks.DARK_OAK_LEAVES.getDefaultState();
    private static final BlockState WATER = Blocks.WATER.getDefaultState();
    private static final BlockState LAVA = Blocks.LAVA.getDefaultState();
    private static final BlockState DIRT = Blocks.DIRT.getDefaultState();
    private static final BlockState GRAVEL = Blocks.GRAVEL.getDefaultState();
    private static final BlockState GRANITE = Blocks.GRANITE.getDefaultState();
    private static final BlockState DIORITE = Blocks.DIORITE.getDefaultState();
    private static final BlockState ANDESITE = Blocks.ANDESITE.getDefaultState();
    private static final BlockState COAL_ORE = Blocks.COAL_ORE.getDefaultState();
    private static final BlockState IRON_ORE = Blocks.IRON_ORE.getDefaultState();
    private static final BlockState GOLD_ORE = Blocks.GOLD_ORE.getDefaultState();
    private static final BlockState REDSTONE_ORE = Blocks.REDSTONE_ORE.getDefaultState();
    private static final BlockState DIAMOND_ORE = Blocks.DIAMOND_ORE.getDefaultState();
    private static final BlockState LAPIS_ORE = Blocks.LAPIS_ORE.getDefaultState();
    private static final BlockState STONE = Blocks.STONE.getDefaultState();
    private static final BlockState EMERALD_ORE = Blocks.EMERALD_ORE.getDefaultState();
    private static final BlockState INFESTED_STONE = Blocks.INFESTED_STONE.getDefaultState();
    private static final BlockState SAND = Blocks.SAND.getDefaultState();
    private static final BlockState CLAY = Blocks.CLAY.getDefaultState();
    private static final BlockState GRASS_BLOCK = Blocks.GRASS_BLOCK.getDefaultState();
    private static final BlockState MOSSY_COBBLESTONE = Blocks.MOSSY_COBBLESTONE.getDefaultState();
    private static final BlockState LARGE_FERN = Blocks.LARGE_FERN.getDefaultState();
    private static final BlockState TALL_GRASS = Blocks.TALL_GRASS.getDefaultState();
    private static final BlockState LILAC = Blocks.LILAC.getDefaultState();
    private static final BlockState ROSE_BUSH = Blocks.ROSE_BUSH.getDefaultState();
    private static final BlockState PEONY = Blocks.PEONY.getDefaultState();
    private static final BlockState BROWN_MUSHROOM = Blocks.BROWN_MUSHROOM.getDefaultState();
    private static final BlockState RED_MUSHROOM = Blocks.RED_MUSHROOM.getDefaultState();
    private static final BlockState SEAGRASS = Blocks.SEAGRASS.getDefaultState();
    private static final BlockState PACKED_ICE = Blocks.PACKED_ICE.getDefaultState();
    private static final BlockState BLUE_ICE = Blocks.BLUE_ICE.getDefaultState();
    private static final BlockState LILY_OF_THE_VALLEY = Blocks.LILY_OF_THE_VALLEY.getDefaultState();
    private static final BlockState BLUE_ORCHID = Blocks.BLUE_ORCHID.getDefaultState();
    private static final BlockState POPPY = Blocks.POPPY.getDefaultState();
    private static final BlockState DANDELION = Blocks.DANDELION.getDefaultState();
    private static final BlockState DEAD_BUSH = Blocks.DEAD_BUSH.getDefaultState();
    private static final BlockState MELON = Blocks.MELON.getDefaultState();
    private static final BlockState PUMPKIN = Blocks.PUMPKIN.getDefaultState();
    private static final BlockState SWEET_BERRY_BUSH = Blocks.SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, Integer.valueOf(3));
    private static final BlockState FIRE = Blocks.FIRE.getDefaultState();
    private static final BlockState NETHERRACK = Blocks.NETHERRACK.getDefaultState();
    private static final BlockState LILY_PAD = Blocks.LILY_PAD.getDefaultState();
    private static final BlockState SNOW = Blocks.SNOW.getDefaultState();
    private static final BlockState JACK_O_LATERN = Blocks.JACK_O_LANTERN.getDefaultState();
    private static final BlockState SUNFLOWER = Blocks.SUNFLOWER.getDefaultState();
    private static final BlockState CACTUS = Blocks.CACTUS.getDefaultState();
    private static final BlockState SUGAR_CANE = Blocks.SUGAR_CANE.getDefaultState();
    private static final BlockState RED_MUSHROOM_BLOCK = Blocks.RED_MUSHROOM_BLOCK.getDefaultState().with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));
    private static final BlockState BROWN_MUSHROOM_BLOCK = Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState().with(HugeMushroomBlock.UP, Boolean.valueOf(true)).with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));
    private static final BlockState MUSHROOM_STEM = Blocks.MUSHROOM_STEM.getDefaultState().with(HugeMushroomBlock.UP, Boolean.valueOf(false)).with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));


    //baseHeight = trunk height
    public static final TreeFeatureConfig PALM_TREE_CONFIG = (new TreeFeatureConfig.Builder
                    (new SimpleBlockStateProvider(RegistryHandler.PALM_LOG.get().getDefaultState()),
                    new SimpleBlockStateProvider(RegistryHandler.PALM_LEAVES.get().getDefaultState()),
                    new AcaciaFoliagePlacer(4,3))).baseHeight(9).foliageHeight(3).ignoreVines()
                    .setSapling((IPlantable) RegistryHandler.PALM_SAPLING.get()).build();

    public static final TreeFeatureConfig OAK_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig JUNGLE_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(JUNGLE_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(8).foliageHeight(3).decorators(ImmutableList.of(new CocoaTreeDecorator(0.2F), new TrunkVineTreeDecorator(), new LeaveVineTreeDecorator())).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();
    public static final TreeFeatureConfig JUNGLE_SAPLING_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(JUNGLE_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(8).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();
    public static final TreeFeatureConfig PINE_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES), new PineFoliagePlacer(1, 0))).baseHeight(7).heightRandA(4).trunkTopOffset(1).foliageHeight(3).foliageHeightRandom(1).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig SPRUCE_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES), new SpruceFoliagePlacer(2, 1))).baseHeight(6).heightRandA(3).trunkHeight(1).trunkHeightRandom(1).trunkTopOffsetRandom(2).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig ACACIA_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(ACACIA_LOG), new SimpleBlockStateProvider(ACACIA_LEAVES), new AcaciaFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(2).trunkHeight(0).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.ACACIA_SAPLING).build();
    public static final TreeFeatureConfig BIRCH_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig field_230129_h_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig field_230130_i_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(6).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig SWAMP_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(3, 0))).baseHeight(5).heightRandA(3).foliageHeight(3).maxWaterDepth(1).decorators(ImmutableList.of(new LeaveVineTreeDecorator())).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig FANCY_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(0, 0))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig OAK_TREE_WITH_MORE_BEEHIVES_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig field_230131_m_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(0, 0))).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig FANCY_TREE_WITH_MORE_BEEHIVES_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(0, 0))).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig field_230132_o_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig field_230133_p_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.02F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig field_230134_q_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(0, 0))).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.02F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig field_230135_r_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.02F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final BaseTreeFeatureConfig field_230136_s_ = (new BaseTreeFeatureConfig(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final BaseTreeFeatureConfig JUNGLE_GROUND_BUSH_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(OAK_LEAVES))).baseHeight(4).setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();
    public static final HugeTreeFeatureConfig DARK_OAK_TREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(DARK_OAK_LOG), new SimpleBlockStateProvider(DARK_OAK_LEAVES))).baseHeight(6).setSapling((net.minecraftforge.common.IPlantable)Blocks.DARK_OAK_SAPLING).build();
    public static final HugeTreeFeatureConfig MEGA_SPRUCE_TREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES))).baseHeight(13).heightInterval(15).crownHeight(13).decorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(PODZOL)))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig MEGA_PINE_TREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES))).baseHeight(13).heightInterval(15).crownHeight(3).decorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(PODZOL)))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig MEGA_JUNGLE_TREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(JUNGLE_LEAVES))).baseHeight(10).heightInterval(20).decorators(ImmutableList.of(new TrunkVineTreeDecorator(), new LeaveVineTreeDecorator())).setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();
    public static final BlockClusterFeatureConfig GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(GRASS), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig TAIGA_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(GRASS, 1).addWeightedBlockstate(FERN, 4), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig LUSH_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(GRASS, 3).addWeightedBlockstate(FERN, 1), new SimpleBlockPlacer())).blacklist(ImmutableSet.of(PODZOL)).tries(32).build();
    public static final BlockClusterFeatureConfig LILY_OF_THE_VALLEY_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LILY_OF_THE_VALLEY), new SimpleBlockPlacer())).tries(64).build();
    public static final BlockClusterFeatureConfig BLUE_ORCHID_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BLUE_ORCHID), new SimpleBlockPlacer())).tries(64).build();
    public static final BlockClusterFeatureConfig DEFAULT_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(POPPY, 2).addWeightedBlockstate(DANDELION, 1), new SimpleBlockPlacer())).tries(64).build();
    public static final BlockClusterFeatureConfig PLAINS_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new PlainFlowerBlockStateProvider(), new SimpleBlockPlacer())).tries(64).build();
    public static final BlockClusterFeatureConfig FOREST_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new ForestFlowerBlockStateProvider(), new SimpleBlockPlacer())).tries(64).build();
    public static final BlockClusterFeatureConfig DEAD_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(DEAD_BUSH), new SimpleBlockPlacer())).tries(4).build();
    public static final BlockClusterFeatureConfig MELON_PATCH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MELON), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).replaceable().func_227317_b_().build();
    public static final BlockClusterFeatureConfig PUMPKIN_PATCH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(PUMPKIN), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).func_227317_b_().build();
    public static final BlockClusterFeatureConfig SWEET_BERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SWEET_BERRY_BUSH), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).func_227317_b_().build();
    public static final BlockClusterFeatureConfig NETHER_FIRE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(FIRE), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(NETHERRACK.getBlock())).func_227317_b_().build();
    public static final BlockClusterFeatureConfig LILY_PAD_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LILY_PAD), new SimpleBlockPlacer())).tries(10).build();
    public static final BlockClusterFeatureConfig RED_MUSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(RED_MUSHROOM), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig BROWN_MUSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BROWN_MUSHROOM), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig LILAC_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LILAC), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig ROSE_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ROSE_BUSH), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig PEONY_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(PEONY), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig SUNFLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SUNFLOWER), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig TALL_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TALL_GRASS), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig LARGE_FERN_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LARGE_FERN), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig CACTUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(CACTUS), new ColumnBlockPlacer(1, 2))).tries(10).func_227317_b_().build();
    public static final BlockClusterFeatureConfig SUGAR_CANE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SUGAR_CANE), new ColumnBlockPlacer(2, 2))).tries(20).xSpread(4).ySpread(0).zSpread(4).func_227317_b_().requiresWater().build();
    public static final BlockStateProvidingFeatureConfig HAY_PILE_CONFIG = new BlockStateProvidingFeatureConfig(new AxisRotatingBlockStateProvider(Blocks.HAY_BLOCK));
    public static final BlockStateProvidingFeatureConfig SNOW_PILE_CONFIG = new BlockStateProvidingFeatureConfig(new SimpleBlockStateProvider(SNOW));
    public static final BlockStateProvidingFeatureConfig MELON_PILE_CONFIG = new BlockStateProvidingFeatureConfig(new SimpleBlockStateProvider(MELON));
    public static final BlockStateProvidingFeatureConfig PUMPKIN_PILE_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).addWeightedBlockstate(PUMPKIN, 19).addWeightedBlockstate(JACK_O_LATERN, 1));
    public static final BlockStateProvidingFeatureConfig BLUE_ICE_PILE_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).addWeightedBlockstate(BLUE_ICE, 1).addWeightedBlockstate(PACKED_ICE, 5));
    public static final LiquidsConfig WATER_SPRING_CONFIG = new LiquidsConfig(Fluids.WATER.getDefaultState(), true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE));
    public static final LiquidsConfig LAVA_SPRING_CONFIG = new LiquidsConfig(Fluids.LAVA.getDefaultState(), true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE));
    public static final LiquidsConfig NETHER_SPRING_CONFIG = new LiquidsConfig(Fluids.LAVA.getDefaultState(), false, 4, 1, ImmutableSet.of(Blocks.NETHERRACK));
    public static final LiquidsConfig ENCLOSED_NETHER_SPRING_CONFIG = new LiquidsConfig(Fluids.LAVA.getDefaultState(), false, 5, 0, ImmutableSet.of(Blocks.NETHERRACK));
    public static final BigMushroomFeatureConfig BIG_RED_MUSHROOM = new BigMushroomFeatureConfig(new SimpleBlockStateProvider(RED_MUSHROOM_BLOCK), new SimpleBlockStateProvider(MUSHROOM_STEM), 2);
    public static final BigMushroomFeatureConfig BIG_BROWN_MUSHROOM = new BigMushroomFeatureConfig(new SimpleBlockStateProvider(BROWN_MUSHROOM_BLOCK), new SimpleBlockStateProvider(MUSHROOM_STEM), 3);

    public static void addLagoons(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(WATER)).withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(4))));
        biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(LAVA)).withPlacement(Placement.LAVA_LAKE.configure(new ChanceConfig(80))));
    }

    public static void addPalmTrees(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(PALM_TREE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10))));
    }

}
*/