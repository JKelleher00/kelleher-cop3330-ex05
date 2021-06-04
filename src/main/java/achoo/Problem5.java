package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem5 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Whats the first number? ");
        int b = a.nextInt();
        System.out.print("Whats the second number? ");
        int c = a.nextInt();
        System.out.println(b + " + " + c + " = " + (b+c) + "\n" + b + " - " + c + " = " + (b-c) + "\n" + b + " * " + c + " = " + (b*c) + "\n" + b + " / " + c + " = " + (b/c));
    }
}
