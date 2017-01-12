package pl.sda.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class KolkiIKrzyzyk {

	public static void main(String[] args) {
		KolkoIKrzyzykInterfejs kolkoIKrzyzykInterfejs = new KolkoIKrzyzykInterfejs();
		Plansza plansza = new Plansza();
		int menu = kolkoIKrzyzykInterfejs.menu();
		
		Map<String, String> mapaGraczy = new HashMap <>();
		String gracz1 = kolkoIKrzyzykInterfejs.podajImie();
		String gracz2 = kolkoIKrzyzykInterfejs.podajImie();
		mapaGraczy.put(gracz1, "X");
		mapaGraczy.put(gracz2, "O");
		
		for (int i = 0; i < 9; i++) {
			kolkoIKrzyzykInterfejs.pokazPlansze(plansza);
			boolean czyWstawiono;
			String aktualnyGracz = null;
			String wstawianyZnak = null;
			if(i%2 ==0 ){
				aktualnyGracz = gracz1;
			} else{
				aktualnyGracz = gracz2;
			}
			wstawianyZnak = mapaGraczy.get(aktualnyGracz);
			
			do {
				int pozycja = kolkoIKrzyzykInterfejs.podajPole(aktualnyGracz);
				czyWstawiono = plansza.wstawZnak(wstawianyZnak, pozycja);
				if (!czyWstawiono) {
					kolkoIKrzyzykInterfejs.podanoNiepoprawnePole();
				}
			} while (!czyWstawiono);
			kolkoIKrzyzykInterfejs.pokazPlansze(plansza);
		}
		
				
		//System.out.println(" I I ");
		//System.out.println("------");
		//System.out.println(" I I ");
		//System.out.println("------");
		//System.out.println(" I I ");
		
	}

}
