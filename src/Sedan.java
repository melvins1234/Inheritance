public class Sedan extends Car{
    protected int length;

    public Sedan(int speed, double regularPrice, String color,int slength){
        super(speed,regularPrice,color);
        length = slength;
    }
    public double getSalePrice(){
        return (length > 20)? super.getSalePrice() - (super.getSalePrice() * .05): super.getSalePrice() - (super.getSalePrice() * .10);
    }
}
