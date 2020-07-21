package com.blocAquatika.blocAquatikaMod.block;

import com.blocAquatika.*;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;

public class lobsterTrap extends CropsBlock {
    public lobsterTrap(){
        super(Properties.create(Material.MISCELLANEOUS).tickRandomly().hardnessAndResistance(0.5f).doesNotBlockMovement().sound(SoundType.CORAL).harvestLevel(3));
    }

    protected IItemProvider getLobsterItem(){
        return null;
    }

}
