package model;

public class Engineer extends Cadres{
    private String trainingIndustry;

    public Engineer() {
    }

    public Engineer(String fullName, String dateOfBirth, String gender, String address, String trainingIndustry) {
        super(fullName, dateOfBirth, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "Kỹ sư: " +
                "  Họ tên: " + getFullName() +
                ", Ngày sinh: " + getDateOfBirth() +
                ", Giới tính: " + getGender() +
                ", Địa chỉ: " + getAddress() +
                ", Nghành đào tạo : '" + trainingIndustry + "\n";
    }
}
