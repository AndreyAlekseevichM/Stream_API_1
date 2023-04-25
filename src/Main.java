import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        for (Integer letter : intList) {
            if (letter > 0 && letter % 2 == 0) {
                System.out.print(letter + " ");
            }
        }
    }
}
