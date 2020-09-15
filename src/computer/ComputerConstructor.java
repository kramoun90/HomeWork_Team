package computer;


public class ComputerConstructor {
    // the constructor is the class name
    //non return typ
    //constructor with parameters
    // constructor without parameters


    //variables
    String name ;
    String brand1;
    String brand2;
    double price1;
    double price2;
    double price3;
    int qty= 2;

    //----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        ComputerConstructor com = new ComputerConstructor();
        ComputerConstructor com1 = new ComputerConstructor("\'Mac\'");
        ComputerConstructor price = new ComputerConstructor("Apple","lenovo",2550.50,1100.10);
        ComputerConstructor calculprice = new ComputerConstructor("MAC","LenovoIdeapad", 2550.55, 1100.99,250);
    }

    //----------------------------------------------------------------------------------------------------------------------
    // constructor without parameters by default
    public ComputerConstructor()
    {
        System.out.println("\"Best Computers Quality\"");
        System.out.println("\"Best Quality \"");
        System.out.println("\"Best Price\"");
    }
    //constructor with parameters/ pattern / signature
    //single Parameter
    public ComputerConstructor(String name)
    {
        this.name= name;
        System.out.println("Apple:"+name);
    }
    //multiple Parameter
    public ComputerConstructor(String name, String brand2, double price1, double price2)
    {
        this.brand1 = name;
        this.brand2= brand2;
        this.price1 =price1;
        this.price2=price2;
        double total= price1+price2;
        System.out.println(name+":"+price1+"\n"+brand2+":"+price2+"\nToTal Price  :"+total+"$");
    }
    //multiple Parameter
    public ComputerConstructor(String brand1, String brand2, double price1, double price2, double price3)
    {
        this.brand1=brand1;
        this.brand2=brand2;
        this.price1 =price1;
        this.price2=price2;
        this.price3=price3;
        double totality = price1+price3 * qty;
        System.out.println(brand1+":"+ price1+"$"+"\n"+brand2+"$"+":"+price2+"$"+"\nMonitor price :"+price3+"$"+"\ntotality:"+totality+"$");
    }
}

