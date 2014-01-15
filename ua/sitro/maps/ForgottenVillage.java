package ua.sitro.maps;

import ua.sitro.nimgame.NimGame;
import ua.sitro.romansworld.GlobalParams;
import ua.sitro.romansworld.Messages;
import ua.sitro.romansworld.Player;
import ua.sitro.romansworld.ToSay;
import ua.sitro.romansworld.World;

/**
 * 
 * ��������� ������� "Forgotten Village"
 * 
 **/

public class ForgottenVillage {
    public static boolean spk = true;
    public static final int FG_X = 15;
    public static final int FG_Y = 15;
    public static final int MapID = 1;

    public static void helloForgottenVillage() {
	System.out
		.println("/--------------------------------------------------------------------------/");
	System.out
		.println("/----    � �� ����������� ����, ����� ������ ���� ���� �������!?       ----/");
	System.out
		.println("/----           ����� ����� ���������� � ����� �������...              ----/");
	System.out
		.println("/--------------------------------------------------------------------------/");

    }

    public static void chapterHouse() {
	System.out
		.println("/--------------------------------------------------------------------------/");
	System.out
		.println("/---- �� ����� � ��� ����� ������. ������ � ���������� "
			+ GlobalParams.Ametist + ",       ----/");
	System.out
		.println("/---- ������ ��� ������. ��������� �� ����� ����� ������, � ��������   ----/");
	System.out
		.println("/---- ����� ����. ���������� � ���, �������� � ���� ���-�� ���� ��� ���----/");
	System.out
		.println("/--------------------------------------------------------------------------/");

    }

    public static void traningCampMsg() {
	System.out
		.println("/--------------------------------------------------------------------------/");
	System.out
		.println("/---- �� �������� �� ����� �������������� ������.                      ----/");
	System.out
		.println("/---- � ���� ������ ���� �����. � �������� ����� ����� ������ ��������.----/");
	System.out
		.println("/---- ���������� � ���, �������� � ���� ���� ��������� ��� ���.        ----/");
	System.out
		.println("/--------------------------------------------------------------------------/");

    }

    public static void ForgottenVillageWelcomeMessage() {

	System.out
		.println("############################################################");
	System.out
		.println("########################����� �������#######################");
	System.out
		.println("############################################################");
	System.out
		.println("########################        #############           ####");
	System.out
		.println("#####                           #### ��� ####           ####");
	System.out
		.println("#####    ��� �����  ####        #### ��� ####           ####");
	System.out
		.println("#####               ####        #####    ####           ####");
	System.out
		.println("########################                                ####");
	System.out
		.println("#####�������####                                        ####");
	System.out
		.println("########    ####                                        ####");
	System.out
		.println("####                                                    ####");
	System.out
		.println("################    ####     �                          ####");
	System.out
		.println("####                ####     �       ####    ########   ####");
	System.out
		.println("####  ������������� ####     �       ####        ####   ####");
	System.out
		.println("####     ������     ####     �       ####��������####   ####");
	System.out
		.println("####                ####     �       ####        ####   ####");
	System.out
		.println("############################################################");

    }

    public static void ForgottenVillageBuild() {

	// ����������� ���������� ��������� ������� ������

	World.PLAYER_POS_X = 7;
	World.PLAYER_POS_Y = 7;

	// �������������� ������� �������
	for (int count = 0; count < 15; count++) {
	    World.world[count][0] = GlobalParams.paling;
	}
	for (int count = 0; count < 15; count++) {
	    World.world[0][count] = GlobalParams.paling;
	}
	for (int count = 0; count < 15; count++) {
	    World.world[14][count] = GlobalParams.paling;
	}
	for (int count = 0; count < 15; count++) {
	    World.world[count][14] = GlobalParams.paling;
	}

	// ��� ����� �������
	World.world[2][3] = GlobalParams.Ametist; // ��������� ��������, � ����
						  // 3 ������.
	World.world[3][10] = GlobalParams.NewbieGuide; // ��������� ��������
	World.world[3][11] = GlobalParams.bonfire; // �����
	World.world[6][11] = GlobalParams.TraderTauren; // ��������� ��������
	World.world[1][10] = GlobalParams.TraningToys; // ��������� ��������
	World.world[1][11] = GlobalParams.TraningToys; // ��������� ��������
	World.world[1][12] = GlobalParams.TraningToys; // ��������� ��������
	World.world[1][13] = GlobalParams.TraningToys; // ��������� ��������
	World.world[2][13] = GlobalParams.TraningToys; // ��������� ��������
	World.world[3][13] = GlobalParams.TraningToys; // ��������� ��������
	World.world[4][13] = GlobalParams.TraningToys; // ��������� ��������
	World.world[8][13] = GlobalParams.TraderRidjz; // ��������� ��������
	World.world[8][11] = GlobalParams.TraderBerton; // ��������� ��������
	World.world[4][10] = GlobalParams.TraningCamp; // ��� ����� ��
						       // ����������
						       // �������������� ������
	World.world[1][8] = GlobalParams.Ostler; // ��������� ��������
	World.world[9][2] = GlobalParams.Wizard; // ��������� ��������
	World.world[13][13] = GlobalParams.Izabela; // ��������� ��������
	World.world[9][9] = GlobalParams.Mumper; // ��������� ��������

	World.world[4][4] = GlobalParams.chest; // ��������� ������, � ��
						// �������� ���� �� �������.
						// ����� ������� ��� ������, ��
						// ����� �� ���������� ����.
	World.world[4][2] = GlobalParams.chapterHouse; // ��� ����� � ���,
						       // ��������� ���������.
	World.world[5][2] = GlobalParams.openDoor;
	for (int count = 1; count < 8; count++) {
	    World.world[1][count] = GlobalParams.wall;
	}
	for (int count = 2; count < 6; count++) {
	    World.world[count][1] = GlobalParams.wall;
	}
	for (int count = 3; count < 6; count++) {
	    World.world[5][count] = GlobalParams.wall;
	}
	for (int count = 2; count < 5; count++) {
	    World.world[count][5] = GlobalParams.wall;

	}

	// �������
	for (int count = 6; count < 8; count++) {
	    World.world[3][count] = GlobalParams.wall;
	}
	World.world[2][7] = "�������� �����";
	World.world[2][6] = "����";

	// ������������� ������
	for (int count = 1; count < 4; count++) {
	    World.world[count][9] = GlobalParams.paling;
	}
	for (int count = 9; count < 15; count++) {
	    World.world[5][count] = GlobalParams.paling;
	}
	World.world[4][9] = "������";

	// ��������
	World.world[10][10] = "�������� �����";
	World.world[11][10] = GlobalParams.wall;
	World.world[10][12] = "��������";
	for (int count = 10; count < 14; count++) {
	    World.world[9][count] = GlobalParams.wall;
	}
	for (int count = 10; count < 13; count++) {
	    World.world[count][13] = GlobalParams.wall;
	}
	for (int count = 10; count < 14; count++) {
	    World.world[12][count] = GlobalParams.wall;
	}

	// ���������� ���
	World.world[10][4] = "�������� �����";
	World.world[9][4] = GlobalParams.wall;
	for (int count = 1; count < 5; count++) {
	    World.world[8][count] = GlobalParams.wall;
	}
	for (int count = 1; count < 5; count++) {
	    World.world[11][count] = GlobalParams.wall;
	}
	for (int count = 9; count < 11; count++) {
	    World.world[count][1] = GlobalParams.wall;
	}
    }

    public static void ForgottenVillageAction() {

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.chest)) {
	    if (GlobalParams.ChestQuestKey == 1) {
		System.out
			.println("����� ���� ������. � ������� ����� ����! ������ ����... ������... �������� ������");
		new ToSay(ToSay.key);
		if (ToSay.key.equals(GlobalParams.getKey)) {

		    Messages.getKey();
		    GlobalParams.keyToTheDoor++;
		    System.out.println("������ � �������: "
			    + GlobalParams.keyToTheDoor);
		    GlobalParams.ChestQuestKey--;

		}
	    } else
		System.out.println("� ������� ������ ���...");

	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.chapterHouse)) {
	    chapterHouse();
	    if (GlobalParams.chapterHouseExp == 1) {
		GlobalParams.exp = GlobalParams.exp + 1;
		GlobalParams.chapterHouseExp = 0;
		System.out.println("�� �������� 1 ���� �����.   � ��� "
			+ GlobalParams.exp + " XP");
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraningCamp)) {
	    traningCampMsg();
	    if (GlobalParams.traningCampExp == 1) {
		GlobalParams.exp = GlobalParams.exp + 1;
		GlobalParams.traningCampExp = 0;
		System.out.println("�� �������� 1 ���� �����.   � ��� "
			+ GlobalParams.exp + " XP");
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Ametist)) {
	    System.out.println("������� ���������� � ���������?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {

		    System.out
			    .println(GlobalParams.Ametist
				    + ":  "
				    + "������ "
				    + GlobalParams.playerName
				    + ", ������ ����� ���� ������ ����� ��������� ������... �� ���� ��� � �� ���� ��� ���� ��������...");
		    System.out.println("�� � ���� ��������� ����� �����:");
		    System.out.println("���������� - 1");
		    System.out.println("����� - 2");
		    System.out.println("����� �� ��������� - 3");

		    new ToSay(ToSay.key);

		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("������!");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("������ ����� ����� �� ������ ����� �������, �� � ����� �������...");
			System.out.println();
		    }
		    if (ToSay.key.equals(GlobalParams.two)) {

			if (GlobalParams.FVQuestTraningCamp == 0) {
			    System.out.println("������������� ������ - 1");
			}
			if (GlobalParams.exp > 50) {
			    System.out.println("�������� - 2");
			}
			if (GlobalParams.exp > 90) {
			    System.out.println("������ ������ - 3");
			}
			new ToSay(ToSay.key);
			if (ToSay.key.equals(GlobalParams.one)) {
			    if (GlobalParams.FVQuestTraningCamp == 0
				    & !GlobalParams.isQuest) {
				spk = false;
				GlobalParams.isQuest = true;
				GlobalParams.FVQuestTraningCamp = 1;
				System.out
					.println(GlobalParams.playerName
						+ ", ���� ���������� ����� ������� ��������, � ������������� ������. �������� � ���.");
				if (GlobalParams.gmMode) {
				    System.out.println("spk = " + spk);
				    System.out.println("isQuest = "
					    + GlobalParams.isQuest);
				}
			    }
			}
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.exp > 50) {
			    spk = false;
			    System.out
				    .println(GlobalParams.Ametist
					    + ":  �! ����, ��� ��! ���� �� �������������, ��� � ��� ��� ������!");
			    new ToSay(ToSay.key);
			    System.out
				    .println(GlobalParams.playerName
					    + ": ����������� ����, �������! ������ ��� ��� ��������� ����� ������ ������� � ���� �������? ");
			    new ToSay(ToSay.key);
			    System.out
				    .println(GlobalParams.Ametist
					    + ":  ����� ����, ����, �������� ���������� � ����������! \n"
					    + "������ ��� ����� �������� ������������ �����. � �� � ������� ��� �������� ���� ������ �����!"
					    + "\n�������� �������� ��������� � ����� ������. ��� ����� �� �������, �� ��� �� �� ������ ������."
					    + "\n ��� ������� ������ �� ����! ������ ��� �� ���... \n"
					    + "����� ������ ���� � ���� ����. �� ��� ������ ����� �������.\n");
			    GlobalParams.FVQuestEpidemia = 1;
			    spk = false;

			}
		    }

		    if (ToSay.key.equals(GlobalParams.three)) {
			if (GlobalParams.exp > 30) {
			    spk = false;
			    System.out
				    .println("����� ����� ������ \"������ ������\" � ��������� ��������� ��� ��� �����������");

			}
		    }

		}
		if (GlobalParams.FVQuestTraningCamp == 8) {
		    System.out
			    .println(GlobalParams.playerName
				    + ", � ��� ���� ���� ����! � �������� � ����� ������ ������ �������.\n"
				    + " ������� ���� ������� �������������... ����� ���� �������� ��� �������. � ������ ������ ��� ������ � ������ ��� �������, �� �����. ");
		    GlobalParams.FVQuestTraningCamp = 9;
		    System.out.println();
		    System.out.println("�� �������� \"������ �������\" ");
		    ForgottenVillage.spk = false;
		}
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.NewbieGuide)) {
	    System.out.println("������� ���������� � �������� ��������?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {

		while (spk) {

		    System.out
			    .println(GlobalParams.NewbieGuide
				    + ":  "
				    + "������ "
				    + GlobalParams.playerName
				    + ", ������ ����� ���� ������ ����� ��������� ������... �� ���� ��� � �� ���� ��� ���� ��������...");
		    System.out.println("�� � ���� ��������� ����� �����:");
		    System.out.println("���������� - 1");
		    System.out.println("����� - 2");
		    System.out.println("����� �� ��������� - 3");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("��� ������ � ����� �������������...");
			System.out.println();
		    }
		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestTraningCamp == 2) {
			    System.out.println("������������� ������ - 1");
			}
			new ToSay(ToSay.key);
			if (ToSay.key.equals(GlobalParams.three)) {
			    spk = false;
			}
			if (ToSay.key.equals(GlobalParams.one)) {
			    if (GlobalParams.FVQuestTraningCamp == 1
				    || GlobalParams.FVQuestTraningCamp == 2) {

				System.out
					.println("��������... � ���� ����� ���� �������, ��� ��� ����������� � ������.\n"
						+ "������� ������!!! ������!!! �������!!! ����� ������...\n"
						+ "\n"
						+ "��� ����������, ����� �� �������� 3 �������� � ������ ����� �����.\n"
						+ "�������� �� �� ������� ���������� �� ������, � �������� � ����� ���� �������������� ������\n"
						+ "��!? ���� ������??? ������!!!");
				GlobalParams.FVQuestTraningCamp = 2;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 3
				    || GlobalParams.FVQuestTraningCamp == 4) {
				GlobalParams.FVQuestTraningCampItem = 0;
				System.out
					.println("������ �������� ����� ������ ����? ��� ���������� ��� �������... ����� �����... ��������� ����� ��������� �������������...");
				GlobalParams.FVQuestTraningCamp = 4;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 5) {

				System.out
					.println("��? ���� ������? ��������!");
				GlobalParams.FVQuestTraningCamp = 6;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 7) {

				System.out
					.println("������� "
						+ GlobalParams.playerName
						+ ", ������ ����������� � ��������. �� ����� ���� ����!");
				GlobalParams.FVQuestTraningCamp = 8;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 10) {

				System.out
					.println("������������� ������! ������� ������������������ ���� ��������� ������.");
				System.out
					.println("����� ����� ������������� �� ������. ������� ��� 3 ��������� �������� � "
						+ "������������� �����.");
				GlobalParams.FVQuestTraningCamp = 11;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 12) {

				System.out
					.println("�� ��� �� ����! �� �����! ����� ����!");
				GlobalParams.FVQuestTraningCampItem = 0;
				GlobalParams.FVQuestTraningCamp = 13;
				GlobalParams.exp += 10;
				GlobalParams.isQuest = false;
				System.out
					.println("����� ��������. �� �������� 10 ���� �����. ��� ����: "
						+ GlobalParams.exp);
				spk = false;

			    }
			}
		    }

		}
	    }

	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraningToys)) {
	    GlobalParams.enemyName = GlobalParams.TraningToys;
	    if (GlobalParams.FVQuestTraningCamp == 2) {
		GlobalParams.tempExp = 3;
	    } else {
		GlobalParams.tempExp = 0;
	    }
	    Player.battleYesNo();
	    if (GlobalParams.FVQuestTraningCamp == 11) {
		GlobalParams.tempExp = 3;
	    } else {
		GlobalParams.tempExp = 0;
	    }
	    Player.battleYesNo();

	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.bonfire)) {
	    if (GlobalParams.FVQuestTraningCamp == 6) {
		System.out.println("1 - ������� �����");
		new ToSay(ToSay.key);
		if (ToSay.key.equals(GlobalParams.one)) {
		    if (GlobalParams.FVQuestTraningCampItem == 1) {
			System.out
				.println("�� �������� �����. ������, ������ ��� ����� �� � ���� ���������, �������� �����.");
			GlobalParams.FVQuestTraningCampItem = 0;
			GlobalParams.FVQuestTraningCamp = 7;
		    } else {
			System.out.println("����� ����� ���������...");
		    }
		}

	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraderRidjz)) {
	    System.out.println("������� ���������� � "
		    + GlobalParams.TraderRidjz + " ?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {

		    System.out
			    .println(GlobalParams.NewbieGuide
				    + ":  "
				    + "������ "
				    + GlobalParams.playerName
				    + ", ������ ����� ���� ������ ����� ��������� ������... �� ���� ��� � �� ���� ��� ���� ��������...");
		    System.out.println("�� � ���� ��������� ����� �����:");
		    System.out.println("���������� - 1");
		    System.out.println("��������� - 2");
		    System.out.println("����� - 3");
		    if (GlobalParams.FVNimGame == 1) {
			System.out.println("������ � ���� - 4");
		    }
		    if (GlobalParams.FVNimGame == 1) {
			System.out.println("����� �� ��������� - 5");
		    }
		    if (GlobalParams.FVNimGame == 0) {
			System.out.println("����� �� ��������� - 4");
		    }

		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out.println("��� ������ � ����� ��������...");
		    }
		    if (ToSay.key.equals(GlobalParams.two)) {
			System.out.println("� ���� ������ ��� ���� ���...");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			if (GlobalParams.FVQuestTraningCamp == 4) {
			    System.out.println("������������� ������ - 1");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("�� ����� �����? � ����� ���� ������!");
				GlobalParams.FVQuestTraningCampItem = 1;
				System.out
					.println("�� �������� ��������� �������: �����");
				GlobalParams.FVQuestTraningCamp = 5;

			    }
			}
			if (GlobalParams.FVQuestEpidemiaTraderRidjz == 1) {
			    if (GlobalParams.FVQuestEpidemiaScore != 2){
			    System.out.println("1 - ������ ����������");
			    }
			    if (GlobalParams.FVQuestEpidemiaScore == 2)
				System.out.println("1 - ������ ����������");
			    new ToSay(ToSay.key);
			    if (GlobalParams.FVQuestEpidemiaScore != 2){
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("�������! �����!\n"
						+ "�� ��� � ������� ������� ��� � ������ � ����� ���� ��� ������?\n"
						+ "� ����� �������� � ����? ���� ��������� � ���� 2 ���� ������ - �����!");

				System.out.println("1 - ������ � ����");
				System.out.println("2 - ��������� ��������");
				new ToSay(ToSay.key);
				if (ToSay.key.equals(GlobalParams.two)) {
				    System.out
					    .println("������! �� �� � �����!!!");
				    spk = false;
				}
				if (ToSay.key.equals(GlobalParams.one)) {
				    System.out
					    .println("������� ������. ���� 15 ������.\n�� ������� ����� �� 1 �� 3. "
						    + "�������� ���, ��� ���� ���������...");

				    NimGame nimGame = new NimGame();
				    Thread t = new Thread(nimGame);
				    t.start();
				    spk = false;

				}
			    }
			    }
			    if (GlobalParams.FVQuestEpidemiaScore == 2) {
			    if (ToSay.key.equals(GlobalParams.one)) {
				    System.out
					    .println("� �� �������!!! ��� ������ ��� � ��������������.\n");
				    System.out
					    .println("�� ��������: ������ ����������");
				    GlobalParams.FVQuestEpidemiaMumperMoney = 3;
				    spk = false;
				}
			    }

			}
		    }
		    if (GlobalParams.FVNimGame == 1) {
			if (ToSay.key.equals(GlobalParams.four)) {

			    NimGame nimGame = new NimGame();
			    Thread t = new Thread(nimGame);
			    t.start();
			    spk = false;

			}
		    }
		    if (GlobalParams.FVNimGame == 1) {
			if (ToSay.key.equals(GlobalParams.five)) {
			    System.out.println("������!");
			    spk = false;
			}
		    } else if (ToSay.key.equals(GlobalParams.four)) {
			System.out.println("������!");
			spk = false;
		    }

		}
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraderTauren)) {

	    if (GlobalParams.FVQuestTraningCamp == 9) {
		System.out.println("����� ������� \"������ �������\".");

		try {
		    new Thread();
		    System.out.println("������ ������ ������...");
		    Thread.sleep(7000);
		    System.out
			    .println("�� ���� "
				    + GlobalParams.playerName
				    + "..."
				    + "������� ����� ���� � ������... ������ �� ��� ��������!");
		    System.out.println();
		    System.out.println("�� �������� �������: ���");
		    GlobalParams.swordWeapon = true;
		    GlobalParams.FVQuestTraningCamp = 10;
		    System.out.println();
		    System.out.println(GlobalParams.playerName
			    + ", ������������� ������...");
		    Thread.sleep(5000);
		    System.out
			    .println("����� ����� ����� ����������� � ��������. �� ������ ���������� ������.");
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

	    }
	}

	// �����
	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Ostler)) {
	    System.out.println("������� ���������� � �������?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("���������� " + GlobalParams.playerName
			    + ", ���� ����?\n");
		    System.out.println("1 - ����������");
		    System.out.println("2 - �����");
		    System.out.println("3 - ����� �� ���������");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("� ������� ��������... ��� ������ ��� �� �������...\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("�� �������!!!\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 1) {
			    System.out.println("\n1 - ��������");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("\n�� ��� ������ � ��������?");
				System.out
					.println("���� � ���� ���� �����. �������, ��������� �� ����������� ����\n"
						+ "����������� � ���� �����, ������� ����� �������� ���� �� ����� ��������.\n"
						+ "�������� � ���.");
				GlobalParams.FVQuestEpidemia = 2;
				spk = false;
			    }
			}
		    }

		}
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Wizard)) {
	    System.out.println("������� ���������� � �����������??");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("���������� " + GlobalParams.playerName
			    + ", ���� ����?\n");
		    System.out.println("1 - ����������");
		    System.out.println("2 - �����");
		    System.out.println("3 - ����� �� ���������");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("� ������� ����� ��� �� ������� � ��� ������!!!\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("� ���� �� ����...\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemiaAbgusAlgae == 1 & GlobalParams.FVQuestEpidemiaMarshSerum == 1 & GlobalParams.FVQuestEpidemiaNemesisPickles == 1){
			    GlobalParams.FVQuestEpidemia = 4;
			}
			if (GlobalParams.FVQuestEpidemia == 2) {
			    System.out.println("1 - ��������");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("�������� ��������? �� ���� � ���� ���� ������.\n"
						+ "�� ���������� ���� ������ � ���������� �����. ������ ��.\n"
						+ "1.�������� ������ (�����)\n"
						+ "2.������� (���-������ �������)\n"
						+ "3.���������� (���� ����� ���������)\n"
						+ "����� ����!");
				GlobalParams.FVQuestEpidemia = 3;
				spk = false;
			    }

			}
			
			if (GlobalParams.FVQuestEpidemia == 4) {
			    System.out.println("1 - ��������");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("��� ������ �����!!!");
				GlobalParams.FVQuestEpidemia = 5;
				spk = false;
			    }

			}
		    }
		}
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraderBerton)) {
	    System.out.println("������� ���������� � ��������� ��������?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("���������� " + GlobalParams.playerName
			    + ", ���� ����?\n");
		    System.out.println("1 - ��������");
		    System.out.println("2 - �����");
		    System.out.println("3 - ����� �� ���������");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("����� ���� �� ��������� ��� �����...\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("� ����� ������� �� �������?\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 3) {
			    System.out.println("1 - ��������");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("���� ����� �������! � ���� ��� ��� �������� �� ��� ���� �����! ��� �����\n\n");
				System.out
					.println("�� ��������: �������� ���������(1��)");
				GlobalParams.FVQuestEpidemiaMarshSerum = 1;
				spk = false;
			    }
			}
		    }

		}
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Izabela)) {
	    System.out.println("������� ���������� � ��������?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out
			    .println("������ ����������! �� ������� ������� ������� �������� ����?\n");
		    System.out.println("1 - ��������");
		    System.out.println("2 - �����");
		    System.out.println("3 - ����� �� ���������");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out.println("������, � ������...\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("...\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 3) {
			    System.out.println("1 - ��������");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("���� �� ������� ��� ��� ����������, � ������ �� ��.");
				System.out
					.println("�� ��������: ������� ��������(1��)");
				GlobalParams.FVQuestEpidemiaNemesisPickles = 1;
				spk = false;
			    }
			}
		    }

		}
	    }
	}

	// ����������

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Mumper)) {
	    System.out.println("������� ���������� � �����������?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("�� ��� �� ����? ���� ����?\n");
		    System.out.println("1 - ��������");
		    System.out.println("2 - �����");
		    System.out.println("3 - ����� �� ���������");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("�������, ��� ���, ��� ������ ����� - ��������� �� ����� �� ���������.\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("...\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 3) {
			    System.out.println("1 - ��������");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("� � ������������� ����� ���� ����������.\n"
						+ "�� ������� �� ��� ������ ������...\n\n"
						+ "���� � ���� ���� ��������, ����� �������� ����...\n"
						+ "��� � ���������� � �� ������� �������� ������.\n"
						+ "����� �� ������� ������� ��� ������?");
				spk = false;

				GlobalParams.FVQuestEpidemiaTraderRidjz = 1;
				spk = false;
			    }
			}
			if (GlobalParams.FVQuestEpidemiaMumperMoney == 3) {
			    System.out.println("1 - ��������");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("������� ���� ��������!!! ��� ������ �� ��� ������!");
				System.out
					.println("�� ��������: ��������� ������(1��)");
				GlobalParams.FVQuestEpidemiaAbgusAlgae = 1;
				spk = false;
			    }
			}
		    }

		}
	    }
	}

    }
}

// ����� �� �������... ���������...
// if
// (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y].equals(GlobalParams.ForgottenVillageOUT)){
// GlobalParams.MapID = NeighborhoodOfForgottenVillage.MapID;
// Checker.onCheck();
// }
