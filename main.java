import java.util.Scanner;

public class Chapter2PPMatthewRoberts {

	public static void main(String[] args) {
		
		
		String name, college, petName, phrase;
		int age, days, totalSeconds;
		
		final int SECONDS = 60;
		final int WEEK = 7;
		
		 
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What is your full name: ");
		name = scan.nextLine();//whatever string the user inputs will be used in the name variable.
		
		System.out.println("What is your age: ");
		age = scan.nextInt();//the number that the user inputs for age will be used in the age variable.
		
		System.out.println("How many days have you been away from your pet? ");
		days = scan.nextInt();//the number that the user inputs for days away from pet will be used in the days variable.
		scan.nextLine();
		
		System.out.println("What college do you attend: ");
		college = scan.nextLine();//the user's input for college will be used in the college variable.
		
		
		System.out.println("What is your pet name: ");
		petName = scan.nextLine();//temporarily stores the pets name entered into the petName variable.
		
		
		System.out.println("What do you say to your pet every day when you are with him/her? ");
		phrase = scan.nextLine();//temporarily stores what is typed for talking to pet 
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old." );
		System.out.println("I'm enjoying my time at " + college + ", though I miss my pet " + petName + " very much!");
		System.out.println("I have been away from " + petName + " for " + days + ".");
		System.out.println("And that is an unbelievable " + (days*24*SECONDS*SECONDS) + " seconds." );
		System.out.println("I have missed saying "  + phrase  +    " for " + days + " days.");
		System.out.println("Even if I say it every week, not everyday,");
		System.out.println("I would still have missed saying " + phrase + " for " + (double) days/WEEK + " times.");
		

	}

}
