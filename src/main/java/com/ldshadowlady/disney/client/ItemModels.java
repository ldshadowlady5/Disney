package com.ldshadowlady.disney.client;

import com.ldshadowlady.disney.Disney;
import com.ldshadowlady.disney.registries.DisneyItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Disney.MODID)
public final class ItemModels {
	public ItemModels() {}

	@SubscribeEvent
	public static void onRegister(ModelRegistryEvent event) {
		register(DisneyItems.MICKEY_EARS);
		register(DisneyItems.MINNIE_EARS);
		register(DisneyItems.STITCH_HAT);
		register(DisneyItems.YODA_EARS);
		register(DisneyItems.BAYMAX_HAT);
		register(DisneyItems.DONALD_HAT);
		register(DisneyItems.GOOFY_HAT);
		register(DisneyItems.PLUTO_HAT);
		register(DisneyItems.POOH_HAT);
		register(DisneyItems.ALADDIN_HAT);
		register(DisneyItems.DAISY_HAT);
		register(DisneyItems.BAMBI_HAT);
		register(DisneyItems.FANTASIA_HAT);
		register(DisneyItems.COCO_HAT_FLORAL);
		register(DisneyItems.DALMATION_HAT_PATCH);
		register(DisneyItems.DALMATION_HAT_ODDBALL);
		register(DisneyItems.DALMATION_HAT_PENNY);
		register(DisneyItems.DALMATION_HAT_LUCKY);
		register(DisneyItems.TIGERLILY_HAT);
		register(DisneyItems.DISNEY_WISH);

		register(DisneyItems.DISNEY_LUCKY_BLOCK);
		register(DisneyItems.DISNEY_ORE);
		register(DisneyItems.PLANKS_LIGHT_BLUE);
		register(DisneyItems.PLANKS_LIME);
		register(DisneyItems.PLANKS_MAGENTA);
		register(DisneyItems.PLANKS_ORANGE);
		register(DisneyItems.PLANKS_PINK);
		register(DisneyItems.PLANKS_SALMON);
		register(DisneyItems.PLANKS_PURPLE	);
		register(DisneyItems.PLANKS_LIGHT_BLUE_STAIRS);
		register(DisneyItems.PLANKS_LIME_STAIRS);
		register(DisneyItems.PLANKS_MAGENTA_STAIRS);
		register(DisneyItems.PLANKS_ORANGE_STAIRS);
		register(DisneyItems.PLANKS_PINK_STAIRS);
		register(DisneyItems.PLANKS_PURPLE_STAIRS);
		register(DisneyItems.PLANKS_SALMON_STAIRS);


		register(DisneyItems.GLOWING_WHITE);
		register(DisneyItems.GLOWING_PASTEL_RAINBOW);
		register(DisneyItems.GLOWING_PINK);
		register(DisneyItems.GLOWING_RAINBOW);
		register(DisneyItems.KITCHEN_COUNTER_PINK);
		register(DisneyItems.KITCHEN_DRAWERS_PINK);
		register(DisneyItems.KITCHEN_CUPBOARD_PINK);
		register(DisneyItems.KITCHEN_SINK_PINK);
		register(DisneyItems.KITCHEN_BLANK_PINK);
		register(DisneyItems.KITCHEN_COUNTER_MINT);
		register(DisneyItems.KITCHEN_DRAWERS_MINT);
		register(DisneyItems.KITCHEN_CUPBOARD_MINT);
		register(DisneyItems.KITCHEN_SINK_MINT);
		register(DisneyItems.KITCHEN_BLANK_MINT);
		register(DisneyItems.KITCHEN_COUNTER_PURPLE);
		register(DisneyItems.KITCHEN_DRAWERS_PURPLE);
		register(DisneyItems.KITCHEN_CUPBOARD_PURPLE);
		register(DisneyItems.KITCHEN_SINK_PURPLE);
		register(DisneyItems.KITCHEN_BLANK_PURPLE);
		register(DisneyItems.KITCHEN_COUNTER_WOOD);
		register(DisneyItems.KITCHEN_DRAWERS_WOOD);
		register(DisneyItems.KITCHEN_CUPBOARD_WOOD);
		register(DisneyItems.KITCHEN_SINK_WOOD);
		register(DisneyItems.KITCHEN_BLANK_WOOD);
		register(DisneyItems.KITCHEN_COUNTER_DARK);
		register(DisneyItems.KITCHEN_DRAWERS_DARK);
		register(DisneyItems.KITCHEN_CUPBOARD_DARK);
		register(DisneyItems.KITCHEN_SINK_DARK);
		register(DisneyItems.KITCHEN_BLANK_DARK);
		register(DisneyItems.KITCHEN_FRIDGE_LOWER);
		register(DisneyItems.KITCHEN_FRIDGE_UPPER);
		register(DisneyItems.KITCHEN_OVEN);
		register(DisneyItems.KITCHEN_CHAIR_BROWN);
		register(DisneyItems.KITCHEN_TABLE_BROWN);
		register(DisneyItems.KITCHEN_TABLE_HALF_BROWN);
		register(DisneyItems.KITCHEN_CHAIR_WHITE);
		register(DisneyItems.KITCHEN_TABLE_WHITE);
		register(DisneyItems.KITCHEN_TABLE_HALF_WHITE);
		register(DisneyItems.KITCHEN_CHAIR_BLACK);
		register(DisneyItems.KITCHEN_TABLE_BLACK);
		register(DisneyItems.KITCHEN_TABLE_HALF_BLACK);
		register(DisneyItems.KITCHEN_SHELF_WHITE_LEFT);
		register(DisneyItems.KITCHEN_SHELF_WHITE_RIGHT);
		register(DisneyItems.KITCHEN_SHELF_WHITE_SINGLE);
		register(DisneyItems.KITCHEN_SHELF_BROWN_LEFT);
		register(DisneyItems.KITCHEN_SHELF_BROWN_RIGHT);
		register(DisneyItems.KITCHEN_SHELF_BROWN_SINGLE);
	}

	private static ModelResourceLocation register(Item item) {
		return register(item, 0);
	}

	private static ModelResourceLocation register(Item item, int id) {
		ResourceLocation name = item.getRegistryName();
		if (name == null) {
			throw new RuntimeException("Missing register name: " + item.getClass().getName() + ", unlocalizedName = " + item.getUnlocalizedName());
		}
		ModelResourceLocation resource = new ModelResourceLocation(Disney.MODID + ':' + name.getResourcePath(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, id, resource);
		return resource;
	}
}
