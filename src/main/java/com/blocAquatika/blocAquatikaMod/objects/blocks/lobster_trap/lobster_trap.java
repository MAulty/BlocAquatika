package com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;

import com.blocAquatika.blocAquatikaMod.BlocAquatika;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

public class lobster_trap extends Block {

    public static lobster_trap LobBlock = new lobster_trap();

    public lobster_trap(Properties properties) {
        super(properties.create(Material.WOOD));
        //setRegistryName(BlocAquatika.MOD_ID + ":lobster_trap");
    }

    public lobster_trap(){
        super(Properties.create(Material.WOOD));
        //setRegistryName(BlocAquatika.MOD_ID + ":lobster_trap");
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return false;
    }

    // Called when the block is placed or loaded client side to get the tile entity for the block
    // Should return a new instance of the tile entity for the block

    // Called just after the player places a block.  Make the block the active model.
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if (tileentity instanceof TileEntitylobster_trap) { // prevent a crash if not the right type, or is null
            TileEntitylobster_trap tileEntityLobster = (TileEntitylobster_trap) tileentity;
        }
        //LOGGER.warn("Usage:");
        //LOGGER.warn("Right click block to activate it.");
        //LOGGER.warn("Use command mbedebug param and mbedebug paramvec3d to modify model parameters in real time");*/
    }

    /*@Override
    public ActionResultType onBlockActivated(BlockState blockState, World world, BlockPos blockPos,
                                             PlayerEntity playerEntity, Hand hand, BlockRayTraceResult rayTraceResult) {
//    if (world.isRemote()) return ActionResultType.SUCCESS;
        TileEntity tileentity = world.getTileEntity(blockPos);
        if (tileentity instanceof TileEntityMBE80) { // prevent a crash if not the right type, or is null
            TileEntityMBE80 tileEntityMBE80 = (TileEntityMBE80)tileentity;
            tileEntityMBE80.getInteractiveParameters().makeThisModelActive(blockPos);
            tileEntityMBE80.getInteractiveParameters().printToConsole();
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.FAIL;  // should never get here
    }*/


    // Include space above the block

    private static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D);

    //Logger LOGGER = LogManager.getLogger();
}
