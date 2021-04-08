public class Main{
    public static void main(String[] args) {

        Sedan newSedan = new Sedan(210, 1250000,"White", 25);
        Ford firstFord = new Ford(250, 1300000, "Black", 2001, 20);

        Car newCar = new Car(245, 1400000, "Red" );

        System.out.println("Sedan Price: " + newSedan.getSalePrice());
        System.out.println("First Ford Price: " + firstFord.getSalePrice());

        Ford secondFord = new Ford(250, 1200000, "Silver", 2009, 20);
        System.out.println("Second Ford Price: " + secondFord.getSalePrice());

        System.out.println("Car Price: " + newCar.getSalePrice());


    }
}
