package lotb.registries;

import lotb.LotbMod;
import lotb.entities.Badger;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES,LotbMod.MODID);
	
	public static final EntityType<Badger> BADGER = reg("badger",EntityType.Builder.<Badger>create(Badger::new,EntityClassification.CREATURE).size(0.9f,1.3f));
	
	public static <T extends Entity> EntityType<T> reg(String name,EntityType.Builder<T> entityBuilder) {
		EntityType<T> entity = entityBuilder.build(new ResourceLocation(LotbMod.MODID,name).toString());
		ENTITIES.register(name,() -> entity);
		return entity;
	}
}
