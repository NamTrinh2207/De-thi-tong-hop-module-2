package controller;

import model.Cadres;

import java.util.ArrayList;

public class CadresManager {
    ArrayList<Cadres> cadres;

    public CadresManager() {
        cadres = new ArrayList<>();
    }

    public CadresManager(ArrayList<Cadres> cadres) {
        this.cadres = cadres;
    }

    public void addNewCadres(Cadres cadre) {
        cadres.add(cadre);
    }

    public String searchByName(String name) {
        String list = "Danh sách đang trống";
        for (Cadres o : cadres) {
            if (name.equals(o.getFullName())) {
                list = o.toString();
            }
        }
        return list;
    }
}
