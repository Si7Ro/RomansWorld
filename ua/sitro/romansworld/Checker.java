package ua.sitro.romansworld;

import ua.sitro.maps.ForgottenVillage;
import ua.sitro.maps.NeighborhoodOfForgottenVillage;

public class Checker {
    public static Boolean regenCheck = false;

    public static void onCheck() {
	if (!regenCheck) {
	    Regeneration.regen = new Regeneration();
	    Thread regeneration = new Thread(Regeneration.regen);
	    regeneration.start();
	}
	if (GlobalParams.MapID == ForgottenVillage.MapID) {
	    World.WORLD_X = ForgottenVillage.FG_X;
	    World.WORLD_Y = ForgottenVillage.FG_Y;
	    World.initWorld();
	    ForgottenVillage.ForgottenVillageWelcomeMessage();
	    ForgottenVillage.ForgottenVillageBuild();
	    GlobalParams.MapID = 0;

	}
	if (GlobalParams.MapID == NeighborhoodOfForgottenVillage.MapID) {
	    World.WORLD_X = NeighborhoodOfForgottenVillage.NFG_X;
	    World.WORLD_Y = NeighborhoodOfForgottenVillage.NFG_Y;
	    World.initWorld();
	    NeighborhoodOfForgottenVillage
		    .NeighborhoodForgottenVillageWelcomeMessage();
	    NeighborhoodOfForgottenVillage.NeighborhoodForgottenVillageBuild();

	    GlobalParams.MapID = 0;

	}

	World.chechPlayerInWorld();
	WorldEngine.engine();

	ForgottenVillage.ForgottenVillageAction();
	Actions.instPlayer();
    }

}
