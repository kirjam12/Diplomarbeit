#Diplomarbeit NFC-Türschloss  


Dieses Projekt besteht aus drei großen Bereichen:  
* Der Software für das **Android** Smartphone  
* Der Software für den **RaspberryPi Zero** im Türschloss  
* Der **Elektrik** und **Mechanik** im Türschloss  

In diesem Repository wird die Programmierung des Raspberry Pi’s bearbeitet.

## Schematic

Schematischer Aufbau:

![alt Image text][schematischerAufbau]

Von einem Smartphone, oder einem NFC-Tag wird ein Sicherheitscode und ein Befehl über NFC and den TRF7970a gesendet.
Dieser Code + Befehl wird über SPI an den Raspberry Pi übermittelt welcher bei richtigem Code + Befehl ein Servolenkung im Türschloss ansteuert.

##Komponenten

* Android Smartphone 
	* mindestens Android 4.4
	* Nfc fähig (ISO 14443-4)
* TRF7970a mit beschaltung ([Datenblatt][datenblattTRF7970a])
* Raspberry Pi Zero
* Servo
* Spannungsverorgung


##Verdrahtung
###TRF7970a - Raspberry Pi  
| TRF7970a| Pin Nr.|   | Raspberry Pi | Pin Nr.|   |Funktion
| -------|:------:|--:| ------------:|-------:|--:|-----------:|
| I / O_7| 24     |   | GPIO 12      |19      |   |MOSI
| I / O_8| 23     |   | GPIO 13      |21      |   |MISO
|DATA_CLK| 26     |   | GPIO 14      |23      |   |Clock
| I / O_4| 21     |   | GPIO 10      |24      |   |Slave select
| EN     | 28     |   | GPIO 8       |3       |   |Chip Enable
| Vdd_x  | 32     |   | 5.0 VDC      |2       |   |Power
| VSS    | 10     |   | Ground       |6       |   |Ground
| IRQ    | 13     |   | GPIO 2       |???     |   |Interrupt request

###Raspberry Pi - Servo  
| Raspberry Pi| Pin Nr.|   | Servo | Farbe|   |Funktion
| ------------|:------:|--:| -----:|-----:|--:|-----------:|
| 5.0 VDC     | 4      |   | GPIO 1|Rot   |   |Power
| Ground      | 9      |   | GPIO 1|Braun |   |Ground
| GPIO 1      | 12     |   | GPIO 1|Orange|   |PWM



[datenblattTRF7970a]: http://www.ti.com/lit/ds/slos743k/slos743k.pdf "Datenblatt auf der Website von Texas Instruments"


[schematischerAufbau]: https://github.com/kirjam12/Diplomarbeit/blob/master/documentationData/readMeData/AufbauDiagramm.png "Aufbau des Projekts (schematisch)"

