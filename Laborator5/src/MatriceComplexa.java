
public class MatriceComplexa {

	NumereComplexe[][] matriceComplexa;
	
	public  MatriceComplexa(int randuri, int coloane) {
		matriceComplexa = new NumereComplexe[randuri][coloane]; 
	}
	
	public MatriceComplexa adunare(MatriceComplexa b) {
	   MatriceComplexa matriceRezultat = new MatriceComplexa(matriceComplexa.length, matriceComplexa[0].length);
	   for(int i = 0; i < matriceComplexa.length; i++) {
		   for(int j = 0; j < matriceComplexa[0].length; j++) {
			   
			   matriceRezultat.matriceComplexa [i][j] = matriceComplexa[i][j].adunare( b.matriceComplexa[i][j] ); 
		   }
	   }
		return matriceRezultat;
	}
	
	public MatriceComplexa scadere(MatriceComplexa b) {
		   MatriceComplexa matriceRezultat = new MatriceComplexa(matriceComplexa.length, matriceComplexa[0].length);
		   for(int i = 0; i < matriceComplexa.length; i++) {
			   for(int j = 0; j < matriceComplexa[0].length; j++) {
				   
				   matriceRezultat.matriceComplexa [i][j] = matriceComplexa[i][j].scadere( b.matriceComplexa[i][j] ); 
			   }
		   }
			return matriceRezultat;
		}
	
	public MatriceComplexa inmultireCu(int b) {
		   MatriceComplexa matriceRezultat = new MatriceComplexa(matriceComplexa.length, matriceComplexa[0].length);
		   for(int i = 0; i < matriceComplexa.length; i++) {
			   for(int j = 0; j < matriceComplexa[0].length; j++) {
				   
				   matriceRezultat.matriceComplexa[i][j] = matriceComplexa[i][j].inmultireScalar(b) ;
			   }
		   }
			return matriceRezultat;
		}
	
	public MatriceComplexa inserareElemente() {
		   MatriceComplexa matriceRezultat = new MatriceComplexa(matriceComplexa.length, matriceComplexa[0].length);
		   for(int i = 0; i < matriceComplexa.length; i++) {
			   for(int j = 0; j < matriceComplexa[0].length; j++) {
				   
				   matriceRezultat.matriceComplexa [i][j] = new NumereComplexe(i, j); 
			   }
		   }
			return matriceRezultat;
		}
	
	public void afisare(MatriceComplexa b) {
		for(int i = 0; i < b.matriceComplexa.length; i++) {
			   for(int j = 0; j < b.matriceComplexa.length; j++) {
				   
				   System.out.printf(b.matriceComplexa[i][j].toString() + " ");
			   }
			   System.out.println("\n");
		   }
	}
}
