package com.blocAquatika.blocAquatikaMod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static final Block shell_sand = new Block(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f,15.0f).sound(SoundType.SAND));
}
