package com.ldshadowlady.disney.registries;

import com.ldshadowlady.disney.Disney;
import com.ldshadowlady.disney.block.*;
import com.ldshadowlady.disney.item.DisneyTab;
import com.ldshadowlady.disney.util.HarvestLevel;
import com.ldshadowlady.disney.util.Util;
import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Disney.MODID)
@Mod.EventBusSubscriber(modid = Disney.MODID)
public class DisneyBlocks {

	private final static Block NIL = Blocks.AIR;
	public static final Block DISNEY_LUCKY_BLOCK = NIL;
	public static final Block DISNEY_ORE = NIL;
	public static final Block PLANKS_LIGHT_BLUE = NIL;
	public static final Block PLANKS_LIME = NIL;
	public static final Block PLANKS_MAGENTA = NIL;
	public static final Block PLANKS_ORANGE = NIL;
	public static final Block PLANKS_PINK = NIL;
	public static final Block PLANKS_PURPLE = NIL;
	public static final Block PLANKS_SALMON = NIL;
	public static final Block PLANKS_LIGHT_BLUE_STAIRS = NIL;
	public static final Block PLANKS_LIME_STAIRS = NIL;
	public static final Block PLANKS_MAGENTA_STAIRS = NIL;
	public static final Block PLANKS_ORANGE_STAIRS = NIL;
	public static final Block PLANKS_PINK_STAIRS = NIL;
	public static final Block PLANKS_PURPLE_STAIRS = NIL;
	public static final Block PLANKS_SALMON_STAIRS = NIL;
	public static final Block GLOWING_WHITE = NIL;
	public static final Block GLOWING_PASTEL_RAINBOW = NIL;
	public static final Block GLOWING_PINK = NIL;
	public static final Block GLOWING_RAINBOW = NIL;
	public static final Block KITCHEN_COUNTER_PINK = NIL;
	public static final Block KITCHEN_DRAWERS_PINK = NIL;
	public static final Block KITCHEN_CUPBOARD_PINK = NIL;
	public static final Block KITCHEN_SINK_PINK = NIL;
	public static final Block KITCHEN_BLANK_PINK = NIL;
	public static final Block KITCHEN_COUNTER_MINT = NIL;
	public static final Block KITCHEN_DRAWERS_MINT = NIL;
	public static final Block KITCHEN_CUPBOARD_MINT = NIL;
	public static final Block KITCHEN_SINK_MINT = NIL;
	public static final Block KITCHEN_BLANK_MINT= NIL;
	public static final Block KITCHEN_COUNTER_PURPLE = NIL;
	public static final Block KITCHEN_DRAWERS_PURPLE = NIL;
	public static final Block KITCHEN_CUPBOARD_PURPLE = NIL;
	public static final Block KITCHEN_SINK_PURPLE = NIL;
	public static final Block KITCHEN_BLANK_PURPLE = NIL;
	public static final Block KITCHEN_COUNTER_WOOD = NIL;
	public static final Block KITCHEN_DRAWERS_WOOD = NIL;
	public static final Block KITCHEN_CUPBOARD_WOOD = NIL;
	public static final Block KITCHEN_SINK_WOOD = NIL;
	public static final Block KITCHEN_BLANK_WOOD = NIL;
	public static final Block KITCHEN_COUNTER_DARK = NIL;
	public static final Block KITCHEN_DRAWERS_DARK = NIL;
	public static final Block KITCHEN_CUPBOARD_DARK = NIL;
	public static final Block KITCHEN_SINK_DARK = NIL;
	public static final Block KITCHEN_BLANK_DARK = NIL;
	public static final Block KITCHEN_FRIDGE_LOWER = NIL;
	public static final Block KITCHEN_FRIDGE_UPPER = NIL;
	public static final Block KITCHEN_OVEN = NIL;
	public static final Block KITCHEN_CHAIR_BROWN = NIL;
	public static final Block KITCHEN_TABLE_BROWN= NIL;
	public static final Block KITCHEN_TABLE_HALF_BROWN= NIL;
	public static final Block KITCHEN_CHAIR_WHITE = NIL;
	public static final Block KITCHEN_TABLE_WHITE= NIL;
	public static final Block KITCHEN_TABLE_HALF_WHITE= NIL;
	public static final Block KITCHEN_CHAIR_BLACK = NIL;
	public static final Block KITCHEN_TABLE_BLACK= NIL;
	public static final Block KITCHEN_TABLE_HALF_BLACK= NIL;
	public static final Block KITCHEN_SHELF_WHITE_LEFT = NIL;
	public static final Block KITCHEN_SHELF_WHITE_RIGHT = NIL;
	public static final Block KITCHEN_SHELF_WHITE_SINGLE = NIL;
	public static final Block KITCHEN_SHELF_BROWN_LEFT = NIL;
	public static final Block KITCHEN_SHELF_BROWN_RIGHT = NIL;
	public static final Block KITCHEN_SHELF_BROWN_SINGLE = NIL;


	@SubscribeEvent
	public static void onRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
			create(new BlockDisneyLuckyBlock(), "disney_lucky_block"),
			create(new BlockDisneyOre(), "disney_ore"),
			create(new BlockDisneyPlanks(), "planks_light_blue"),
			create(new BlockDisneyPlanks(), "planks_lime"),
			create(new BlockDisneyPlanks(), "planks_magenta"),
			create(new BlockDisneyPlanks(), "planks_orange"),
			create(new BlockDisneyPlanks(), "planks_pink"),
			create(new BlockDisneyPlanks(), "planks_purple"),
			create(new BlockDisneyPlanks(), "planks_salmon"),
			create(new BlockDisneyPlanksStairs(PLANKS_LIGHT_BLUE_STAIRS.getDefaultState()),"planks_light_blue_stairs"),
			create(new BlockDisneyPlanksStairs(PLANKS_LIME_STAIRS.getDefaultState()),"planks_lime_stairs"),
			create(new BlockDisneyPlanksStairs(PLANKS_MAGENTA_STAIRS.getDefaultState()),"planks_magenta_stairs"),
			create(new BlockDisneyPlanksStairs(PLANKS_ORANGE_STAIRS.getDefaultState()),"planks_orange_stairs"),
			create(new BlockDisneyPlanksStairs(PLANKS_PINK_STAIRS.getDefaultState()),"planks_pink_stairs"),
			create(new BlockDisneyPlanksStairs(PLANKS_PURPLE_STAIRS.getDefaultState()),"planks_purple_stairs"),
			create(new BlockDisneyPlanksStairs(PLANKS_SALMON_STAIRS.getDefaultState()),"planks_salmon_stairs"),
			create(new BlockGlowing(), "glowing_white"),
			create(new BlockGlowing(), "glowing_pastel_rainbow"),
			create(new BlockGlowing(), "glowing_pink"),
			create(new BlockGlowing(), "glowing_rainbow"),
			create(new BlockKitchen(), "kitchen_counter_pink"),
			create(new BlockKitchen(), "kitchen_drawers_pink"),
			create(new BlockKitchen(), "kitchen_cupboard_pink"),
			create(new BlockKitchen(), "kitchen_sink_pink"),
			create(new BlockKitchen(), "kitchen_blank_pink"),
			create(new BlockKitchen(), "kitchen_counter_mint"),
			create(new BlockKitchen(), "kitchen_drawers_mint"),
			create(new BlockKitchen(), "kitchen_cupboard_mint"),
			create(new BlockKitchen(), "kitchen_sink_mint"),
			create(new BlockKitchen(), "kitchen_blank_mint"),
			create(new BlockKitchen(), "kitchen_counter_purple"),
			create(new BlockKitchen(), "kitchen_drawers_purple"),
			create(new BlockKitchen(), "kitchen_cupboard_purple"),
			create(new BlockKitchen(), "kitchen_sink_purple"),
			create(new BlockKitchen(), "kitchen_blank_purple"),
			create(new BlockKitchen(), "kitchen_counter_wood"),
			create(new BlockKitchen(), "kitchen_drawers_wood"),
			create(new BlockKitchen(), "kitchen_cupboard_wood"),
			create(new BlockKitchen(), "kitchen_sink_wood"),
			create(new BlockKitchen(), "kitchen_blank_wood"),
			create(new BlockKitchen(), "kitchen_counter_dark"),
			create(new BlockKitchen(), "kitchen_drawers_dark"),
			create(new BlockKitchen(), "kitchen_cupboard_dark"),
			create(new BlockKitchen(), "kitchen_sink_dark"),
			create(new BlockKitchen(), "kitchen_blank_dark"),
			create(new BlockKitchen(), "kitchen_fridge_lower"),
			create(new BlockKitchen(), "kitchen_fridge_upper"),
			create(new BlockKitchen(), "kitchen_oven"),
			create(new BlockKitchen(), "kitchen_chair_brown"),
			create(new BlockKitchen(), "kitchen_table_brown"),
			create(new BlockKitchen(), "kitchen_table_half_brown"),
			create(new BlockKitchen(), "kitchen_chair_white"),
			create(new BlockKitchen(), "kitchen_table_white"),
			create(new BlockKitchen(), "kitchen_table_half_white"),
			create(new BlockKitchen(), "kitchen_chair_black"),
			create(new BlockKitchen(), "kitchen_table_black"),
			create(new BlockKitchen(), "kitchen_table_half_black"),
			create(new BlockKitchen(), "kitchen_shelf_white_left"),
			create(new BlockKitchen(), "kitchen_shelf_white_right"),
			create(new BlockKitchen(), "kitchen_shelf_white_single"),
			create(new BlockKitchen(), "kitchen_shelf_brown_left"),
			create(new BlockKitchen(), "kitchen_shelf_brown_right"),
			create(new BlockKitchen(), "kitchen_shelf_brown_single")



		);
	}

	private static Block setHarvestLevel(Block block, String toolClass, HarvestLevel level) {
		block.setHarvestLevel(toolClass, level.getValue());
		return block;
	}

	private static Block create(Block block, String name) {
		return create(block, name, DisneyTab.instance());
	}

	private static Block create(Block block, String name, CreativeTabs tab) {
		return Util.name(block, name).setCreativeTab(tab);
	}
}
