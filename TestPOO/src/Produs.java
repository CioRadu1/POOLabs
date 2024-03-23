
public class Produs {
       private String nume;
       private Furnizor furnizor;
       private int pret; 
       private int cantitateInStoc;
       
	public String getNume() {
		return nume;
	}
	
	public  Furnizor getFurnizor() {
		return furnizor;
	}
	
	public int getPret() {
		return pret;
	}
	
	public int getCantitateInStoc() {
		return cantitateInStoc;
	}
	
	public Produs(String nume, Furnizor furnizor, int pret, int cantitateInStoc) {
		
		this.nume = nume;
		this.pret = pret;
		this.furnizor = furnizor;
		this.cantitateInStoc = cantitateInStoc; 
		
	}
	
	@Override
	public String toString() {
		return "Produs [nume=" + nume + ", furnizor=" + furnizor + ", pret=" + pret + ", cantitateInStoc="
				+ cantitateInStoc + "]";
	}
      
}
