package game;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		NumberGame n=new NumberGame();
		
		while(true) {
			System.out.println("Welcome to Number Guessing Game!");
			System.out.println("\tAll the Best!!");
			
			System.out.println("\tEnter your Choice");
			
			System.out.println("\t 1 .Select Mode/Level");
			System.out.println("\t 2 .Exit");
			int choice=sc.nextInt();
			int level=0;
			if(choice==2) {
				break;
			}
			else if(choice==1){
				System.out.println("\tSelect Level");
				System.out.println("\t 1. Easy");
				System.out.println("\t 2. Medium");
				System.out.println("\t 3. Hard");

				 level=sc.nextInt();
				
			}
			else {
				System.out.println("Invalid choice , Game will start Again");
			}
			
			int randomnumber=0;
			int numberofattempts=0;
			int max=0;
			if(level==1) {
				randomnumber=n.Randomnumber(0, 10);
				numberofattempts=5;
				max=10;
			}
			else if(level==2) {
				randomnumber=n.Randomnumber(0, 50);
				numberofattempts=7;
                max=50;
			}
			else if(level==3) {
				randomnumber=n.Randomnumber(0, 100);
				numberofattempts=10;
				max=100;

			}
			else {
				System.out.println("Invalid choice , Game will start Again");
			}
			while(numberofattempts>0) {
				System.out.println("Enter number between 0 to "+max+" :");
				int number=sc.nextInt();
				if(number==randomnumber) {
					System.out.println("YouWon!!!");
					break;
				}
				else if(number<randomnumber) {
					System.out.println("Your entered Number is less than Answer");
				}
				else if(number>randomnumber) {
					System.out.println("Your entered Number is greater than Answer");
				}
				
				
				
				numberofattempts--;
                if(numberofattempts==0) {
				   System.out.println("YouLost.. Try Again");
				   System.out.println("The number was : "+randomnumber);
				   break;
				}
				System.out.println("You have "+numberofattempts+" attempts remaining");
				
				
			}
			
		}
	}
}
