package controllers;

import services.ProductService;
import services.Service;

import java.util.Scanner;

public class ProductController implements Controller{

    private final Service service;

    public ProductController(){
        this.service = new ProductService();
        init();
    }
    @Override
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product Controller: 1) Create - 2) Read - 3) Update - 4) Delete");
        System.out.print("Action: ");
        int action = scanner.nextInt();

        switch (action){
            case 1: service.create(); break;
            case 2: service.read(); break;
            case 3: service.update(); break;
            case 4: service.delete(); break;
        }
    }
}
