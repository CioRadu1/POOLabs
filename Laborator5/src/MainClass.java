
public class MainClass {

	public static void main(String[] args) {
		
		
		NumereComplexe a = new NumereComplexe (5, 2);
		NumereComplexe b = new NumereComplexe (13, 9);
		
		a = a.adunare(b);
	    a = a.inmultire(b);
	   	a = a.scadere(b);
		System.out.println(a);
		
		MatriceComplexa matriceComp = new MatriceComplexa(3, 3);
		MatriceComplexa matriceComp1 = new MatriceComplexa(3, 3);
		MatriceComplexa matriceComp2 = new MatriceComplexa(3, 3);
		
		matriceComp = matriceComp.inserareElemente();
		matriceComp1 = matriceComp1.inserareElemente();
		matriceComp2 = matriceComp2.inserareElemente();
		
		matriceComp = matriceComp.adunare(matriceComp1);
		matriceComp = matriceComp.scadere(matriceComp2);
		matriceComp = matriceComp.inmultireCu(8);
		
		matriceComp.afisare(matriceComp);
	    
		

	}
}
