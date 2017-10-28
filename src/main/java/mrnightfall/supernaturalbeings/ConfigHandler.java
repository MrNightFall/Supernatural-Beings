package mrnightfall.supernaturalbeings;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static Configuration config;
	
	//Biome
	public static int mistyMountainsBiomeID;
	public static boolean spawnBiomeInOverworld;
	
	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}

	public static void syncConfig() {
		String category;
		
		category = "Biome";
		config.addCustomCategoryComment(category, "Biome Settings"); //these to lines are needed for every single category
		mistyMountainsBiomeID = config.getInt("mistyMountainsBiomeID", category, 40, 40, 126, "Biome ID of the Misty Mountains Biome.");
		spawnBiomeInOverworld = config.getBoolean("spawnBiomeInOverworld", category, true, "If set to true the biomes added will spawn");
		
		config.save();
	}
}
