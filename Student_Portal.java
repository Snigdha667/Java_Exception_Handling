import java.util.Scanner;

public class Student_Portal {
     String name;
     String country;
     Student_Portal(){
         Scanner s = new Scanner(System.in);
         name = s.next();
         country = s.next();
     }
}
class InvalidCountryException extends Exception{
    public InvalidCountryException(String exp){
        super(exp);
    }
}
class UserRegistration {
        void registerUser(String username, String userCountry) throws InvalidCountryException {
            try {
                if (userCountry.equals("India")) {
                    System.out.println("User registration done Successfully");

                } else throw new InvalidCountryException("User Outside India cannot be registered");
            }
            catch (InvalidCountryException e){
                System.out.println(e);
            }
        }


    public static void main(String[] args) throws InvalidCountryException {
        UserRegistration ob = new UserRegistration();
        Student_Portal obj = new Student_Portal();
        ob.registerUser(obj.name,obj.country);
    }

}