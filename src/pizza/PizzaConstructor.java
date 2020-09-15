package pizza;

public class PizzaConstructor {

    //Variables
    String ingridien1;
    double salt;
    double yeast;
    int watter;
    int flower;
    //Default constructor
    public PizzaConstructor()
    {
        System.out.println("\"making Pizza With Watter, Flower , Yeast ,Salt\"");
    }
    //constructor with single parameter
    public PizzaConstructor(String name)
    {
        this.ingridien1=name;
        System.out.println(" Bake The Pizza in the"+" "+ name);
    }
    //constructor with multiple parameters
    public PizzaConstructor(int W, int F, double Y, double S)
    {
        this.watter=W;
        this.flower=F;
        this.yeast=Y;
        this.salt=S;
        System.out.println("Mix All This Ingredients Together:"+"\nLitters:"+W+"\nkilo:"+F+"\nPounds:"+Y+"\nTableSpoon:"+S);
    }
    public static void main(String[] args)
    {
        PizzaConstructor make = new PizzaConstructor();
        PizzaConstructor step1 = new PizzaConstructor("\"Brick Oven\"");
        PizzaConstructor Mixing = new PizzaConstructor(5,3,2.5,2.5);

    }

}
