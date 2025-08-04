/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usermenu;

import java.util.Scanner;

/**
 *
 * @author 30066318
 */
public class UserMenu {

    public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
    
       System.out.println ("Library menu");
       System.out.println ("1. Borrow a book");
       System.out.println ("2. Return a book");
       System.out.println ("3. View all books");
       System.out.println ("4. Pay late fees");
       System.out.println ("Enter your choice: ");
           
           int choice = in.nextInt ();
           
//           if (choice == 1)
//           {
//               System.out.println("You chose to borrow a book.");
//           }
//           else if (choice == 2)
//                   {
//                       System.out.println("You have chosen to return a book.");
//                   }
//           else if (choice == 3)
//           {
//               System.out.println("You have chosen to view all books.");
//           }
//           else if (choice == 4)
//           {
//               System.out.println("You chose to pay late fees.");
//           }
//           else
//           {
//               System.out.println("Invalid Choice.");
//           }
        switch (choice) {
            case 1:
                System.out.println ("You have chosen to borrow a book.");
                break;
            case 2:
                System.out.println ("You have chosen to return a book.");
                break;
            case 3:
                System.out.println ("You have chosen to view all books.");
                break;
            case 4:
                System.out.println ("You have chosen to pay late fees.");
                break;
            default:
                System.out.println ("Invalid choice.");
                
         
        }
    }
}
