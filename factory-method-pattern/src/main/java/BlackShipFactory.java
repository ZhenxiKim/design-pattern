/**
 * @author jhkim
 * @since 2023/01/22
 *
 */
public class BlackShipFactory implements ShipFactory{
	@Override
	public Ship createShip() {
		return new BlackShip();
	}
}
