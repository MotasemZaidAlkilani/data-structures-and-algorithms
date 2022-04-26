import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class insertionSortTest {
insertionSort main=new insertionSort();
    @Test
    public void array1Test(){
        int []array={8,4,23,42,16,15};
        int []sortdArray=main.insertionSort(array);
        int expectedInFirst=4;
        int actualInFirst=sortdArray[0];
        assertEquals(expectedInFirst,actualInFirst);

        int expectedInMid=16;
        int actualInMid=sortdArray[sortdArray.length/2];
        assertEquals(expectedInFirst,actualInFirst);

        int expectedInLast=42;
        int actualInLast=sortdArray[sortdArray.length-1];
        assertEquals(expectedInLast,actualInLast);
    }
    @Test
    public void array2Test(){
        int []array={20,18,12,8,5,-2};
        int []sortdArray=main.insertionSort(array);
        int expectedInFirst=-2;
        int actualInFirst=sortdArray[0];
        assertEquals(expectedInFirst,actualInFirst);

        int expectedInMid=12;
        int actualInMid=sortdArray[sortdArray.length/2];
        assertEquals(expectedInFirst,actualInFirst);

        int expectedInLast=20;
        int actualInLast=sortdArray[sortdArray.length-1];
        assertEquals(expectedInLast,actualInLast);
    }
    @Test
    public void array3Test(){
        int []array={5,12,7,5,5,7};
        int []sortdArray=main.insertionSort(array);
        int expectedInFirst=5;
        int actualInFirst=sortdArray[0];
        assertEquals(expectedInFirst,actualInFirst);

        int expectedInMid=7;
        int actualInMid=sortdArray[sortdArray.length/2];
        assertEquals(expectedInFirst,actualInFirst);

        int expectedInLast=12;
        int actualInLast=sortdArray[sortdArray.length-1];
        assertEquals(expectedInLast,actualInLast);
    }
}
