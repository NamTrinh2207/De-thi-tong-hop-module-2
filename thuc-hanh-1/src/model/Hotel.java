package model;

import java.io.Serializable;

public class Hotel implements Serializable {
    private int numberOfRentalDays;
    private String typeOfRoom;
    private double roomRates;
    private Person person;

    public Hotel() {
    }

    public Hotel(int numberOfRentalDays, String typeOfRoom, double roomRates, Person person) {
        this.numberOfRentalDays = numberOfRentalDays;
        this.typeOfRoom = typeOfRoom;
        this.roomRates = roomRates;
        this.person = person;
    }

    public int getNumberOfRentalDays() {
        return numberOfRentalDays;
    }

    public void setNumberOfRentalDays(int numberOfRentalDays) {
        this.numberOfRentalDays = numberOfRentalDays;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(double roomRates) {
        this.roomRates = roomRates;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double payRent() {
        return numberOfRentalDays * roomRates;
    }

    @Override
    public String toString() {
        return "Hotel: " +
                "Số ngày thuê =" + numberOfRentalDays +
                ", Kiểu phòng=" + typeOfRoom +
                ", Giá phòng =" + roomRates + " " +
                person.toString();
    }
}
