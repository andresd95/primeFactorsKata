import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {

    @Test
    void given1_whenGenerate_returnEmptyList() {
        List<Integer> result = PrimeFactors.generate(1);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void given2_whenGenerate_returnListWith2() {
        List<Integer> result = PrimeFactors.generate(2);
        Assertions.assertEquals(Collections.singletonList(2), result);
    }

    @Test
    void given3_whenGenerate_returnListWith3() {
        List<Integer> result = PrimeFactors.generate(3);
        Assertions.assertEquals(Collections.singletonList(3), result);
    }

    @Test
    void given4_whenGenerate_returnListWith2And2() {
        List<Integer> result = PrimeFactors.generate(4);
        Assertions.assertEquals(Arrays.asList(2, 2), result);
    }

    @Test
    void given5_whenGenerate_returnListWith5() {
        List<Integer> result = PrimeFactors.generate(5);
        Assertions.assertEquals(Collections.singletonList(5), result);
    }

    @Test
    void given6_whenGenerate_returnListWith2And3() {
        List<Integer> result = PrimeFactors.generate(6);
        Assertions.assertEquals(Arrays.asList(2, 3), result);
    }

    @Test
    void given7_whenGenerate_returnListWith7() {
        List<Integer> result = PrimeFactors.generate(7);
        Assertions.assertEquals(Collections.singletonList(7), result);
    }

    @Test
    void given288_whenGenerate_returnListWithFive2andTwo3() {
        List<Integer> result = PrimeFactors.generate(288);
        Assertions.assertEquals(Arrays.asList(2, 2, 2, 2, 2, 3, 3), result);
    }

    @Test
    void given1000_whenGenerate_returnListWithThree2andThree5() {
        List<Integer> result = PrimeFactors.generate(1000);
        Assertions.assertEquals(Arrays.asList(2, 2, 2, 5, 5, 5), result);
    }

    @Test
    void givenBigNonPrime_whenGenerate_returnItsFactors() {
        List<Integer> result = PrimeFactors.generate(10000007);
        Assertions.assertEquals(Arrays.asList(941 , 10627), result);
    }

    @Test
    void givenBigPrime_whenGenerate_returnItself() {
        List<Integer> result = PrimeFactors.generate(7919);
        Assertions.assertEquals(Arrays.asList(7919), result);
    }
}
