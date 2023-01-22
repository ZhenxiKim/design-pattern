public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackShip);
    }
}
