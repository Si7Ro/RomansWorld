package ua.sitro.romansworld;

public class World {
    public static int WORLD_X = 30;
    public static int WORLD_Y = 30;
    public static final int MIN_WORLD_X = 0;
    public static final int MIN_WORLD_Y = 0;
    public static int PLAYER_POS_X = 0;
    public static int PLAYER_POS_Y = 0;
    static String player = "X";
    public static String[][] world = new String[WORLD_X][WORLD_Y];
    static String[][] mapWorld = new String[PLAYER_POS_X][PLAYER_POS_Y];

    public static void initWorld() {

	for (int x = 0; x < World.world.length; x++) {
	    for (int y = 0; y < World.world[x].length; y++) { // Инициализируем
							      // мир
		World.world[x][y] = "";

	    }
	}

    }

    public void mapWorld() { // Просмотр игровой карты

	String mapSave = world[PLAYER_POS_X][PLAYER_POS_Y];
	world[PLAYER_POS_X][PLAYER_POS_Y] = player;
	for (int y = 0; y < WORLD_Y; y++) {
	    for (int x = 0; x < WORLD_X; x++) {

		if (world[x][y].equals(GlobalParams.wall)
			|| world[x][y].equals(GlobalParams.paling)
			|| world[x][y].equals(player)) {
		    System.out.print(" " + world[x][y].charAt(0) + " ");

		} else if (world[x][y].equals(GlobalParams.openDoor)
			|| world[x][y].equals(GlobalParams.closeDoor)) {
		    System.out.print(" Д ");
		} else if (world[x][y].equals(GlobalParams.openGate)) {
		    System.out.print(" В ");
		} else if (world[x][y].equals(GlobalParams.teleport)) {
		    System.out.print(" Т ");
		} else {
		    System.out.print("   ");
		}
	    }

	    System.out.println("");

	}
	System.out.println(" *******************************************");
	System.out.println(" **      КРАТКИЕ ОБОЗНАЧЕНИЯ НА КАРТЕ     **");
	System.out.println(" *******************************************");
	System.out.println(" **    З - ЗАБОР     ***    С - СТЕНА     **");
	System.out.println(" **    X - ИГРОК     ***    Т - ТЕЛЕПОРТ  **");
	System.out.println(" **    Д - ДВЕРЬ     ***    В - ВОРОТА    **");
	System.out.println(" *******************************************");
	world[PLAYER_POS_X][PLAYER_POS_Y] = mapSave;
    }

    public static void chechPlayerInWorld() {

	if (PLAYER_POS_X > WORLD_X - 1) {

	    PLAYER_POS_X -= 1;
	    Messages.limitOfTheWorld();

	} else if (PLAYER_POS_X < MIN_WORLD_X) {

	    PLAYER_POS_X += 1;
	    Messages.limitOfTheWorld();

	} else if (PLAYER_POS_Y > WORLD_Y - 1) {

	    PLAYER_POS_Y -= 1;
	    Messages.limitOfTheWorld();

	} else if (PLAYER_POS_Y < MIN_WORLD_Y) {

	    PLAYER_POS_Y += 1;
	    Messages.limitOfTheWorld();

	} else
	    Messages.moveTo();
    }

}
