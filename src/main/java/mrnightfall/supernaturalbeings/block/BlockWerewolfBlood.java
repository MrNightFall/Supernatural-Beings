package mrnightfall.supernaturalbeings.block;

import mrnightfall.supernaturalbeings.fluid.FluidWerewolfBlood;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockWerewolfBlood extends BlockFluidClassic{

	public static final BlockWerewolfBlood instance = new BlockWerewolfBlood();
	public static final String name = "werewolfblood";
	
	public BlockWerewolfBlood() {
		super(FluidWerewolfBlood.instance, Material.WATER);
		setUnlocalizedName(name);
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

}
