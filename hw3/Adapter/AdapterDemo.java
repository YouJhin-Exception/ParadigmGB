package hw3.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        ElectricSocket socket = new ElectricSocket();
        socket.supplyElectricity(110);

        USPlugAdapter adapter = new USPlugAdapter(socket);
        adapter.supplyElectricity(110);
    }
}
