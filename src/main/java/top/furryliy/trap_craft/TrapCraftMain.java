package top.furryliy.trap_craft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.furryliy.trap_craft.blocks.mine.NormalMineBlock;
import top.furryliy.trap_craft.item.chips.I;
import top.furryliy.trap_craft.item.chips.M;
import top.furryliy.trap_craft.item.chips.O;
import top.furryliy.trap_craft.item.chips.P;
import top.furryliy.trap_craft.util.SetSetting;

import static top.furryliy.trap_craft.util.SetSetting.*;


public class TrapCraftMain implements ModInitializer {
	private static final String MOD_ID = "trap_craft";
	public static final ItemGroup TC_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tc_group"),() -> new ItemStack(Blocks.TNT));


	private static final I CHIP_I = new I(SetSetting.setItemSetting());
	private static final M CHIP_M = new M(SetSetting.setItemSetting());
	private static final O CHIP_O = new O(SetSetting.setItemSetting());
	private static final P CHIP_P = new P(SetSetting.setItemSetting());

	private static final NormalMineBlock NORMAL_MINE_BLOCK = new NormalMineBlock(setBlockSetting(Material.STONE).nonOpaque());

	
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "normal_mine"), NORMAL_MINE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "normal_mine"), setBlockItem(NORMAL_MINE_BLOCK));

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chip_p"), CHIP_P);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chip_i"), CHIP_I);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chip_m"), CHIP_M);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chip_o"), CHIP_O);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gunpowder_l2"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"dynamite_l1"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"dynamite_l2"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"dynamite_l3"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"dynamite_l4"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"detonation_l1"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"detonation_l2"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"detonator_l1"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"detonator_l2"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"detonator_delay_l1"), setItem());
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"detonator_delay_l2"), setItem());
	}
}
