package controller;

import model.Hotel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    List<Hotel> hotels;

    //Display saving-------------------------------------
    public HotelManager() {
        hotels = new ArrayList<>();
    }

    public HotelManager(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    //CRUD hotel-----------------------------------------
    public void addNewHotel(Hotel hotel) {
        hotels.add(hotel);
        writeToFile();
    }

    public void display() {
        List<Hotel> hotelList = readDataFromFile();
        for (Hotel ht : hotelList
        ) {
            System.out.println(ht);
        }
    }

    public void deleteByHotel() {
        hotels.remove(hotels.size()-1);
        writeToFile();
    }

    public void writeToFile() {
        File file = new File("test.txt");
        FileOutputStream stream;
        try {
            stream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedOutputStream bufSt = new BufferedOutputStream(stream);
            ObjectOutputStream oos = new ObjectOutputStream(bufSt);
            oos.writeObject(hotels);
            oos.close();
        } catch (IOException e) {
            System.err.println("Lỗi");
        }
        try {
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Hotel> readDataFromFile() {
        File file = new File("test.txt");
        List<Hotel> students = new ArrayList<>();
        FileInputStream stream;
        try {
            stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedInputStream bufInSt = new BufferedInputStream(stream);
            ObjectInputStream ois = new ObjectInputStream(bufInSt);
            students = (List<Hotel>) ois.readObject();
            stream.close();
            ois.close();
        } catch (Exception ex) {
            System.err.println("Lỗi");
        }
        return students;
    }


    public String payRent(String identityCardNumber) {
        StringBuilder name = new StringBuilder();
        List<Hotel> hotelList = readDataFromFile();
        for (Hotel o : hotelList
        ) {
            if (identityCardNumber.equals(o.getPerson().getIdentityCardNumber())) {
                name.append("Khách trọ: ").append(o.getPerson().getFullName()).
                        append("\n Số tiền phải trả: ").append(o.payRent());
            }
        }
        return name.toString();
    }
}
