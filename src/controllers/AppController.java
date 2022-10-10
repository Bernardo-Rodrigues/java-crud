package controllers;

import java.util.Scanner;

public class AppController implements Controller{
    private static Scanner scanner = new Scanner(System.in);

    public AppController(){
        init();
    }
    public void init(){
        System.out.println("Controllers:");
        System.out.println("1 - Products");
        System.out.println("2 - Order");
        System.out.println("3 - Client");

        useController();
    }

    public void useController(){
        System.out.println();
        System.out.print("Enter controller: ");
        Integer choice = scanner.nextInt();
        Controller controller = null;

        switch (choice){
            case 1: controller = new ProductController(); break;
            case 2: controller = new OrderController(); break;
            case 3: controller = new ClientController(); break;
            default: System.out.println("Invalid option!");
        }
    }
}
