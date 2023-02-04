package model;

public class Receipt {
    private Client client;
    private int oldIndex;
    private int newIndex;
    private double moneyToBePaid;

    public Receipt() {
    }

    public Receipt(Client client, int oldIndex, int newIndex) {
        this.client = client;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public double getMoneyToBePaid() {
        return (getNewIndex() - getOldIndex()) * 750;
    }

    public void setMoneyToBePaid(double moneyToBePaid) {
        this.moneyToBePaid = moneyToBePaid;
    }

    @Override
    public String toString() {
        return " " + client.toString() +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex+"\n";
    }
}
