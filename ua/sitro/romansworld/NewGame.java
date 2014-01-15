package ua.sitro.romansworld;

import ua.sitro.maps.ForgottenVillage;

public class NewGame {
	public void PlayerParams() {

		GlobalParams.MapID = ForgottenVillage.MapID;
		GlobalParams.playerName = "Роман";
		GlobalParams.lvl = 1;
		GlobalParams.maxHP = 20 * GlobalParams.lvl;
		GlobalParams.health = GlobalParams.maxHP;
		GlobalParams.damage = 1;
		GlobalParams.exp = 0;

	}
}
