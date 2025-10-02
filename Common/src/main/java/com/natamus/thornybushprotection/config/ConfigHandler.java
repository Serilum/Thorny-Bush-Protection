package com.natamus.thornybushprotection.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.thornybushprotection.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean negateBushDamageForPlayers = true;
	@Entry public static boolean mustWearLeggingsToDisableDamage = true;

	public static void initConfig() {
		configMetaData.put("negateBushDamageForPlayers", Arrays.asList(
			"Basically enables the mod. If players should not receive damage when walking through berry bushes."
		));
		configMetaData.put("mustWearLeggingsToDisableDamage", Arrays.asList(
			"If players should wear anything in the leggings armour slot in order to not receive damage from berry bushes."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}