package lotb.tools;

import lotb.registries.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GrassColors;
import net.minecraft.world.ILightReader;
import net.minecraft.world.biome.BiomeColors;

public class FoilageColorizer {
	static ItemColors ITEMCOLOURS;
	static BlockColors BLOCKCOLOURS;
	
	public static void register() {
		ITEMCOLOURS=Minecraft.getInstance().getItemColors();
		BLOCKCOLOURS=Minecraft.getInstance().getBlockColors();
		registerBlockColours();
		registerItemColours();
	}
	
	private static void registerBlockColours() {
		final IBlockColor grassColourHandler = (state, blockAccess, pos, tintIndex) -> {
			if (blockAccess != null && pos != null) {
				return BiomeColors.getFoliageColor(blockAccess, pos);
			}return GrassColors.get(0.5D, 1.0D);
			//return 0xff0000ff;
		};
		BLOCKCOLOURS.register(grassColourHandler, ModBlocks.LEBETHRON_LEAVES);
	}
	
	private static void registerItemColours() {
		final IItemColor itemBlockColourHandler = (stack, tintIndex) -> {
			final BlockState state = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
			return BLOCKCOLOURS.getColor(state, null, null, tintIndex);
		};
		ITEMCOLOURS.register(itemBlockColourHandler,ModBlocks.LEBETHRON_LEAVES);
	}
}
