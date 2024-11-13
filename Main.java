public class Main{

public static void main(String[] args){
Car car = new Car("Toyota Hilux");
Car car2 = new Car("Tata Nano");

Garage garage = new Garage(car);

garage.park(car);
garage.park(car2);
}

}
