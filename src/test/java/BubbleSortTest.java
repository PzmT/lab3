import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElementArray() {
        int[] input = {5};
        int[] expected = {5};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithTwoElements() {
        int[] input = {5, 3};
        int[] expected = {3, 5};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithThreeElements() {
        int[] input = {5, 3, 7};
        int[] expected = {3, 5, 7};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithFourElements() {
        int[] input = {5, 3, 7, 1};
        int[] expected = {1, 3, 5, 7};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithFiveElements() {
        int[] input = {5, 3, 7, 1, 9};
        int[] expected = {1, 3, 5, 7, 9};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithSixElements() {
        int[] input = {5, 3, 7, 1, 9, 2};
        int[] expected = {1, 2, 3, 5, 7, 9};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithSevenElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6};
        int[] expected = {1, 2, 3, 5, 6, 7, 9};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithEightElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 9};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithNineElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4, 8};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithTenElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4, 8, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithElevenElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4, 8, 0, 10};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithTwelveElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4, 8, 0, 10, 11};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithThirteenElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4, 8, 0, 10, 11, 12};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithFourteenElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4, 8, 0, 10, 11, 12, 13};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithFifteenElements() {
        int[] input = {5, 3, 7, 1, 9, 2, 6, 4, 8, 0, 10, 11, 12, 13, 14};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] result = BubbleSort.getBubbleSort(input);
        Assert.assertArrayEquals(expected, result);
    }

}