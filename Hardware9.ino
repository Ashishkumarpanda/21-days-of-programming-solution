#include<LiquidCrystal.h>

LiquidCrystal lcd(12,11,10,9,8,7);

const int kPinTemp = A0;
 
 void loop()
 {
 float reading = analogRead(kPinTemp);     
 float temperatureC=kPinTemp/2.048;      
 lcd.setCursor(0,0); 

 lcd.print("CENTI TEMP= ");
 lcd.print(temperatureC);                 
 float temperatureF= ((temperatureC ) * 9.0 / 5.0) + 32.0; 

 lcd.setCursor(0,1);                     
 lcd.print("FARE TEMP= ");
 lcd.print(temperatureF);               

 delay(800);               
 lcd.clear();                            
 }
