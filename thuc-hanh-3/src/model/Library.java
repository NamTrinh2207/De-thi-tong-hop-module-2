package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Library implements Serializable {
    private Student student;
    private LocalDate borrowedDate;
    private int limit;
    private String idBook;

    public Library(Student student, LocalDate borrowedDate, int limit, String idBook) {
        this.student = student;
        this.borrowedDate = borrowedDate;
        this.limit = limit;
        this.idBook = idBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public LocalDate bookReturnDeadline() {
        return borrowedDate.plusDays(getLimit());
    }

    @Override
    public String toString() {
        return "Thư viện : " +
                student +
                ", ngày mượn=" + borrowedDate +
                ", số ngày mượn=" + limit +
                ", mã số sách=" + idBook+"\n";
    }
}
