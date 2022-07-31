package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {
    private List<Item> item;
    public Long id;
    private String itemName;
    private Double cost;

    public Order(Long id, String itemName, Double cost) {
        this.setId(id);
        this.setItemName(itemName);
        this.setCost(cost);
    }

    public Order(Long id,String itemName){
        this.setId(id);
        this.setItemName(itemName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "id" + id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
        result = prime * result + ((cost == null) ? 0 : cost.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Order other = (Order) obj;
        if (getId() == null) {
            if (other.getItemName() != null) return false;
        } else if (!getId().equals(other.getItemName())) return false;
        if (itemName == null) {
            if (other.itemName != null) return false;
        } else if (!id.equals(other.id)) return false;
        if (cost == null) {
            return other.cost == null;
        } else return cost.equals(other.cost);
    }
}

