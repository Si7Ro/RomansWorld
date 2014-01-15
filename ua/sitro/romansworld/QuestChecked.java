package ua.sitro.romansworld;

import java.util.Random;

public class QuestChecked {
	static int n;

	public static void questChecked() {

		if (GlobalParams.isQuest) {

			// Forgotten Village Quests
			if (GlobalParams.FVQuestTraningCamp == 2) {
				n = 3;
				checkedEngine();
				if (GlobalParams.FVQuestTraningCampItem >= 3) {
					GlobalParams.FVQuestTraningCamp = 3;
				}
			}
			if (GlobalParams.FVQuestTraningCamp == 11) {
				n = 7;
				checkedEngine();
				if (GlobalParams.FVQuestTraningCampItem >= 3) {
					GlobalParams.FVQuestTraningCamp = 12;
				}
			}

		}
	}

	public static void checkedEngine() {
		int r = new Random().nextInt(n);
		if (GlobalParams.gmMode) {
			System.out.println("Рандомное число для выпада итема: " + r);
		}
		if (r == 1) {
			GlobalParams.FVQuestTraningCampItem++;
			System.out.println();
			System.out.println("Вы получили квестовый предмет. У вас: "
					+ GlobalParams.FVQuestTraningCampItem + " предмета.");
		}

	}
}
