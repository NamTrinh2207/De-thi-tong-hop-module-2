package display;

import controller.TownManager;
import model.Person;
import model.Town;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Town> towns = new ArrayList<>();
    public static TownManager town = new TownManager(towns);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("""
                    Menu----------------
                    1. Thêm hộ gia đình
                    2. Danh sách các hộ gia đình
                    3. Danh sách các hộ trong khu phố năm nay có người mừng thượng thọ (80 tuổi)
                    0. Thoát
                    """);
            try {
                System.out.print("Mời bạn chọn: ");
                int checkInput = Integer.parseInt(input.nextLine());
                switch (checkInput) {
                    case 1 -> town.addNewFamily(addNew());
                    case 2 -> {
                        System.out.println("Danh sách các hộ gia đình: ");
                        System.out.println(town.showTown());
                    }
                    case 3 -> {
                        System.out.println("Danh sách các hộ trong khu phố năm nay có người mừng thượng thọ (80 tuổi):");
                        System.out.println(town.get80());
                    }
                    case 0 -> System.exit(checkInput);
                    default -> System.out.println("Mời bạn nhập lại!");
                }
            } catch (Exception e) {
                System.err.println("Không được để trống");
            }
        } while (true);
    }

    public static Town addNew() {
        List<Person> person = new ArrayList<>();
        try {
            System.out.print("Nhập số người trong hộ:");
            int memberOfFamily = Integer.parseInt(input.nextLine());
            System.out.print("Nhập Số nhà:");
            String apartmentNumber = input.nextLine();
            for (int i = 1; i <= memberOfFamily; i++) {
                System.out.println("thành viên thứ " + i + ":");
                System.out.print("họ và tên: ");
                String fullName = input.nextLine();
                System.out.print("Ngày sinh: ");
                int day = input.nextInt();
                System.out.print("tháng sinh: ");
                int month = input.nextInt();
                System.out.print("năm sinh: ");
                int year = input.nextInt();
                LocalDate yearOfBirth = LocalDate.of(year, month, day);
                input.nextLine();
                System.out.print("Công việc: ");
                String job = input.nextLine();
                person.add(new Person(fullName, yearOfBirth, job));
            }
            return new Town(memberOfFamily, apartmentNumber, person);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
