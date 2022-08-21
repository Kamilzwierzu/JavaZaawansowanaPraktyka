import java.util.ArrayList;
import java.util.List;

public class LiczbyOdKonca {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i + 1);
        }


        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}



