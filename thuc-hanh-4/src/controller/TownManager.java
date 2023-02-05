package controller;

import model.Person;
import model.Town;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TownManager {
    //Data saving------------------------------------------
    List<Town> towns;

    public TownManager() {
        towns = new ArrayList<>();
    }

    public TownManager(List<Town> towns) {
        this.towns = towns;
    }

    //CRUD Town Manager------------------------------------
    public void addNewFamily(Town town) {
        towns.add(town);
    }

    public String showTown() {
        return towns.toString();
    }

    public ArrayList<Town> longevityHappiness() {
        ArrayList<Town> towns1 = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate test = LocalDate.ofEpochDay(now.minusYears(80).getYear());
        for (Town p : towns) {
            for (Person o : p.getPeople()) {
                if (test.isEqual(LocalDate.ofEpochDay(o.getDateOfBirth().getYear()))) {
                    towns1.add(p);
                }
            }
        }
        return towns1;
    }
}
