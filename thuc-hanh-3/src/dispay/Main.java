package dispay;


import controller.LibraryManager;
import model.Library;
import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Library> libraries = new ArrayList<>();
    public static LibraryManager library = new LibraryManager(libraries);
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int checkInput;
        do {
            System.out.println("""
                    Menu-----------------------------------
                    1. Thêm thẻ mượn
                    2. Danh sách thẻ mượn
                    3. Danh sách tên sinh viên, tên sách mượn cần trả vào ngày cuối tháng
                    0. Thoát
                    """);
            System.out.print("Mời chọn: ");
            checkInput = Integer.parseInt(input.nextLine());
            switch (checkInput) {
                case 1 -> library.addNewLibrary(addLibrary());
                case 2 -> display();
                case 3 -> showReturnDueDate();
                case 0 -> System.out.println("Tạm biệt");
                default -> System.out.println("Mời bạn nhập lại!");
            }
        } while (checkInput != 0);
    }

    public static Library addLibrary() {
        Library libraryOne = null;
        try {
            System.out.print("Nhập tên sinh viên: ");
            String fullName = input.nextLine();
            System.out.print("Nhập mã sinh viên: ");
            String id = input.nextLine();
            System.out.print("Nhập ngày-tháng-năm sinh: ");
            String dateOfBirth = input.nextLine();
            System.out.print("Nhập tên lớp: ");
            String clas = input.nextLine();
            LocalDate date = LocalDate.now();
            System.out.print("Nhập số ngày mượn sách: ");
            int limit = Integer.parseInt(input.nextLine());
            System.out.print("Nhập mã số sách : ");
            String idBook = input.nextLine();
            Student student = new Student(fullName, id, dateOfBirth, clas);
            libraryOne = new Library(student, date, limit, idBook);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return libraryOne;
    }

    public static void display() {
        if (libraries.isEmpty()) {
            System.out.println("Trống............");
        } else {
            System.out.println("Danh sách thẻ mượn: ");
            System.out.println(library.displayLibrary());
        }
    }

    public static void showReturnDueDate() {
        if (libraries.isEmpty()) {
            System.out.println("Trống------------");
        } else {
            System.out.println("Danh sách tên sinh viên, tên sách mượn cần trả vào ngày cuối tháng:");
            System.out.println(library.showReturnBook());
        }

    }
}
