package com.ldshadowlady.disney.registries;

import java.util.stream.Stream;

import com.ldshadowlady.disney.Disney;
import com.ldshadowlady.disney.item.*;
import com.ldshadowlady.disney.util.Util;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Disney.MODID)
@Mod.EventBusSubscriber(modid = Disney.MODID)
public class DisneyItems {

	private static final Item NIL = Items.AIR;
	public static final Item MICKEY_EARS = NIL;
	public static final Item MINNIE_EARS = NIL;
	public static final Item STITCH_HAT = NIL;
	public static final Item YODA_EARS = NIL;
	public static final Item BAYMAX_HAT = NIL;
	public static final Item DONALD_HAT = NIL;
	public static final Item GOOFY_HAT = NIL;
	public static final Item PLUTO_HAT = NIL;
	public static final Item POOH_HAT = NIL;
	public static final Item ALADDIN_HAT = NIL;
	public static final Item DAISY_HAT = NIL;
	public static final Item BAMBI_HAT = NIL;
	public static final Item FANTASIA_HAT = NIL;
	public static final Item COCO_HAT_FLORAL = NIL;
	public static final Item DALMATION_HAT_PATCH = NIL;
	public static final Item DALMATION_HAT_ODDBALL = NIL;
	public static final Item DALMATION_HAT_PENNY = NIL;
	public static final Item DALMATION_HAT_LUCKY = NIL;
	public static final Item TIGERLILY_HAT = NIL;
	public static final Item DISNEY_WISH = NIL;

	public static final Item DISNEY_LUCKY_BLOCK = NIL;
	public static final Item DISNEY_ORE = NIL;
	public static final Item PLANKS_LIGHT_BLUE = NIL;
	public static final Item PLANKS_LIME = NIL;
	public static final Item PLANKS_MAGENTA = NIL;
	public static final Item PLANKS_ORANGE = NIL;
	public static final Item PLANKS_PINK = NIL;
	public static final Item PLANKS_PURPLE = NIL;
	public static final Item PLANKS_SALMON = NIL;
	public static final Item PLANKS_LIGHT_BLUE_STAIRS = NIL;
	public static final Item PLANKS_LIME_STAIRS = NIL;
	public static final Item PLANKS_MAGENTA_STAIRS = NIL;
	public static final Item PLANKS_ORANGE_STAIRS = NIL;
	public static final Item PLANKS_PINK_STAIRS = NIL;
	public static final Item PLANKS_PURPLE_STAIRS = NIL;
	public static final Item PLANKS_SALMON_STAIRS = NIL;

	public static final Item GLOWING_WHITE = NIL;
	public static final Item GLOWING_PASTEL_RAINBOW = NIL;
	public static final Item GLOWING_PINK = NIL;
	public static final Item GLOWING_RAINBOW = NIL;
	public static final Item KITCHEN_COUNTER_PINK = NIL;
	public static final Item KITCHEN_DRAWERS_PINK = NIL;
	public static final Item KITCHEN_CUPBOARD_PINK = NIL;
	public static final Item KITCHEN_SINK_PINK = NIL;
	public static final Item KITCHEN_BLANK_PINK = NIL;
	public static final Item KITCHEN_COUNTER_MINT = NIL;
	public static final Item KITCHEN_DRAWERS_MINT = NIL;
	public static final Item KITCHEN_CUPBOARD_MINT = NIL;
	public static final Item KITCHEN_SINK_MINT = NIL;
	public static final Item KITCHEN_BLANK_MINT= NIL;
	public static final Item KITCHEN_COUNTER_PURPLE = NIL;
	public static final Item KITCHEN_DRAWERS_PURPLE = NIL;
	public static final Item KITCHEN_CUPBOARD_PURPLE = NIL;
	public static final Item KITCHEN_SINK_PURPLE = NIL;
	public static final Item KITCHEN_BLANK_PURPLE = NIL;
	public static final Item KITCHEN_COUNTER_WOOD = NIL;
	public static final Item KITCHEN_DRAWERS_WOOD = NIL;
	public static final Item KITCHEN_CUPBOARD_WOOD = NIL;
	public static final Item KITCHEN_SINK_WOOD = NIL;
	public static final Item KITCHEN_BLANK_WOOD = NIL;
	public static final Item KITCHEN_COUNTER_DARK = NIL;
	public static final Item KITCHEN_DRAWERS_DARK = NIL;
	public static final Item KITCHEN_CUPBOARD_DARK = NIL;
	public static final Item KITCHEN_SINK_DARK = NIL;
	public static final Item KITCHEN_BLANK_DARK = NIL;
	public static final Item KITCHEN_FRIDGE_LOWER = NIL;
	public static final Item KITCHEN_FRIDGE_UPPER = NIL;
	public static final Item KITCHEN_OVEN = NIL;
	public static final Item KITCHEN_CHAIR_BROWN = NIL;
	public static final Item KITCHEN_TABLE_BROWN = NIL;
	public static final Item KITCHEN_TABLE_HALF_BROWN = NIL;
	public static final Item KITCHEN_CHAIR_WHITE = NIL;
	public static final Item KITCHEN_TABLE_WHITE = NIL;
	public static final Item KITCHEN_TABLE_HALF_WHITE = NIL;
	public static final Item KITCHEN_CHAIR_BLACK = NIL;
	public static final Item KITCHEN_TABLE_BLACK = NIL;
	public static final Item KITCHEN_TABLE_HALF_BLACK = NIL;
	public static final Item KITCHEN_SHELF_WHITE_LEFT = NIL;
	public static final Item KITCHEN_SHELF_WHITE_RIGHT = NIL;
	public static final Item KITCHEN_SHELF_WHITE_SINGLE= NIL;
	public static final Item KITCHEN_SHELF_BROWN_LEFT = NIL;
	public static final Item KITCHEN_SHELF_BROWN_RIGHT = NIL;
	public static final Item KITCHEN_SHELF_BROWN_SINGLE= NIL;


	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			create(new ItemDisneyHat(), "mickey_ears"),
			create(new ItemDisneyHat(), "minnie_ears"),
			create(new ItemDisneyHat(), "stitch_hat"),
			create(new ItemDisneyHat(), "yoda_ears"),
			create(new ItemDisneyHat(), "baymax_hat"),
			create(new ItemDisneyHat(), "donald_hat"),
			create(new ItemDisneyHat(), "goofy_hat"),
			create(new ItemDisneyHat(), "pluto_hat"),
			create(new ItemDisneyHat(), "pooh_hat"),
			create(new ItemDisneyHat(), "aladdin_hat"),
			create(new ItemDisneyHat(), "daisy_hat"),
			create(new ItemDisneyHat(), "bambi_hat"),
			create(new ItemDisneyHat(), "fantasia_hat"),
			create(new ItemDisneyHat(), "coco_hat_floral"),
			create(new ItemDisneyHat(), "dalmation_hat_patch"),
			create(new ItemDisneyHat(), "dalmation_hat_oddball"),
			create(new ItemDisneyHat(), "dalmation_hat_penny"),
			create(new ItemDisneyHat(), "dalmation_hat_lucky"),
			create(new ItemDisneyHat(), "tigerlily_hat"),
			create(new ItemDisneyWish(), "disney_wish"),

			create(DisneyBlocks.DISNEY_LUCKY_BLOCK),
			create(DisneyBlocks.DISNEY_ORE),
			create(DisneyBlocks.PLANKS_LIGHT_BLUE),
			create(DisneyBlocks.PLANKS_LIME),
			create(DisneyBlocks.PLANKS_MAGENTA),
			create(DisneyBlocks.PLANKS_ORANGE),
			create(DisneyBlocks.PLANKS_PINK),
			create(DisneyBlocks.PLANKS_PURPLE),
			create(DisneyBlocks.PLANKS_SALMON),
			create(DisneyBlocks.PLANKS_LIGHT_BLUE_STAIRS),
			create(DisneyBlocks.PLANKS_LIME_STAIRS),
			create(DisneyBlocks.PLANKS_MAGENTA_STAIRS),
			create(DisneyBlocks.PLANKS_ORANGE_STAIRS),
			create(DisneyBlocks.PLANKS_PINK_STAIRS),
			create(DisneyBlocks.PLANKS_PURPLE_STAIRS),
			create(DisneyBlocks.PLANKS_SALMON_STAIRS),
			create(DisneyBlocks.GLOWING_WHITE),
			create(DisneyBlocks.GLOWING_PASTEL_RAINBOW),
			create(DisneyBlocks.GLOWING_PINK),
			create(DisneyBlocks.GLOWING_RAINBOW),
			create(DisneyBlocks.KITCHEN_COUNTER_PINK),
			create(DisneyBlocks.KITCHEN_DRAWERS_PINK),
			create(DisneyBlocks.KITCHEN_CUPBOARD_PINK),
			create(DisneyBlocks.KITCHEN_SINK_PINK),
			create(DisneyBlocks.KITCHEN_BLANK_PINK),
			create(DisneyBlocks.KITCHEN_COUNTER_MINT),
			create(DisneyBlocks.KITCHEN_DRAWERS_MINT),
			create(DisneyBlocks.KITCHEN_CUPBOARD_MINT),
			create(DisneyBlocks.KITCHEN_SINK_MINT),
			create(DisneyBlocks.KITCHEN_BLANK_MINT),
			create(DisneyBlocks.KITCHEN_COUNTER_PURPLE),
			create(DisneyBlocks.KITCHEN_DRAWERS_PURPLE),
			create(DisneyBlocks.KITCHEN_CUPBOARD_PURPLE),
			create(DisneyBlocks.KITCHEN_SINK_PURPLE),
			create(DisneyBlocks.KITCHEN_BLANK_PURPLE),
			create(DisneyBlocks.KITCHEN_COUNTER_WOOD),
			create(DisneyBlocks.KITCHEN_DRAWERS_WOOD),
			create(DisneyBlocks.KITCHEN_CUPBOARD_WOOD),
			create(DisneyBlocks.KITCHEN_SINK_WOOD),
			create(DisneyBlocks.KITCHEN_BLANK_WOOD),
			create(DisneyBlocks.KITCHEN_COUNTER_DARK),
			create(DisneyBlocks.KITCHEN_DRAWERS_DARK),
			create(DisneyBlocks.KITCHEN_CUPBOARD_DARK),
			create(DisneyBlocks.KITCHEN_SINK_DARK),
			create(DisneyBlocks.KITCHEN_BLANK_DARK),
			create(DisneyBlocks.KITCHEN_FRIDGE_LOWER),
			create(DisneyBlocks.KITCHEN_FRIDGE_UPPER),
			create(DisneyBlocks.KITCHEN_OVEN),
			create(DisneyBlocks.KITCHEN_CHAIR_BROWN),
			create(DisneyBlocks.KITCHEN_TABLE_BROWN),
			create(DisneyBlocks.KITCHEN_TABLE_HALF_BROWN),
			create(DisneyBlocks.KITCHEN_CHAIR_WHITE),
			create(DisneyBlocks.KITCHEN_TABLE_WHITE),
			create(DisneyBlocks.KITCHEN_TABLE_HALF_WHITE),
			create(DisneyBlocks.KITCHEN_CHAIR_BLACK),
			create(DisneyBlocks.KITCHEN_TABLE_BLACK),
			create(DisneyBlocks.KITCHEN_TABLE_HALF_BLACK),
			create(DisneyBlocks.KITCHEN_SHELF_WHITE_LEFT),
			create(DisneyBlocks.KITCHEN_SHELF_WHITE_RIGHT),
			create(DisneyBlocks.KITCHEN_SHELF_WHITE_SINGLE),
			create(DisneyBlocks.KITCHEN_SHELF_BROWN_LEFT),
			create(DisneyBlocks.KITCHEN_SHELF_BROWN_RIGHT),
			create(DisneyBlocks.KITCHEN_SHELF_BROWN_SINGLE)
			


		);
	}



	private static Item[] create(Block... blocks) {
		return Stream.of(blocks).map(DisneyItems::create).toArray(Item[]::new);
	}

	private static Item create(Block block) {
		return create(new ItemBlock(block));
	}

	private static Item create(ItemBlock item) {
		return create(item, item.getBlock().getRegistryName().toString());
	}

	private static Item create(Item item, String registryName) {return create(item, registryName, DisneyTab.instance());}

	private static Item create(Item item, String registryName, CreativeTabs tab) {return Util.name(item, registryName).setCreativeTab(tab);}
}