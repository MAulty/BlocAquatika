package com.blocAquatika.blocAquatikaMod.objects.blocks;

import com.blocAquatika.blocAquatikaMod.BlocAquatika;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import static com.blocAquatika.blocAquatikaMod.objects.blocks.ModBlocks.lobster_trap;

public class lobster_trap extends Block
{

    public static lobster_trap INST = new lobster_trap();
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
    protected static final VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape TOP_SHAPE = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;

    public lobster_trap(Properties properties) {
        super(properties);
        //super.setRegistryName(BlocAquatika.MOD_ID, "lobster_trap");
    }

    public lobster_trap(){
        super(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

        RenderTypeLookup.setRenderLayer(this, RenderType.getCutoutMipped());

        //super.setRegistryName(BlocAquatika.MOD_ID, "lobster_trap");
    }
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
        return BOTTOM_SHAPE;
    }


/*
    public BlockRenderType getBlockLayer(){
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public boolean isOpaqueCube(IBlockReader worldIn, BlockPos pos) {
        return false;
    }
*/
}
