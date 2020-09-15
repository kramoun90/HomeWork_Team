package mobile;

public class MobileMethAndCons {
    //Variables
    String mobileModel;
    String mobilseries;
    int mobilQty;
    int mobileprice;

    public MobileMethAndCons()
    {
        System.out.println("\"I have Samsung mobile\"");
    }
    //constructor with single parameter
    public MobileMethAndCons(String name0)
    {
        this.mobileModel=name0;
        System.out.println("My Mobile Model Is"+" "+ name0);
    }
    //constructor with multiple parameters
    public MobileMethAndCons(String mobilename,String mobilseries, int mobileprice, int mobilQty)
    {
        this.mobileModel=mobilename;
        this.mobilseries=mobilseries;
        this.mobileprice=mobileprice;
        this.mobilQty=mobilQty;
        System.out.println(mobilename+"\nModel:"+mobileModel+"\nprice:"+mobileprice+"\nQuantity:"+mobilQty);
    }
    public static void mobileBrands4(String Model,String GalaxyS20 , String Note9,int s20price,int note9price ,double Qty){
        String name =Model ;
        String name1=Note9;
        String name2 = GalaxyS20;
        int priceS= s20price;
        int priceN = note9price;
        int QTYphone= (int) Qty;
        int total = priceS + priceN*QTYphone ;
        System.out.println("Total Price of Mobiles: \'" + name+"\'&\'"+name1+"\' :"+"Quantity "+QTYphone+" phones:"+ total+"$");
    }







    public static void main(String[] args)
    {
        MobileMethAndCons phone= new MobileMethAndCons();
        MobileMethAndCons  phone1= new MobileMethAndCons("\"Samsung Galaxy note 10\"");
        MobileMethAndCons phone2 = new MobileMethAndCons("Samsung Galaxy","Note 9",1400,1);
        MobileMethAndCons.mobileBrands4("Samsung","Galaxy S20","Galaxy Note 9",1200,1400,2);

    }
}