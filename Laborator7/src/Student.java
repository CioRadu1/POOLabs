
public class Student implements Cloneable{
		String nume;
		int id;
		Masina masina;
		
		
		public Student(String nume, int id, Masina masina) {
			super();
			this.nume = nume;
			this.id = id;
			this.masina = masina;
		}
		
		public Student clone (){
			try {
				Student copieStudent;
				copieStudent = (Student) super.clone();
				copieStudent.masina = masina.clone();
				//copieStudent.masina = new Masina(masina.marca, masina.culoare); //merge si varianta asta dar e ineficienta
				return copieStudent;
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public String toString() {
				return "Studentul " + nume + " cu id-ul " + id + " si cu masina " + masina.marca + " de culoare " + masina.culoare + " cu id " + masina.id;
		}
		
		
}
