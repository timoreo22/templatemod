package fr.timoreo.test.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block test;

	public static void init(){
		
	}
	
	public static void register(){
		registerBlock(test);
	}
    
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		item.setUnlocalizedName(block.getUnlocalizedName());
	    GameRegistry.register(item);
	    ModItems.registerRender(item);
	}
	
	
    public static void registerRenders(){
    	registerRender(test);
    }

    private static void registerRender(Block block) {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0,new ModelResourceLocation(block.getRegistryName(), "inventory" ));
    	
    }
	
}
