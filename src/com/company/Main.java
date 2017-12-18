package com.company;


public class Main {

    public static void main(String[] args) {
      /*  System.out.println(Recursion.factorial(5));
        System.out.println(Recursion.sum(10));
        System.out.println(Recursion.fibonacci(8)); */

        Node root = new Node(1);
        Node node1 = new Node(0);
        Node node2 = new Node(2);
        root.setRight(node1);
        root.setRight(node2);

        Node node3 = new Node(5);
        Node node4 = new Node(10);
        node1.setLeft(node3);
        node1.setRight(node4);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        node3.setLeft(node5);
        node3.setRight(node6);

        Recursion.preOrder(node1);
        Recursion.inOrder(node1);
        Recursion.postOrder(node1);
         /*


        MotoricVehicle m = new MotoricVehicle();
        try {
            m.go();
        } catch (NotImplementedException e){

            System.out.println(e);

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally{

            //
        }
       Car mazda = new Car();
        mazda.setEngineType(EngineType.DIESEL);
        mazda.setSpeed(129);


        Car opel = new  Car();
        opel.setEngineType(EngineType.GAS);
        opel.setSpeed(140);


        try {
            mazda.go();
            opel.go();
        } catch (SpeedingException e){
            System.out.println(e);
        }

     try {
            int x = 10;
            System.out.print(x / 0);
        } catch (ArithmeticException e){

            //HANDLE exception
            System.out.println("Ne ossz nullával");
        } catch (Exception e){
            System.out.println(e.getMessage());

        }        }



        try {
            divide(10, 0);

        } catch (ArithmeticException e){
            System.out.println("Elkaptuk: "+ e.getMessage());
        } */
    }

    private static void divide (int a, int b) throws ArithmeticException{

        System.out.println(a/b);
    }
}
