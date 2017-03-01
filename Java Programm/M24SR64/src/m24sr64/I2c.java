/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m24sr64;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.pi4j.wiringpi.I2C;
/**
 *
 * @author jakobkirchberger
 */
public class I2c 
{
    
    
   
    //create I2C bus
    I2CBus bus;
    //create Device object
    private I2CDevice i2c;
    //
    private DataInputStream i2cReceive;
    
    public void heil() throws I2CFactory.UnsupportedBusNumberException, InterruptedException
    {
    
        try {
            
            bus = I2CFactory.getInstance(I2CBus.BUS_0);
            //get the Device
            i2c = bus.getDevice(I2CBus.BUS_0);
            //delay for internal setup
            System.out.println("Device connected");
            Thread.sleep(20);
           
            int read = i2c.read();
            System.out.println("read:"+read);
            
            
            
            
           
            
        } catch (IOException ex) {
            Logger.getLogger(I2c.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
