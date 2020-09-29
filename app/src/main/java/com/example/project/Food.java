package com.example.project;

public class Food {


    private  double  fd_price;
    private String  name;
    private  String description;
    private String Category;

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    Food(){


        fd_price = 0.0;
        name ="";
        description="";
        Category = "";
    }





    public double getFd_price() {
        return fd_price;
    }

    public void setFd_price(double fd_price) {
        this.fd_price = fd_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
