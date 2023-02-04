package views;

import controller.HotelManager;
import model.Hotel;
import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display {
    public static List<Hotel> hotels = new ArrayList<>();
    public static HotelManager hotel = new HotelManager(hotels);
    public static Scanner input = new Scanner(System.in);
    public static int checkInput;

    public static Hotel addNew() {
        Hotel hotels = null;
        try {
            System.out.print("Nhập số ngày khách muốn thuê: ");
            int numberOfRentalDays = Integer.parseInt(input.nextLine());
            System.out.print("Nhập kiểu phòng khách muốn thuê: ");
            String typeOfRoom = input.nextLine();
            System.out.print("Nhập giá phòng: ");
            double roomRates = Double.parseDouble(input.nextLine());
            System.out.print("Nhập họ và tên khách  thuê: ");
            String fullName = input.nextLine();
            System.out.print("Nhập ngày/tháng/năm sinh: ");
            String yearOfBirth = input.nextLine();
            System.out.print("Nhập số chúng minh thư: ");
            String identityCardNumber = input.nextLine();
            Person person = new Person(fullName, yearOfBirth, identityCardNumber);
            hotels = new Hotel(numberOfRentalDays, typeOfRoom, roomRates, person);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return hotels;
    }

    public static String checkCCCD() {
        String CCCD = "";
        try {
            System.out.print("Nhập vào CCCD khách muốn trả phòng: ");
            CCCD = input.nextLine();
            hotel.payRent(CCCD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CCCD;
    }

    public static void checkHotelEmpty() {
        if (hotels.isEmpty()) {
            System.out.println("Không có phòng để xóa!");
        } else {
            hotel.deleteByHotel();
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("""
                    Menu---------------------
                    1. Thêm phòng cho thuê
                    2. Danh sách phòng và thông tin khách trọ
                    3. Xóa phòng
                    4. Số tiền phải trả nếu khách trả phòng
                    0. Thoát.""");
            System.out.print("Mời bạn chọn: ");
            checkInput = Integer.parseInt(input.nextLine());
            switch (checkInput) {
                case 1 -> hotel.addNewHotel(addNew());
                case 2 -> {
                    System.out.println("Danh sách phòng và thông tin khách trọ:");
                    hotel.display();
                }
                case 3 -> checkHotelEmpty();
                case 4 -> System.out.println(hotel.payRent(checkCCCD()));
                case 0 -> System.exit(checkInput);
            }
        } while (true);
    }
}
