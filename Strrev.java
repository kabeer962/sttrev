import java.util.Scanner;
public class Strrev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String r=""; 
        for (int i = input.length() - 1; i >= 0; i--) {
            r+= input.charAt(i);
        }
        System.out.println("The reversed string is: " +r);
    }
}
