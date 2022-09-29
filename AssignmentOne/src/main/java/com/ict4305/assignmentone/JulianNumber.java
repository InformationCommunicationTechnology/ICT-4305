/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ict4305.assignmentone;

/**
 *
 * @author lutherchikumba
 */
public class JulianNumber {
    private static int JulianNumber;
    private static int  l;
    private static int n;
    private static int i;
    private static int j;
    private static int day; 
    private static int month; 
    private static int year ;
    
    public static int toJulianNumber( int day, int month, int year ){
        JulianNumber = ( 1461 * (year + 4800 + (month - 14 ) / 12 ) ) / 4 + ( 367 * (month - 2 - 12* ( (month - 14 ) / 12 ) ) )/ 12 - ( 3 * ( ( year + 4900 + ( month - 14 ) / 12 ) / 100 ) ) / 4 + day - 32075;
        return JulianNumber;
    }
// returns an array of integers for day, month, and year     
    public static int[] fromJulianNumber(int julianNumber){
        l = julianNumber + 68569; 
        n = ( 4 * l ) / 146097; 
        l = l - ( 146097 * n + 3 ) / 4; 
        i = ( 4000 * ( l + 1 ) ) / 1461001; 
        l = l - ( 1461 * i ) / 4 + 31; 
        j = ( 80 * l ) / 2447; 
        day = l - ( 2447 * j ) / 80; 
        l = j / 11; 
        month = j + 2 - ( 12 * l ); 
        year = 100 * ( n - 49 ) + i + l;
        int [] sample = {day, month, year};
        return sample;
    }
    
}
