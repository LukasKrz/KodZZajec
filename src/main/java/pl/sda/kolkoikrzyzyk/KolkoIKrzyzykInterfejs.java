package pl.sda.kolkoikrzyzyk;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class KolkoIKrzyzykInterfejs {
	public int menu (){
		System.out.println("1. Start");
		System.out.println("0. Koniec");
		Scanner scanner = new Scanner (System.in);
		int odpowiedz = scanner.nextInt();
		return odpowiedz;
	}
	
	public String podajImie(){
		System.out.println("Podaj swoje imie");
		Scanner scanner = new Scanner(System.in);
		String imie = scanner.nextLine();
		return imie;
	}
	
	public int podajPole(String imie){
		System.out.println("Gracz" + imie); 
		System.out.println("podaj numer pola: ");
		Scanner scanner = new Scanner(System.in);
		int pozycja = scanner.nextInt();
		return pozycja;
	}
	
	public void pokazPlansze(Plansza plansza){
		System.out.println(plansza.toString());
		System.out.println();
	}
	
	public void podanoNiepoprawnePole (){
		System.out.println("Podano niepoprawne pole. Spróbuj jeszcze raz");
		Scanner scanner = new Scanner (System.in);
		scanner.nextLine();
	}
	
}
