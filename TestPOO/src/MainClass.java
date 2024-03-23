
public class MainClass {

	public static void main(String[] args) {
		
		Inventar magazin = new Inventar(12);
		Furnizor furnizorUnu = new Furnizor ("Mega", "info1", 20000);
		Furnizor furnizorDoi = new Furnizor ("Mega", "info1", 20000);
		Furnizor furnizorTrei = new Furnizor ("Mega", "info1", 20000);
		Furnizor furnizorPatru = new Furnizor ("Mega", "info1", 20000);
		Furnizor furnizorCinci = new Furnizor ("Mega", "info1", 20000);
		Furnizor furnizorSase = new Furnizor ("Mega", "info1", 20000);
		Produs banane = new Produs ("Banane",furnizorUnu, 3, 200);
		Produs mere = new Produs ("Mere",furnizorDoi, 2, 400);
		Produs portocale = new Produs ("Portocale",furnizorTrei, 4, 0);
		Produs kiwi = new Produs ("Kiwi",furnizorPatru, 7, 200);
		Produs struguri = new Produs ("Struguri",furnizorCinci, 9, 40);
		Produs gutuie = new Produs ("Gutui",furnizorSase, 12, 50);
		
		magazin = magazin.adaugaProdus(banane); 
		magazin = magazin.adaugaProdus(mere); 
		magazin = magazin.adaugaProdus(portocale); 
		magazin = magazin.adaugaProdus(kiwi); 
		magazin = magazin.adaugaProdus(struguri);
		magazin = magazin.adaugaProdus(gutuie); 
		
		magazin.listeazaProduse();
		magazin.gasesteProdusDupaNume(gutuie);
		
	}

}
