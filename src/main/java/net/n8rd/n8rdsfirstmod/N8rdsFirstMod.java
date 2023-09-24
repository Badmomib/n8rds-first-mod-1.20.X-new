package net.n8rd.n8rdsfirstmod;

import net.fabricmc.api.ModInitializer;

import net.n8rd.n8rdsfirstmod.item.ModItemGroups;
import net.n8rd.n8rdsfirstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class N8rdsFirstMod implements ModInitializer {
	public static final String MOD_ID = "n8rdsfirstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}