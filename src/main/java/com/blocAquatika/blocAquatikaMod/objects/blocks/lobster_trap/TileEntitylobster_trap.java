package com.blocAquatika.blocAquatikaMod.objects.blocks.lobster_trap;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;

import javax.annotation.Nullable;

public class TileEntitylobster_trap extends TileEntity implements ITickableTileEntity {
    public TileEntitylobster_trap() {super(StartupCommon.tileEntityDataTypeLobster);}


    // When the world loads from disk, the server needs to send the TileEntity information to the client
    //  it uses getUpdatePacket(), getUpdateTag(), onDataPacket(), and handleUpdateTag() to do this:
    //  getUpdatePacket() and onDataPacket() are used for one-at-a-time TileEntity updates
    //  getUpdateTag() and handleUpdateTag() are used by vanilla to collate together into a single chunk update packet
    @Override
    @Nullable
    public SUpdateTileEntityPacket getUpdatePacket()
    {
        CompoundNBT nbtTagCompound = new CompoundNBT();
        write(nbtTagCompound);
        int tileEntityType = 42;  // arbitrary number; only used for vanilla TileEntities.  You can use it, or not, as you want.
        return new SUpdateTileEntityPacket(this.pos, tileEntityType, nbtTagCompound);
    }

    /* Creates a tag containing the TileEntity information, used by vanilla to transmit from server to client
     */
    @Override
    public CompoundNBT getUpdateTag()
    {
        CompoundNBT nbtTagCompound = new CompoundNBT();
        write(nbtTagCompound);
        return nbtTagCompound;
    }

    /* Populates this TileEntity with information from the tag, used by vanilla to transmit from server to client
     */
    @Override
    public void handleUpdateTag(CompoundNBT tag)
    {
        this.read(tag);
    }


    /**
     * Don't render the object if the player is too far away
     * @return the maximum distance squared at which the TER should render
     */
    @Override
    public double getMaxRenderDistanceSquared()
    {
        final int MAXIMUM_DISTANCE_IN_BLOCKS = 32;
        return MAXIMUM_DISTANCE_IN_BLOCKS * MAXIMUM_DISTANCE_IN_BLOCKS;
    }

    /** Return an appropriate bounding box enclosing the TER
     * This method is used to control whether the TER should be rendered or not, depending on where the player is looking.
     * The default is the AABB for the parent block, which might be too small if the TER renders outside the borders of the
     *   parent block.
     * If you get the boundary too small, the TER may disappear when you aren't looking directly at it.
     * @return an appropriately size AABB for the TileEntity
     */
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        // if your render should always be performed regardless of where the player is looking, use infinite
        //   Your should also change TileEntitySpecialRenderer.isGlobalRenderer().
        AxisAlignedBB infiniteExample = INFINITE_EXTENT_AABB;

        return infiniteExample;
    }

    //public lobster_trap_model.InteractiveParameters getInteractiveParameters() {return interactiveParameters;}

    @Override
    public void tick() {

    }
}
