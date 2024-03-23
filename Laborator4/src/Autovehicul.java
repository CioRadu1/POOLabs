import java.awt.Color;

public class Autovehicul {

	   private	String marca; 
	   Color culoare;
	   private float vitCurenta;
	   private int treaptaViteza;
	   float vitMax;  //
	   int numarTrepteDisp; //
	   Sofer sofer;
	   Rezervor rezervor;
	   
	public String getMarca() {
		   return marca;
	   }
	   
	   public void setMarca(String marc) {
		   marca = marc; 
	   }
	   
	   
	   
	   public Color getColor() {
		   return culoare;
	   }
	   
	   public void setColor(Color culoare) {
		    this.culoare = culoare; 
	   }
	   
	   
	   
	   public float vitCurenta() {
		   return vitCurenta;
	   }
	   
	   public void vitCurenta(float vitCurenta) {
		    this.vitCurenta = vitCurenta; 
	   }
	   
	   
	   
	   public int treaptaViteza() {
		   return treaptaViteza;
	   }
	   
	   public void treaptaViteza(int treaptaViteza) {
		    this.treaptaViteza = treaptaViteza; 
	   }
	   
	   public void accelerare(float delta) {
		   vitCurenta = vitCurenta + delta;
		   treaptaViteza ++;
		   if (vitCurenta >= vitMax) {
			   vitCurenta = vitMax;
			   treaptaViteza = 5;
		   }
		   
	   }
	   
	   public void decelerare(float delta) {
		   vitCurenta = vitCurenta - delta;
		   treaptaViteza --;
		   if (vitCurenta <= 0) {
			   vitCurenta = 0;
			   treaptaViteza = 0;
		   }
	   }
	   
	   
	   public void oprire() {
		   treaptaViteza = 0;
		   vitCurenta = 0;
	   }
	   
	   public Autovehicul(String marca, float vitMax, Color culoare, float vitCurenta, int numarTrepteDisp, Sofer sofer, Rezervor rezervor) {
		   this.marca = marca;
		   this.vitMax = vitMax;
		   this.culoare = culoare;
		   this.vitCurenta = vitCurenta;
		   this.numarTrepteDisp = numarTrepteDisp;
		   this.sofer = sofer;
		   this.rezervor = rezervor;
	   }
	   
	   @Override
	public String toString() {
		return "Autovehicul marca=" + marca + ", culoare=" + culoare + ", vitCurenta=" + vitCurenta
				+ ", treaptaViteza=" + treaptaViteza + ", vitMax=" + vitMax + ", numarTrepteDisp=" + numarTrepteDisp
				+ ", sofer=" + sofer + ", rezervor=" + rezervor + "]";
	}
	   
	   
}
