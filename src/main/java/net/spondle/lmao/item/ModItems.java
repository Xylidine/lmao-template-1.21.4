package net.spondle.lmao.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


import java.util.function.Function;

public class ModItems {
    /*
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Lmao.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;

    }
    */

    public static final Item STEEL_INGOT = register("steel_ingot", Item::new, new Item.Settings());
    public static final Item SILVER_INGOT = register("silver_ingot", Item::new, new Item.Settings());

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("lmao", path));
        return Items.register(registryKey,factory, settings);

    }


    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.STEEL_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.SILVER_INGOT));
    }



}
