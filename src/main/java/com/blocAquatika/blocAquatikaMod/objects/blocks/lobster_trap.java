package com.blocAquatika.blocAquatikaMod.objects.blocks;

import com.blocAquatika.blocAquatikaMod.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import java.util.Random;

public class lobster_trap extends Block implements IGrowable//, IWaterLoggable
{
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;
    public static lobster_trap INST = new lobster_trap();
    public static final VoxelShape SHAPE = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
    public static final VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    public static final VoxelShape TOP_SHAPE = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;

//

    public lobster_trap(Properties properties) {
        super(properties);
    }

    public lobster_trap(){
        super(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    }


    public static boolean cannotAttach(Block blockIn) {
        return blockIn instanceof LeavesBlock || blockIn == INST || blockIn == Blocks.CARVED_PUMPKIN || blockIn == Blocks.JACK_O_LANTERN || blockIn == Blocks.MELON || blockIn == Blocks.PUMPKIN;
    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
        return BOTTOM_SHAPE;
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(RegistryHandler.LOBSTER.get());
    }

    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }

    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        super.tick(state, worldIn, pos, rand);
        int i = state.get(AGE);
        if (i < 3 && worldIn.getLightSubtracted(pos.up(), 0) >= 9 && net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, rand.nextInt(5) == 0)) {
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i + 1)), 2);
            net.minecraftforge.common.ForgeHooks.onCropsGrowPost(worldIn, pos, state);
        }

    }

    public boolean isOpaqueCube(IBlockReader worldIn, BlockPos pos) {
        return false;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return state.get(AGE) < 3;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }


    public void func_225535_a_(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {

    }

    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        int i = Math.min(3, state.get(AGE) + 1);
        worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i)), 2);
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        boolean flag = state.get(AGE) == 3;
        if (!flag && player.getHeldItem(handIn).getItem() == Items.BONE_MEAL) {
            return ActionResultType.PASS;
        } else if (state.get(AGE) > 1) {
            int j = 1 + worldIn.rand.nextInt(2);
            spawnAsEntity(worldIn, pos, new ItemStack(RegistryHandler.LOBSTER.get(), j + (flag ? 1 : 0)));
            worldIn.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_CHEST_OPEN, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.rand.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);
            return ActionResultType.SUCCESS;
        } else {
            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }


}
