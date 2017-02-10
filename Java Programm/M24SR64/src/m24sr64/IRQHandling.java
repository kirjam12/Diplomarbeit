/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m24sr64;

/**
 *
 * @author jakobkirchberger
 */
    
import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class IRQHandling 
{
    
    public static void listen () throws InterruptedException 
    {
        System.out.println("listening");
        
        // create a GPIO controller
        final GpioController gpio = GpioFactory.getInstance();

        // set GPI=_02 as input with pullddown resistor
        final GpioPinDigitalInput irq = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, PinPullResistance.PULL_DOWN);

        // set shutdown state for irq
        irq.setShutdownOptions(true);

        // create a listener for GPIO_02
        irq.addListener(new GpioPinListenerDigital() 
        {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) 
            {
                //Todo//
            }

        });

        while(true) {
            Thread.sleep(20);
        }

    }
}

    

