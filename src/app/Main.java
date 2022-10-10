package app;

import controllers.AppController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Access controllers(Y/N): ");
        String option = scanner.next();

        if(option.equals("N")) System.exit(0);

        new AppController();
    }
}
