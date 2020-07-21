package com.ldshadowlady.disney;

import java.io.IOException;

import com.ldshadowlady.disney.proxy.CommonProxy;
import com.ldshadowlady.disney.world.WorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Disney.MODID,
	version = Disney.VERSION,
	name = Disney.NAME,
	dependencies = "required-after:monstersandpets")

public class Disney {
	public static final String MODID = "disney";

	public static final String NAME = "Disney";

	public static final String VERSION = "1.0.0";

	@Mod.Instance(MODID)
	public static com.ldshadowlady.disney.Disney instance;

	@SidedProxy(
		clientSide = "com.ldshadowlady.disney.proxy.ClientProxy",
		serverSide = "com.ldshadowlady.disney.proxy.CommonProxy"
	)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void init(FMLPreInitializationEvent event) throws IOException {
		proxy.init();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new WorldGen());
		proxy.initRenders();
	}
}
