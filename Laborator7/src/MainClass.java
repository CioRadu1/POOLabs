import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Masina a = new Masina("Mecedes", "Alb", 9);
		Student s = new Student("Marcel", 1, a);
		Masina m1 = new Masina("Logan" , "Alb", 1);
		Masina m2 = new Masina("Dacia" , "Negru", 2);
		Masina m3 = new Masina("Skoda" , "Albastru", 3);
		Masina m4= new Masina("Volvo" , "Gri", 4);
		Masina arr[] = new Masina[4];
		arr[0]= m4;
		arr[1]= m2;
		arr[2]= m3;
		arr[3]= m1;
		Student s1 = s.clone(); 
		s1.masina.vopseste("Galben");
		System.out.println(s);
		System.out.println(s1);
		Arrays.sort(arr);
		for(int i = 0; i < 4; i++) {
			System.out.println(arr[i]);
		}
		
	}
 
}
