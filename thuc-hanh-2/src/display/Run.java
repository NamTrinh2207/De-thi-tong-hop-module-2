package display;

import controller.ReceiptManager;
import model.Client;
import model.Receipt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static List<Receipt> receipts = new ArrayList<>();
    public static ReceiptManager receipt = new ReceiptManager(receipts);
    public static Scanner input = new Scanner(System.in);

    public static Receipt addReceipt() {
        try {
            System.out.print("Nhập họ tên khách hàng: ");
            String fullName = input.nextLine();
            System.out.print("Nhập địa chỉ khách hàng: ");
            String address = input.nextLine();
            System.out.print("Nhập mã số công tơ điện: ");
            String electricMeterCode = input.nextLine();
            System.out.print("Nhập chỉ số cũ:");
            int oldIndex = Integer.parseInt(input.nextLine());
            System.out.print("Nhập chỉ số mới:");
            int newIndex = Integer.parseInt(input.nextLine());
            Client client = new Client(fullName, address, electricMeterCode);
            return new Receipt(client, oldIndex, newIndex);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void display() {
        if (receipts.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            receipt.displayReceipt();
        }
    }

    public static void displayGetMoney() {
        if (receipts.isEmpty()) {
            System.out.println("Danh sách đang trống!");
        } else {
            System.out.println("tiền điện phải trả là: \n"+receipt.moneyToPaid());
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("""
                    Menu-------------------------------
                    1. Nhập thông tin hộ sử dụng điện
                    2. Danh sách những hộ sử dụng điện
                    3. Tiền điện phải trả cho mỗi hộ dân
                    0. Thoát.""");
            System.out.print("Mời bạn chọn: ");
            int checkInput = Integer.parseInt(input.next());
            input.nextLine();
            switch (checkInput) {
                case 1 -> receipt.addNewReceipt(addReceipt());
                case 2 -> display();
                case 3 -> displayGetMoney();
                case 0 -> System.exit(checkInput);
                default -> System.out.println("Dữ liệu không chính xác!");
            }
        } while (true);
    }
}
