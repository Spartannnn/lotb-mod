package lotb.world;

import lotb.registries.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
	@SuppressWarnings("rawtypes")
	public static void generateOres() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			ConfiguredPlacement prismarinePlacement = Placement.COUNT_RANGE.configure(new CountRangeConfig(20,5,0,25));
			OreFeatureConfig prismarineOreFeature = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,ModBlocks.PRISMARINE_ORE.getDefaultState(),10);
			biome.addFeature(Decoration.UNDERGROUND_ORES,Feature.ORE.withConfiguration(prismarineOreFeature).withPlacement(prismarinePlacement));
		}
	}
}
