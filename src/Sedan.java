public class Sedan extends Car{
    protected static int length;

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
