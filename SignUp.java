import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to JavaGram! Let's sign you up.");
     
        System.out.println("\nWhat is your first name?");
        
        String firstName = scan.nextLine();
    
        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();
    

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("\nMake a username");  
        String userName = scan.nextLine();
        
        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        System.out.println("\nWhat country is that?");
        String country = scan.nextLine();
        
        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: "+ firstName);
        System.out.println("\tLast Name: "+lastName);
        System.out.println("\tAge: "+age);
        System.out.println("\tUsername: "+userName);
        System.out.println("\tCity: "+city);
        System.out.println("\tCountry: "+country);
        scan.close();

    }
    }

