/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Lovro
 */
public class RPNCalculator {

    Scanner scanner = new Scanner(System.in);
   PathStack stack = new PathStack();

    public void calculate() {
        String input = "";
    System.out.println("Input >");
        while (true) {
            input = scanner.next();
            try{
                int numInput = Integer.parseInt(input);
               stack.push(numInput);
            }catch (NumberFormatException e){
                switch (input) {
                    case "+":
                        stack.push((int) stack.pop() + (int) stack.pop());
                        break;
                    case "-":
                        stack.push((int) stack.pop() - (int) stack.pop());
                        break;
                    case "*":
                        stack.push((int) stack.pop() *(int) stack.pop());
                        break;
                    case "/":
                        stack.push((int) stack.pop() / (int) stack.pop());
                        break;
                    default:
                        break;
                }
            }
              printStack(stack.getData());
        }
    }
    public void printStack(Path path) { //reverse print
        if(path == null) return;
        printStack( path.getRest());
        System.out.println("printStack " + path.getFirst());
    }
}
