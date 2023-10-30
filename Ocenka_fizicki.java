package proekt_9;

import java.util.Scanner;

          public class Ocenka_fizicki {

	      public static void main(String[] args) {
		  double  max=0,bodovi=0,procent=0;
		  Scanner tastatura = new Scanner (System.in);
		  System.out.println ("Programot prsmetuva dali spored poenite koi ke se vnesat pitomecot pominal na fzicki podgotovki i so koja ocenka");
		  System.out.println ("Vnesete go maksimalniot broj na bodovi");
		  max=tastatura.nextDouble();
		  System.out.print ("Vneseto go brojot na poeni koi ste gi dobile");
		  bodovi=tastatura.nextDouble();
		  procent=bodovi/max*100;
		  if (procent<59) {
			  System.out.println ("Pitomecot ne pominal na fizickite");
			  System.exit(0);
		  }
		  procent=bodovi/max*100;
		  if (procent>=60 && procent<=64) {
			  System.out.println ("Pitomecot dobil 2");
		  }
		  else if (procent>=65 && procent<=74) {
			  System.out.println("Pitoecot dobil 3");
		  }
		  else if (procent>=75 && procent<=84) {
			  System.out.println("Pitomecot dobil 4");
		  }
		  else if (procent>=85 && procent<=100) {
			  System.out.println ("Pitomecot dobil 5");
		  }
		  
			  

	}

}

