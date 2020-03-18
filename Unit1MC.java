
/**
 * Commonly missed questions from Unit 1 MC
 *
 * @Catherine Gu
 * @version 1.0
 */
public class Unit1MC
{
    public static void main (String[]args)
    {
        System.out.println("----------");
        System.out.println("Unit 1 MC");
        System.out.println("----------");
        
        System.out.println("Question 1");
        /*
         * question 1
         * ----------------------------------------------------------------
         * Which of the following arithmetic expressions evaluates to 1 ?
         * I. 2 / 5 % 3
         * II. 2 / (5 % 3)
         * III. 2 / 5 + 1
         */
        int answer1 = 2 / 5 % 3;
        int answer2 = 2 / (5 % 3);
        int answer3 = 2 / 5 + 1;
        
        System.out.println("I. "+ answer1);
        System.out.println("II. " + answer2);
        System.out.println("III. " + answer3);
        
        /*
         * I. 2/5=0, 0%3=0
         * II. 5%3=2, 2/2=1
         * III. 2/5=0, 0+1=1
         */
        
        System.out.println("Question 2");
        /*
         * question 2
         * ----------------------------------------------------------------
         * Consider the following code segment.
         * 
         * double d = 0.25;
         * int i = 3;
         * double diff = d - i;
         * System.out.print((int)diff - 0.5);
         * 
         * What is printed as a result of executing the code segment?
         */

        double d = 0.25;
        int i = 3;
        double diff = d - i;
        System.out.print((int)diff - 0.5);
        
        System.out.println();
        
        /*
         * This outputs -2.5 because 0.25-3=-2.75 and -2.75 is type casted
         * to -2 and -2-0.5=-2.5.
         */
        
        System.out.println("Question 3");
        /*
         * question 3
         * ----------------------------------------------------------------
         * Consider the following code segment, which is intended to display 
         * 6.0.
         * double fact1 = 1 / 2;
         * double fact2 = 3 * 4;
         * double product = fact1 * fact2;
         * System.out.println(product);
         * Which of the following best describes the error, if any, in the 
         * code segment?
         * 
         * A) There are no errors and the code works as intended.
         * B) Either the numerator or the denominator of the fraction 1 / 2 
         * should be cast as double.
         * C) The expression fact1 * fact 2 should be cast as double.
         * D) The expressions 1 / 2 and 3 * 4 should both be cast as double.
         * E) The variables fact1 and fact2 should both be declared as int.
         */
        
        System.out.print("Original: ");
        double fact1 = 1 / 2;
        double fact2 = 3 * 4;
        double product = fact1 * fact2;
        System.out.println(product);
        
        System.out.print("Fixed: ");
        fact1 = 1. / 2;
        fact2 = 3 * 4;
        product = fact1 * fact2;
        System.out.println(product);
        /*
         * The answer is B because 1/2 is still integer type division
         */
        
        
    }
}