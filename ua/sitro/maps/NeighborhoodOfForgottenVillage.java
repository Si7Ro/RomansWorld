package ua.sitro.maps;

import java.io.IOException;

import ua.sitro.romansworld.GlobalParams;
import ua.sitro.romansworld.World;

/**
 * 
 * Окрестности деревни "Forgotten Village".
 * 
 **/
public class NeighborhoodOfForgottenVillage {
    public static final int NFG_X = 10;
    public static final int NFG_Y = 10;
    public static final int MapID = 2;

    public static void NeighborhoodForgottenVillageWelcomeMessage() {

	System.out
		.println("#############ВЫ ВЫШЛИ В ОКРЕСНОСТИ ДЕРЕВНИ FORGOTTEN VILLAGE############");

    }

    public static void NeighborhoodForgottenVillageBuild() {

	// Присваиваем координаты стартоой позиции игрока
	World.PLAYER_POS_X = 3;
	World.PLAYER_POS_Y = 3;
	World.world[3][2] = GlobalParams.ForgottenVillageEastIN;
	World.world[3][4] = GlobalParams.closeDoor;
    }

    public static void NeighborhoodForgottenVillageAction() throws IOException {
	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.ForgottenVillageEastIN)) {

	    GlobalParams.MapID = ForgottenVillage.MapID;

	}

    }

}
