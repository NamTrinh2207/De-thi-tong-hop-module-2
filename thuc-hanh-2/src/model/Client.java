package model;

public class Client {
    private String name;
    private String address;
    private String electricMeterCode;

    public Client(String name, String address, String electricMeterCode) {
        this.name = name;
        this.address = address;
        this.electricMeterCode = electricMeterCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElectricMeterCode() {
        return electricMeterCode;
    }

    public void setElectricMeterCode(String electricMeterCode) {
        this.electricMeterCode = electricMeterCode;
    }

    @Override
    public String toString() {
        return "Client: " +
                " Name=" + name +
                ", Address=" + address +
                ", Electric Meter Code=" + electricMeterCode;
    }
}
