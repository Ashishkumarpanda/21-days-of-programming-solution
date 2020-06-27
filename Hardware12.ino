#include <LiquidCrystal.h>
#include <Wire.h>
#include <Dwenguino.h>
#include <Servo.h>
Servo myservo; 
int potpin = 0;
int val;  
void setup() { 
  initDwenguino();
  my servo.attach(SERVO_1); 
}    
void loop() { 
  val = analogRead(potpin); 
  val = map(val, 0, 1023, 0, 179); 
  myservo.write(val); 
  delay(10); 
}
