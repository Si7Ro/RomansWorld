package ua.sitro.romansworld;

public class Actions {
    public static Boolean count = true;

    public static void instPlayer() {

	while (count) {
	    try {

		// Инициализация ввода команд игроком

		new ToSay(ToSay.key);
		// Реагируем на команды

		Messages.waitPlayer();
		if (!GlobalParams.inBattle) {
		    if (GlobalParams.gmMode) {
			if (ToSay.key.equals("hp")) {
			    System.out.println("1 - Посмотреть здоровье");
			    System.out
				    .println("2 - Пополнить здоровье до максимума");
			    new ToSay(ToSay.key);

			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out.println("У меня "
					+ GlobalParams.health + " HP");
			    }
			    if (ToSay.key.equals(GlobalParams.two)) {
				GlobalParams.health = GlobalParams.maxHP;
				System.out.println("Вы полностью здоровы.");
				System.out.println("У меня "
					+ GlobalParams.health + " HP");
			    }

			}
		    }
		    if (ToSay.key.equals(GlobalParams.howManyKeys)) {
			if (GlobalParams.keyToTheDoor == 0) {
			    System.out.println("У меня нет ключей.");
			} else
			    System.out.println("У меня "
				    + GlobalParams.keyToTheDoor + " ключей");
		    }

		    if (ToSay.key.equals(GlobalParams.getKey)) {
			if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
				.equals(GlobalParams.doorKey)) {
			    Messages.getKey();
			    GlobalParams.keyToTheDoor++;
			    World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y] = "";
			    System.out.println("Ключей в кармане: "
				    + GlobalParams.keyToTheDoor);
			} else
			    System.out.println("Осмотрись... Я ключей не вижу");
		    }

		    if (ToSay.key.equals(GlobalParams.move)) {
			Messages.moveNSWE();
			new ToSay(ToSay.key);
			if (ToSay.key.equals(GlobalParams.south)) {
			    WorldEngine.x = World.PLAYER_POS_X;
			    WorldEngine.y = World.PLAYER_POS_Y;
			    World.PLAYER_POS_Y += 1;

			    Checker.onCheck();

			} else if (ToSay.key.equals(GlobalParams.north)) {
			    WorldEngine.x = World.PLAYER_POS_X;
			    WorldEngine.y = World.PLAYER_POS_Y;
			    World.PLAYER_POS_Y -= 1;

			    Checker.onCheck();

			} else if (ToSay.key.equals(GlobalParams.west)) {
			    WorldEngine.x = World.PLAYER_POS_X;
			    WorldEngine.y = World.PLAYER_POS_Y;
			    World.PLAYER_POS_X -= 1;

			    Checker.onCheck();

			} else if (ToSay.key.equals(GlobalParams.east)) {
			    WorldEngine.x = World.PLAYER_POS_X;
			    WorldEngine.y = World.PLAYER_POS_Y;
			    World.PLAYER_POS_X += 1;

			    Checker.onCheck();

			}

		    }
		    if (ToSay.key.equals(GlobalParams.gmOn)) {
			System.out.println("Режим GameMaser активирован.");
			GlobalParams.gmMode = true;

		    }
		    if (ToSay.key.equals(GlobalParams.gmOff)) {
			System.out.println("Режим GameMaser отключен.");
			GlobalParams.gmMode = false;

		    }
		    if (ToSay.key.equals(GlobalParams.closeGame)) {
			Messages.exitGame();
			System.exit(0);

		    }

		    if (ToSay.key.equals(GlobalParams.stayToLook)) {
			Messages.stayToLook();

		    }

		    if (ToSay.key.equals(GlobalParams.map)) {
			World w = new World();
			w.mapWorld();
		    }

		    if (ToSay.key.equals(GlobalParams.help)) {
			Messages.helpMsg();

		    }

		    if (ToSay.key.equals("exp")) {
			if (GlobalParams.gmMode) {
			    System.out.println("У вас " + GlobalParams.exp
				    + " XP");
			} else {
			    System.out.println("Недостаточно прав");
			}
		    }

		    if (ToSay.key.equals("teleport")) {
			if (GlobalParams.gmMode) {
			    System.out.println("Введите координату Х:  ");

			    new ToSay(ToSay.key);
			    World.PLAYER_POS_X = Integer.parseInt(ToSay.key);
			    System.out.println("Введите координату Y:  ");
			    new ToSay(ToSay.key);
			    World.PLAYER_POS_Y = Integer.parseInt(ToSay.key);

			    System.out
				    .println("Вы телепортировались в координаты: "
					    + World.PLAYER_POS_X
					    + ", "
					    + World.PLAYER_POS_Y);

			} else {
			    System.out.println("Недостаточно прав");
			}
		    }

		    if (ToSay.key.equals("setexp")) {
			if (GlobalParams.gmMode) {
			    System.out.println("Установите кол-во EXP");
			    new ToSay(ToSay.key);
			    GlobalParams.exp = Integer.parseInt(ToSay.key);

			    System.out.println("Установлено "
				    + GlobalParams.exp + " XP");
			} else {
			    System.out.println("Недостаточно прав");
			}
		    }

		} else {
		    Player.inBattle();

		}

	    } catch (Exception ex) {
	    }
	}

    }
}
