package com.ldshadowlady.disney.world;

import java.util.Random;

import com.ldshadowlady.disney.registries.DisneyBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WorldGen {
	private WorldGenerator gen_disney_ore = new WorldGenMinable(DisneyBlocks.DISNEY_ORE.getDefaultState(), 3);


	@SubscribeEvent
	public void onBiomeDecorate(DecorateBiomeEvent.Post event) {
		World world = event.getWorld();
		Random random = event.getRand();
		BlockPos pos = event.getPos();
		this.runGenerator(this.gen_disney_ore, world, random, pos, 50, 4, 64);

	}


	private void runGenerator(WorldGenerator generator, World world, Random rand, BlockPos chunkPos, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			generator.generate(world, rand, chunkPos.add(rand.nextInt(16),minHeight + rand.nextInt(heightDiff),rand.nextInt(16)));
		}
	}

}
