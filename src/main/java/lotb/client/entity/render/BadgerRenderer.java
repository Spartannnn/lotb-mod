package lotb.client.entity.render;

import lotb.LotbMod;
import lotb.entities.Badger;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.util.ResourceLocation;

public class BadgerRenderer extends MobRenderer<Badger, CowModel<Badger>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(LotbMod.MODID,"textures/entity/badger");
 
 	public BadgerRenderer(EntityRendererManager renderManager) {
	 	super(renderManager,new CowModel<Badger>(),0.5f);
 	}
 	public ResourceLocation getEntityTexture(Badger entity) {
 		return TEXTURE;
 	}
}
