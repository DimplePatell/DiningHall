#include <SoftwareSerial.h>
// constants won't change. They're used here to
// set pin numbers:
const int buttonPin = 2;     // the number of the pushbutton pin
const int colorPin1 = 3;
const int colorPin2 = 4;
int colorState1 = 0;
int colorState2 = 0;
//const int ledPin =  13;      // the number of the LED pin
// variables will change:
int buttonState = 0;         // variable for reading the pushbutton status
const int RX_PIN = 10;
const int TX_PIN = 9;
const int BLUETOOTH_BAUD_RATE = 9600;

SoftwareSerial bluetooth(RX_PIN, TX_PIN);

void setup() {
  Serial.begin(9600);
  // initialize the LED pin as an output:
  //pinMode(ledPin, OUTPUT);
  //initialize the pushbutton pin as an input:
  pinMode(buttonPin, INPUT);
  bluetooth.begin(BLUETOOTH_BAUD_RATE);
}

void loop() {
  // read the state of the pushbutton value:
  colorState1 = digitalRead(colorPin1);
  colorState2 = digitalRead(colorPin2);

  buttonState = digitalRead(buttonPin);
  // Show the state of pushbutton on serial monitor
  // if it is, the buttonState is HIGH:
  if (buttonState == HIGH) {
    // turn LED on:
  Serial.println("Table 1 is occupied");
  colorState1 = 36;
  colorState2 = 45;
  Serial.print("this is colorState1: ");
  Serial.println(colorState1);

  Serial.print("this is colorState2: ");
  Serial.println(colorState2);
  } else {
   Serial.println("Table 1 is available");
  }

// if(bluetooth.available()){
//    Serial.write(bluetooth.read());
//  }
//  if(Serial.available()){
//    bluetooth.write(Serial.read());
//  }
  // Added the delay so that we can see the output of button
  delay(100);
}
