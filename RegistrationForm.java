
package registration.form;
import java.util.*;
public class RegistrationForm {

    public static void main(String[] args) {
        
        System.out.println("Welcome User!");
        System.out.println("Pleas Sign-in an account" + "\n");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your first name: ");
        String name = sc.nextLine();
        System.out.print("Enter your last name: ");
        Scanner ac = new Scanner (System.in);
       String lastname = ac.nextLine();
       
      
       System.out.print("Enter your age: ");
       Scanner vc = new Scanner (System.in);
       String age = vc.nextLine();
       System.out.print("Enter your weight: ");
       Scanner tc = new Scanner (System.in);
       String weight = tc.nextLine();
       System.out.print("Enter height: ");
       Scanner bc = new Scanner (System.in);
       String height = bc.nextLine();
       
       System.out.println("\n" + "User Information: " );
       System.out.println("User fullname: " + name + lastname);
       System.out.println("Age: " + age);
       System.out.println("Weight: " + weight);
       System.out.println("Height: " + height);
       
       
       
       
       
        
        
       
      
       
       
        
  
    }
    
}
