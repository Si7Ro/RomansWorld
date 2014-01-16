package ua.sitro.romansworld;

public class WorldEngine {

	public static int checkDoor = 0;
	static int x;
	static int y;

	public static void engine() {

		if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
				.equals(GlobalParams.paling)) {
			System.out.println("Забор не помеха? Ну-ну...");
			World.PLAYER_POS_X = x;
			World.PLAYER_POS_Y = y;

		}

		if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
				.equals(GlobalParams.wall)) {
			System.out.println("Вы уперлись носом в стену.");
			World.PLAYER_POS_X = x;
			World.PLAYER_POS_Y = y;

		}

		if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
				.equals(GlobalParams.closeDoor)) {
			if (checkDoor == 0) {
				if (GlobalParams.keyToTheDoor != 0) {
					GlobalParams.keyToTheDoor -= 1;
					checkDoor = 1;
					World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y] = "Открытая дверь";
					System.out.println("Вы открыли дверь ключем");
					checkDoor = 0;
				} else {
					System.out
							.println("Перед вам закрытая дверь. Но у вас нет ключа от неё.");
					World.PLAYER_POS_X = x;
					World.PLAYER_POS_Y = y;
				}
			} else {
				System.out.println("Дверь заперта. Используйте ключ.");
				World.PLAYER_POS_X = x;
				World.PLAYER_POS_Y = y;

			}

		}

	}

}
