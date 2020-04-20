/**
 * Missed questions from Unit 7 MC
 *
 * @Catherine Gu
 * @version 1.0
 */

import java.util.*;

public class Unit7MC
{
    public static void main(String[] args)
    {
        System.out.println("----------");
        System.out.println("Unit 7 MC");
        System.out.println("----------");
        
        System.out.println("Question 1");
        /*
         * Consider the following statement, which is intended to create an
         * ArrayList named numbers that can be used to store Integer values.
         * ArrayList<Integer> numbers = <<missing code>>;
         * 
         * Which of the following can be used to replace <<missing code>> so
         * that the statement works as intended?
         * I.   new ArrayList()
         * II.  new ArrayList<Integer>
         * III. new ArrayList<Integer>()
         */
        
        //I
        new ArrayList();
        //II
        //***produces error
        //new ArrayList<Integer>;
        //III
        new ArrayList<Integer>();
        
        /*
         * Only I and III work because new ArrayList<Integer> does not
         * correctly create an array and it produces an error that says it
         * is missing a parentheses.
         */
        
        System.out.println("Question 2");
        /*
         * Consider the method seqSearch, which implements a sequential 
         * search algorithm.
         * public int seqSearch(int[] arr, int target)
         * {
         *     for (int j = 0; j < arr.length; j++)
         *     {
         *         if (arr[j] == target)
         *         {
         *             return j;
         *          }
         *      }
         *      return -1;
         *  }
         * 
         * Consider another method, seqSearch2, which modifies seqSearch to 
         * use an enhanced for loop.
         * 
         * public int seqSearch2(int[] arr, int target)
         * {
         *     for (int j : arr)
         *     {
         *         if (j == target)
         *         {
         *             return j;
         *          }
         *      }
         *      return -1;
         *  }
         *  
         * Which of the following best describes the difference in the 
         * behavior of seqSearch2 relative to seqSearch as a result of the 
         * modification?
         */
        
        //declare variables
        int[] arr = new int[]{1,2,3,4,5,6,7}; 
        int target = 5;
        
        //1st code
        System.out.println("First Method");
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == target)
            {
                System.out.println(j);
            }
        }
        
        //2nd code
        System.out.println("Second Method");
        for (int j : arr)
        {
            if (j == target)
            {
                System.out.println(j);
            }
        }
        
        /*
         * My answer: The modification in seqSearch2 has no effect: 
         * seqSearch2  will always behave exactly as seqSearch does.
         * 
         * Correct Answer: The modification in seqSearch2 will cause the 
         * value of target to be returned instead of the index of target in 
         * cases where target appears in arr.
         * 
         * Explanation: Method seqSearch returns the index of the first 
         * occurrence of target in arr, while Method seqSearch2 returns the
         * value of target if it appears in arr.
         */
        
        System.out.println("Question 3");
        /*
         * Consider the following correct implementation of the insertion 
         * sort algorithm.
         * public static void insertionSort(int[] elements)
         * {
         *     for (int j = 1; j < elements.length; j++)
         *     {
         *         int temp = elements[j];
         *         int possibleIndex = j;
         *         while (possibleIndex > 0 && 
         *         temp < elements[possibleIndex - 1])
         *         {
         *             elements[possibleIndex] = elements[possibleIndex - 1];
         *             possibleIndex--;   // line 10
         *         }
         *         elements[possibleIndex] = temp;
         *     }
         * }
         * The following declaration and method call appear in a method in
         * the same class as insertionSort.
         * int[] arr = {10, 8, 3, 4};
         * insertionSort(arr);
         * 
         * How many times is the statement possibleIndex--; in line 10 of 
         * the method executed as a result of the call to insertionSort ?
         */
        
        //declare variables
        int[] elements = {10, 8, 3, 4};
        int executed = 0;
        
        //call
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;   // line 10
                executed++;
            }
            elements[possibleIndex] = temp;
        }
        
        System.out.println("Line 10 executed: " + executed);
        
        /*
         * My answer: 6
         * Correct Answer: 5
         * Explanation:
         * The statement in line 10 is executed each time an element is 
         * shifted to the right. For the given array, 10 is shifted right 
         * when 8 is inserted before it. Then 8 and 10 are each shifted 
         * right when 3 is inserted before them. Lastly, 8 and 10 are each 
         * shifted right when 4 is inserted before them. A total of 5 shifts
         * occur, so the statement in line 10 is executed 5 times.
         */
        
        System.out.println("Question 4");
        /*
         * Consider the following correct implementation of the selection
         * sort algorithm.
         * public static void selectionSort(int[] elements)
         * {
         *     for (int j = 0; j < elements.length - 1; j++)
         *     {
         *         int minIndex = j;
         *         for (int k = j + 1; k < elements.length; k++)
         *         {
         *             if (elements[k] < elements[minIndex])
         *             {
         *                 minIndex = k;
         *             }
         *         }
         *         if (j != minIndex)
         *         {
         *             int temp = elements[j];
         *             elements[j] = elements[minIndex];
         *             elements[minIndex] = temp;   // line 19
         *          }
         *      }
         *  }
         *  
         *  The following declaration and method call appear in a method 
         *  in the same class as selectionSort.
         *  int[] arr = {30, 40, 10, 50, 20};
         *  selectionSort(arr);
         *  How many times is the statement
         *  elements[minIndex] = temp;
         *  in line 19 of the method executed as a result of the call 
         *  to selectionSort ?
         */
        
        //declare variables- renamed arr to array
        int[] array = {30, 40, 10, 50, 20};
        int count = 0;
        
        for (int j = 0; j < array.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < array.length; k++)
            {
                if (array[k] < array[minIndex])
                {
                    minIndex = k;
                }
            }
            if (j != minIndex)
            {
                int temp = array[j];
                array[j] = array[minIndex];
                array[minIndex] = temp;   // line 19
                count++;
            }
        }
        
        System.out.println("Line 19 executed: " + count);
        
        /*
         * My answer: 4
         * Correct answer: 3
         * Explanation:
         * Line 19 executes each time a value is swapped into the correct 
         * position in the array. For this array, the values 30 and 10 are 
         * swapped, then 40 and 20. 30 is already in the right place, so no
         * swap occurs. Lastly, 50 and 40 are swapped.
         */
        
   }

}
    