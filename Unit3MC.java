
/**
 * Commonly missed questions from Unit 3 MC
 *
 * @Catherine Gu
 * @version 1.0
 */
public class Unit3MC
{
    public static void main(String[] args)
    {
        System.out.println("----------");
        System.out.println("Unit 3 MC");
        System.out.println("----------");
        
        System.out.println("Question 1");
        /*
         * question 1
         * ----------------------------------------------------------------
         * In the code segment below, the int variable temp represents a 
         * temperature in degrees Fahrenheit. The code segment is intended 
         * to print a string based on the value of temp. The following table 
         * shows the string that should be printed for different temperature
         * ranges.
         * 
         * Temp Range                   String to Print
         * 31 and below                 "cold"
         * 32-50                        "cool"
         * 51-70                        "moderate"
         * 71 and above                 "warm"
         * 
         * String weather;
         * if (temp <= 31)
         * {
         *     weather = "cold";
         * }
         * else
         * {
         *     weather = "cool";
         * }
         * if (temp >= 51)
         * {
         *     weather = "moderate";
         *  }
         *  else
         *  {
         *      weather = "warm";
         *  }
         *  System.out.print(weather);
         *  
         *  Which of the following test cases can be used to show that the 
         *  code does NOT work as intended?
         *  I. temp = 30
         *  II. temp = 51
         *  III. temp = 60
         */
        
        String weather;
        int temp = 30;
        
        if (temp <= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "moderate";
        }
        else
        {
            weather = "warm";
        }
        
        System.out.print(weather);
        
        System.out.println();
        
        /*
         * The answer is I. because 30 degrees will fail the second if
         * statement and skip to the else statement which would  print 
         * "warm" because 30 is not >= 51.
         * The rest of the choices print the correct statement for the temp.
         */
        
        System.out.println("Question 2");
        /*
         * question 2
         * ----------------------------------------------------------------
         * Consider the following code segment.
         * 
         * String first = new String("duck");
         * String second = new String("duck");
         * String third = new String("goose");
         * if (first == second)
         * {
         *     System.out.print("A");
         * }
         * else if (second == third)
         * {
         *     System.out.print("B");
         * }
         * else if (first.equals(second))
         * {
         *     System.out.print("C");
         *  }
         *  else if (second.equals(third))
         *  {
         *      System.out.print("D");
         *  }
         *  else
         *  {
         *      System.out.print("E");
         *  }
         *  
         *  What is printed as a result of executing the code segment?
         */
        
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        
        if (first == second)
        {
            System.out.print("A");
        }
        else if (second == third)
        {
            System.out.print("B");
        }
        else if (first.equals(second))
        {
            System.out.print("C");
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
        
        System.out.println();
        
        /*
         * The letter C will be printed becaue you cannot use == to compare
         * strings. The first string is the same as the second string so
         * the .equals will come as tru and thus print "C".
         */
        
        System.out.println("Question 3");
        /*
         * question 3
         * ----------------------------------------------------------------
         * Consider the following two code segments. Assume that variables 
         * x and y have been declared as int variables and have been 
         * assigned integer values.
         * 
         * I.
         *  int result = 0;
         *  if (x > y)
         *  {
         *      result = x - y;
         *      System.out.print(result);
         *  }
         *  else if (x < y)
         *  {
         *      result = y - x;
         *      System.out.print(result);
         *  }
         *  else
         *  {
         *      System.out.print(result);
         *  }
         *  
         * II.
         *  if (x < y)
         *  {
         *      System.out.print(y - x);
         *  }
         *  else
         *  {
         *      System.out.print(x - y);
         *  }
         *  
         *  Which of the following correctly compares the outputs of the 
         *  two code segments?
         */
        
        int x, y;
        int result;
        
        for (x = 3; x >= 1; x--)
        {
            for (y = 2; y <= 4; y++)
            {
                //I
                result = 0;
                if (x > y)
                {
                    result = x - y;
                    System.out.print(result);
                }
                else if (x < y)
                {
                    result = y - x;
                    System.out.print(result);
                }
                else
                {
                    System.out.print(result);
                }
                System.out.print("\t");
                //II
                if (x < y)
                {
                    System.out.print(y - x);
                }
                else
                {
                    System.out.print(x - y);
                }
                System.out.println();
            }
        }
        
        /*
         * The answer is that code segment I and code segment II produce 
         * the same output for all values of x and y. Both segments will do
         * the same calculations and will result in the absolute value of 
         * x and y.
         */
        
        System.out.println("Question 4");
        /*
         * question 4
         * ----------------------------------------------------------------
         * In the following expression, j, k, and m are properly declared 
         * and initialized int variables.
         * 
         * !((j == k) && (k > m))
         * 
         * Which of the following is equivalent to the expression above?
         */
        
        int j = 1;
        int k = 0;
        int m = 0;
        boolean quest, testA, testB, testC, testD, testE;
        
        quest = !((j == k) && (k > m));
        testA = (j != k) || (k < m);
        testB = (j != k) || (k <= m);
        testC = (j == k) || (k < m);
        testD = (j != k) && (k <= m);
        testE = (j == k) && (k < m);
        
        System.out.println("quest:" + quest);
        System.out.println("A:" + testA);
        System.out.println("B:" + testB);
        System.out.println("C:" + testC);
        System.out.println("D:" + testD);
        System.out.println("E:" + testE);
        
        /*
         * The answer is B because of DeMorgan's Law. The ! reverses the
         * signs so > becomes <=, == becomes !=, and && becomes ||.
         */
        
    }
}