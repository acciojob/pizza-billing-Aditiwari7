package com.driver;

public class Pizza {

    private int price; //calculating the final bill price.
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int takeawayprice;

    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isTakeawayAdded;
    boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeawayprice = 20;

        if(isVeg==true){
            this.price = 300;
            this.toppingsPrice = 70;
        }else{
            this.price = 400;
            this.toppingsPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeawayAdded = false;

        this.bill = "Base Price Of The Pizza: "+ this.price+"\n"; //Base Price Of The Pizza: 300
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded == false){
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(isToppingAdded == false){
            this.price = this.price + this.toppingsPrice;
            this.isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(isTakeawayAdded == false){
            this.price = this.price + this.takeawayprice;
            this.isTakeawayAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated == false){
            if(isCheeseAdded == true){
                this.bill = this.bill + "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingAdded == true){
                this.bill = this.bill + "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeawayAdded == true){
                this.bill = this.bill + "Paperbag Added: "+this.takeawayprice+"\n";
            }
            this.bill = this.bill + "Total Price: "+this.price+"\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
