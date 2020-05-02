package com.blocAquatika.blocAquatikaMod.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class ModBlocks {
    public static final Block palm_log = new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.JUNGLE_LOG));
    public static final Block palm_leaves = new LeavesBlock(Block.Properties.from(Blocks.JUNGLE_LEAVES));
    public static final Block shell_sand = new Block(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f,15.0f).sound(SoundType.SAND));
    public static final Block lobster_trap = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
}
