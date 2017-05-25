package com.tooloverhaul.render;

import com.tooloverhaul.TOGlobal;
import com.tooloverhaul.items.TOItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class TOItemRender {
    public static void registerItemRender(){

        regItem(TOItems.emerald_Axe);

    }

    public static void regItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(TOGlobal.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
