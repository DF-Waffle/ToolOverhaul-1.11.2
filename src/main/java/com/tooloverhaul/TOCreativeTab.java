package com.tooloverhaul;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TOCreativeTab extends CreativeTabs{

    public TOCreativeTab(String string){
        super(string);
    }


    public ItemStack getTabIconItem(){
        return new ItemStack(Items.COMMAND_BLOCK_MINECART);
    }


}
