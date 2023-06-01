package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.arrays.MyArrays;

class ArraysTest {
	@Test
void removeNumberTest() {
	int[] src = {1, 2, 3, 4, 5, 6, 7};
	int index = 3;
	int[] expected1 = {1, 2, 3, 5, 6, 7};
	assertArrayEquals(expected1, MyArrays.removeNumber(src, index));
	index = 0;
	int[] expected2 = {2, 3, 4, 5, 6, 7};
	assertArrayEquals(expected2, MyArrays.removeNumber(src, index));
	index = 6;
	int[] expected3 = {1, 2, 3, 4, 5, 6};
	assertArrayEquals(expected3, MyArrays.removeNumber(src, index));
}
	@Test
void binarySearchTest() {
	int[] src = {2, 4, 3, 7, 6, 5, 1, 6, 4};
	Arrays.sort(src);
	assertEquals(1, Arrays.binarySearch(src, 2));
	assertEquals(4, Arrays.binarySearch(src, 4));
	assertEquals(6, Arrays.binarySearch(src, 6));
	assertEquals(-1, Arrays.binarySearch(src, -1));
}
	@Test
void insertBinaryTest() {
	int[] src = {1, 2, 3, 4, 5, 6, 7};
	int[] expected = {1, 2, 3, 4, 5, 5, 6, 7};
	src = MyArrays.insertNumberSorted(src, 5);
	assertArrayEquals(expected, src);
	assertEquals(5, Arrays.binarySearch(src, 5));
	assertEquals(-1, Arrays.binarySearch(src, -1));
	assertEquals(6, Arrays.binarySearch(src, 6));
}
}
