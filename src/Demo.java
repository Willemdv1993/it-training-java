
public class Demo {
	public static void main(String args[]) {
		
		Dier dier = new Dier();
		Dier dier2 = new Konijn();
		Konijn konijn = new Konijn();
		Konijn konijn2 = new Dier();
		
		
	}
}

class Dier{
	
	int aantalCellen;
	void voortplanten() {
		
		System.out.println("voortplanten");
	}
	
}

class Konijn extends Dier{ // is a relatie 
	
	int lengteOren;
	void wortelsEten() {
		
		System.out.println("wortels eten in Konijn");
	}
}