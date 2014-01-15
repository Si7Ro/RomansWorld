package ua.sitro.maps;

import ua.sitro.nimgame.NimGame;
import ua.sitro.romansworld.GlobalParams;
import ua.sitro.romansworld.Messages;
import ua.sitro.romansworld.Player;
import ua.sitro.romansworld.ToSay;
import ua.sitro.romansworld.World;

/**
 * 
 * Стартовая деревня "Forgotten Village"
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
		.println("/----    Я не представляю себе, каким ветром меня сюда занесло!?       ----/");
	System.out
		.println("/----           Думаю нужно наведаться к главе деревни...              ----/");
	System.out
		.println("/--------------------------------------------------------------------------/");

    }

    public static void chapterHouse() {
	System.out
		.println("/--------------------------------------------------------------------------/");
	System.out
		.println("/---- Вы вошли в дом главы посёлка. Добрый и отзывчивый "
			+ GlobalParams.Ametist + ",       ----/");
	System.out
		.println("/---- всегда рад гостям. Частенько он стоит около камина, у западной   ----/");
	System.out
		.println("/---- стены дома. Поговорите с ним, возможно у него что-то есть для вас----/");
	System.out
		.println("/--------------------------------------------------------------------------/");

    }

    public static void traningCampMsg() {
	System.out
		.println("/--------------------------------------------------------------------------/");
	System.out
		.println("/---- Вы ступаете на землю тренеровочного лагеря.                      ----/");
	System.out
		.println("/---- В дали слышен звон мечей. У северной стены стоит Тренер новичков.----/");
	System.out
		.println("/---- Поговорите с ним, возможно у него есть поручения для Вас.        ----/");
	System.out
		.println("/--------------------------------------------------------------------------/");

    }

    public static void ForgottenVillageWelcomeMessage() {

	System.out
		.println("############################################################");
	System.out
		.println("########################СХЕМА ДЕРЕВНИ#######################");
	System.out
		.println("############################################################");
	System.out
		.println("########################        #############           ####");
	System.out
		.println("#####                           #### МАГ ####           ####");
	System.out
		.println("#####    Дом главы  ####        #### Зал ####           ####");
	System.out
		.println("#####               ####        #####    ####           ####");
	System.out
		.println("########################                                ####");
	System.out
		.println("#####Конюшня####                                        ####");
	System.out
		.println("########    ####                                        ####");
	System.out
		.println("####                                                    ####");
	System.out
		.println("################    ####     Р                          ####");
	System.out
		.println("####                ####     Ы       ####    ########   ####");
	System.out
		.println("####  Тренировочный ####     Н       ####        ####   ####");
	System.out
		.println("####     лагерь     ####     О       ####Телепорт####   ####");
	System.out
		.println("####                ####     К       ####        ####   ####");
	System.out
		.println("############################################################");

    }

    public static void ForgottenVillageBuild() {

	// Присваиваем координаты стартовой позиции игрока

	World.PLAYER_POS_X = 7;
	World.PLAYER_POS_Y = 7;

	// Инициализируем границы деревни
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

	// Дом главы деревни
	World.world[2][3] = GlobalParams.Ametist; // Квестовый персонаж, у него
						  // 3 квеста.
	World.world[3][10] = GlobalParams.NewbieGuide; // Квестовый персонаж
	World.world[3][11] = GlobalParams.bonfire; // Костёр
	World.world[6][11] = GlobalParams.TraderTauren; // Квестовый персонаж
	World.world[1][10] = GlobalParams.TraningToys; // Квестовый персонаж
	World.world[1][11] = GlobalParams.TraningToys; // Квестовый персонаж
	World.world[1][12] = GlobalParams.TraningToys; // Квестовый персонаж
	World.world[1][13] = GlobalParams.TraningToys; // Квестовый персонаж
	World.world[2][13] = GlobalParams.TraningToys; // Квестовый персонаж
	World.world[3][13] = GlobalParams.TraningToys; // Квестовый персонаж
	World.world[4][13] = GlobalParams.TraningToys; // Квестовый персонаж
	World.world[8][13] = GlobalParams.TraderRidjz; // Квестовый персонаж
	World.world[8][11] = GlobalParams.TraderBerton; // Квестовый персонаж
	World.world[4][10] = GlobalParams.TraningCamp; // При входе на
						       // территорию
						       // Тренировочного лагеря
	World.world[1][8] = GlobalParams.Ostler; // Квестовый персонаж
	World.world[9][2] = GlobalParams.Wizard; // Квестовый персонаж
	World.world[13][13] = GlobalParams.Izabela; // Квестовый персонаж
	World.world[9][9] = GlobalParams.Mumper; // Квестовый персонаж

	World.world[4][4] = GlobalParams.chest; // Квестовый сундук, в нём
						// хранится ключ от конюшни.
						// Можно открыть без квеста, но
						// тогда не прибавится опыт.
	World.world[4][2] = GlobalParams.chapterHouse; // При входе в дом,
						       // выводится сообщение.
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

	// Конюшня
	for (int count = 6; count < 8; count++) {
	    World.world[3][count] = GlobalParams.wall;
	}
	World.world[2][7] = "Закрытая дверь";
	World.world[2][6] = "Конь";

	// Тренировочный лагерь
	for (int count = 1; count < 4; count++) {
	    World.world[count][9] = GlobalParams.paling;
	}
	for (int count = 9; count < 15; count++) {
	    World.world[5][count] = GlobalParams.paling;
	}
	World.world[4][9] = "Ворота";

	// Телепорт
	World.world[10][10] = "Открытая дверь";
	World.world[11][10] = GlobalParams.wall;
	World.world[10][12] = "Телепорт";
	for (int count = 10; count < 14; count++) {
	    World.world[9][count] = GlobalParams.wall;
	}
	for (int count = 10; count < 13; count++) {
	    World.world[count][13] = GlobalParams.wall;
	}
	for (int count = 10; count < 14; count++) {
	    World.world[12][count] = GlobalParams.wall;
	}

	// Магический зал
	World.world[10][4] = "Открытая дверь";
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
			.println("Тааак вижу сундук. В сундуке лежит ключ! Возьми меня... возьми... закричал ключик");
		new ToSay(ToSay.key);
		if (ToSay.key.equals(GlobalParams.getKey)) {

		    Messages.getKey();
		    GlobalParams.keyToTheDoor++;
		    System.out.println("Ключей в кармане: "
			    + GlobalParams.keyToTheDoor);
		    GlobalParams.ChestQuestKey--;

		}
	    } else
		System.out.println("В сундуке ничего нет...");

	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.chapterHouse)) {
	    chapterHouse();
	    if (GlobalParams.chapterHouseExp == 1) {
		GlobalParams.exp = GlobalParams.exp + 1;
		GlobalParams.chapterHouseExp = 0;
		System.out.println("Вы получили 1 очко опыта.   У вас "
			+ GlobalParams.exp + " XP");
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraningCamp)) {
	    traningCampMsg();
	    if (GlobalParams.traningCampExp == 1) {
		GlobalParams.exp = GlobalParams.exp + 1;
		GlobalParams.traningCampExp = 0;
		System.out.println("Вы получили 1 очко опыта.   У вас "
			+ GlobalParams.exp + " XP");
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Ametist)) {
	    System.out.println("Желаете поговорить с Аметистом?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {

		    System.out
			    .println(GlobalParams.Ametist
				    + ":  "
				    + "Привет "
				    + GlobalParams.playerName
				    + ", сейчас между нами должен будет произойти диалог... Но пока что я не знаю что тебе говорить...");
		    System.out.println("Но я тебе предлагаю некий выбор:");
		    System.out.println("Поговорить - 1");
		    System.out.println("Квест - 2");
		    System.out.println("Выйти из разговора - 3");

		    new ToSay(ToSay.key);

		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("Прощай!");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("Каждый народ велик не только своим будущим, но и своим прошлым...");
			System.out.println();
		    }
		    if (ToSay.key.equals(GlobalParams.two)) {

			if (GlobalParams.FVQuestTraningCamp == 0) {
			    System.out.println("Тренировочный лагерь - 1");
			}
			if (GlobalParams.exp > 50) {
			    System.out.println("Эпидемия - 2");
			}
			if (GlobalParams.exp > 90) {
			    System.out.println("Письмо Тальку - 3");
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
						+ ", тебе необходимо найти тренера новичков, в тренеровочном лагере. Поговори с ним.");
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
					    + ":  О! Воин, это вы! Даже не представляете, как я рад вас видеть!");
			    new ToSay(ToSay.key);
			    System.out
				    .println(GlobalParams.playerName
					    + ": Приветствую тебя, Аметист! Отчего это мое появление такую бурную радость у тебя вызвало? ");
			    new ToSay(ToSay.key);
			    System.out
				    .println(GlobalParams.Ametist
					    + ":  Такие дела, воин, страшные происходят и непонятные! \n"
					    + "Помощь мне нужна крепкого бесстрашного бойца. А вы в прошлый раз показали себя именно таким!"
					    + "\nСтрашная эпидемия появилась в нашем посёлке. Для людей не страшна, но вот от неё гибнут лошади."
					    + "\n Вся надежда только на тебя! Выясни что да как... \n"
					    + "Конюх введет тебя в курс дела. Он как всегда около конюшни.\n");
			    GlobalParams.FVQuestEpidemia = 1;
			    spk = false;

			}
		    }

		    if (ToSay.key.equals(GlobalParams.three)) {
			if (GlobalParams.exp > 30) {
			    spk = false;
			    System.out
				    .println("Здесь текст квеста \"Письмо Тальку\" и различные параметры для его прохождения");

			}
		    }

		}
		if (GlobalParams.FVQuestTraningCamp == 8) {
		    System.out
			    .println(GlobalParams.playerName
				    + ", я ищу тебя весь день! Я наслышан о твоей помощи нашему тренеру.\n"
				    + " Позволь тебя немного отблагодарить... Думаю тебя обрадует мой сюрприз. А сейчас возьми это письмо и отнеси его Таурену, на рынок. ");
		    GlobalParams.FVQuestTraningCamp = 9;
		    System.out.println();
		    System.out.println("Вы получили \"Письмо Таурену\" ");
		    ForgottenVillage.spk = false;
		}
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.NewbieGuide)) {
	    System.out.println("Желаете поговорить с Тренером новчиков?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {

		while (spk) {

		    System.out
			    .println(GlobalParams.NewbieGuide
				    + ":  "
				    + "Привет "
				    + GlobalParams.playerName
				    + ", сейчас между нами должен будет произойти диалог... Но пока что я не знаю что тебе говорить...");
		    System.out.println("Но я тебе предлагаю некий выбор:");
		    System.out.println("Поговорить - 1");
		    System.out.println("Квест - 2");
		    System.out.println("Выйти из разговора - 3");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("Мне неочем с тобой разговаривать...");
			System.out.println();
		    }
		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestTraningCamp == 2) {
			    System.out.println("Тренировочный лагерь - 1");
			}
			new ToSay(ToSay.key);
			if (ToSay.key.equals(GlobalParams.three)) {
			    spk = false;
			}
			if (ToSay.key.equals(GlobalParams.one)) {
			    if (GlobalParams.FVQuestTraningCamp == 1
				    || GlobalParams.FVQuestTraningCamp == 2) {

				System.out
					.println("Послушай... У меня очень мало времени, так что рассказываю в кратце.\n"
						+ "Махаешь руками!!! Ногами!!! Головой!!! Залог победы...\n"
						+ "\n"
						+ "Мне необходимо, чтобы ты раздобыл 3 предмета с гербом нашей армии.\n"
						+ "Получить их ты сможешь тренируясь на куклах, у западной и южной стен тренировочного лагеря\n"
						+ "Ну!? Чего стоишь??? ВПЕРЕД!!!");
				GlobalParams.FVQuestTraningCamp = 2;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 3
				    || GlobalParams.FVQuestTraningCamp == 4) {
				GlobalParams.FVQuestTraningCampItem = 0;
				System.out
					.println("Видишь потухший костёр позаду тебя? Нам необходимо его разжечь... Найди огонь... Вероятней всего прийдется поторговаться...");
				GlobalParams.FVQuestTraningCamp = 4;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 5) {

				System.out
					.println("Ну? Чего стоишь? Розжигай!");
				GlobalParams.FVQuestTraningCamp = 6;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 7) {

				System.out
					.println("Молодец "
						+ GlobalParams.playerName
						+ ", теперь отправляйся к Аметисту. Он давно тебя ищет!");
				GlobalParams.FVQuestTraningCamp = 8;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 10) {

				System.out
					.println("Прекраснейший клинок! Позволь продемонстрировать тебе несколько ударов.");
				System.out
					.println("Самое время поупражняться на куклах. Принеси мне 3 квестовых предмета с "
						+ "тренировочных кукол.");
				GlobalParams.FVQuestTraningCamp = 11;
				spk = false;

			    }

			    if (GlobalParams.FVQuestTraningCamp == 12) {

				System.out
					.println("Ну что же воин! Ты готов! Удачи тебе!");
				GlobalParams.FVQuestTraningCampItem = 0;
				GlobalParams.FVQuestTraningCamp = 13;
				GlobalParams.exp += 10;
				GlobalParams.isQuest = false;
				System.out
					.println("Квест завершен. Вы получили 10 очей опыта. Ваш опыт: "
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
		System.out.println("1 - Розжечь костёр");
		new ToSay(ToSay.key);
		if (ToSay.key.equals(GlobalParams.one)) {
		    if (GlobalParams.FVQuestTraningCampItem == 1) {
			System.out
				.println("Вы разожгли костёр. Теперь, каждый раз когда вы к нему подойдете, получите бонус.");
			GlobalParams.FVQuestTraningCampItem = 0;
			GlobalParams.FVQuestTraningCamp = 7;
		    } else {
			System.out.println("Костёр нужно розжигать...");
		    }
		}

	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraderRidjz)) {
	    System.out.println("Желаете поговорить с "
		    + GlobalParams.TraderRidjz + " ?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {

		    System.out
			    .println(GlobalParams.NewbieGuide
				    + ":  "
				    + "Привет "
				    + GlobalParams.playerName
				    + ", сейчас между нами должен будет произойти диалог... Но пока что я не знаю что тебе говорить...");
		    System.out.println("Но я тебе предлагаю некий выбор:");
		    System.out.println("Поговорить - 1");
		    System.out.println("Торговать - 2");
		    System.out.println("Квест - 3");
		    if (GlobalParams.FVNimGame == 1) {
			System.out.println("Играть в игру - 4");
		    }
		    if (GlobalParams.FVNimGame == 1) {
			System.out.println("Выйти из разговора - 5");
		    }
		    if (GlobalParams.FVNimGame == 0) {
			System.out.println("Выйти из разговора - 4");
		    }

		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out.println("Нам неочем с тобой говорить...");
		    }
		    if (ToSay.key.equals(GlobalParams.two)) {
			System.out.println("У меня ничего для тебя нет...");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			if (GlobalParams.FVQuestTraningCamp == 4) {
			    System.out.println("Тренировочный лагерь - 1");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Ты ищешь огонь? Я готов тебе помочь!");
				GlobalParams.FVQuestTraningCampItem = 1;
				System.out
					.println("Вы получили квестовый предмет: Огонь");
				GlobalParams.FVQuestTraningCamp = 5;

			    }
			}
			if (GlobalParams.FVQuestEpidemiaTraderRidjz == 1) {
			    if (GlobalParams.FVQuestEpidemiaScore != 2){
			    System.out.println("1 - Помощь попрошайке");
			    }
			    if (GlobalParams.FVQuestEpidemiaScore == 2)
				System.out.println("1 - Помощь попрошайке");
			    new ToSay(ToSay.key);
			    if (GlobalParams.FVQuestEpidemiaScore != 2){
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Ахахаха! Хахах!\n"
						+ "Ты что и вправду подумал что я возьму и отдам тебе его деньги?\n"
						+ "А давай ссыграем в игру? Если выиграешь у меня 2 раза подряд - отдам!");

				System.out.println("1 - Играть в игру");
				System.out.println("2 - Закончить разговор");
				new ToSay(ToSay.key);
				if (ToSay.key.equals(GlobalParams.two)) {
				    System.out
					    .println("Хахаха! Ну ты и лопух!!!");
				    spk = false;
				}
				if (ToSay.key.equals(GlobalParams.one)) {
				    System.out
					    .println("Правила просты. Есть 15 спичек.\nПо очереди берем от 1 до 3. "
						    + "Проиграл тот, кто взял последнюю...");

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
					    .println("А ты молодец!!! Вот возьми как и договаривались.\n");
				    System.out
					    .println("Вы получили: Деньги попрошайки");
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
			    System.out.println("Прощай!");
			    spk = false;
			}
		    } else if (ToSay.key.equals(GlobalParams.four)) {
			System.out.println("Прощай!");
			spk = false;
		    }

		}
	    }
	}

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.TraderTauren)) {

	    if (GlobalParams.FVQuestTraningCamp == 9) {
		System.out.println("Исчез предмет \"Письмо Таурену\".");

		try {
		    new Thread();
		    System.out.println("Таурен читает письмо...");
		    Thread.sleep(7000);
		    System.out
			    .println("Ну чтож "
				    + GlobalParams.playerName
				    + "..."
				    + "Аметист знает толк в оружии... Видимо ты его заслужил!");
		    System.out.println();
		    System.out.println("Вы получили предмет: Меч");
		    GlobalParams.swordWeapon = true;
		    GlobalParams.FVQuestTraningCamp = 10;
		    System.out.println();
		    System.out.println(GlobalParams.playerName
			    + ", рассматривает оружие...");
		    Thread.sleep(5000);
		    System.out
			    .println("Думаю самое время встретиться с тренером. Он обучит мастерству клинка.");
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

	    }
	}

	// Конюх
	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Ostler)) {
	    System.out.println("Желаете поговорить с Конюхом?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("Здравствуй " + GlobalParams.playerName
			    + ", чего тебе?\n");
		    System.out.println("1 - Поговорить");
		    System.out.println("2 - Квест");
		    System.out.println("3 - Выйти из разговора");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("В деревне эпидемия... Что делать ума не приложу...\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("До встречи!!!\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 1) {
			    System.out.println("\n1 - Эпидемия");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("\nТы уже слышал о эпидемии?");
				System.out
					.println("Есть у меня одна мысль. Однажды, Волшебник из Магического зала\n"
						+ "рассказывал о чудо зелье, которое якобы исцеляет всех от любых напастей.\n"
						+ "Поговори с ним.");
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
	    System.out.println("Желаете поговорить с Волшебником??");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("Здравствуй " + GlobalParams.playerName
			    + ", чего тебе?\n");
		    System.out.println("1 - Поговорить");
		    System.out.println("2 - Квест");
		    System.out.println("3 - Выйти из разговора");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("Я слишком занят что бы болтать с кем попало!!!\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("Я тебя не ждал...\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemiaAbgusAlgae == 1 & GlobalParams.FVQuestEpidemiaMarshSerum == 1 & GlobalParams.FVQuestEpidemiaNemesisPickles == 1){
			    GlobalParams.FVQuestEpidemia = 4;
			}
			if (GlobalParams.FVQuestEpidemia == 2) {
			    System.out.println("1 - Эпидемия");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Эпидемия говоришь? Да есть у меня один рецепт.\n"
						+ "Но инграиенты есть только у нескольких людей. Посети их.\n"
						+ "1.Торговец Бертон (Рынок)\n"
						+ "2.Изабела (Юго-Восток деревни)\n"
						+ "3.Попрошайка (Двор возле Телепорта)\n"
						+ "Удачи тебе!");
				GlobalParams.FVQuestEpidemia = 3;
				spk = false;
			    }

			}
			
			if (GlobalParams.FVQuestEpidemia == 4) {
			    System.out.println("1 - Эпидемия");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Вот возьми зелье!!!");
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
	    System.out.println("Желаете поговорить с Торговцем Бертоном?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("Здравствуй " + GlobalParams.playerName
			    + ", чего тебе?\n");
		    System.out.println("1 - Торговля");
		    System.out.println("2 - Квест");
		    System.out.println("3 - Выйти из разговора");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("Думаю тебе не покарману мой товар...\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("А может беляшик на дорожку?\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 3) {
			    System.out.println("1 - Эпидемия");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Тебе очень повезло! У меня как раз осталось то что тебе нужно! Вот держи\n\n");
				System.out
					.println("Вы получили: Болотная сыворотка(1шт)");
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
	    System.out.println("Желаете поговорить с Изабелой?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out
			    .println("Привет незнакомец! Не желаешь уделить вечерок одинокой даме?\n");
		    System.out.println("1 - Говорить");
		    System.out.println("2 - Квест");
		    System.out.println("3 - Выйти из разговора");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out.println("Извини, я занята...\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("...\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 3) {
			    System.out.println("1 - Эпидемия");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Если ты просишь это для Волшебника, я готова на всё.");
				System.out
					.println("Вы получили: Соленья Немезиды(1шт)");
				GlobalParams.FVQuestEpidemiaNemesisPickles = 1;
				spk = false;
			    }
			}
		    }

		}
	    }
	}

	// Попрошайка

	if (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y]
		.equals(GlobalParams.Mumper)) {
	    System.out.println("Желаете поговорить с Попрошайкой?");
	    new ToSay(ToSay.key);
	    if (ToSay.key.equals(GlobalParams.speak)) {
		spk = true;
		while (spk) {
		    System.out.println("Ах это ты воин? Чего тебе?\n");
		    System.out.println("1 - Говорить");
		    System.out.println("2 - Квест");
		    System.out.println("3 - Выйти из разговора");
		    new ToSay(ToSay.key);
		    if (ToSay.key.equals(GlobalParams.one)) {
			System.out
				.println("Говорят, что там, где живётся плохо - попрошаек на улице не встретишь.\n");
		    }
		    if (ToSay.key.equals(GlobalParams.three)) {
			System.out.println("...\n");
			spk = false;
		    }

		    if (ToSay.key.equals(GlobalParams.two)) {
			if (GlobalParams.FVQuestEpidemia == 3) {
			    System.out.println("1 - Эпидемия");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Я с удовольствием отдам тебе инградиент.\n"
						+ "Но сначала ты мне должен помочь...\n\n"
						+ "Есть у меня одна слабость, люблю азартные игры...\n"
						+ "Вот и проигрался я до копейки торговцу Риджсу.\n"
						+ "Может ты сможешь вернуть мои деньги?");
				spk = false;

				GlobalParams.FVQuestEpidemiaTraderRidjz = 1;
				spk = false;
			    }
			}
			if (GlobalParams.FVQuestEpidemiaMumperMoney == 3) {
			    System.out.println("1 - Эпидемия");
			    new ToSay(ToSay.key);
			    if (ToSay.key.equals(GlobalParams.one)) {
				System.out
					.println("Спасибо тебе огромное!!! Вот возьми то что просил!");
				System.out
					.println("Вы получили: Водоросли Абгуса(1шт)");
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

// Выход из деревни... Заготовка...
// if
// (World.world[World.PLAYER_POS_X][World.PLAYER_POS_Y].equals(GlobalParams.ForgottenVillageOUT)){
// GlobalParams.MapID = NeighborhoodOfForgottenVillage.MapID;
// Checker.onCheck();
// }
