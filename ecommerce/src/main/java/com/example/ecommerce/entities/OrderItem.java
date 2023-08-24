package com.example.ecommerce.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantidade;
    private Double preco;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product,  Integer quantidade, Double preco) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder (Order order){
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    public OrderItemPK getId() {
        return id;
    }

    public void setId(OrderItemPK id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
