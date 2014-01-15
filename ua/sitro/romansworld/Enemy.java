package ua.sitro.romansworld;

public class Enemy {
	static int lvl = GlobalParams.lvl;
	public static int healthPoint = lvl * 10;
	static int damage = lvl * 2;

	public Enemy(String name) {

		if (healthPoint <= 0) {
			healthPoint = GlobalParams.lvl * 10;
		}
		return;
	}

	public static void healthPoint() {
		if (healthPoint > 0) {
			System.out.println(GlobalParams.enemyName + " осталось "
					+ healthPoint + " HP");
		} else {
			GlobalParams.exp += GlobalParams.tempExp;
			System.out.println("Поздравляем! Вы победили "
					+ GlobalParams.enemyName + ". Вы получаете "
					+ GlobalParams.tempExp + " очка опыта");
			GlobalParams.tempExp = 0;
			QuestChecked.questChecked();
			Checker.regenCheck = false;

		}

	}

	public static void enemyDamage() {

		GlobalParams.health = GlobalParams.health - damage;

		System.out.println("Соперник нанёс по вам урон: " + damage);
		System.out.println("У вас осталось " + GlobalParams.health + " HP");

	}

}
