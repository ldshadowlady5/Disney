package com.ldshadowlady.disney.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemDisneyHat extends ItemArmor{
	public ItemDisneyHat(){
		super(ItemArmor.ArmorMaterial.DIAMOND, 2, EntityEquipmentSlot.HEAD);
	}

	@Override
	public EntityEquipmentSlot getEquipmentSlot() {
		return null;
	}

	@Override
	public boolean isDamageable() {
		return false;
	}

	@Override
	public int getDamage(ItemStack stack) {
		return 0;
	}

	@Override
	public void setDamage(ItemStack stack, int damage) {}



}
