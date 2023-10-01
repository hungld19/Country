/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ManageEastAsiaCountries;
import java.util.ArrayList;
import model.Country;

/**
 *
 * @author LAPTOP DELL
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        //loop until user want to exist
        while (true) {
            int choice = ManageEastAsiaCountries.menu();
            switch (choice) {
                case 1:
                    ManageEastAsiaCountries.inputCountry(lc);
                    break;
                case 2:
                    ManageEastAsiaCountries.printCountry(lc);
                    break;
                case 3:
                    ManageEastAsiaCountries.searchByName(lc);
                    break;
                case 4:
                    ManageEastAsiaCountries.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}