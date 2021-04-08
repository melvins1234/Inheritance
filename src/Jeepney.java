public class Jeepney extends Car{
    private int weight;

    public Jeepney(int speed, double regularPrice, String color, int weight){
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSalePrice(){
        return (this.weight > 2000) ? super.getRegularPrice() - (super.getRegularPrice() * 0.1) : super.getRegularPrice() - (super.getRegularPrice() * 0.2);
    }
}
