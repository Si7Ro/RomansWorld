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
	

	// ����� ��������� ����
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

	// ��������� ������
	public static int keyToTheDoor = 0;
	public static String playerName;
	public static int lvl = 1;
	public static int health;
	public static int damage;
	public static int exp;
	public static int enemyDamage = lvl * 2;
	public static int maxHP = 20 * lvl;


	// ������������� ����
	public static final String wall = "�����";
	public static final String paling = "�����";
	public static final String chapterHouse = "��� �����";
	public static final String closeDoor = "�������� �����";
	public static final String openDoor = "�������� �����";
	public static final String doorKey = "����";
	public static final String chest = "������";
	public static final String bonfire = "�����";
	public static final String openGate = "������";
	public static final String teleport = "��������";

	// ���������������� �������
	public static final String gmOn = "gmon";
	public static final String gmOff = "gmoff";
	public static final String move = "����";
	public static final String yes = "��";
	public static final String no = "���";
	public static final String south = "��";
	public static final String north = "�����";
	public static final String west = "�����";
	public static final String east = "������";
	public static final String stayToLook = "�����������";
	public static final String closeGame = "�����";
	public static final String map = "�����";
	public static final String help = "������";
	public static final String getKey = "����� ����";
	public static final String howManyKeys = "������� � ���� ������?";
	public static final String speak = "��������";
	public static final String speakQuest = "�����";

	// ForgottenVillage
	public static int FVNimGame = 0; 
	public static int chapterHouseExp = 1;
	public static int traningCampExp = 1;
	public static int ChestWithKeyInChapterHouseOnForgottenVillage = 1;
	public static int ChestQuestKey = 1;
	public static final String Ametist = "�������";
	public static final String Ostler = "�����";
	public static final String Wizard = "���������";
	public static final String Izabela = "�������";
	public static final String Mumper = "����������";
	public static final String TraderRidjz = "�������� �����";
	public static final String TraderTauren = "�������� ������";
	public static final String TraderBerton = "�������� ������";
	public static final String TraningToys = "������������� �����";
	public static final String TraningCamp = "������������� ������";
	public static final String NewbieGuide = "������ ��������";
	public static final String ForgottenVillageOUT = "����� �� Forgotten Village";
	public static final String ForgottenVillageEastIN = "���� � Forgotten Village";
	
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
