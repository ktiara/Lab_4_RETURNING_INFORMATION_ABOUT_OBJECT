public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Camry", "Toyota", 2022, 28000.0, "Black", 5);

        System.out.println(myCar.toString());

        myCar.sell();

        System.out.println(myCar.getBrand());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
        System.out.println(myCar.getPrice());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getQuantity());

        myCar.setPrice(27000.0);
        myCar.setColor("White");

        System.out.println(myCar.toString());
    }
}