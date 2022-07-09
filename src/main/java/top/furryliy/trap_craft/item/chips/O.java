package top.furryliy.trap_craft.item.chips;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static top.furryliy.trap_craft.util.SetIdentifier.setIdentifier;
import static top.furryliy.trap_craft.util.SetItem.setItem;

public class O extends Item{

    public O(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack item, @Nullable World world, List<Text> tooltip, TooltipContext context){
        tooltip.add(new TranslatableText("item.trap_craft.chip_o.tooltip").formatted(Formatting.BLUE));
    }
}
