public class Ford extends Car{
    protected int year;
    protected int manufacturerDiscount;

    public Ford(int speed,double regularPrice,String color,int fyear, int fmanufacturerDiscount){
        super(speed,regularPrice,color);
        year = fyear;
        manufacturerDiscount = fmanufacturerDiscount;
    }

    public double getSalePrice(){
        return super.getSalePrice() - (super.getSalePrice() * manufacturerDiscount);
    }

    public int getYear() {
        return year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
