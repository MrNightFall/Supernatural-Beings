package mrnightfall.supernaturalbeings.world;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeMistyMountains extends Biome {

	public BiomeMistyMountains(BiomeProperties properties) {
		super(properties);
		this.topBlock = Blocks.STONE.getDefaultState();
		this.fillerBlock = Blocks.STONE.getDefaultState();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class,100, 60, 60));

	}
	
}
