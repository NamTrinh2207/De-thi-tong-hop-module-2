package model;

import java.util.Objects;

public class Cadres {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String address;

    public Cadres() {
    }

    public Cadres(String fullName, String dateOfBirth, String gender, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadres cadres = (Cadres) o;
        return Objects.equals(fullName, cadres.fullName) && Objects.equals(dateOfBirth, cadres.dateOfBirth)
                && Objects.equals(gender, cadres.gender) && Objects.equals(address, cadres.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, dateOfBirth, gender, address);
    }
}
