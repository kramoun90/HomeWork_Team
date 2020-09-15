package pizza;

public class PizzaMethods {

    //return types methods
    //return type default (no parameter)
    public static String Baking()
    {
        String name ;
        System.out.println("\'Baking The Dough In High Fire\'");
        return "wood";
    }
    // Return Method with Parameter Dynamic
    public static int AddTopping(String kind ,int S,int CH,int CK,char size )
    {
        String name = kind;
        int sauce;
        int cheese;
        int chicken;
        char siz;
        int qyt ;
        int price = S + CH + CK ;
        System.out.println("Price Based Of The Topping"+" "+"\nPrice Of A Large"+name+":"+price+"$");
        return price;
    }
    // Return Method with Parameter Dynamic
    public static int AddTopping2(String kind ,int S,int CH,int CK,char size,int QTY )
    {
        String name = kind;
        int sauce;
        int cheese;
        int chicken;
        char siz;
        int qyt =QTY;
        int price = S + CH + CK * QTY ;
        System.out.println("Price Based Of The Topping"+" "+"\nPrice Of Two Large"+name+":"+price+"$");
        return price;
    }
    // Method Non_return without parameters
    public static void PizzaKinds(){
        String name = "\'Veggie pizza\'";
        String name1= "\'buffalo Pizza\'";
        System.out.println("Kinds  :" + name+"&"+name1);
    }
    //Method Non-return with parameters (Dynamic)
    public static void PizzaKinds1(String name2 , String name3,int price1 ){
        String name =name2 ;
        String name1 = name3;
        int price = price1;
        int price2 = price1;
        int totprice = price1 + price2 ;
        System.out.println("Two Kinds :" + name2+" & "+name3+":"+totprice+"$");
    }
    public static void main(String[] args) {
        PizzaMethods.Baking();
        PizzaMethods.AddTopping("ChickenPizza",5,5,10,'L');
        PizzaMethods.AddTopping2("ChickenPizza",4,4,10,'L',3);
        PizzaMethods.PizzaKinds();
        PizzaMethods.PizzaKinds1("BeefPizza","CheesePizza",20);
    }
}
