package model;

public class Worker extends Cadres {
    private String level;

    public Worker() {

    }

    public Worker(String fullName, String dateOfBirth, String gender, String address, String level) {
        super(fullName, dateOfBirth, gender, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Công nhân: " +
                "  Họ tên: " + getFullName() +
                ", Ngày sinh: " + getDateOfBirth() +
                ", Giới tính: " + getGender() +
                ", Địa chỉ: " + getAddress() +
                ", Cấp bậc: '" + level + "\n";
    }
}
