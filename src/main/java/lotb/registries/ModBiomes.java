package lotb.registries;

import lotb.LotbMod;
import lotb.world.Biomes.ShireBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomes {
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,LotbMod.MODID);
	
	public static final Biome SHIRE = new ShireBiome();
	public static final Biome ROHAN = new ShireBiome();
	public static final Biome MORODR = new ShireBiome();
	public static final Biome GONDOR = new ShireBiome();
	public static final Biome HARGONDOR = new ShireBiome();
	public static final Biome MIRKWOOD = new ShireBiome();
	public static final Biome MISTYMOUNTAINS = new ShireBiome();
	
	public static void RegisterItems() {
		BIOMES.register("shire",() -> SHIRE);
		BIOMES.register("rohan",() -> SHIRE);
		BIOMES.register("mordor",() -> SHIRE);
		BIOMES.register("gondor",() -> SHIRE);
		BIOMES.register("hargondor",() -> SHIRE);
		BIOMES.register("mirkwood",() -> SHIRE);
		BIOMES.register("misty_mts",() -> SHIRE);
	}
}
