/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AccountModel;
import Model.Film;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haing
 */
public class ListFilm {
    private static List<Film> list = new ArrayList<>();

    public ListFilm() {
    }

    public static List<Film> getList() {
        return list;
    }

    public static void setList(List<Film> list) {
        ListFilm.list = list;
    }
    
    public static void addFilm(Film film){
        list.add(film);
    }
    
    public static void saveFilm(){
        String fName  = "src/Data/listFilm.dat";
         if (list.size() == 0) {
            System.out.println("List film is empty");
            return;
        }
        
        try{
            FileOutputStream f = new FileOutputStream(fName);
            ObjectOutputStream fo = new ObjectOutputStream(f);
            for(Film a: list){
                fo.writeObject(a);
            }
            fo.close();f.close();
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void loadFilm(){
        String fName = "src/Data/listFilm.dat";
        if(list.size() >  0){
            list.clear();
        }
        try {
            File f = new File(fName);
            if (!f.exists()){
                return;
            }
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream fo = new ObjectInputStream(fi);
            while (fi.available() > 0) {                
                Film a = (Film)(fo.readObject()) ;
                list.add(a);
            }
            
            fo.close();fi.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
