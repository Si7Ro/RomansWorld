package ua.sitro.romansworld;

import java.util.Random;

public class Player {
	static int damage;
	static Boolean critical = false;
	static int weapon = 1;
	
	public static void inBattle(){
	
		
		
		while (GlobalParams.inBattle) {
			new Enemy(GlobalParams.enemyName);
			System.out.println("Чем нанести удар?");
			System.out.println("Кулаки - 1");
			if (GlobalParams.swordWeapon){System.out.println("Мечь - 2");}
			new ToSay(ToSay.key);
			
			if (ToSay.key.equals(GlobalParams.one)){
				weapon = 1;
				playerDamage();
				Enemy.healthPoint();
				Enemy.enemyDamage();
				battelCheck();
			}
			if (GlobalParams.swordWeapon){
				if (ToSay.key.equals(GlobalParams.two)){
					weapon = 2;
					playerDamage();
					Enemy.healthPoint();
					Enemy.enemyDamage();
					battelCheck();
				}
			}
		}
		
		}
	
	
	public static void playerDamage(){
		criticalDamage();
		if (!critical) {
			damage = GlobalParams.lvl * weapon;
		}
		Enemy.healthPoint -= damage;
		System.out.println("Вы нанесли " + GlobalParams.enemyName + " урон: "  + damage);
		
	}
	
	public static void battelCheck(){
		
		critical = false;
		
		if (Enemy.healthPoint <= 0) {
			GlobalParams.inBattle = false;
		}
		if (GlobalParams.health <= 0){
			GlobalParams.inBattle = false;
			System.out.println("Вас убили! Вы очнетесь в ближайшем городе через 15 секунд...");
			try {
				new Thread();
				Thread.sleep(15000);
				World.PLAYER_POS_X = 7;
				World.PLAYER_POS_Y = 7;
				GlobalParams.health = 1;
				System.out.println("Вас подлечил местный знахарь! Впредь будтье осторожнее... Сейчас у Вас "+ GlobalParams.health + " HP");
				Checker.regenCheck = false;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void criticalDamage(){
		Random rand = new Random();
		
		int r = rand.nextInt(9);
		int a = (100/r+1)*2;
		int b = ((r+1)*100)/2;
		int crit = a - b;
		if (GlobalParams.gmMode) {
			System.out.println("Сгенерированое число: " + r);
			System.out.println("Проверочное число критического удар: " + crit);
		}
		if (crit > 0){
			critical = true;
			int criticalDamage = 5;
			damage = GlobalParams.damage * weapon * criticalDamage;
			System.out.println("КРИТИЧЕСКИЙ УДАР!!!");
		}

	}

	public static void stepPlayer() {
		
		Actions.instPlayer();
		
	}
	
	public static void battleYesNo(){
		System.out.println("Вступить в бой? (да\\нет)");
		new ToSay(ToSay.key);
		if (ToSay.key.equals(GlobalParams.no)){
			System.out.println("\nВы отказались от боя...");
		}
		if (ToSay.key.equals(GlobalParams.yes)){
			GlobalParams.inBattle = true;
			inBattle();
		}
	}

}
