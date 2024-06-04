package FIAT;
import java.util.*;
import java.util.regex.*;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        boolean isValid = Pattern.matches(emailPattern, email);
        System.out.println(isValid);
    }
}
