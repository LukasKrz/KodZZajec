package pl.sda.kolkoikrzyzyk;

public class KolkiIKrzyzyk {

	public static void main(String[] args) {
		KolkoIKrzyzykInterfejs kolkoIKrzyzykInterfejs = new KolkoIKrzyzykInterfejs();
		Plansza plansza = new Plansza();
		int menu = kolkoIKrzyzykInterfejs.menu();
		
		String gracz1 = kolkoIKrzyzykInterfejs.podajImie();
		String gracz2 = kolkoIKrzyzykInterfejs.podajImie();
		
		int pozycja = kolkoIKrzyzykInterfejs.podajPole(gracz1);
		boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
		czyWstawiono = plansza.wstawZnak("O", pozycja);
		
		//int pozycja = kolkoIKrzyzykInterfejs.podajPole(gracz2);   TO TRZEBA UZUPEŁNIĆ  NA POCZĄTKU W ŚRODĘ
		//boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
		//czyWstawiono = plansza.wstawZnak("O", pozycja);

		//System.out.println(" I I ");
		//System.out.println("------");
		//System.out.println(" I I ");
		//System.out.println("------");
		//System.out.println(" I I ");
		
	}

}
