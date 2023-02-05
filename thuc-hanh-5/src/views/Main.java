package views;

import controller.CadresManager;
import model.Cadres;
import model.Engineer;
import model.Staff;
import model.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Cadres> cadres = new ArrayList<>();
    public static CadresManager cadre = new CadresManager(cadres);
    public static Scanner input = new Scanner(System.in);
    public static int checkInput;

    public static Cadres addNew() {
        String name;
        String dayOfBirth;
        String gender;
        String address;
        do {
            System.out.println("""
                    Bạn muốn thêm
                    1. Nhân viên
                    2. Kỹ sư
                    3. Công nhân
                    0. Thoát""");
            System.out.print("Lựa chọn :");
            checkInput = input.nextInt();
            input.nextLine();
            switch (checkInput) {
                case 1 -> {
                    try {
                        System.out.print("Nhập tên nhân viên: ");
                        name = input.nextLine();
                        System.out.print("Nhập ngày sinh nhân viên: ");
                        dayOfBirth = input.nextLine();
                        System.out.print("Nhập giới tính nhân viên: ");
                        gender = input.nextLine();
                        System.out.print("Nhập địa chỉ nhân viên: ");
                        address = input.nextLine();
                        System.out.print("Nhập công việc nhân viên: ");
                        String work = input.nextLine();
                        return new Staff(name, dayOfBirth, gender, address, work);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        System.out.print("Nhập tên kỹ sư: ");
                        name = input.nextLine();
                        System.out.print("Nhập ngày sinh kỹ sư: ");
                        dayOfBirth = input.nextLine();
                        System.out.print("Nhập giới tính kỹ sư: ");
                        gender = input.nextLine();
                        System.out.print("Nhập địa chỉ kỹ sư: ");
                        address = input.nextLine();
                        System.out.print("Nhập nghành đào tạo kỹ sư: ");
                        String trainingIndustry = input.nextLine();
                        return new Engineer(name, dayOfBirth, gender, address, trainingIndustry);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.print("Nhập tên công nhân: ");
                        name = input.nextLine();
                        System.out.print("Nhập ngày sinh công nhân: ");
                        dayOfBirth = input.nextLine();
                        System.out.print("Nhập giới tính công nhân: ");
                        gender = input.nextLine();
                        System.out.print("Nhập địa chỉ công nhân: ");
                        address = input.nextLine();
                        System.out.print("Nhập cấp bậc công nhân:");
                        String level = input.nextLine();
                        return new Worker(name, dayOfBirth, gender, address, level);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 0 -> System.exit(checkInput);
            }
        } while (true);
    }

    public static void showSearch() {
        String fullName;
        try {
            System.out.print("Nhập họ tên muốn tìm kiếm: ");
            fullName = input.nextLine();
            System.out.println(cadre.searchByName(fullName));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Menu---------------------------------
                    1. Thêm mới
                    2. Tìm kiếm
                    0. Thoát
                    """);
            try {
                System.out.print("Lựa chọn: ");
                checkInput = Integer.parseInt(input.nextLine());
                if (checkInput == 1) {
                    cadre.addNewCadres(addNew());
                } else if (checkInput == 2) {
                    showSearch();
                } else if (checkInput == 0){
                    System.exit(checkInput);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}