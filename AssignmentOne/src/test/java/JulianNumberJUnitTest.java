/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.ict4305.assignmentone.JulianNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lutherchikumba
 */
public class JulianNumberJUnitTest {
    
    public JulianNumberJUnitTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testfromJulianNumberOne(){
        JulianNumber jNumber = new JulianNumber();
        int[] arr = {25,12,2050};
        assertArrayEquals(arr,jNumber.fromJulianNumber(2470166));
        
    }
    
    @Test
    public void testfromJulianNumberTwo(){
        JulianNumber jNumber = new JulianNumber();
        int[] arr = {15,3,1492};
        assertArrayEquals(arr,jNumber.fromJulianNumber(2266076));
        
    }

    @Test
    public void testfromJulianNumberThree(){
        JulianNumber jNumber = new JulianNumber();
        int[] arr = {1,2,1957};
        assertArrayEquals(arr,jNumber.fromJulianNumber(2435871));
        
    }
    @Test
    public void testfromJulianNumberFour(){
        JulianNumber jNumber = new JulianNumber();
        int[] arr = {5,1,50};
        assertArrayEquals(arr,jNumber.fromJulianNumber(1739327));
        
    }    
    
    @Test
    public void testtoJulianNumberOne(){
        JulianNumber jNumber = new JulianNumber();
        assertEquals(2470166,jNumber.toJulianNumber(25,12,2050));
        
    }
    @Test
    public void testtoJulianNumberTwo(){
        JulianNumber jNumber = new JulianNumber();
        assertEquals(2266076,jNumber.toJulianNumber(15,3,1492));
        
    }
    @Test
    public void testtoJulianNumberThree(){
        JulianNumber jNumber = new JulianNumber();
        assertEquals(2435871,jNumber.toJulianNumber(1,2,1957));
        
    }
    @Test
    public void testtoJulianNumberFour(){
        JulianNumber jNumber = new JulianNumber();
        assertEquals(1739327,jNumber.toJulianNumber(5,1,50));
        
    }

}
