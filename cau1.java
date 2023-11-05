import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class cau1 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            if (i == 0) continue;
            numberList.add(Integer.parseInt(args[i]));
        }

        Set<Integer> numberSet = new HashSet<Integer>(numberList);
        System.out.println(numberSet.size());        
    }
}
