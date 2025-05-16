package name.modid.Items.custom;

import net.minecraft.block.Block;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import name.modid.Items.ModItems;
import name.modid.ThingsOfThings;

public class Armor {

    public static final RegistryEntry<ArmorMaterial> SECRET_ARMOR_MATERIAL = registerArmorMaterial("secret_armor_material",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.HELMET, 16);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, null, null, 0, 0));

    private static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ThingsOfThings.MOD_ID, name), material.get());
    }
}
