package fr.timoreo.test.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModItems {
	
    public static void registerRender(Item item) {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(item.getRegistryName(), "inventory" ));
    	
    }
    

}
