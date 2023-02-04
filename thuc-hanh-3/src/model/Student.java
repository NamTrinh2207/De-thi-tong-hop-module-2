package model;

public class Student {
    private String fullName;
    private String id;
    private String dateOfBirth;
    private String clas;

    public Student(String fullName, String id, String dateOfBirth, String clas) {
        this.fullName = fullName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.clas = clas;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return
                "họ tên=" + fullName +
                        ", mã sinh viên=" + id +
                        ", năm sinh=" + dateOfBirth +
                        ", lớp=" + clas;
    }
}
