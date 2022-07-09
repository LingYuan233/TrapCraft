package top.furryliy.trap_craft.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import top.furryliy.trap_craft.TrapCraftMain;

public class SetItem {
    public static Item setItem(){
        return new Item(new FabricItemSettings().group(TrapCraftMain.TC_GROUP));
    }
}
