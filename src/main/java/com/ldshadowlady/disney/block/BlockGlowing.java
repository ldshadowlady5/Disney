package com.ldshadowlady.disney.block;

import java.util.Random;

import com.ldshadowlady.disney.registries.DisneyItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockGlowing extends BlockGlowstone {
	public BlockGlowing() {
		super(Material.ICE);
		this.setLightLevel(1F);
		setHardness(3);
		setResistance(5);	}

}

