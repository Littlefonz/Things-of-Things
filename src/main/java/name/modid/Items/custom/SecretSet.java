package name.modid.Items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

import name.modid.ThingsOfThings;

public class SecretSet {

    public static final int BASE_DURABILITY = -1;
    public static final RegistryKey<EquipmentAsset> GUIDITE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ThingsOfThings.MOD_ID, "secret"));

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 8,
                    EquipmentType.CHESTPLATE, 16,
                    EquipmentType.LEGGINGS, 10,
                    EquipmentType.BOOTS, 6
            ),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            0.0F,
            0.0F,
            null,
            GUIDITE_ARMOR_MATERIAL_KEY
    );
}
