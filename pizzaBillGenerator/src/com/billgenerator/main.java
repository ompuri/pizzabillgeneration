package com.billgenerator;

public class main
{
    public static void main(String[] args)
    {
        Pizza basepizza = new Pizza(false);
        basepizza.addexracheese();
        basepizza.addextratopping();
        basepizza.takeaway();
        basepizza.getbill();
    }
}
