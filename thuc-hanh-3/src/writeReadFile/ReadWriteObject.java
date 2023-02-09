package writeReadFile;
import model.Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
public  class ReadWriteObject {
    // kiem tra file co object hay khong
    public static boolean hasObject(File f) {
        // thu doc xem co object nao chua
        FileInputStream fi;
        boolean check = true;
        try {
            fi = new FileInputStream(f);
            ObjectInputStream inStream = new ObjectInputStream(fi);
            if (inStream.readObject() == null) {
                check = false;
            }
            inStream.close();
 
        } catch (FileNotFoundException e) {
            check = false;
        } catch (IOException e) {
            check = false;
        } catch (ClassNotFoundException e) {
            check = false;
            e.printStackTrace();
        }
        return check;
    }
 
    public static void write(Library s) {
        try {
 
            File f = new File("student.dat");
            FileOutputStream fo;
            ObjectOutputStream oStream = null;
 
            // neu file chu ton tai thi tao file va ghi binh thuong
            if (!f.exists()) {
                fo = new FileOutputStream(f);
                oStream = new ObjectOutputStream(fo);
            } else { // neu file ton tai
 
                // neu chua co thi ghi binh thuong
                if (!hasObject(f)) {
                    fo = new FileOutputStream(f);
                    oStream = new ObjectOutputStream(fo);
                } else { // neu co roi thi ghi them vao
 
                    fo = new FileOutputStream(f, true);
 
                    oStream = new ObjectOutputStream(fo) {
                        protected void writeStreamHeader() throws IOException {
                            reset();
                        }
                    };
                }
            }
            oStream.writeObject(s);
            oStream.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void read() {
        try {
            File f = new File("student.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream inStream = new ObjectInputStream(fis);
            Object s;
            int i = 0;
            while (true) {
                s = inStream.readObject();
                System.out.println(++i + ":" + s.toString());
            }
        } catch (ClassNotFoundException e) {
        } catch (IOException e) {
        }
    }
}