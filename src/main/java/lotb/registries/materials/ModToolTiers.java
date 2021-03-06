package lotb.registries.materials;

import lotb.registries.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModToolTiers implements IItemTier{
	MITHRIL(4 ,5 ,12.0f ,10.0f ,22 ,ModItems.MITHRIL_INGOT)
	;
	private final int harvestLevel;
	private final int durability;
	private final float efficiency;
	private final float damage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairItem;
	
	private ModToolTiers(int _harvest,int _uses,float _eff,float _damage,int _enchant, Item _repair) {
		harvestLevel=_harvest;
		durability=_uses;
		efficiency=_eff;
		damage=_damage;
		enchantability=_enchant;
		repairItem= new LazyValue<>(() -> { return Ingredient.fromItems(_repair); });
		
		
	}

	@Override
	public int getMaxUses() {
		return durability;
	}

	@Override
	public float getEfficiency() {
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		return damage;
	}

	@Override
	public int getHarvestLevel() {
		return harvestLevel;
	}
	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return repairItem.getValue();
	}

}
