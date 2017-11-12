package mrnightfall.supernaturalbeings.world;

import mrnightfall.supernaturalbeings.ConfigHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomeRegistry {
	
	
	public static Biome mistymountains;
	public static final int mistyMountainsBiomeID = ConfigHandler.mistyMountainsBiomeID;
	
	//Called by preInit
	public static void addComponents() {
		mistymountains = new BiomeMistyMountains(new BiomeProperties("MistyMountains").setTemperature(-0.5f).setRainfall(1.0f).setSnowEnabled().setBaseHeight(2.0f).setHeightVariation(1.0f));
		Biome.registerBiome(mistyMountainsBiomeID, "MistyMountains", mistymountains);
		
	}

	//Called by Init
	public static void registerComponents() {

		BiomeDictionary.registerBiomeType(mistymountains, Type.MOUNTAIN);
		BiomeManager.addSpawnBiome(mistymountains);
	}

	//Called by postInit
	public static void addBiomesToWorld() {
		BiomeManager.addBiome(BiomeType.ICY, new BiomeManager.BiomeEntry(mistymountains,1000000000));

		BiomeProvider.allowedBiomes.add(mistymountains);
	}
}