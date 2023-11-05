import java.util.ArrayList;
import java.util.List;

public class cau3 {
    static int reverseInteger(int number) {
        String resultString = "";
        String numberString = String.valueOf(number);

        for (int i = numberString.length() - 1; i >= 0; i--) {
            resultString += numberString.charAt(i);
        }

        return Integer.parseInt(resultString);
    }

    static void getPermutations(String targetString, String result, List<String> permutations) {
 
        // If string is empty
        if (targetString.length() == 0) {
            permutations.add(result);
            return;
        }
 
        for (int i = 0; i < targetString.length(); i++) {
 
            // ith character of str
            char character = targetString.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String restOfString = targetString.substring(0, i) + targetString.substring(i + 1);
 
            // Recursive call
            getPermutations(restOfString, result + character, permutations);
        }

    }



    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int reverseNumber = reverseInteger(number);
        System.out.println(number - reverseNumber);

        List<String> permutations = new ArrayList<String>();
        getPermutations(String.valueOf(number), "", permutations);

        String permutationsResult = "";
        for (int i = 0; i < permutations.size(); i++) {
            permutationsResult += permutations.get(i);
            if (i < permutations.size() -1) {
                permutationsResult += " ";
            }
        }
        
        System.out.println(permutationsResult);
    }
}
