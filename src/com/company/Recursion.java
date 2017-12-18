package com.company;

/**
 * Created by java1 on 2017.12.18..
 */


public class Recursion {
// per** javadoc

    public static int factorial(int n) {


        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }


    public static int sum(int n){


        if (n == 1){
            return 1;
        }
        return n + sum(n-1);

    }

    public static int fibonacci (int n){
        if (n <= 1){
            return n;
        }
        else {
            return fibonacci(n-1)+ fibonacci(n-2);
        }


    }


    public static void preOrder(Node node){

        if (node != null){
            System.out.println(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());

        }
    }

    public static void inOrder (Node node){
        if (node != null){
            inOrder(node.getLeft());
            System.out.println(node.getData());
            inOrder(node.getRight());

        }
    }

    public static void postOrder (Node node){
        if (node != null){
            postOrder(node.getRight());
            System.out.println(node.getData());
            postOrder(node.getLeft());

        }


    }
}
