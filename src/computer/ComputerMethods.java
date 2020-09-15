package computer;

public class ComputerMethods{
    //return types methods\

    //return type default (no parameter)
    public static String Brands()
    {
        String name = "\'Apple\'";
        String name1="\'Lenovo\'";
        System.out.println("\'Best Computer Brands\'"+name+"&"+name1);
        return "Best Computer Brands"+name+name1;
    }
    // Return Method with Parameter (Dynamic)
    public static double  Brands1(double A,double LE ,double HP )
    {
        double PrcieA = A;
        double PriceLe = LE;
        double Pricehp = HP;
        double totalP= PrcieA+PriceLe+Pricehp;
        System.out.println("TOTAL Price Is :"+totalP+"$");
        return totalP;
    }
    // Return Method with Parameter (Dynamic)
    public static double Brands2(double Apple,double Lenovo,double Hp ){
    double PrcieApple = Apple*(1-10)/100;
    double PriceLenovo = Lenovo*(1-20)/100;
    double PriceOfhp= Hp;
    double discountedvalue= PrcieApple+PriceLenovo+PriceOfhp;
        System.out.println("Computer Discount "+discountedvalue);
        return discountedvalue;
    }
    // Method Non_return without parameters
    public static void Brands3(){
        String name = "\'Apple\'";
        String name1= "\'HP\'";
        System.out.println("Brands 3 :" + name+"&"+name1);
    }
    //Method Non-return with parameters (Dynamic)
    public static void Brands4(String nameHP , String nameLE,int priceHP,int priceLE ){
        String name =nameHP ;
        String name1 = nameLE;
        int pricehp= priceHP;
        int pricele = priceLE;
        int total = pricehp + pricele ;
        System.out.println("Prices combined: \'" + nameHP+"&"+nameLE+"\' "+total+"$");
    }
    public static void main(String[] args) {
        ComputerMethods.Brands();
        ComputerMethods.Brands1(2550.99,998.95,1150.88);
        ComputerMethods.Brands2(2550.99,998.95,1150.88);
        ComputerMethods.Brands3();
        ComputerMethods.Brands4("HP","Lenovo",1200,1100);
    }
}

