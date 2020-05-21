package lotb.registries;

import lotb.LotbMod;
import lotb.blocks.ModPressurePlateBlock;
import lotb.blocks.ModTrapDoorBlock;
import lotb.blocks.ModWoodButtonBlock;
import lotb.blocks.PieBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,LotbMod.MODID);
	
	//ores
	public static final Block PRISMARINE_ORE 	 	= reg("prismarine_ore", 	new Block(Block.Properties.create(Material.ROCK)), ItemGroup.BUILDING_BLOCKS);
	public static final Block QUARTZ_ORE  	 	 	= reg("quartz_ore", 	 	new Block(Block.Properties.create(Material.ROCK)), ItemGroup.BUILDING_BLOCKS);
	public static final Block GLOWSTONE_ORE  	 	= reg("glowstone_ore",  	new Block(Block.Properties.create(Material.ROCK)), ItemGroup.BUILDING_BLOCKS);
	public static final Block MITHRIL_ORE 	 	 	= reg("mithril_ore",	 	new Block(Block.Properties.create(Material.ROCK)), ItemGroup.BUILDING_BLOCKS);
	public static final Block MITHRIL_BLOCK  	 	= reg("mithril_block",	 	new Block(Block.Properties.create(Material.IRON)), ItemGroup.BUILDING_BLOCKS);
	//building
	public static final Block THATCH_BLOCK 	 	 	= reg("thatch",		 	new Block(Block.Properties.create(Material.EARTH)),ItemGroup.BUILDING_BLOCKS);
	public static final Block THATCH_STAIRS  	 	= reg("thatch_stairs",	 	new StairsBlock(()->THATCH_BLOCK.getDefaultState(),Block.Properties.create(Material.EARTH)),ItemGroup.BUILDING_BLOCKS);
	public static final Block THATCH_SLAB 	 	 	= reg("thatch_slab",	 	new SlabBlock(Block.Properties.create(Material.EARTH)),ItemGroup.BUILDING_BLOCKS);
	public static final Block THATCH_WALL 	 	 	= reg("thatch_wall",	 	new WallBlock(Block.Properties.create(Material.EARTH)),ItemGroup.BUILDING_BLOCKS);
	public static final Block STICK_BLOCK		 	= reg("stick_block",	 	new RotatedPillarBlock(Block.Properties.create(Material.MISCELLANEOUS)),ItemGroup.BUILDING_BLOCKS);
	public static final Block BLAZE_BLOCK	 	 	= reg("blaze_block",	 	new RotatedPillarBlock(Block.Properties.create(Material.MISCELLANEOUS)),ItemGroup.BUILDING_BLOCKS);
	public static final Block STONE_BRICK_PILLAR 	= reg("stone_brick_pillar",new RotatedPillarBlock(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	//temp mordor rock
	public static final Block MORDOR_ROCK			= reg("mordor_rock",		new Block(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	//public static final Block MORDOR_POLISHED
	public static final Block MORDOR_STAIR			= reg("mordor_rock_stairs",	new StairsBlock(() -> MORDOR_ROCK.getDefaultState(),Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	public static final Block MORDOR_SLAB			= reg("mordor_rock_slab",	new SlabBlock(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	public static final Block MORDOR_WALL			= reg("mordor_rock_wall",	new WallBlock(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	public static final Block MORDOR_BRICK			= reg("mordor_brick",		new Block(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	public static final Block MORDOR_BRICK_STAIR	= reg("mordor_brick_stairs",new StairsBlock(() -> MORDOR_BRICK.getDefaultState(),Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	public static final Block MORDOR_BRICK_SLAB		= reg("mordor_brick_slab",	new SlabBlock(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	public static final Block MORDOR_BRICK_WALL		= reg("mordor_brick_wall",	new WallBlock(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	//public static final Block MOSSY_MORDOR_BRICK
	//public static final Block CRACKED_MORDOR_BRICK
	//public static final Block CHISELED_MORDOR_BRICK
	public static final Block MORDOR_PILLAR			= reg("mordor_pillar",		new RotatedPillarBlock(Block.Properties.create(Material.ROCK)),ItemGroup.BUILDING_BLOCKS);
	//bricks
	//woodtypes
	public static final Block LEBETHRON_LOG			= reg("shire_oak_log",			new LogBlock(MaterialColor.WOOD,Block.Properties.from(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
	public static final Block LEBETHRON_LOG_STRIPPED= reg("stripped_shire_oak_log",	new LogBlock(MaterialColor.WOOD,Block.Properties.from(Blocks.STRIPPED_OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
	public static final Block LEBETHRON_WOOD		= reg("shire_oak_wood",			new RotatedPillarBlock(			Block.Properties.from(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final Block LEBETHRON_WOOD_STRIPPED=reg("stripped_shire_oak_wood",new RotatedPillarBlock(			Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
	public static final Block LEBETHRON_LEAVES		= reg("shire_oak_leaves",	new LeavesBlock(		Block.Properties.from(Blocks.OAK_LEAVES)),ItemGroup.DECORATIONS);
	public static final Block LEBETHRON_PLANKS		= reg("shire_oak_planks",	new Block(				Block.Properties.from(Blocks.OAK_PLANKS)),ItemGroup.BUILDING_BLOCKS);
	public static final Block LEBETHRON_SLAB		= reg("shire_oak_slab",		new SlabBlock(			Block.Properties.from(Blocks.OAK_SLAB)),ItemGroup.BUILDING_BLOCKS);
	public static final Block LEBETHRON_STAIRS		= reg("shire_oak_stairs",	new StairsBlock(() -> LEBETHRON_PLANKS.getDefaultState(),	Block.Properties.from(Blocks.OAK_STAIRS)),ItemGroup.BUILDING_BLOCKS);
	public static final Block LEBETHRON_FENCE		= reg("shire_oak_fence",	new FenceBlock(			Block.Properties.from(Blocks.OAK_FENCE)),ItemGroup.DECORATIONS);
	public static final Block LEBETHRON_GATE		= reg("shire_oak_gate",		new FenceGateBlock(		Block.Properties.from(Blocks.OAK_FENCE_GATE)),ItemGroup.REDSTONE);
	public static final Block LEBETHRON_TRAPDOOR	= reg("shire_oak_trapdoor",	new ModTrapDoorBlock(	Block.Properties.from(Blocks.OAK_TRAPDOOR)),ItemGroup.REDSTONE);
	public static final Block LEBETHRON_BUTTON		= reg("shire_oak_button",	new ModWoodButtonBlock(	Block.Properties.from(Blocks.OAK_BUTTON)),ItemGroup.REDSTONE);
	public static final Block LEBETHRON_PRESSURE	= reg("shire_oak_pressureplate",new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)),ItemGroup.REDSTONE);
	//pies
	public static final Block PORK_PIE 		= reg("pork_pie",	new PieBlock(),ItemGroup.FOOD);
	public static final Block BEEF_PIE 		= reg("beef_pie",	new PieBlock(),ItemGroup.FOOD);
	public static final Block MUTTON_PIE 	= reg("mutton_pie",	new PieBlock(),ItemGroup.FOOD);
	public static final Block CHICKEN_PIE	= reg("chicken_pie",new PieBlock(),ItemGroup.FOOD);
	public static final Block FISH_PIE		= reg("fish_pie",	new PieBlock(),ItemGroup.FOOD);
	public static final Block SALMON_PIE	= reg("salmon_pie",	new PieBlock(),ItemGroup.FOOD);
	public static final Block RABBIT_PIE	= reg("rabbit_pie",	new PieBlock(),ItemGroup.FOOD);
	public static final Block VENISON_PIE	= reg("venison_pie",new PieBlock(),ItemGroup.FOOD);
	
	
	
	/**-----------------funcs-----------------------*/
	//register blocks
	public static Block reg(String id, Block block) {
		BLOCKS.register(id, () -> block);
		return block;
	}
	//register block and standard blockitem
	public static Block reg(String id, Block block, ItemGroup group) {
		BLOCKS.register(id, () -> block);
		ModItems.ITEMS.register(id, () -> new BlockItem(block, new Item.Properties().group(group)));
		return block;
	}
}

