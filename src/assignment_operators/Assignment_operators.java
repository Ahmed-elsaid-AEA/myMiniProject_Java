/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_operators;

import java.util.Scanner;

/**
 *
 * @author A.E.A
 */
public class Assignment_operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Enter your name :");
//        Scanner input = new Scanner(System.in);
//        String name=input.nextLine();
//        System.out.println("hello "+name);
//        System.out.println("Enter your age :");
//        double age=input.nextDouble();
//        System.out.println("your age :"+age);
//        System.out.println("enter true or false");
//        boolean success=input.nextBoolean();
//        System.out.println(success);
//     
        // make program that enable user to input name age college scucess salary
        Scanner input = new Scanner(System.in);
        String name, college;
        double age;
        boolean success;
        int salary;
        System.out.println("Enter your name :");
        name = input.nextLine();
        System.out.println("Enter your age :");
        age = input.nextDouble();
        System.out.println("Enter your college :");
        input = new Scanner(System.in);
        college = input.nextLine();
        System.out.println("Enter your success :");
        success = input.nextBoolean();
        System.out.println("Enter your salary :");
        salary = input.nextInt();
        System.out.println("name : " + name + "\n" + "age : " + age + "\n" + "college : " + college + "\n" + "success  : " + success + "salary : " + salary);

    }

}
