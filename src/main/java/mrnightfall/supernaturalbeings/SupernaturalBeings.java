package mrnightfall.supernaturalbeings;

import java.io.File;

import mrnightfall.supernaturalbeings.init.ModFluids;
import mrnightfall.supernaturalbeings.proxy.CommonProxy;
import mrnightfall.supernaturalbeings.world.BiomeRegistry;
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
	
	private static File configDir;
	
	public static File getConfigDir() {
		return configDir;
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Configuration
		configDir = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		configDir.mkdirs();
		ConfigHandler.init(new File(configDir.getPath(), Reference.MODID + ".cfg"));
		
		//MISC
		ModFluids.register();
		BiomeRegistry.addComponents();
		
		//other
		
		Utils.getLogger().info("Pre Initialize");
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		BiomeRegistry.registerComponents();
		
		Utils.getLogger().info("Initialize");
	}
	
	@EventHandler
	public void init(FMLPostInitializationEvent event) {
		
		BiomeRegistry.addBiomesToWorld();
		
		Utils.getLogger().info("Post Initialize");
	}
	
}
