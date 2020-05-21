package lotb.registries;

import lotb.LotbMod;
import lotb.registries.materials.ModArmourTiers;
import lotb.registries.materials.ModToolTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,LotbMod.MODID);
	
	//mithril tools
	public static final Item MITHRIL_INGOT 		= new Item(new Item.Properties().group(ItemGroup.MATERIALS));
	public static final Item MITHRIL_NUGGET 	= new Item(new Item.Properties().group(ItemGroup.MATERIALS));
	public static final Item MITHRIL_SWORD 		= new SwordItem(ModToolTiers.MITHRIL, 1, 1, new Item.Properties().group(ItemGroup.COMBAT));
	public static final Item MITHRIL_AXE 		= new AxeItem(ModToolTiers.MITHRIL,1,1,new Item.Properties().group(ItemGroup.TOOLS));
	public static final Item MITHRIL_PICK		= new PickaxeItem(ModToolTiers.MITHRIL,1,1,new Item.Properties().group(ItemGroup.TOOLS));
	public static final Item MITHRIL_SHOVEL		= new ShovelItem(ModToolTiers.MITHRIL,1,1,new Item.Properties().group(ItemGroup.TOOLS));
	public static final Item MITHRIL_HOE		= new HoeItem(ModToolTiers.MITHRIL,1,new Item.Properties().group(ItemGroup.TOOLS));
	public static final Item MITHRIL_HELMET		= new ArmorItem(ModArmourTiers.MITHRIL,EquipmentSlotType.HEAD,new Item.Properties().group(ItemGroup.COMBAT));
	public static final Item MITHRIL_CHESTPLATE	= new ArmorItem(ModArmourTiers.MITHRIL,EquipmentSlotType.CHEST,new Item.Properties().group(ItemGroup.COMBAT));
	public static final Item MITHRIL_LEGGINGS	= new ArmorItem(ModArmourTiers.MITHRIL,EquipmentSlotType.LEGS,new Item.Properties().group(ItemGroup.COMBAT));
	public static final Item MITHRIL_BOOTS		= new ArmorItem(ModArmourTiers.MITHRIL,EquipmentSlotType.FEET,new Item.Properties().group(ItemGroup.COMBAT));
	
	public static void RegisterItems() {
		ITEMS.register("mithril_ingot",	 	() -> MITHRIL_INGOT);
		ITEMS.register("mithril_nugget", 	() -> MITHRIL_NUGGET);
		ITEMS.register("mithril_sword",  	() -> MITHRIL_SWORD);
		ITEMS.register("mithril_axe", 	 	() -> MITHRIL_AXE);
		ITEMS.register("mithril_pickaxe",	() -> MITHRIL_PICK);
		ITEMS.register("mithril_shovel", 	() -> MITHRIL_SHOVEL);
		ITEMS.register("mithril_hoe", 	 	() -> MITHRIL_HOE);
		ITEMS.register("mithril_helmet", 	() -> MITHRIL_HELMET);
		ITEMS.register("mithril_chestplate",() -> MITHRIL_CHESTPLATE);
		ITEMS.register("mithril_leggings", 	() -> MITHRIL_LEGGINGS);
		ITEMS.register("mithril_boots", 	() -> MITHRIL_BOOTS);
	}
}
