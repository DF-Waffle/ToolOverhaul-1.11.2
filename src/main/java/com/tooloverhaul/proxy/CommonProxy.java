package com.tooloverhaul.proxy;

import com.tooloverhaul.items.TOItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preinit(FMLPreInitializationEvent preEvent) {
        TOItems.initItems();
        //TOBlocks.initBlocks();
        //TORecipes.initRecipies();

    }

    public void init(FMLInitializationEvent Event){

    }

    public void postInit(FMLPostInitializationEvent postEvent){

    }
}
