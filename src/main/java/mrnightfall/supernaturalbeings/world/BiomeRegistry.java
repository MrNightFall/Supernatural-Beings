package mrnightfall.supernaturalbeings.world;

import mrnightfall.supernaturalbeings.ConfigHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void MainRegistry() {
		
	}
	
	public static Biome mistymountains;
	public static final int mistyMountainsBiomeID = ConfigHandler.mistyMountainsBiomeID;
	
	public static void initializeBiome() {
		mistymountains = new BiomeMistyMountains(new BiomeProperties("MistyMountains").setTemperature(-0.5f).setRainfall(1.0f).setSnowEnabled().setBaseHeight(2.0f).setHeightVariation(1.0f));
		Biome.registerBiome(mistyMountainsBiomeID, "MistyMountains", mistymountains);
		
	}
	
	public static void registerBiome() {
		BiomeDictionary.registerBiomeType(mistymountains, Type.MOUNTAIN);
		BiomeManager.addSpawnBiome(mistymountains);
	}
}