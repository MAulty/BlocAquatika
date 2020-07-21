package com.blocAquatika.blocAquatikaMod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.HandSide;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;


public class MoorishIdolEntity extends WaterMobEntity {
    public MoorishIdolEntity(EntityType<MoorishIdolEntity> type, World world) {
        super(type, world);
    }

    //public MoorishIdolEntity(EntityType<MoorishIdolEntity> moorishIdolEntityEntityType, World world) {
    //}

    public static AttributeModifierMap.MutableAttribute func_234300_m_() {
        return MobEntity.func_233666_p_().func_233815_a_(Attributes.MAX_HEALTH, 30.0D);
    }

    public int getMaxGroupSize() {
        return 5;
    }

    protected ItemStack getFishBucket() {
        return new ItemStack(Items.SALMON_BUCKET);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SALMON_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    @Override
    public Iterable<ItemStack> getArmorInventoryList() {
        return null;
    }

    @Override
    public ItemStack getItemStackFromSlot(EquipmentSlotType slotIn) {
        return null;
    }

    @Override
    public void setItemStackToSlot(EquipmentSlotType slotIn, ItemStack stack) {

    }

    @Override
    public HandSide getPrimaryHand() {
        return null;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.ENTITY_SALMON_FLOP;
    }
}