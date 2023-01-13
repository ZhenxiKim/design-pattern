/**
 * @author jhkim
 * @since 2023-01-12
 *
 */
public enum VehicleFactory {
	Car {
		@Override
		public Vehicle createVehicle() {
			return new Car();
		}
	},
	Truck {
		@Override
		public Vehicle createVehicle() {
			return new Truck();
		}
	};
	public abstract Vehicle createVehicle();
}
