
/**
 * My missed questions from Unit 4 MC
 *
 * @Catherine Gu
 * @version 1.0
 */
public class Unit4MC
{
    public static void main(String[] args)
    {
        System.out.println("----------");
        System.out.println("Unit 4 MC");
        System.out.println("----------");
        
        System.out.println("Question 1");
        /*
         * question 1
         * ----------------------------------------------------------------
         * Consider the following code segment.
         * 
         * int total = 0;
         * for (int k = 0; k <= 100; k += 2)
         * {
         *     total += k;
         *  }
         *  
         *  Which of the following for loops could be used to replace the 
         *  for loop in the original code segment so that the original and
         *  the revised code segments store the same value in total?
         */
        
        //question
        int total = 0;
        for (int k = 0; k <= 100; k += 2)
        {
            total += k;
        }
        System.out.println("Original total: " + total);
        
        //my answer (D)
        for (int k = 1; k <= 101; k += 2)
        {
            total += k + 1;
        }
        System.out.println("Wrong total: " + total);
        
        //correct answer (E)
        for (int k = 1; k <= 101; k += 2)
        {
            total += k - 1;
        }
        System.out.println("Correct total: " + total);
        
        /*
         * In the for loop condition for the original segment, it totals 
         * all the even numbers from 0-100. In E, the loops goes from 1-101
         * but subtracts 1 from k before adding so it would still add the 
         * even numbers from 0-100
         */
        
        System.out.println("Question 2");
        /*
         * question 2
         * ----------------------------------------------------------------
         * Consider the following code segments, which differ only in 
         * their loop header.
         * 
         * Code Segment I
         * for (int i = 0; i < 10; i++)
         * {
         *     System.out.print( "*" );
         * }
         * 
         * Code Segment II
         * for (int i = 1; i <= 10; i++)
         * {
         *     System.out.print( "*" );
         * }
         * 
         * Which of the following best explains how the difference in the 
         * two loop headers affects the output?
         */
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print( "*" );
        }
        
        System.out.println();
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.print( "*" );
        }
        
        System.out.println();
        
        /*
         * The output of the code segments is the same because the loops
         * in both code segments iterate 10 times. The first segment loops
         * from 0-9 which is 10 *s and the second segment loops from
         * 1-10 which is also 10*s.
         */
        
        System.out.println("Question 3");
        /*
         * question 3
         * ----------------------------------------------------------------
         * Consider the following code segment.
         * 
         * int n = 6;
         * for (int i = 1; i < n; i = i + 2)  // Line 2
         * {
         *     System.out.print(i + " ");
         *  }
         *  Which of the following best explains how changing i < n to 
         *  i <= n in line 2 will change the result?
         */
        
        int n = 6;
        System.out.println("Original: ");
        for (int i = 1; i < n; i = i + 2)  // Line 2
        {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //changed line 2
        System.out.println("Changed: ");
        for (int i = 1; i <= n; i = i + 2)  // Line 2
        {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        /*
         * There will be no change to the program output because the loop
         * will iterate the same number of times because when i is increased 
         * by 2 every time, the loops would still iterate 3 times
         */
        
        System.out.println("Question 4");
        /*
         * question 4
         * ----------------------------------------------------------------
         * Consider the following method.
         * public String mystery(String word, int num)
         * {
         *     String result = "";
         *     for (int k = num; k >= 0; k--)
         *     {
         *         result += word.substring(0, k);
         *      }
         *      return result;
         *  }
         *  What is returned as a result of the call mystery("computer", 3) ?
         */
        
        String ans = mystery("computer", 3);
        System.out.println("Result: " + ans);
        
        /*
         * The result is "comcoc" because substring includes the first index
         * but does not include the second so (0,3) would result in "com" not
         * "comp"
         */
        
        System.out.println("Question 5");
        /*
         * question 5
         * ----------------------------------------------------------------
         * Consider the following code segment.
         * String str = "AP-CSA";
         * for (int i = 0; i < str.length(); i++)
         * {
         *     if (str.substring(i, i + 1).equals("A"))
         *     {
         *         System.out.print(i + " ");
         *     }
         * }
         * 
         * What is printed as a result of executing the code segment?
         */
        
        String str = "AP-CSA";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.substring(i, i + 1).equals("A"))
            {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        
        /*
         * The answer is 0 5 because it prints the indexes where the letter 
         * "A" is appears.
         */
        
        System.out.println("Question 6");
        /*
         * question 6
         * ----------------------------------------------------------------
         * Consider the following code segment.
         * for (int k = 0; k < 4; k++)
         * {
         *     // missing loop header //
         *     {
         *         System.out.print(k);
         *     }
         *         System.out.println();
         * }
         *      
         * The code segment is intended to produce the following output.
         * 0
         * 11
         * 222
         * 3333
         * Which of the following can be used to replace 
         * // missing loop header // so that the code segment will work
         * as intended?
         */
        
        for (int k = 0; k < 4; k++)
        {
            for (int h = k; h >= 0; h--)        // missing loop header //
            {
                System.out.print(k);
            }
            System.out.println();
        }
        
        /*
         * The answer is for (int h = k; h >= 0; h--) because this loop 
         * header will display integers increasing from 0 to 3 and print each
         * number one more time than the value of the integer.
         */
        
        System.out.println("Question 7");
        /*
         * question 7
         * ----------------------------------------------------------------
         * Consider the following code segment.
         * for (int j = 0; j < 4; j++)
         * {
         *     for (int k = 0; k < j; k++)
         *     {
         *         System.out.println("hello");
         *     }
         * }
         * Which of the following best explains how changing the inner for
         * loop header to  for (int k = j; k < 4; k++)  will affect the 
         * output of the code segment?
         */
        
        System.out.println("Original");
        for (int j = 0; j < 4; j++)
        {
            for (int k = 0; k < j; k++)
            {
                System.out.println("hello");
            }
        }
        
        System.out.println("Changed");
        for (int j = 0; j < 4; j++)
        {
            for (int k = j; k < 4; k++)
            {
                System.out.println("hello");
            }
        }
        
        /*
         * The answer is "The string "hello" will be printed four additional
         * times because the inner loop will iterate one additional time 
         * for each iteration of the outer loop." This is because in the
         * original code it prints hello the number of times the value of 
         * j is so it prints hello 0 + 1 + 2 + 3 times. The revised code will
         * print hello 4 + 3 + 2 + 1 times.
         */
    }
    
    //question 4
    public static String mystery(String word, int num)
    {
        String result = "";
        for (int k = num; k >= 0; k--)
        {
            result += word.substring(0, k);
        }
        return result;
    }
}
