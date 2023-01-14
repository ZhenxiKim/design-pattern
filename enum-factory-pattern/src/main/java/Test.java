/**
 * @author jhkim
 * @since 2023-01-12
 *
 */
public class Test {
	public static void main(String[] args) {
		Vehicle truck = VehicleFactory.Truck.createVehicle();
		truck.drive();

		Vehicle car = VehicleFactory.Car.createVehicle();
		car.drive();
	}
}
