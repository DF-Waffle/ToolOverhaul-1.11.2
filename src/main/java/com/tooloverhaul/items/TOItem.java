package com.tooloverhaul.items;

import com.tooloverhaul.TOGlobal;
import net.minecraft.item.Item;

public class TOItem extends Item{

    public TOItem(String name){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(TOGlobal.toCreativeTab);
    }
}
