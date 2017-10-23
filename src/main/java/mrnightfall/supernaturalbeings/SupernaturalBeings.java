package mrnightfall.supernaturalbeings;

import mrnightfall.supernaturalbeings.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class SupernaturalBeings {
	
	@Mod.Instance(Reference.MODID)
	public static SupernaturalBeings instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.Client_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre Initialize");
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Initialize");
	}
	
	@EventHandler
	public void init(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post Initialize");
	}
	
}
