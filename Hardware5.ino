const int buttonPin = 2;    
const int ledPin =  13;      
int count = 0;               
int buttonState = 0;         

void setup()
{
  Serial.begin(9600);
 
  pinMode(ledPin, OUTPUT);     
 
  pinMode(buttonPin, INPUT);    
}

void loop(){
 
  buttonState = digitalRead(buttonPin);
  if (buttonState == HIGH) {    
     
    digitalWrite(ledPin, HIGH); 
    count++;              
    if (count >= 8) {
      count = 0;
    } 
  }
  else {
   
    digitalWrite(ledPin, LOW);
  }
}
