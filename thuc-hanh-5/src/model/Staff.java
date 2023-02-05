package model;

public class Staff extends Cadres {
    private String work;

    public Staff() {
    }

    public Staff(String fullName, String dateOfBirth, String gender, String address, String work) {
        super(fullName, dateOfBirth, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Nhân viên: " +
                "  Họ tên: " + getFullName() +
                ", Ngày sinh: " + getDateOfBirth() +
                ", Giới tính: " + getGender() +
                ", Địa chỉ: " + getAddress() +
                ", Công việc: '" + work + "\n";
    }
}
