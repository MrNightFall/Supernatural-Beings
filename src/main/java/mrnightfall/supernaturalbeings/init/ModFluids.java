package mrnightfall.supernaturalbeings.init;

import mrnightfall.supernaturalbeings.Reference;
import mrnightfall.supernaturalbeings.block.BlockWerewolfBlood;
import mrnightfall.supernaturalbeings.fluid.FluidWerewolfBlood;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModFluids {
	
	private static ModelResourceLocation werewolfblood_location = new ModelResourceLocation(Reference.MODID + ":" + BlockWerewolfBlood.name, "fluid");
	
	public static void register() {
		FluidRegistry.registerFluid(FluidWerewolfBlood.instance);
		GameRegistry.registerBlock(BlockWerewolfBlood.instance, BlockWerewolfBlood.name);
		Item werewolfblood = Item.getItemFromBlock(BlockWerewolfBlood.instance);
		ModelLoader.setCustomMeshDefinition(werewolfblood, new ItemMeshDefinition() {

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return werewolfblood_location;
			}
			
		});
		ModelLoader.setCustomStateMapper(BlockWerewolfBlood.instance, new StateMapperBase() {

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return werewolfblood_location;
			}
			
		});
	}
	
}

