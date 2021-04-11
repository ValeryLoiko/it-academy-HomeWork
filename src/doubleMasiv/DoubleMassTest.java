package doubleMasiv;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleMassTest {

    @Test
    void masMax() {
        int[][] mas = new int[][]{{0, 34, 2}, {9, 12, 18, 5}, {3, 4, 5}};
        int[] expectedMax = {34, 0, 1};
        int[] realMax = DoubleMass.masMax(mas);

        Assert.assertArrayEquals(expectedMax, realMax);
    }

    @Test
    void masMin() {
        int[][] mas = new int[][]{{-7, 34, 2}, {9, 12, 18, 5}, {3, 4, 5}};
        int[] expectedMin = {-7, 0, 0};
        int[] realMin = DoubleMass.masMin(mas);

        Assert.assertArrayEquals(expectedMin, realMin);
    }
}