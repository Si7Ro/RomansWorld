package ua.sitro.romansworld;

public class WorldEngine {

	public static int checkDoor = 0;
	static int x;
	static int y;

	public static void engine() {

		if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
				.equals(GlobalParams.paling)) {
			System.out.println("����� �� ������? ��-��...");
			World.PLAYER_POS_X = x;
			World.PLAYER_POS_Y = y;

		}

		if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
				.equals(GlobalParams.wall)) {
			System.out.println("�� �������� ����� � �����.");
			World.PLAYER_POS_X = x;
			World.PLAYER_POS_Y = y;

		}

		if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
				.equals(GlobalParams.closeDoor)) {
			if (checkDoor == 0) {
				if (GlobalParams.keyToTheDoor != 0) {
					GlobalParams.keyToTheDoor -= 1;
					checkDoor = 1;
					World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y] = "�������� �����";
					System.out.println("�� ������� ����� ������");
					checkDoor = 0;
				} else {
					System.out
							.println("����� ��� �������� �����. �� � ��� ��� ����� �� ��.");
					World.PLAYER_POS_X = x;
					World.PLAYER_POS_Y = y;
				}
			} else {
				System.out.println("����� �������. ����������� ����.");
				World.PLAYER_POS_X = x;
				World.PLAYER_POS_Y = y;

			}

		}

	}

}
