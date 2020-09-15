package car;

import pizza.PizzaConstructor;

public class CarConstrAndMethd {
    //Variables
    String carModel;
    int wheels;
    int doors;
    byte seats;
    int speed;
    public CarConstrAndMethd()
    {
        System.out.println("\"My BMW has,wheels,doors,seats\"");
    }
    //constructor with single parameter
    public CarConstrAndMethd(String name)
    {
        this.carModel=name;
        System.out.println("My Car Is"+" "+ name);
    }
    //constructor with multiple parameters
    public CarConstrAndMethd(String carModel,int W ,int D, byte S, int SP)
    {
        this.carModel=carModel;
        this.wheels=W;
        this.doors=D;
        this.seats=S;
        this.speed=SP;
        System.out.println("My BMW :"+carModel+"\nwheel:"+W+"\ndoors:"+D+"\nseats:"+S+"\nspeed:"+SP+"KH");
    }
    public static void carBrands4(String nameBMW , String namePorsche,int priceBMW,int pricePorshe ){
        String name =nameBMW ;
        String name1 = namePorsche;
        int priceB= priceBMW;
        int priceP = pricePorshe;
        int total = priceP + priceB ;
        System.out.println("Total Price of this Tow Cars: \'" + name+"\'&\'"+name1+"\' :"+total+"$");
    }







    public static void main(String[] args)
    {
        CarConstrAndMethd nm = new CarConstrAndMethd();
        CarConstrAndMethd BM = new CarConstrAndMethd("\"BMW\"");
        CarConstrAndMethd BMW = new CarConstrAndMethd("X7",4,4, (byte) 7,220);
        CarConstrAndMethd.carBrands4("BMW","PORSHE",25000,35000);

    }
}
