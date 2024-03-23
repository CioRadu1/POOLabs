
public class Autovehicul {
		Sofer sofer ;
		double vitezaMaxima;
		double vitezaCurenta;
		
		
		
		public Autovehicul(Sofer sofer, double vitezaMaxima, double vitezaCurenta) {
			super();
			this.sofer = sofer;
			this.vitezaMaxima = vitezaMaxima;
			this.vitezaCurenta = vitezaCurenta;
		}

		public Autovehicul() {}

		 void accelereaza(int delta) {
			vitezaCurenta += delta;
			if(vitezaCurenta > vitezaMaxima) {
				vitezaCurenta = vitezaMaxima;
			}
		}
		
		 void accelereaza(double delta) {
			vitezaCurenta += delta;
			if(vitezaCurenta > vitezaMaxima) {
				vitezaCurenta = vitezaMaxima;
			}
		}
}
