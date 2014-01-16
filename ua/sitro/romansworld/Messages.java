package ua.sitro.romansworld;

public class Messages extends World {

	public static void welcomeToGame() {
		System.out
				.println("*******************************************************************************");
		System.out
				.println("*******************************************************************************");
		System.out
				.println("*   RRRRRRR     OOOOOOOO  MMM       MMM     AAAA     NNN       NN    SSSS     *");
		System.out
				.println("*   RR     RR   OOOOOOOO  MMMM     MMMM    AAAAAA    NNNN      NN  SSSSSSS    *");
		System.out
				.println("*   RR   RR RR  OO    OO  MM MM   MM MM    AA  AA    NN NN     NN SS          *");
		System.out
				.println("*   RR  RR  RR  OO    OO  MM  MMMMM  MM   AA    AA   NN  NN    NN SS          *");
		System.out
				.println("*   RR     RR   OO    OO  MM   MMM   MM   AA    AA   NN   NN   NN  SS         *");
		System.out
				.println("*   RR   RRR    OO    OO  MM    M    MM  AAA AA AAA  NN   NN   NN   SSSSSS    *");
		System.out
				.println("*   RR  RR      OO    OO  MM         MM  AA      AA  NN   NN   NN    SSSSSS   *");
		System.out
				.println("*   RR   RR     OO    OO  MM         MM  AA      AA  NN    NN  NN          SS *");
		System.out
				.println("*   RR    RR    OO    OO  MM         MM  AA      AA  NN     NN NN          SS *");
		System.out
				.println("*   RR    RRR   OOOOOOOO  MM         MM  AA      AA  NN      NNNN   SSSSSSSS  *");
		System.out
				.println("*   RR     RRR  OOOOOOOO  MM         MM  AA      AA  NN       NNN     SSSS    *");
		System.out
				.println("*                                                                             *");
		System.out
				.println("*                                                                             *");
		System.out
				.println("*     ww                  WW  OOOOOOOO  RRRRRRRRR     LL      DD              *");
		System.out
				.println("*     ww                  WW  OOOOOOOO  RR       RR   LL      DDDDD           *");
		System.out
				.println("*     ww                  WW  OO    OO  RR   RR  RR   LL      DD   DD         *");
		System.out
				.println("*     ww                  WW  OO    OO  RR  RR   RR   LL      DD     D        *");
		System.out
				.println("*     ww        WW        WW  OO    OO  RR       RR   LL      DD     D        *");
		System.out
				.println("*     ww       WWWW       WW  OO    OO  RR    RRRR    LL      DD     D        *");
		System.out
				.println("*      ww     WWW WWW     WW  OO    OO  RR    RR      LL      DD     D        *");
		System.out
				.println("*       WW   WWW   WWW   WW   OO    OO  RR     RR     LL  LL  DD    D         *");
		System.out
				.println("*        WW WWW     WWW WW    OO    OO  RR      RR    LL  LL  DD   DD         *");
		System.out
				.println("*         WWWW       WWWW     OOOOOOOO  RR       RRR  LLLLLL  DDDDD           *");
		System.out
				.println("*          WW         WW      OOOOOOOO  RR        RRR LLLLLL  DD              *");
		System.out
				.println("*******************************************************************************");
		System.out
				.println("*******************************************************************************");

		System.out.println();

	}

	public static void helpMsg() {

		System.out
				.println("*********************************************************************");
		System.out
				.println("**********************Основные игровые команды:**********************");
		System.out
				.println("*********************************************************************");

	}

	public static void stayToLook() {
		int count = 0;
		String[] cardinal = { "на Северо-Запад", "на Запад", "на Юго-Запад",
				"на Север", "себе под ноги", "на Юг", "на Северо-Восток",
				"на Восток", "на Юго-Восток" };
		
		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				if (!world[PLAYER_POS_X + x][PLAYER_POS_Y + y].equals("")) {
					System.out.println("Смотрю " + cardinal[count] + ": "
							+ world[PLAYER_POS_X + x][PLAYER_POS_Y + y]);
				}

				count++;

			}
		}
		

	}

	public static void inBattle() {
		System.out.println("Вы не можете двигаться, когда находитесь в бою...");

	}

	public static void battleAttack() {
		System.out.println("Чтобы ударить рукой, нажмите: 1");
		System.out.println("Чтобы ударить ногой, нажмите: 2");
		System.out.println("Чтобы ударить головой, нажмите: 3");

	}

	public static void moveNSWE() {
		System.out.println("Куда идём? (север, юг, запад, восток)");

	}

	public static void moveTo() {
		if (GlobalParams.gmMode) {
			System.out.println("Сделан ход на " + ToSay.key + ".");
			System.out.println("Координаты квадрата " + "X: " + PLAYER_POS_X
					+ ";" + " Y: " + PLAYER_POS_Y + ";");
		} else {
			System.out.println("Сделан ход на " + ToSay.key + ".");
		}
	}

	public static void waitPlayer() {
		System.out.println("Ожидаю действий игрока...");

	}

	public static void limitOfTheWorld() {
		System.out.println("Вы уперлись в границу мира!");

	}

	public static void getKey() {
		System.out.println("Вы подняли ключ");

	}

	public static void exitGame() {
		System.out.println("Пока! Заходи еще.");

	}

}
