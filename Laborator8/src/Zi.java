//{"LUNI", "MARTI", "MIERCURI", "JOI", "VINERI", "SAMBATA", "DUMINICA"}
public class Zi {
	
		private String zi;
		private boolean lucratoare;
		
		public Zi(String zi, boolean lucratoare) {
			this.zi = zi;
			this.lucratoare = lucratoare;
		}

		public String getZi() {
			return zi;
		}

		public void setZi(String zi) {
			this.zi = zi;
		}

		public boolean isLucratoare() {
			return true;
		}
		
		public boolean isNelucratoare() {
			return false;
		}

		public void setLucratoare(boolean lucratoare) {
			this.lucratoare = lucratoare;
		}
		
		
		
}
