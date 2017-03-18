package com.assignment;

import org.junit.Assert;

/**
 * Hello world!
 *
 */
//import org.junit.Assert;
public class App 
{

        //Testing a float
        public static float multiplication(float a, float b)
        {
            return a * b;
        }

        //Testing a integer
        public static int subtract(int a, int b)
        {
            return a - b;
        }

        //Testing obect equility
        public static String equality()
        {
            String equals = new String("Integers");
            return equals;
        }

        //Testing true statement
        public static boolean truth(int a, int b)
{
    int c = a + b;
    if (c == 4) {
        return true;
    } else
        return false;
}

        //Testing false statement
        public static boolean false1(String a)
        {
            if(a.equals ("Integers"))
            {
                return false;
            }
            else
                return true;

        }

        //Testing null
        public static App Nullness()
        {
            App nulln =  null;
            return nulln;
        }

        //Testing not null
        public static String notNullness()
        {
            String a = "a1";
            return a;
        }

        //Testing fail
        public static void fail1() {

            System.out.println("Thank you");
            fail1();
        }

        //Test arrays
        public static int[] arrayT(){

            int[] array1 = new int[]{1,2,3};
            return array1;
        }

        public static void disable()
        {
            Assert.fail("Failed");
        }


}
