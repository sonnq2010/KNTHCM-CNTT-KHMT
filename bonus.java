import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = -1000;

        do {
            String input = scanner.nextLine();
            number = Integer.parseInt(input);

            if (number == -1) {
                System.out.println(sum);
                scanner.close();
                break;
            }
    
            sum += number; 
        } while (true);
    }
}
