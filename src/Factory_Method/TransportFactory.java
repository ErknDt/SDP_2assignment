package Factory_Method;

public abstract class TransportFactory {

    public abstract Transport createTransport();

    public void startDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}