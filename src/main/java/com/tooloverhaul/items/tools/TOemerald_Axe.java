package com.tooloverhaul.items.tools;

import com.google.common.collect.Sets;
import com.tooloverhaul.TOGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class TOemerald_Axe extends ItemTool{

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
    private static final float [] ATTACK_DAMAGE = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float [] ATTACK_SPEED = new float[] {-3.2F, -3.2F, -3.1F, -3.0F, -3.0F};

    public TOemerald_Axe(String name, Item.ToolMaterial material){
        super(material, EFFECTIVE_ON);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.isRepairable();

        setUnlocalizedName(name);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state){
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

}
