package net.ra77a3l3.createstorage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ra77a3l3.createstorage.CreateStorageNetwork;

public class ModItems {
    public static final Item DrawerController = registerItem("drawer controller", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DrawerController);
    }


    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateStorageNetwork.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        CreateStorageNetwork.LOGGER.info("Registering Mod Item for " + CreateStorageNetwork.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
