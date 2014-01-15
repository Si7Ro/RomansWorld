package ua.sitro.romansworld;

import java.util.Scanner;

public class ToSay {
    public static String key;
    public static Scanner sc = new Scanner(System.in);

    public ToSay(String key) {

	ToSay.key = sc.nextLine();

	if (ToSay.key.equals(GlobalParams.closeGame)) {
	    sc.close();
	}
    }

}
