import java.util.Scanner;
public class FormLetterWriter{
	public static void main(String[] args){
		String firstName;
		String lastName;
		char choice='z';
		boolean cont=true;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		firstName = inputDevice.nextLine();
		
		System.out.println("Please enter your last name: ");
		lastName = inputDevice.nextLine();
		
		
		while(cont){
			System.out.println("=================================== \n");
				System.out.println("What would you like to test? \n");
				System.out.println("a) Just last name \n");
				System.out.println("b) Both names \n");
				System.out.println("q) quit");
				System.out.println("=================================== \n");
			choice = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if(choice=='a'||choice=='A'){
				displaySalutation(lastName);
				
			}
			if(choice=='b'||choice=='B'){
				displaySalutation(firstName,lastName);
			}
			if(choice=='q'||choice=='Q'){
				cont=false;
			}
		}

	}
	
	public static void displaySalutation(String lastName){
		System.out.println("Dear Mr. or Ms. "+lastName+" ");
		System.out.println("Thank you for your recent order.");
	}
	
	public static void displaySalutation(String firstName, String lastName){
		System.out.println("Dear "+firstName+" "+lastName+" ");
		System.out.println("Thank you for your recent order.");
	}
}