package top.furryliy.trap_craft.blocks.mine;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.furryliy.trap_craft.blocks.mine.he.*;
import top.furryliy.trap_craft.blocks.mine.normal.*;

import static top.furryliy.trap_craft.util.SetSetting.setBlockItem;

public class MineBlock {
    private static final String MOD_ID = "trap_craft";

    //普通地雷
    private static final NormalMine NORMAL_MINE_BLOCK = new NormalMine(initBlock());
    private static final NormalMineP NORMAL_MINE_P = new NormalMineP(initBlock());
    private static final NormalMineM NORMAL_MINE_M = new NormalMineM(initBlock());
    private static final NormalMineI NORMAL_MINE_I = new NormalMineI(initBlock());
    private static final NormalMineO NORMAL_MINE_O = new NormalMineO(initBlock());

    //高爆地雷
    private static final HighExplodeMine HIGH_EXPLODE_MINE = new HighExplodeMine(initBlock());
    private static final HighExplodeMineP HIGH_EXPLODE_MINE_P = new HighExplodeMineP(initBlock());
    private static final HighExplodeMineM HIGH_EXPLODE_MINE_M = new HighExplodeMineM(initBlock());
    private static final HighExplodeMineO HIGH_EXPLODE_MINE_O = new HighExplodeMineO(initBlock());
    private static final HighExplodeMineI HIGH_EXPLODE_MINE_I = new HighExplodeMineI(initBlock());

    public static void register() {
        //Normal Mine
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine"), NORMAL_MINE_BLOCK);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine"), setBlockItem(NORMAL_MINE_BLOCK));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_p"), NORMAL_MINE_P);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_p"), setBlockItem(NORMAL_MINE_P));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_m"), NORMAL_MINE_M);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_m"), setBlockItem(NORMAL_MINE_M));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_i"), NORMAL_MINE_I);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_i"), setBlockItem(NORMAL_MINE_I));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_o"), NORMAL_MINE_O);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_o"), setBlockItem(NORMAL_MINE_O));


        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_he"), HIGH_EXPLODE_MINE);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_he"), setBlockItem(HIGH_EXPLODE_MINE));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_he_p"), HIGH_EXPLODE_MINE_P);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_he_p"), setBlockItem(HIGH_EXPLODE_MINE_P));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_he_o"), HIGH_EXPLODE_MINE_O);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_he_o"), setBlockItem(HIGH_EXPLODE_MINE_O));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_he_i"), HIGH_EXPLODE_MINE_I);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_he_i"), setBlockItem(HIGH_EXPLODE_MINE_I));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine_he_m"), HIGH_EXPLODE_MINE_M);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "normal_mine_he_m"), setBlockItem(HIGH_EXPLODE_MINE_M));
    }

    private static Block.Settings initBlock(Material material){
        return Block.Settings.of(material).nonOpaque();
    }
    private static Block.Settings initBlock(){
        return Block.Settings.of(Material.STONE).nonOpaque();
    }
}
