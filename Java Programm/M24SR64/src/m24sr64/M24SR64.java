/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m24sr64;

import com.pi4j.wiringpi.I2C;
import static com.pi4j.wiringpi.I2C.wiringPiI2CSetup;
/**
 *
 * @author jakobkirchberger
 */
public class M24SR64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
        int fd = I2C.wiringPiI2CSetup(I2C.CHANNEL_0);
        int data =I2C.wiringPiI2CReadReg16(fd,123);
        System.out.println(data);
        
        } catch (Exception e) {
        }
       
      
        }        
    }
    
   
    
    
    
    
    
    
    

