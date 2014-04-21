/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1to7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author James
 */
public class Lab3 {
    public static void main(String[] args) {

        Lab1 employee1 = new Lab1("James", "Rheingans", "333-33-3333");
        Lab1 employee2 = new Lab1("John", "Smith", "444-44-4444");
        Lab1 employee3 = new Lab1("Sally", "Jones", "222-22-2222");
        Lab1 employee4 = new Lab1("James", "Rheingans", "333-33-3333");

        List<Lab1> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        System.out.println("Size of List: " + employeeList.size() + "\n");

        for(Lab1 e: employeeList){
            System.out.println(e.toString());
        }
    }
}
