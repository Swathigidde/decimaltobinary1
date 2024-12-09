import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the decimal number from user
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        
        // Display the binary equivalent
        System.out.println("Binary representation: " + binary);
    }
}

