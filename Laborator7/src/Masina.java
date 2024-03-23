
public class Masina implements Cloneable, Comparable<Object>{
		String marca;
		String culoare;
		int id;
		
		public Masina(String marca, String culoare, int id) {
			this.id = id;
			this.marca = marca;
			this.culoare = culoare;
		}
		
		void vopseste(String culoare) {
			this.culoare = culoare;
		}
		
		public Masina clone () {
			try {
				return (Masina)super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public int compareTo(Object a) {
			Masina temp = (Masina)a;
			return (id - temp.id);
			/* SAU
			 * if(id < temp.id) { return -1; } else if(id == temp.id){ return 0; } else {
			 * return 1; }
			 */
		}
		
		public String toString() {
			return marca + " " + culoare + " " + id;
	}
	
}
