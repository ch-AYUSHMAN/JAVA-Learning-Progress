/*public class ExceptionsMain {
//ArrayIndexOutOfBoundsException/ArithimeticException
    public static void main( String[] args){
        
        try {
            int arr[ ] = new int[5];
           arr[5]  = 10;
           int result = 10 / 0;
           
                } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println ("Exception: " + e);
        } catch ( Exception e) {
            System.out.println( "General Exception : " + e);
        } finally {
            System.out.println( " There are few Exceptions ");
}
    }
    
// Custom Exceptions on Valid Age
public static void validateAge ( int age) throws AgeException{
    if ( age < 18){
        throw new AgeException("Age must be above 18");
    }
    else {
        System.out.println( "You are eligible");
    }
}
public static void main( String [] args){
    try {
        validateAge(16);
    } catch (AgeException e) {
        System.out.println(  e.getMessage());

    }
}
}
class AgeException extends Exception {
    public AgeException ( String message){
        super(message);
    }
}
    
}
// EMAIL VALIDATOR
public class ExceptionsMain {
    public static void main ( String [] args){
        try {
            validateEmail("username");
        } catch ( InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
public static void validateEmail( String email) throws InvalidEmailException{
    if ( !email.contains("@gmail")){
        throw new InvalidEmailException("Email must contain '@gmail.com'");

    }
}
 // CHECKED EXCEPTIONS
import java.io.IOException;
public class ExceptionsMain {
    public static void main ( String[] args){
        try {
            processFile();
        
        } catch (IOException e) {
            System.out.println ( " File processing error: " + e.getMessage());
        }

    }
static void processFile() throws IOException{
    throw new IOException(" Unable to process File");
}   
}
class InvalidEmailException extends Exception {
    public InvalidEmailException ( String message){
        super(message);
        }
}*/
import java.io.IOException;
class UserException extends Exception{
    public UserException( String message){
        super(message);
    }
}
public class ExceptionsMain {
public static void main( String []  args){
    try {
        performTask();
        
    } catch (UserException | IOException e) {
        System.out.println(e.getMessage());
    }
}
 static void performTask() throws UserException , IOException{
    throw new UserException("custom user exception occurred");
 }

    
}