// Name of author(s) : DEEPIT CHANDGOTHIA
// Project: CAESAR CIPHER ASSIGNMENT 1

// CAESAR CIPHER 

public class CaesarCipher {

    public static int charToCode(char letter) {
        int lower_base = (int) 'a';
        int ascii_value = (int) letter; // get the ascii value of the character
        return ascii_value - lower_base; // get the offset from 'a'
    }

    public static char codeToChar(int value) {
        int base = (int) 'a';
        return (char) (value + base);
    }

    public static int modulo(int shifted_letter) {
        int normalized;
        if (shifted_letter < 0) {
            // Negative
            normalized = 26 + shifted_letter;
        } else if (shifted_letter > 25) {
            // More than 25
            normalized = shifted_letter % 26;
        } else {
            normalized = shifted_letter;
        }

        return normalized;

    }

    public static char encrypt(char letter, int num) {
        // change the character to a value
        int value = charToCode(letter);

        // calculate the shifted value using n
        int shifted_value = value + num;

        // normalize the shifted value
        int new_value = modulo(shifted_value);

        // return the value to a character, which is returned
        return codeToChar(new_value);

    }

    public static char decrypt(char ch, int n) {
        int value = charToCode(ch);
        int shifted = value - n;
        int newvalue = modulo(shifted);

        return codeToChar(newvalue);
    }
}
