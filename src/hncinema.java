
import Controller.ListAccount;
import Controller.ListFilm;
import View.Login;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author haing
 */
public class hncinema {


   public static void main(String[] args) throws IOException {
        ListAccount.loadToFile();
        ListFilm.loadFilm();
        
        Login loginframe = new Login();
        loginframe.setVisible(true);
        loginframe.pack();
        loginframe.setLocationRelativeTo(null);
    }
    
}
