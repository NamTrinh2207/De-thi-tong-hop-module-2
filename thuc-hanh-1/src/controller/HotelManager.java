package controller;

import model.Hotel;

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
    public void addNewHotel(Hotel hotel){
        hotels.add(hotel);
    }
    public void display(){
        System.out.println(hotels);
    }
    public void deleteByHotel(){
        hotels.remove(hotels.size()-1);
    }

    public String payRent(String identityCardNumber){
        StringBuilder name = new StringBuilder();
        double payRent;
        for (Hotel o: hotels
             ) {
            if (identityCardNumber.equals(o.getPerson().getIdentityCardNumber())){
                payRent = o.payRent();
                name.append("Khách trọ: ").append(o.getPerson().getFullName()).
                        append("\n Số tiền phải trả: ").append(payRent);
            }else {
                System.out.println("Không tìm thấy dữ liệu !!");
            }
        }
        return name.toString();
    }
}
