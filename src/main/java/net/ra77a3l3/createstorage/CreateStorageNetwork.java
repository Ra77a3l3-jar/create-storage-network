package net.ra77a3l3.createstorage;

import net.fabricmc.api.ModInitializer;

import net.ra77a3l3.createstorage.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateStorageNetwork implements ModInitializer {
	public static final String MOD_ID = "createstoragenetwork";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
