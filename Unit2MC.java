
/**
 * Commonly missed questions from Unit 2 MC
 *
 * @Catherine Gu
 * @version 1.0
 */
public class Unit2MC
{
    public static void main(String[] args)
    {
        System.out.println("----------");
        System.out.println("Unit 2 MC");
        System.out.println("----------");
        
        System.out.println("Question 1");
        /*
         * question 1
         * ----------------------------------------------------------------
         * Consider the following class declaration.
         * public class Thing
         * {
         *     private String color;
 
         *     public Thing()
         *     {
         *         color = "Blue";
         *     }

         *      public Thing(String setColor)
         *      {
         *          color = setColor;
         *      }
         *  }
         *  Which of the following code segments, when appearing in a class 
         *  other than Thing, would create a reference of type Thing with a 
         *  value of null ?
         *  
         *  A) Thing someThing = new Thing("Green");
         *  B) Thing someThing = new Thing("");
         *  C) Thing someThing = new Thing();
         *  D) Thing someThing;
         *  E) Thing("Green");
         */
        
        Thing someThing;
        //someThing.toString();         gives error
        System.out.println("someThing is uninitialied --> null");
        
        /*
         * The answer is D because it isn't initialized anything so it is
         * automatically set to null
         */
        
        System.out.println("Question 2");
        /*
         * question 2
         * ----------------------------------------------------------------
         * The code segment below is intended to randomly print one of the
         * values 2, 4, 6, or 8 with equal probability.
         * int val = // missing code // ;
         * val *= 2;
         * System.out.print(val);
         * Which of the following can be used to replace // missing code // 
         * so that the code segment works as intended?
         * 
         * A) Math.random() * 4 + 1
         * B) Math.random() * 8
         * C) (int) (Math.random() * 4)
         * D) (int) (Math.random() * 4 + 1)
         * E) (int) (Math.random() * 8 + 1)
         */
        
        int val = (int) (Math.random() * 4);
        val *= 2;
        System.out.print(val);
        
        System.out.println();
        
        /*
         * The answer is D because Math.random returns a number between 0 
         * and 1 so you would need to multiply it by 4 and add 1 to get a
         * number >= 1 and < 5.
         */

    }
        

}