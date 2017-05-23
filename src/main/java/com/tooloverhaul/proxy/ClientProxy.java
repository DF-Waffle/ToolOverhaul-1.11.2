package com.tooloverhaul.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    public void preInit(FMLPreInitializationEvent preEvent){
        super.preinit(preEvent);
    }

    public void init(FMLInitializationEvent Event){
        super.init(Event);
        //TOItemRender.registerItemRender();
        //TOBlockRender.registerBlockRender();
    }

    public void postInit(FMLPostInitializationEvent postEvent){
        super.postInit(postEvent);
    }

}
