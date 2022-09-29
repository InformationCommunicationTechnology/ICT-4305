/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignmentone;

import com.ict4305.assignmentone.JulianNumber;

/**
 *
 * @author lutherchikumba
 */
public class AssignmentOne {

    public static void main(String[] args) {
        int julianNumber = 0;
        int [] jNumber ;
        JulianNumber number = new JulianNumber();
        julianNumber = number.toJulianNumber(15,3,1942);
        System.out.println(julianNumber);
        jNumber = number.fromJulianNumber(2435871);
        for(int i=0; i < jNumber.length; i++){
            System.out.print("/" + jNumber[i]);
        }
        
        
        
    }
}
