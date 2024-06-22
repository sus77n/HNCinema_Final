/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AccountModel;
import Model.ManagerAccount;
import Model.User;
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
public class ListAccount {
    private static List<AccountModel> list = new ArrayList<>();

    public ListAccount() {
    }
    
    public static boolean AddNewUser(String username, String password, String phoneNumber){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                return false;
            }
        }
        list.add(new User(username, password, phoneNumber));
        saveToFile();
        return true;
    }
    
   
    public static boolean AddNewManager(String username, String password, String phoneNumber){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                return false;
            }
        }
        list.add(new ManagerAccount(username, password, phoneNumber));
        saveToFile();
        return true;
    }
    
    public static AccountModel checkAccount(String username, String password){
        for (AccountModel current : list) {
            if (current.getUsername().equals(username)) {
                if (current.getPassword().equals(password)) {
                    return current;
                }
            }
        }
        return null;
    }
    
    public static void loadToFile(){
        String fName = "src/Data/listAccount.dat";
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
                AccountModel a = (AccountModel)(fo.readObject()) ;
                list.add(a);
            }
            
            fo.close();fi.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void saveToFile(){
        String fName = "src/Data/listAccount.dat";
        if (list.size() == 0) {
            System.out.println("List account is empty");
            return;
        }
        
        try{
            FileOutputStream f = new FileOutputStream(fName);
            ObjectOutputStream fo = new ObjectOutputStream(f);
            for(AccountModel a: list){
                fo.writeObject(a);
            }
            fo.close();f.close();
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
}
