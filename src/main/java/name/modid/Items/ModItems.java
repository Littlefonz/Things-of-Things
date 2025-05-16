package name.modid.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import name.modid.Items.custom.AbbysDayChanger;
import name.modid.Items.custom.AbbysNightChanger;
import name.modid.Items.custom.EvesTurd;
import name.modid.Items.custom.GisellesCapybara;
import name.modid.Items.custom.KaisFlower;
import name.modid.Items.custom.KodysFlag;
import name.modid.Items.custom.SpensersFlintLock;
import name.modid.Items.custom.JacobsPetPatrick;
import name.modid.ThingsOfThings;

public class ModItems {

    public static final Item SPENCERS_FLINT_LOCK = register("spensers_flint_lock", SpensersFlintLock::new, new Item.Settings());
    public static final Item KODYS_FLAG = register("kodys_flag", KodysFlag::new, new Item.Settings());
    public static final Item EVES_TURD = register("eves_turd", EvesTurd::new, new Item.Settings());
    public static final Item KAIS_FLOWER = register("kais_flower", KaisFlower::new, new Item.Settings());
    public static final Item JACOBS_PET_PATRICK = register("jacobs_pet_patrick", JacobsPetPatrick::new, new Item.Settings());
    public static final Item GISELLES_CAPYBARA = register("giselles_capybara", GisellesCapybara::new, new Item.Settings());
    public static final Item ABBYS_DAY_CHANGER = register("abbys_day_changer", AbbysDayChanger::new, new Item.Settings());
    public static final Item ABBYS_NIGHT_CHANGER = register("abbys_night_changer", AbbysNightChanger::new, new Item.Settings());


    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ThingsOfThings.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ThingsOfThings.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(KAIS_FLOWER))
            .displayName(Text.translatable("itemGroup.things_of_things"))
            .build();

    public static void initialize() {
        // Register the group.
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        // Register items to the custom item group.
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SPENCERS_FLINT_LOCK);
            itemGroup.add(ModItems.KODYS_FLAG);
            itemGroup.add(ModItems.EVES_TURD);
            itemGroup.add(ModItems.KAIS_FLOWER);
            itemGroup.add(ModItems.JACOBS_PET_PATRICK);
            itemGroup.add(ModItems.GISELLES_CAPYBARA);
            itemGroup.add(ModItems.ABBYS_DAY_CHANGER);
            itemGroup.add(ModItems.ABBYS_NIGHT_CHANGER);
        });
    }
}
