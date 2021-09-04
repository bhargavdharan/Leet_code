// Creating An array
import java.util.*;
class StringArrayMain{
    public static void main(String[] args) {
        // Declare and initialize array
        // String[] strArr = new String[10];
        String[] strArr = {"one","Two","three"};

        System.out.println("Array Elements are:");
        //Iterate over Array
        for(int i = 0; i < strArr.length; i++)
        {
            System.out.println(strArr[i]);
        }
        System.out.println("====================");
        System.out.println("Printing array elements using Array elements using Array.toString() method:");
        System.out.println("====================");
        System.out.println(Arrays.toString(strArr));

    }
}