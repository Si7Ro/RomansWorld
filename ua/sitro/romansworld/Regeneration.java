package ua.sitro.romansworld;

public class Regeneration implements Runnable {
	public static Regeneration regen;

	@Override
	public void run() {
		Checker.regenCheck = false;

		if (GlobalParams.health < GlobalParams.maxHP) {
			while (GlobalParams.health < GlobalParams.maxHP) {
				try {

					if (!GlobalParams.inBattle) {
						GlobalParams.health++;
						System.out
								.println("������������� 1 ������� ��������. � ��� "
										+ GlobalParams.health + " HP");
						Thread.sleep(1000);

						if (GlobalParams.health < GlobalParams.maxHP) {
							Checker.regenCheck = true;
						}
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
