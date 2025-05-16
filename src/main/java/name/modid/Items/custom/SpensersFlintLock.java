package name.modid.Items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class SpensersFlintLock extends Item {

    public SpensersFlintLock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.things-of-things.spensers_flint_lock").formatted(Formatting.GRAY));

        super.appendTooltip(stack, context, tooltip, type);
    }
}
