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
 * @author jrheingans1
 */
public class Lab2 {

    public static void main(String[] args) {

        Lab1 employee1 = new Lab1("James", "Rheingans", "333-33-3333");
        Lab1 employee2 = new Lab1("John", "Smith", "444-44-4444");
        Lab1 employee3 = new Lab1("Sally", "Jones", "222-22-2222");
        Lab1 employee4 = new Lab1("James", "Rheingans", "333-33-3333");

        List employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        System.out.println("Size of List: " + employeeList.size() + "\n");

        Lab1 fromList = (Lab1) employeeList.get(1);
        System.out.println(fromList.toString() + "\n");

        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
        }
        System.out.println();

        Object[] employeeArray = employeeList.toArray();
        int count = 0;
        for (Object o : employeeArray) {
            employeeArray[count] = (Lab1) employeeArray[count];
            count++;
        }

        System.out.println(employeeList.contains(employee4));
    }
}
