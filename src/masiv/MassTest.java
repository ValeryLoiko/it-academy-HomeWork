package masiv;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MassTest {

    @Test
    static int averageNumber(int[] array) {
        int[] mass = new int[]{1, 3, 5, 7, 9};
        int expectedAverage = 5;
        int realAverage = Mass.averageNumber(mass);
        Assert.assertEquals(expectedAverage, realAverage);
        return expectedAverage;
    }

    @Test
    void numbersMoreAverage() {
        int[] mass = new int[]{1, 3, 5, 7, 9};
        ArrayList<Integer> expectedMas = new ArrayList<Integer>();
        expectedMas.add(7);
        expectedMas.add(9);

        ArrayList<Integer> acteulMas = Mass.numbersMoreAverage(mass);
        Assert.assertEquals(expectedMas, acteulMas);
    }
}