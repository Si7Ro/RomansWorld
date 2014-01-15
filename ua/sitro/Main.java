package ua.sitro;

import ua.sitro.romansworld.Checker;
import ua.sitro.romansworld.Messages;
import ua.sitro.romansworld.NewGame;
import ua.sitro.romansworld.Player;
import ua.sitro.romansworld.ToSay;

public class Main implements Runnable {
	static Main tGame;

	public static void main(String[] args) {

		tGame = new Main();
		Thread game = new Thread(tGame);

		game.start();

	}

	@Override
	public void run() {

		NewGame newGame = new NewGame();

		Messages.welcomeToGame();
		System.out.println("Нажмите ENTER для начала игры...");
		new ToSay(ToSay.key);

		newGame.PlayerParams();

		Checker.onCheck();

		Player.stepPlayer();
	}
}
