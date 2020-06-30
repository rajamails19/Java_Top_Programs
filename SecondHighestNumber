package sample_1;

import java.util.TreeSet;

public class SecondHighestNumber {
	public static void main(String[] args)
    {
        Integer[] arr = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 100,100, 100, 89, 89 };
        int largest = 0;
        int secondLargest = 0;
   
        // **Sekhar** This is optional ( until line 20 ) - just to make sure, the input arr is not duplicate & sorted in ascending order 
        
        TreeSet<Integer> tree = new TreeSet<Integer>();

        for(int i = 0; i< arr.length; i++) {
            tree.add(arr[i]);
        }
        
        arr = new Integer[tree.size()];
       arr =  tree.toArray(arr);
 
        // **Sekhar** This is optional, if you want to see the input elements 
        
        for (int i = 0; i < arr.length; i++)
        {
        System.out.print(arr[i] + " ");
        }
      
        // **Sekhar** The actual logic starts here 
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }
}
