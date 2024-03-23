
public class Inventar {
       Produs[] listaProduse; 
       int j = 0;
       public Inventar (int nrProduse) {
    	   listaProduse = new Produs[nrProduse];
       }
       
       public Inventar adaugaProdus (Produs q) {
    	   Inventar listaRezultat = new Inventar (12); 
    	   if(j < listaProduse.length) {
    		   if(listaProduse[j] == null) {
    			   listaRezultat.listaProduse[j] = q;
    		   }
    		   j++;
    	   }
    	   return listaRezultat;	   
       }
       
       public void listeazaProduse() {
    	   
    	   for(int i = 0; i < listaProduse.length; i++) {
    		   if(listaProduse[i] != null) {
    		   System.out.printf(listaProduse[i].getNume() + " ");
    		   }
    	   }
       }
       
       public String gasesteProdusDupaNume(Produs q) {
    	   int ok = 0;
    	   for(int i = 0; i < listaProduse.length; i++) {
    		   if(listaProduse[i] != null) {
    			   if(listaProduse[i].getNume().equals(q.getNume())){
    				   System.out.println("S-a gasit in lista!"); 
    				   ok = 1;
    			   }
    		   }
    	   }
    	   if (ok!=0) {
    		   System.out.println("Nu s-a gasit produsul in lista");
    	   }
    	   else {
    		  return q.getNume();
    	   }
    		return "";
       }
}
