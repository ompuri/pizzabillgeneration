package com.billgenerator;

public class Pizza
{
    private int price;
    private Boolean veg;

    private int exracheeseprice=100;

    private int extratoppingprice=150;

    private int backpackprice =20;

    public Pizza(Boolean veg) {
        this.veg = veg;

        if (this.veg){
            this.price = 300;
        }else{
            this.price =400;

        }

    }
    public void addexracheese()
    {
        System.out.println("extra cheese added");
        this.price +=exracheeseprice;

    }
    public void  addextratopping()
    {
        System.out.println("extratopping added");
        this.price+= extratoppingprice;

    }

    public void takeaway()
    {
        System.out.println("take away opted");
        this.price += backpackprice;
    }
    public void getbill()
    {
        System.out.println(this.price);
    }
}
