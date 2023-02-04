package controller;

import model.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptManager {
    //Display saving-----------------------------------------------------
    List<Receipt> receipts;

    public ReceiptManager() {
        receipts = new ArrayList<>();
    }

    public ReceiptManager(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    //CRUD Receipt-------------------------------------------------------
    public void addNewReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    public void displayReceipt() {
        System.out.println(receipts);
    }

    public String moneyToPaid() {
        StringBuilder name = new StringBuilder();
        for (Receipt o : receipts) {
            if (o.getOldIndex() > o.getNewIndex()) {
                return "Không tính được tiền điện của khách hàng: " + o.getClient().getName();
            } else {
                name.append("Khách hàng: ").append(o.getClient().
                        getName()).append(", Tiền điện: ").append(o.getMoneyToBePaid()).append("\n");
            }
        }
        return name.toString();
    }
}
