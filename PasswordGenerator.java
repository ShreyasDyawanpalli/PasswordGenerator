import java.security.SecureRandom;

public class PasswordGenerator {
    
    // Define characters for generating password
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+";

    public static String generatePassword(int length) {
        // Combine all characters
        String allChars = LOWERCASE_CHARS + UPPERCASE_CHARS + DIGITS + SPECIAL_CHARS;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        
        // Generate password
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }
        
        return password.toString();
    }

    public static void main(String[] args) {
        int length = 12; // Set desired length of password
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }
}
