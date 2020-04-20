
/**
 * Missed questions from Unit 6 MC
 *
 * @Catherine Gu
 * @version 1.0
 */
public class Unit6MC
{
    public static void main(String[] args)
    {
        System.out.println("----------");
        System.out.println("Unit 6 MC");
        System.out.println("----------");
        
        System.out.println("Question 1");
        /*
         * Consider the following code segment.
         * int[] numbers = {1, 2, 3, 4, 5, 6};
         * for (int i = 0; i < numbers.length; i++)
         * {
         *     System.out.println(numbers[i]);
         * }
         *  Which of the following for loops produces the same output as 
         *  the code segment?
         */
        
        System.out.println("Question result:");
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        
        //correct answer
        System.out.println("Correct Answer:");
        for (int x : numbers)
        {
            System.out.println(x);
        }
        
        System.out.println("My Answer:");
        //my answer
        //***produces run time error
        /*
         * for (int x : numbers)
         * {
         *     System.out.println(numbers[x]);
         * }
         */
        
        
        /*
         * My answer is incorrect because x is where the values are stored
         * not numbers[x]. The correct answer prints the assigned copy of 
         * an element from the array numbers for each iteration of the 
         * enhanced for loop.
         */
    }
}
