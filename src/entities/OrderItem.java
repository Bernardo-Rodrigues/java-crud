package entities;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem(Product product){
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double subTotal(){
        return 0;
    }
}
