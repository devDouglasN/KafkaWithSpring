package com.douglas.springKafka.product;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private Double value;
    private String owner;

    public Product() {
    }

    public Product(String name, Double value, String owner) {
        this.name = name;
        this.value = value;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + name + '\'' +
                ", valor=" + value +
                ", dono='" + owner + '\'' +
                '}';
    }
}
