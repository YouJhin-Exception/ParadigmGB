package hw3.Adapter;

public class USPlugAdapter {
    private ElectricSocket socket;

    public USPlugAdapter(ElectricSocket socket) {
        this.socket = socket;
    }

    public void supplyElectricity(int voltage) {
        int europeanVoltage = convertToEuropeanVoltage(voltage);
        socket.supplyElectricity(europeanVoltage);
    }

    private int convertToEuropeanVoltage(int voltage) {
        return voltage * 2; // конвертация вольтажа для примера
    }
}
