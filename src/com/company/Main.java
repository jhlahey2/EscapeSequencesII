package com.company;

/**
 * Assignment
 * Write a Java program to print the following columns of values. Use \t for the tabs between the columns.
 *
 *  Cost      Quantity   Total
 *  $1,000.00   4       $4,000.00
 *  $   50.00   8         $400.00
 *  ______________________________
 *  TOTAL:      12      $4,400.00
 */
public class Main {

    public static void main(String[] args)
    {
        System.out.println("\tCost\t\tQuantity\t\tTotal");
        System.out.println("\t$1,000.00\t   4    \t\t$4,000.00");
        System.out.println("\t$   50.00\t   8    \t\t  $400.00");
        System.out.println("\t_____________________________________");
        System.out.println("\tTOTAL    \t  12     \t\t$4,400.00");
    }
}
