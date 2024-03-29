import org.junit.Assert;
import org.junit.Test;

public class BackPackTest {
    @Test
    public void testOptimizing1() {
        int[] w = {2, 3, 4, 5};
        int[] v = {3, 4, 5, 6};
        int limit = 8;
        int expected = 10;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing2() {
        int[] w = {1, 2, 3, 4, 5};
        int[] v = {1, 6, 10, 16, 20};
        int limit = 10;
        int expected = 37;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing3() {
        int[] w = {3, 4, 5, 6};
        int[] v = {2, 3, 4, 5};
        int limit = 10;
        int expected = 8;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing4() {
        int[] w = {1, 2, 3, 4};
        int[] v = {5, 4, 3, 2};
        int limit = 5;
        int expected = 9;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing5() {
        int[] w = {2, 3, 4, 5, 6};
        int[] v = {3, 4, 5, 6, 7};
        int limit = 15;
        int expected = 19;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing6() {
        int[] w = {1, 2, 3, 4, 5, 6};
        int[] v = {6, 5, 4, 3, 2, 1};
        int limit = 12;
        int expected = 18;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing7() {
        int[] w = {3, 4, 5, 6, 7};
        int[] v = {2, 3, 4, 5, 6};
        int limit = 15;
        int expected = 12;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing8() {
        int[] w = {1, 1, 1, 1, 1};
        int[] v = {5, 4, 3, 2, 1};
        int limit = 3;
        int expected = 12;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing9() {
        int[] w = {2, 3, 4, 5, 6, 7};
        int[] v = {3, 4, 5, 6, 7, 8};
        int limit = 20;
        int expected = 25;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing10() {
        int[] w = {1, 2, 3, 4, 5, 6, 7};
        int[] v = {7, 6, 5, 4, 3, 2, 1};
        int limit = 18;
        int expected = 25;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing11() {
        int[] w = {2, 3, 4, 5, 6, 7, 8};
        int[] v = {3, 4, 5, 6, 7, 8, 9};
        int limit = 25;
        int expected = 30;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing12() {
        int[] w = {1, 1, 1, 1, 1, 1, 1};
        int[] v = {9, 8, 7, 6, 5, 4, 3};
        int limit = 7;
        int expected =42;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing13() {
        int[] w = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] v = {3, 4, 5, 6, 7, 8, 9, 10};
        int limit = 30;
        int expected = 36;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing14() {
        int[] w = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int limit = 25;
        int expected = 45;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimizing15() {
        int[] w = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] v = {3, 4, 5, 6, 7, 8, 9, 10, 11};
        int limit = 35;
        int expected = 42;
        int result = BackPack.optimizing(w, v, limit);
        Assert.assertEquals(expected, result);
    }
}
