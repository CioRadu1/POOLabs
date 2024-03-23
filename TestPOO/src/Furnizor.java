
public class Furnizor {
		private String numeSRL;
		private String infoFiscal;
		private int bilant;
				

		public String getNumeSRL() {
			return numeSRL;
		}
		public void setNumeSRL(String numeSRL) {
			this.numeSRL = numeSRL;
		}
		
		
		public String getInfoFiscal() {
			return infoFiscal;
		}
		public void setInfoFiscal(String infoFiscal) {
			this.infoFiscal = infoFiscal;
		}
		
		
		public int getBilant() {
			return bilant;
		}
		public void setBilant(int bilant) {
			this.bilant = bilant;
		}
		
		public Furnizor(String numeSRL, String infoFiscal, int bilant) {
			this.numeSRL = numeSRL;
			this.infoFiscal = infoFiscal;
			this.bilant = bilant;
		}
		
		@Override
		public String toString() {
			return "Furnizor [numeSRL=" + numeSRL + ", infoFiscal=" + infoFiscal + ", bilant=" + bilant + "]";
		}
		
		
}
