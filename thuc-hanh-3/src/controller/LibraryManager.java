package controller;

import model.Library;
import writeReadFile.ReadWriteObject;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    //Display saving----------------------------------------------------
    List<Library> libraries;

    public LibraryManager() {
        libraries = new ArrayList<>();
    }

    public LibraryManager(List<Library> libraries) {
        this.libraries = libraries;
    }
    //CRUD LibraryManager-----------------------------------------------
    public void addNewLibrary(Library library){
        libraries.add(library);
        ReadWriteObject.write(library);

    }
//    public String displayLibrary(){
//        return libraries.toString();
//    }
        public void displayLibrary(){
        ReadWriteObject.read();
    }

    public String showReturnBook(){
        LocalDate now = LocalDate.now();
        LocalDate lastDay = now.with(TemporalAdjusters.lastDayOfMonth());
        StringBuilder builder = new StringBuilder();
        for (Library o:libraries) {
            if (o.bookReturnDeadline().isEqual(lastDay)){
                builder.append("Tên sinh viên: ").append(o.getStudent().getFullName()).
                        append("; mã số sách: ").append(o.getIdBook()).append("\n");
            }
        }
        return builder.toString();
    }
}
