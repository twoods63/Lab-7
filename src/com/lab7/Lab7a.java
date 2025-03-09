package com.lab7;

import java.util.*;
public class Lab7a {
    public static int recursive_multiply (int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + recursive_multiply(a, b - 1);
    }
    public static int recursive_div (int a, int b) {
        if (b == 0) {
            return - 1;
        }
        if (a == b) {
            return 1;
        }
        if (a < b) {
            return 0;
        }
        return 1 + recursive_div(a - b, b);
    }
    public static int recursive_mod (int a, int b) {
        if (b == 0) {
            return  - 1;
        }
        if (a < b) {
            return a;
        }
        return recursive_mod(a - b, b);
    }


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int choice = -1;

      while (choice != 0) {
          System.out.print("Choose from the following:\n0. Quit\n1. Multiply 2 numbers\n2. Div 2 numbers\n3. Mod 2 numbers\n");
          choice = sc.nextInt();

          if (choice == 0) {
              break;
          }

          System.out.println("Enter the first number");
          int num1 = sc.nextInt();
          System.out.println("Enter the second number");
          int num2 = sc.nextInt();

          int result;

          switch (choice) {
              case 1:
                  result = recursive_multiply(num1, num2);
                  System.out.print("Answer: " + result);
                  break;
              case 2:
                  result = recursive_div(num1, num2);
                  System.out.print("Answer: " + result);
                  break;
              case 3:
                  result = recursive_mod(num1, num2);
                  System.out.print("Answer: " + result);
                  break;
              default:
                  System.out.println();
          }
          System.out.println();
      }
    }
}