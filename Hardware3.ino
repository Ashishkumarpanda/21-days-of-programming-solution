
int pin = 2;
void setup()
{
Serial.begin(9600);
pinMode(pin, INPUT);
}

void loop() 
{
int state = digitalRead(pin);
Serial.println(state);
delay(1); 
}
