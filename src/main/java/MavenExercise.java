import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

import static java.lang.Character.*;


public class MavenExercise extends StringUtils {
        public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a String:");

            String response = scanner.nextLine();
        System.out.println(response);

            for (int i = 0; i <=response.length() - 1; i++) {
                if(isDigit(response.charAt(i))) {
                    System.out.println("Cannot include any digits.");
                    return;
                }
            }
                System.out.println(swapCase(response));
                System.out.println(reverse(response));




    }
}
