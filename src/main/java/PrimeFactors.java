import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        int current = number;
        int i = 2;
        while (i <= current) {
            if (current % i == 0) {
                primeFactors.add(i);
                current = current / i;
            } else {
                i++;
            }
        }

        return primeFactors;
    }


}
