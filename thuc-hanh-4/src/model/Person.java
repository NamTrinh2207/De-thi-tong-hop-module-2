package model;

import java.time.LocalDate;

public class Person {
    private String fullName;
    private LocalDate dateOfBirth;
    private String job;

    public Person() {
    }

    public Person(String fullName, LocalDate dateOfBirth, String job) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return
                " Họ tên = " + fullName +
                        ", Ngày sinh = " + dateOfBirth +
                        ", Công việc = " + job + "\n";
    }
}
