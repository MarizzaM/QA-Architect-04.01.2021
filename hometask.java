package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

//        1. Create a function that prints "hello world" , call it from main
        print_hello_world("Hello World!");
//        2. Create a function that prints all numbers from 1 to 100, call it from main
        print_from_1_to_100();
//        3. Create a function that inputs a number and prints if the number is even (zugi) or not, call it from main
        even_or_odd(s);
//        4. **etgar: input the number from main instead of inside the function
        System.out.print("\nPlease enter the number: ");
        int num = s.nextInt();
        even_or_odd_etgar(num);
//        5. what is the difference betwene "step over" and "step into" ?
        
/*
Steps into the method to show what happens inside it.
    Use this option when you are not sure the method is returning a correct result.
Using steps over the implementation of the methods is skipped,
    and you move straight to the next line of the caller method.
 */
        
//        6. if you define int x inside main and int x inside a function , it is the same x? why?
        
/*
it is the not same x...
x - local variable, defined inside the method and its scope is limited to this method only
 */
        
//        7. ***etgarCreate function A() and call it from main, inside function A() call function B(), inside function B() call function A()
//        what happend? why do you think?

/*
Methods A and B are called over and over recursively
 */
        function_a();

    }

    private static void function_a() {
        function_b();
    }

    private static void function_b() {
        function_a();
    }

    private static void even_or_odd_etgar(int num) {
        if (num % 2 == 0) {
            System.out.println(String.format("Number %d is even", num));
        } else {
            System.out.println(String.format("Number %d is odd", num));
        }
    }

    private static void even_or_odd(Scanner s) {
        System.out.print("\nPlease enter the number: ");
        int num = s.nextInt();
        even_or_odd_etgar(num);
    }

    private static void print_from_1_to_100() {
        for(int i = 1; i <= 100; i++){
            System.out.print(i + " ");
        }
    }

    private static void print_hello_world(String s2) {
        System.out.println("Hello World!");
    }

}
