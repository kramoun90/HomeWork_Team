public class ConstructorPizza{
    // the constructor is the class name
    //non return typ
    //constructor with parameters
    // constructor without parameters
    String name ;
    double price;
    public static void main(String[] args) {
        ConstructorPizza OVEN = new ConstructorPizza();
        ConstructorPizza oven = new ConstructorPizza("Veggie");
        ConstructorPizza prc = new ConstructorPizza("Care", 20.50);
    }

    // constructor without parameters by default
    public ConstructorPizza(){
        System.out.println("\"Make Pizza In Brick Oven\"");
    }
    //constructor with parameters/ pattern / signature
    public ConstructorPizza(String name){
        this.name = name;
        System.out.println(name);
    }
    public ConstructorPizza(String name, double price){
        this.price =price;
        System.out.println(price);
    }

}

