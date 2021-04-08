public class Sedan extends Car{
    protected static int length;

    public Sedan(int sspeed,double sregularPrice,String scolor,int slength){
        super(sspeed,sregularPrice,scolor);
        length = slength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getSalePrice(){
        return (length > 20)? super.getSalePrice() - (super.getSalePrice() * .05): super.getSalePrice() - (super.getSalePrice() * .10);
    }
}
