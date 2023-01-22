/**
 * @author jhkim
 * @since 2023/01/21
 *
 */
public class WhiteShipFactory implements ShipFactory {

	@Override
	public Ship createShip() {
		return new WhiteShip();
	}
}
