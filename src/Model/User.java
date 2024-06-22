/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haing
 */
public class User extends AccountModel {
    
    private List<Film> listFavorite = new ArrayList<>();

    public User(String username, String password, String phoneNumber) {
        super(username, password, phoneNumber);
    }

    public List<Film> getListFavorite() {
        return listFavorite;
    }

    
    
}
