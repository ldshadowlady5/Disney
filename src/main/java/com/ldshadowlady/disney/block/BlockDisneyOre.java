package com.ldshadowlady.disney.block;

import java.util.Random;

import com.ldshadowlady.disney.registries.DisneyItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDisneyOre extends BlockOre {

	public BlockDisneyOre() {
		super();
		setHardness(3);
		setResistance(5);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
			return DisneyItems.DISNEY_WISH;
	}
}
