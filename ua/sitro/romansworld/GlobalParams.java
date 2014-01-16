package ua.sitro.romansworld;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GlobalParams implements Serializable {
	public static Boolean gmMode = false; // GameMaster Mode
	public static int MapID = 0;
	public static Boolean newGame = true;
	public static Boolean isQuest = false;
	public static Boolean swordWeapon = false;
	public static String enemyName = null;
	public static Boolean inBattle = false;
	public static int tempExp = 0;
	

	// Общие параметры мира
	public static String space = "";
	public static String zero = "0";
	public static String one = "1";
	public static String two = "2";
	public static String three = "3";
	public static String four = "4";
	public static String five = "5";
	public static String six = "6";
	public static String seven = "7";
	public static String eight = "8";
	public static String nine = "9";

	// Настройки игрока
	public static int keyToTheDoor = 0;
	public static String playerName;
	public static int lvl = 1;
	public static int health;
	public static int damage;
	public static int exp;
	public static int enemyDamage = lvl * 2;
	public static int maxHP = 20 * lvl;


	// Инициализация мира
	public static final String wall = "Стена";
	public static final String paling = "Забор";
	public static final String chapterHouse = "Дом главы";
	public static final String closeDoor = "Закрытая дверь";
	public static final String openDoor = "Открытая дверь";
	public static final String doorKey = "Ключ";
	public static final String chest = "Сундук";
	public static final String bonfire = "Костёр";
	public static final String openGate = "Ворота";
	public static final String teleport = "Телепорт";

	// Пользовательские команды
	public static final String gmOn = "gmon";
	public static final String gmOff = "gmoff";
	public static final String move = "идти";
	public static final String yes = "да";
	public static final String no = "нет";
	public static final String south = "юг";
	public static final String north = "север";
	public static final String west = "запад";
	public static final String east = "восток";
	public static final String stayToLook = "осмотреться";
	public static final String closeGame = "выход";
	public static final String map = "карта";
	public static final String help = "помощь";
	public static final String getKey = "взять ключ";
	public static final String howManyKeys = "сколько у меня ключей?";
	public static final String speak = "говорить";
	public static final String speakQuest = "квест";

	// ForgottenVillage
	public static int FVNimGame = 0; 
	public static int chapterHouseExp = 1;
	public static int traningCampExp = 1;
	public static int ChestWithKeyInChapterHouseOnForgottenVillage = 1;
	public static int ChestQuestKey = 1;
	public static final String Ametist = "Аметист";
	public static final String Ostler = "Конюх";
	public static final String Wizard = "Волшебник";
	public static final String Izabela = "Изабела";
	public static final String Mumper = "Попрошайка";
	public static final String TraderRidjz = "Торговец Риджс";
	public static final String TraderTauren = "Торговец Таурен";
	public static final String TraderBerton = "Торговец Бертон";
	public static final String TraningToys = "Тренировочная кукла";
	public static final String TraningCamp = "Тренировочный лагерь";
	public static final String NewbieGuide = "Тренер новичков";
	public static final String ForgottenVillageOUT = "Выход из Forgotten Village";
	public static final String ForgottenVillageEastIN = "Вход в Forgotten Village";
	
	public static int FVQuestTraningCamp = 0;
	public static int FVQuestTraningCampItem = 0;
	public static int FVQuestEpidemia = 0;
	public static int FVQuestEpidemiaMarshSerum = 0;
	public static int FVQuestEpidemiaNemesisPickles = 0;
	public static int FVQuestEpidemiaTraderRidjz = 0;
	public static int FVQuestEpidemiaAbgusAlgae = 0;
	public static int FVQuestEpidemiaMumperMoney = 0;
	public static int FVQuestEpidemiaScore = 0;
}
