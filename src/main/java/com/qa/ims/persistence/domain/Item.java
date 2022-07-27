package com.qa.ims.persistence.domain;

public class Item {


    private Long id;
    private String itemName;
    private Double cost;

    public Item(String itemName, double cost) {
        this.setItemName(itemName);
        this.setCost(cost);
    }

    public Item(Long id, String itemName, double cost) {
        this.setId(id);
        this.setItemName(itemName);
        this.setCost(cost);


    }


    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "id:" + id + " item name:" + itemName + " description:" + cost;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.cost, cost) == 0 && itemName.equals(item.itemName);
    }


}


