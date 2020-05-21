package lotb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lotb.client.entity.render.BadgerRenderer;
import lotb.registries.ModBlocks;
import lotb.registries.ModEntities;
import lotb.registries.ModItems;
import lotb.tools.FoilageColorizer;
import lotb.world.OreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("lotb")
public class LotbMod
{
    public static final String MODID = "lotb";
    
    
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();

    public LotbMod() {
        // Register the setup method for modloading
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::enqueueIMC);
    	modEventBus.addListener(this::processIMC);
    	modEventBus.addListener(this::doClientStuff);
    	
    	ModItems.RegisterItems();
    	ModItems.ITEMS.register(modEventBus);
    	ModBlocks.BLOCKS.register(modEventBus);
    	ModEntities.ENTITIES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
//========================================================================================================================


    private void setup(final FMLCommonSetupEvent event){
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	FoilageColorizer.register();
    	RenderingRegistry.registerEntityRenderingHandler(ModEntities.BADGER, BadgerRenderer::new);
    }

    private void enqueueIMC(final InterModEnqueueEvent event){
        // some example code to dispatch IMC to another mod
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    	OreGen.generateOres();
    }

}
