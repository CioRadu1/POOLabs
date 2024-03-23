import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		//4.2
		System.out.println("Introduceti varsta:");
		Scanner input = new Scanner (System.in);
	    int varsta = input.nextInt() ; 
	    
	    System.out.println("Introduceti sexul (0/1): ");
	    Scanner input1 = new Scanner (System.in);
	    int sex = input1.nextInt() ;
    
	    System.out.println("Introduceti inaltimea:");
	    Scanner input2 = new Scanner (System.in);
	    int inaltime = input2.nextInt() ;
		
	    short wrap;
	    wrap=(short) ((((varsta << 1) | sex) << 8) | inaltime); 
	    
	    varsta = wrap & 0xff;
	    sex = (wrap >>> 8) & 1;
	    inaltime = (wrap >>> 9) & 0x7f;
	    
	    System.out.println(varsta);
	    System.out.println(sex);
	    System.out.println(inaltime);

	    //4.4
	    String str1 = "Ana are ";
		String str2 = "mere";
		String str3 = str1 + str2;
		System.out.println(str3.equals("Ana are mere"));
		System.out.println(str3 == "Ana are mere");
		
		
		//4.3
		
		System.out.println("Introduceti un sir:");
		Scanner input5 = new Scanner (System.in);
		String string = input5.nextLine() ;
		int nrc = 0;
		int nrv = 0;
		for(int i = 0; i < string.length(); i++)
		{
			if(( string.charAt(i) == 'a') || ( string.charAt(i) == 'e') || 
					( string.charAt(i) == 'i') || ( string.charAt(i) == 'o') || ( string.charAt(i) == 'u')) {
				nrv += 1;
			}
			else if (string.charAt(i) !=' ')
				nrc += 1;
		}
		System.out.println(nrv);
		System.out.println(nrc);
		
		
		//4.1
	    class Goldbach {

	        public static boolean isPrime(int x)
	        {
	            boolean isPrimeTemp=true;
	            if(x<=1 || (x%2==0&&x!=2))
	                return false;
	            else if(x==2) return true;
	            else
	            {
	            for (int i = 2; i <= Math.sqrt(x); i++)
	            {
	                if(x%i==0) {
	                    isPrimeTemp = false;
	                    break;
	                }
	            }
	            }
	            return isPrimeTemp;
	        }

	        public static void main(String[] args)
	        {
	            int n,m;
	            Scanner newSc = new Scanner(System.in);
	            n = newSc.nextInt();
	            m = newSc.nextInt();
	            newSc.close();
	            for(int i=m;i<=n;i++)
	            {
	                if(i%2==0)
	                {
	                    for(int j=3;j<=i/2;j++)
	                    {
	                        int x,y;
	                        x=j;
	                        y=i-j;
	                        if(isPrime(x)&&isPrime(y))
	                        {
	                            System.out.println(i + " = " + x + "+" +  y);
	                        }
	                    }
	                }
	            }



	        }

	    }
	}

}
