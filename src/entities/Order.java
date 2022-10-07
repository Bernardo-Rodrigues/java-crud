package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> orderItems;
    private Client client;

    public Order(Client client){
        this.client = client;
        this.moment = LocalDateTime.now();
        this.status = OrderStatus.PROCESSING;
        this.orderItems = new ArrayList();
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(){};

    public void removeItem(){};

    public void listItems(){};

    public double total(){
        return 0;
    };
}
