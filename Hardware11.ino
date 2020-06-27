int analog_ip = A0;  
int inputVal = 0; 


void setup() {
  Serial.begin(9600);              
}

void loop(){
    inputVal = analogRead(analog_ip);

        Serial.print("Input Value:");
        Serial.print(inputVal);       
        Serial.print("\n");          
        delay(500);                  

  
  
}
