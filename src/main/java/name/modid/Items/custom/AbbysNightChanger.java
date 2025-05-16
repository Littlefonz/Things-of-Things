package name.modid.Items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class AbbysNightChanger extends Item {

    public AbbysNightChanger(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.things-of-things.abbys_night_changer").formatted(Formatting.GRAY));

        super.appendTooltip(stack, context, tooltip, type);
    }
}
