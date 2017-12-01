package fr.timoreo.test;

import fr.timoreo.test.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class TestMod {

	
	@Instance
	public static TestMod instance;
    
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
    
    @EventHandler
    public void init(FMLInitializationEvent event) // executé au démarrage!
    {
        proxy.init();
    	if(event.getSide().isClient()) { 
    		System.out.println("Côté Client!");
    	}else {
    		System.out.println("Côté Server!");
    	}
    }
    @EventHandler
    public void preinit(FMLPreInitializationEvent e) { // executé avant la méthode au dessus!
    	System.out.println("démarage du mod!");
    }
}
