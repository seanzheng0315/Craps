/**
 * Write a description of class Craps here.
 *
 * @author Sean Zheng
 * @version 2019-01-14
 */

import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play craps? (Y/N)");
        String play = in.next();
        while (play.toUpperCase().substring(0,1).equals("Y"))
        {
            System.out.println("Would you like to read the instructions? (Y/N)");
            String instructions = in.next();
            if (instructions.toUpperCase().substring(0,1).equals("Y"))
            {
                System.out.println("1. A player rolls two six-sided dice and adds the numbers");
                System.out.println("rolled together.");
                System.out.println("");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and");
                System.out.println("a 2, 3, or 12 automatically loses, and play is over. If");
                System.out.println("a 4, 5, 6, 8, 9, or 10 are rolled on this first roll,");
                System.out.println("that number becomes the point.");
                System.out.println("");
                System.out.println("3. The player continues to roll the two dice again until");
                System.out.println("one of two things happens: either they roll the point from");
                System.out.println("that first roll again, in which case they win; or they roll");
                System.out.println("a 7, in which case they lose.");

            }
        }
            System.out.println("Ok, goodbye.");
    }
}
