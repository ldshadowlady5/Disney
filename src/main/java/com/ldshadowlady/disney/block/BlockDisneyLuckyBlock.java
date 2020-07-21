package com.ldshadowlady.disney.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.common.collect.ImmutableList;
import com.ldshadowlady.disney.registries.DisneyItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockDisneyLuckyBlock extends Block{

	boolean willHarvest = false;
	public BlockDisneyLuckyBlock() {

		super(Material.GLASS);
		setHardness(1);
		setResistance(1);
	}


	@Override
	public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
		if (super.removedByPlayer(state, world, pos, player, willHarvest)) {
			if (!world.isRemote) {
				Random rand = new Random();
				int randomNumber = rand.nextInt(2)+1;
				MinecraftServer server = world.getMinecraftServer();

				final List<Item> ListofDisneyHats = new ArrayList<>();
				ListofDisneyHats.add(DisneyItems.BAMBI_HAT);
				ListofDisneyHats.add(DisneyItems.BAYMAX_HAT);
				ListofDisneyHats.add(DisneyItems.COCO_HAT_FLORAL);
				ListofDisneyHats.add(DisneyItems.DAISY_HAT);
				ListofDisneyHats.add(DisneyItems.DALMATION_HAT_LUCKY);
				ListofDisneyHats.add(DisneyItems.DALMATION_HAT_ODDBALL);
				ListofDisneyHats.add(DisneyItems.DALMATION_HAT_PATCH);
				ListofDisneyHats.add(DisneyItems.DALMATION_HAT_PENNY);
				ListofDisneyHats.add(DisneyItems.DONALD_HAT);
				ListofDisneyHats.add(DisneyItems.FANTASIA_HAT);
				ListofDisneyHats.add(DisneyItems.GOOFY_HAT);
				ListofDisneyHats.add(DisneyItems.MICKEY_EARS);
				ListofDisneyHats.add(DisneyItems.MINNIE_EARS);
				ListofDisneyHats.add(DisneyItems.PLUTO_HAT);
				ListofDisneyHats.add(DisneyItems.POOH_HAT);
				ListofDisneyHats.add(DisneyItems.POOH_HAT);
				ListofDisneyHats.add(DisneyItems.STITCH_HAT);
				ListofDisneyHats.add(DisneyItems.TIGERLILY_HAT);
				ListofDisneyHats.add(DisneyItems.YODA_EARS);



				switch(randomNumber){
					case 1:
						player.sendMessage(new TextComponentTranslation("You wish has been DENIED.")
							.setStyle(new Style().setColor(TextFormatting.RED)));
						EntityEntry entry = ForgeRegistries.ENTITIES.getValue(new ResourceLocation("monstersandpets:goose_pet"));
						if (entry != null){
							Entity mob = entry.newInstance(world);
							mob.setPosition(player.posX, player.posY, player.posZ);
							world.spawnEntity(mob);
						}

						break;

					case 2:
						Random randomHat = new Random();
						System.out.println(randomHat);
						player.sendMessage(new TextComponentTranslation("You wish has been granted.")
							.setStyle(new Style().setColor(TextFormatting.GOLD)));


						//Spawning firework
						//EntityFireworkRocket entityfireworkrocket = new EntityFireworkRocket(world, itemstack, player);
						//world.spawnEntity(entityfireworkrocket);


						//Spawning Hat
						world.spawnEntity(new EntityItem(world, pos.getX(), (pos.getY() + 1), pos.getZ(), new ItemStack((ListofDisneyHats.get(randomHat.nextInt(ListofDisneyHats.size()))))));
						break;
					default:
						Random defaultRandomHat = new Random();
						System.out.println(defaultRandomHat);
						world.spawnEntity(new EntityItem(world,pos.getX(),(pos.getY()+1),pos.getZ(),new ItemStack((ListofDisneyHats.get(defaultRandomHat.nextInt(ListofDisneyHats.size()))))));
						break;
				}



			}
			return true;
		}
		return false;
	}

	@Override
	public int quantityDropped(Random random)
	{
	int drop = 0;
		return drop;
	}

}
