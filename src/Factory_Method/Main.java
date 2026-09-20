package Factory_Method;

public class Main {

    public static void main(String[] args) {

        TransportFactory truckFactory = new TruckFactory();
        truckFactory.startDelivery();

        TransportFactory shipFactory = new ShipFactory();
        shipFactory.startDelivery();
    }
}