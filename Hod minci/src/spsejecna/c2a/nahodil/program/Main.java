package spsejecna.c2a.nahodil.program;
// vytvoreni package

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try { // cely project do try catch
			
		Random rand = new Random();
		int times = 0;
		int winnerSide = 0;
		boolean err = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Napiš jedna pro Pannu, nulu pro Orla");
		do {
			try {
				 winnerSide = sc.nextInt();
			err = false;
			if(winnerSide != 0 && winnerSide != 1) {
			throw new Exception();
			}
			}catch(Exception e) {
				sc = new Scanner(System.in);
				System.err.println("enter 1 or 0");
				err = true;
			}
			}while(err);
		
		Integer panna = 0;
		Integer orel = 0;
		System.out.println("Kolik hodù chceš?");
		
		// try catch + do while na spravnou odpoved
		do {
		try {
			times = sc.nextInt();
		err = false;
		}catch(Exception e) {
			sc = new Scanner(System.in);
			System.err.println("enter whole number");
			err = true;
		}
		}while(err);
		for(int i = 0; i < times; i++) {
			int chance = rand.nextInt(2);
			if(chance == 1) panna ++;
			else orel++;
			
		}
		// zaverecne vyhodnoceni
		System.out.println("Panna padla: " + panna );
		System.out.println("Orel padl: " + orel);
		if(panna == orel) {

			System.out.println("Je to plichta!!!");
		}else if(panna > orel) {
			if(winnerSide ==1) {
		
				System.out.println("vyhral jsi");
			}else {
				System.out.println("Prohral jsi");
			}
		}else {
			if(winnerSide == 0) {
				System.out.println("vyhral jsi");
			}else {
				System.out.println("Prohral jsi");
			}
		}
		//nejsem si uplne jisty, na jake funkci tohle funguje, ale udelal bych to mnohem jednodusi
		// originalni vytvor davam do komentare
		/*
		int side = 3;
		int score = 0;
		Integer number1 = 0;
		Integer number2 = 0;
		Integer number3 = 0;
		Integer number4 = 0;
		Integer minimum = 0;
		Integer maximum = 1000;
		for (int i=0;i<times;i++) {
			number1 = rand.nextInt((maximum - minimum) + 1) + minimum;
			number2 = rand.nextInt((maximum - minimum) + 1) + minimum;
			number3 = rand.nextInt((maximum - minimum) + 1) + minimum;
			number4 = rand.nextInt((maximum - minimum) + 1) + minimum;
			if (number1>500&&number2>500&&number3>500&&number4>500) {
				number1 = rand.nextInt((maximum - minimum) + 1) + minimum;
				number2 = rand.nextInt((maximum - minimum) + 1) + minimum;
				number3 = rand.nextInt((maximum - minimum) + 1) + minimum;
				number4 = rand.nextInt((maximum - minimum) + 1) + minimum;
				if (number1>500&&number2>500&&number3>500&&number4>500) {
					System.out.println("Haha, z dùvodu toho,"
							+ " že se stala neobvyklá situace,"
							+ " se ti prohazuje strana, co sis vybral");
					if (winnerSide==1) {
						winnerSide=0;
						System.out.println("Nyní vyhraješ, pokud padne Orel");
					}
					else if (winnerSide==0) {
						winnerSide=1;
						System.out.println("Nyní vyhraješ, pokud padne Panna");
					}
				}
			}
			for (int y=0;y<999999;y++) {
				number1 = rand.nextInt((maximum - minimum) + 1) + minimum;
				number2 = rand.nextInt((maximum - minimum) + 1) + minimum;
				number3 = rand.nextInt((maximum - minimum) + 1) + minimum;
				number4 = rand.nextInt((maximum - minimum) + 1) + minimum;
				if (number1<=500&&number2<=500||number3>=500&&number4>=500) {
					side = 1;
					System.out.print("Padla Panna, takže");
					panna++;
					break;
				}
				else if (number1>=500&&number2>=500||number3<=500&&number4<=500) {
					side = 0;
					System.out.print("Padl Orel, takže");
					orel++;
					break;
				}
			}
			
			if (winnerSide==side) {
				System.out.print(" jsi vyhrál. Gratuluju :) +1 skóre pro tebe");
				score++;
			}
			else if (winnerSide!=side) {
				System.out.print(" jsi prohrál,"
						+ " budu ti muset odeèíst jedno skóre,"
						+ " pokud tedy nejsi na nule."
						+ " Zkus to znovu, hodnì štestí :)");
				score--;
			}	
		}
		System.out.println("Zatím statistiky vypadají takhle: ");
		System.out.println("- Mincí hozeno: " + times + "krát");
		System.out.println("- Panna padla: " + panna + "krát");
		System.out.println("- Orel padl: " + orel + "krát");
		System.out.println("- Skóre: " + score);
		*/
		
		sc.close();//zavreni scanneru
	}catch(Exception e) {
		System.err.println("Something went wrong");
	}
		
	}
}