
import java.util.Scanner;

public class HellowWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		HellowWorldi18n.translate();
		
		int idiom = 0;
		
		 String g = "";
	     String t = "";
		
		while(idiom != 4) {
		
		
		@SuppressWarnings("resource")
		Scanner sd = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println(HellowWorldi18n.getSring4());
		System.out.println("1. Español.");
		System.out.println("2. Francais.");
		System.out.println("3. English.");
		System.out.println("4. "+ HellowWorldi18n.getSringexir());
		idiom = sd.nextInt();
		
		if(idiom == 1) {
			
			g = "es";
			t = "ES";
		}
		if(idiom == 2) {
			
			g = "fr";
			t = "FR";
			
		}
		if(idiom == 3) {
			
			g = "en";
			t = "US";
			
		}
		
		if(idiom !=1&&idiom != 2 && idiom!=3) {
			
			System.out.println("Invalid option.");
			
		}
		
		HellowWorldi18n.setCountry(t);
		HellowWorldi18n.setLanguage(g);
		

		HellowWorldi18n.translate();
		System.out.println("");
		System.out.println("");
	
		System.out.println(HellowWorldi18n.getSring1());
        System.out.println(HellowWorldi18n.getSring2());
        System.out.println(HellowWorldi18n.getSring3());
        System.out.println(HellowWorldi18n.getSring5());
		
		
		}
		
        
      
		
	}

}
