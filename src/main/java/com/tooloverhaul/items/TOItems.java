package com.tooloverhaul.items;

import com.tooloverhaul.items.tools.TOemerald_Axe;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOItems {


    public static Item emerald_Axe;



    //ToolMaterials
    public static Item.ToolMaterial EMERALDTOOLS = EnumHelper.addToolMaterial("EMERALDTOOLS", 3, 1700, 10.0F, 6.0F, 20);


    public static void initItems(){
        GameRegistry.register(emerald_Axe = new TOemerald_Axe("emerald_Axe", EMERALDTOOLS));
    }

}
