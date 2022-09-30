// Name of author(s) : DEEPIT CHANDGOTHIA
// Project: CAESAR CIPHER ASSIGNMENT 1

// CAESAR CIPHER TESTER

import java.util.Scanner;

public class CaesarCipherTester {
    public static void main(String[] args) {
        // Creates a new scanner object which reads user
        Scanner grinnell = new Scanner(System.in);

        // Prints the purpose of this program
        System.out.println("This program encrypts and decrypts messages using the Caesar Cipher.");

        System.out.println("Would you like to encode or decode a message?");
        String choice = grinnell.nextLine(); // Takes user input for choice

        // A friend while testing my program wrote Encode
        // so to include that I converted input to lower case
        String choice_lower_case = choice.toLowerCase();

        if (choice_lower_case.equals("encode")) {
            System.out.println("Enter the string to encode: ");
            String str = grinnell.nextLine();
            encodeTable(str);
        } else if (choice_lower_case.equals("decode")) {
            System.out.println("Enter the string to decode: ");
            String str = grinnell.nextLine();
            decodeTable(str);
        } else {
            System.out.println("Valid options are \"encode\" or \"decode\"");
            grinnell.close();
            return;
        }
        grinnell.close();
        System.out.println();

    }

    public static void encodeTable(String normal_text) {
        int text_length = normal_text.length();
        char next;
        for (int i = 0; i < 26; i++) {
            System.out.print("n = " + i + ": ");
            for (int j = 0; j < text_length; j++) {
                next = normal_text.charAt(j);
                System.out.print(CaesarCipher.encrypt(next, i));
            }
            System.out.println();
        }

    }

    public static void decodeTable(String encrypted_text) {
        int text_length = encrypted_text.length();
        char next;
        for (int i = 0; i < 26; i++) {
            System.out.print("n = " + i + ": ");
            for (int j = 0; j < text_length; j++) {
                next = encrypted_text.charAt(j);
                System.out.print(CaesarCipher.decrypt(next, i));
            }
            System.out.println();

        }

    }

}
