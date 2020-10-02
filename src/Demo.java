
public class Demo {
	public static void main(String args[]) {
		
		Speler spelerWit = new Speler();
		spelerWit.voornaam = "Johan";
		spelerWit.kleur = "wit";

		Speler spelerZwart = new Speler();
		spelerZwart.voornaam = "Grietje";
		spelerZwart.kleur = "zwart";
		
		spelerWit.voorstellen();
		spelerZwart.voorstellen();
		
		Schaakspel spel1 = new Schaakspel();
		spel1.starten();
	}
}

class Speler {
	String voornaam;
	String kleur;
	int leeftijd;
	
	void voorstellen() {
		System.out.println("Hoi ik ben " + voornaam + " en ik speel met " + kleur);
	}
	void nieuweNaamGeven(String nieuweNaam) {
		voornaam = nieuweNaam;
	}
}

class Schaakspel {
	
	void starten() {
		Speler spelerWit = new Speler();
		spelerWit.voornaam = "Johan";
		spelerWit.kleur = "wit";

		Speler spelerZwart = new Speler();
		spelerZwart.voornaam = "Grietje";
		spelerZwart.kleur = "zwart";
		
		spelerWit.voorstellen();
		spelerZwart.voorstellen();
	}
}