package com.ldshadowlady.disney.item;

import com.ldshadowlady.disney.registries.DisneyItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DisneyTab extends CreativeTabs{
 private static final class Holder{
 		private static final CreativeTabs INSTANCE = new DisneyTab();
	}

	private DisneyTab() {super("disney"); }

	@Override
	public ItemStack getTabIconItem() {return new ItemStack(DisneyItems.FANTASIA_HAT); }

	public static CreativeTabs instance() {
		return Holder.INSTANCE;
	}

}