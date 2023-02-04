package model;

import java.util.List;

public class Town {
    private int memberOfFamily;
    private String apartmentNumber;
    private List<Person> people;

    public Town() {
    }

    public Town(int memberOfFamily, String apartmentNumber, List<Person> people) {
        this.memberOfFamily = memberOfFamily;
        this.apartmentNumber = apartmentNumber;
        this.people = people;
    }

    public int getMemberOfFamily() {
        return memberOfFamily;
    }

    public void setMemberOfFamily(int memberOfFamily) {
        this.memberOfFamily = memberOfFamily;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Family:  " +
                "  Số người =" + memberOfFamily +
                ", Số nhà ='" + apartmentNumber + "\n" + people.toString() + "\n\n";
    }
}
