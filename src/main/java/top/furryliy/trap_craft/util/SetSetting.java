package top.furryliy.trap_craft.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import top.furryliy.trap_craft.TrapCraftMain;

public class SetSetting {

    public static Item.Settings setItemSetting(){
        return new Item.Settings().group(TrapCraftMain.TC_GROUP);
    }

    public static Block.Settings setBlockSetting(Material material){
        return Block.Settings.of(material);
    }

    public static BlockItem setBlockItem(Block block){
        return new BlockItem(block, new Item.Settings().group(TrapCraftMain.TC_GROUP));
    }

    public static Identifier setIdentifier(String name){
        return new Identifier("tarp_craft",name);
    }

    public static Item setItem(){
        return new Item(new FabricItemSettings().group(TrapCraftMain.TC_GROUP));
    }

}
