void setup(){
pinMode(13,OUTPUT);
}

void loop()
{
for (int x = 0; x < 10; x++) {
   digitalWrite(13, HIGH);   
   delay(2000);              
   digitalWrite(13, LOW);    
   delay(2000);           
}
}
