package task2_find_arrays.test;

import org.junit.Test;
import task2_find_arrays.ArrayFinder;

import static org.junit.Assert.assertEquals;

public class ArrayFinderTest {

    @Test
    public void testFound() {
        int[] arr = {4, 9, 3, 7, 8};
        int[] subArr = {3, 7};
        assertEquals(2, ArrayFinder.findSubArray(arr, subArr));
    }

    @Test
    public void testNotFound() {
        int[] arr = {1, 2, 3, 4};
        int[] subArr = {5, 6};
        assertEquals(-1, ArrayFinder.findSubArray(arr, subArr));
    }

    @Test
    public void testEmptySubArray() {
        int[] arr = {1, 2, 3};
        int[] subArr = {};
        assertEquals(-1, ArrayFinder.findSubArray(arr, subArr));
    }

    @Test
    public void testSubArrayAtStart() {
        int[] arr = {1, 2, 3, 4};
        int[] subArr = {1, 2};
        assertEquals(0, ArrayFinder.findSubArray(arr, subArr));
    }

    @Test
    public void testSubArrayAtEnd() {
        int[] arr = {1, 2, 3, 4};
        int[] subArr = {3, 4};
        assertEquals(2, ArrayFinder.findSubArray(arr, subArr));
    }

}
