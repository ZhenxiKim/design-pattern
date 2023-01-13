/**
 * @author jhkim
 * @since 2023-01-13
 *
 */
public interface ShipFactory {
	default Ship orderShip(String name, String email) {
		validate(name, email);
		return new Ship();
	}

	private void validate(String name, String email) {

	}
	
	private void prepareFor(String name) {
		System.out.println("name = " + name);
	}
}
