import java.io.*;
import java.util.Scanner;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class main {
    public static void main(String[] args) {
        try {
            // Input file path
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the input file path (press Enter to use default: c:\\Users\\harsh\\VS CODE\\sample_input.txt): ");
            String inputFilePath = input.nextLine();
            if (inputFilePath.isEmpty()) {
                inputFilePath = "c:\\Users\\harsh\\VS CODE\\sample_input.txt";
            }

            // Read the entire file content
            String plainText = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(inputFilePath)));

            // Generate AES key and IV
            SecretKey key = AESUtil.generateKey();
            IvParameterSpec iv = AESUtil.generateIV();

            // Encrypt the file content
            String cipherText = AESUtil.encrypt(plainText, key, iv);

            // Write the encrypted string to the output file
            String outputFilePath = "c:\\Users\\harsh\\VS CODE\\sample_output.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write(cipherText);
            }

            System.out.println("Encryption complete.  ");
            System.out.println("Encrypted content: "+cipherText);

            // Automatically decode the encrypted content
            String decryptedText = AESUtil.decrypt(cipherText, key, iv);
            System.out.println("Decrypted content: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


