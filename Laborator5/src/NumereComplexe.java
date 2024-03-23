
public class NumereComplexe {
		private int parteaRe;
		private int parteaIm;
		
		public NumereComplexe(int parteaRe, int parteaIm) {
			
			this.parteaRe = parteaRe; 
			this.parteaIm = parteaIm; 
		}
		
		public NumereComplexe adunare(NumereComplexe b) {
			NumereComplexe rezultat = new NumereComplexe(0, 0);
			rezultat.parteaRe += b.parteaRe + parteaRe;
			rezultat.parteaIm += b.parteaIm + parteaIm;
			return rezultat;
		}
		
		public NumereComplexe inmultire(NumereComplexe b) {
			NumereComplexe rezultat = new NumereComplexe(0, 0);
			rezultat.parteaRe = b.parteaRe * parteaRe - b.parteaIm * parteaIm;
			rezultat.parteaIm = b.parteaIm * parteaRe  + parteaIm * b.parteaRe;
			return rezultat;
		}
		
		public NumereComplexe scadere(NumereComplexe b) {
			NumereComplexe rezultat = new NumereComplexe(0, 0);
			rezultat.parteaRe = parteaRe - b.parteaRe;
			rezultat.parteaIm = parteaIm - b.parteaIm;
			return rezultat;
		}
		
		public NumereComplexe inmultireScalar(int s) {
			NumereComplexe rezultat = new NumereComplexe(0, 0);
			rezultat.parteaRe = parteaRe * s ;
			rezultat.parteaIm = parteaIm * s;
			return rezultat;
		}
		
		@Override
        public String toString() {
			if((parteaRe == 0) && (parteaIm != 0))
				return parteaIm + "*i";
			else if((parteaIm == 0) && (parteaRe != 0))
				return parteaRe + " ";
			else if ((parteaRe != 0) && (parteaIm != 0 ))  
        	   return parteaRe + "+" + parteaIm + "*i";
			else if ((parteaRe == 0) && (parteaIm == 0 ))  
	        	   return 0 + "";
			return null;
        }
}
