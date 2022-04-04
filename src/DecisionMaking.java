import java.util.*;
public class DecisionMaking {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Hey, What's Your Name?");
		String name = sc.nextLine();
		boolean runner = true;
		do {
		System.out.println(name + ", Enter a number between 1 and 100:");
		int num = sc.nextInt();
		if ((num | 1) > num &  (num >= 2 & num <=25)){
            System.out.println(name + ", Your number "+num + " is Even and less than 25");
		}
		else if (num % 2 == 0 &  (num >= 26 & num <=60)) {
           	System.out.println("Even, " + name );
           	System.out.println("Continue(y/n)");
           }
		else if (num % 2 == 0 &  num > 60) {
           	System.out.println(num + " and Even");
           }
		else if (num % 2 != 0 &  (num > 60 & num <=100)) {
           	System.out.println("Odd and over 60");
           }
		else {
            System.out.println(num + " Number is Odd");
            }
		sc.nextLine();
		String answ = sc.nextLine();
		if (answ.equalsIgnoreCase("n")) {
			runner = false;
		}
	  }while (runner);
		sc.close();
	}
}
