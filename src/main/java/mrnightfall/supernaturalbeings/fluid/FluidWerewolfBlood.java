package mrnightfall.supernaturalbeings.fluid;

import mrnightfall.supernaturalbeings.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidWerewolfBlood extends Fluid{

	public static final String name = "werewolfblood";
	public static final FluidWerewolfBlood instance = new FluidWerewolfBlood();
	
	public FluidWerewolfBlood() {
		super(name, new ResourceLocation(Reference.MODID + ":" + "Blocks/" + name + "_still"), new ResourceLocation(Reference.MODID + ":" + "Blocks/" + name + "_flow"));
		
	}
	

}
