public class Ford extends Car{
    protected int year;
    protected int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color,int fyear, int nfmanufacturerDiscount){
        super(speed,regularPrice,color);
        year = fyear;
        manufacturerDiscount = nfmanufacturerDiscount;
    }
    public double getSalePrice(){
        return super.getSalePrice() - (super.getSalePrice() * manufacturerDiscount);
    }
}
