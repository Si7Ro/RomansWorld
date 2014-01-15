package ua.sitro.nimgame;

import java.util.Scanner;
import ua.sitro.romansworld.Actions;
import ua.sitro.romansworld.Checker;
import ua.sitro.romansworld.GlobalParams;

public class NimGame implements Runnable {
    static int spichki;
    static int scan;
    public static NimGame nim;
    static int compHod;
    static boolean once = false;
    static Scanner sc = new Scanner(System.in);

    public NimGame() {
	super();
    }

    public static void AILogic() {
	if (spichki == 15) {
	    compHod = 2;
	}
	if (spichki == 14) {
	    compHod = 2;
	}
	if (spichki == 13) {
	    compHod = 3;
	}
	if (spichki == 12) {
	    compHod = 3;
	}
	if (spichki == 11) {
	    compHod = 2;
	}
	if (spichki == 10) {
	    compHod = 3;
	}
	if (spichki == 9) {
	    compHod = 2;
	}
	if (spichki == 8) {
	    compHod = 1;
	}
	if (spichki == 7) {
	    compHod = 2;
	}
	if (spichki == 6) {
	    compHod = 1;
	}
	if (spichki == 5) {
	    compHod = 1;
	}
	if (spichki == 4) {
	    compHod = 3;
	}
	if (spichki == 3) {
	    compHod = 2;
	}
	if (spichki == 2) {
	    compHod = 1;
	}
	if (spichki == 1) {
	    compHod = 1;
	}

    }

    public static void engine() {

	int count = 0;

	while (count < spichki) {
	    System.out.print("|" + " ");
	    count++;
	}
	System.out.println("\n");

    }

    public static void playerMove() {
	boolean c = false;
	while (!c) {
	    System.out
		    .println("Ход Романа\nВведите, сколько спичек выберете?\nОт 1 до 3");

	    if (sc.hasNextInt()) {

		scan = sc.nextInt();

		if (scan > spichki) {
		    System.out
			    .println("Вы не можете взять больше спичек, чем имеется на столе.");
		    c = false;
		} else if (scan >= 1 && scan <= 3) {
		    c = true;
		} else {
		    System.out
			    .println("Вы  можете взять от 1 до 3х спичек за один ход!");
		    c = false;
		}

	    }

	}

	spichki -= scan;

    }

    public void run() {
	Actions.count = false;

	System.out.println("СПИЧКИ:\n");
	spichki = 15;
	engine();
	while (spichki > 0) {
	    if (!once) {

		System.out.println("Для начала игры:\n" + "1) нажмите ENTER\n"
			+ "2) введите от любое число и нажмите ENTER");
		sc.next();
	    }
	    once = true;
	    playerMove();
	    engine();
	    if (spichki == 0) {

		System.out.println("ВЫ ПРОИГРАЛИ!!! ПОБЕДИЛ РИДЖС!");
		Actions.count = true;
		once = false;
		Checker.onCheck();

		break;

	    }
	    System.out.println("Ходит Риджс...");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e) {
	    }
	    AILogic();
	    spichki -= compHod;
	    System.out.println("Компьютер взял " + compHod + " спич.");
	    if (spichki == 0) {
		System.out.println("ВЫ ВЫИГРАЛИ!");
		if (GlobalParams.FVQuestEpidemiaTraderRidjz == 1) {
		    GlobalParams.FVQuestEpidemiaScore += 1;
		}
		Actions.count = true;
		once = false;
		Checker.onCheck();
		break;

	    }
	    engine();
	    System.out.println("Осталось " + spichki + " спич.");
	}
	spichki = 15;

    }
}