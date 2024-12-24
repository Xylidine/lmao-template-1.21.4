package net.spondle.lmao;

import net.fabricmc.api.ModInitializer;


import net.spondle.lmao.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lmao implements ModInitializer {
	public static final String MOD_ID = "lmao";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();

		LOGGER.info("Hello Fabric world!");
	}
}