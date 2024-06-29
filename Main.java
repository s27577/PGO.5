public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2020, 500, 25);
        Vehicle truck = new Truck("Ford", "F-150", 2019, 600, 30, 5);

        System.out.println("Car fuel efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Truck fuel efficiency: " + truck.calculateFuelEfficiency());
    }
}
