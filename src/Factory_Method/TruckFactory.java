package Factory_Method;

public class TruckFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}