package model;

public class Person {
    private String fullName;
    private String yearOfBirth;
    private String identityCardNumber;

    public Person(String fullName, String yearOfBirth, String identityCardNumber) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.identityCardNumber = identityCardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public String toString() {
        return "Thông tin khách trọ:" +
                " Họ tên =" + fullName +
                ", Năm sinh=" + yearOfBirth +
                ", số CCCD=" + identityCardNumber;
    }
}
