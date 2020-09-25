class Main {
  public static void main(String[] args) {
    byte num = 4;
    byte[] multBy = new byte[12];
    
    byte val = 1;
    // put values from to 1-12 to 12 memory spaces
    for (byte index = 0; index < 12 ; index++){
      multBy[index] = val;
      val++;
    }    
// calaculate using for-each
System.out.println("Output of the For Each Loop");
    for (byte multiplyBy : multBy){
      
        System.out.println(num + " x " + multiplyBy + " = " + num*multiplyBy);
      }
// calaculate based on for loop
System.out.println("Output of the For Loop");
    for (byte index = 0; index < 12; index++){      
        System.out.println(num + " x " + multBy[index] + " = " + num*multBy[index]); 
    }
// calaculate using while loop 
System.out.println("Output of the While Loop");
byte index = 0;
  while (index < 12){
     System.out.println(num + " x " + multBy[index] + " = " + num*multBy[index]); 
     index++;
  }

System.out.println("Output of the do While Loop");
index = 0;
  do {
    
     System.out.println(num + " x " + multBy[index] + " = " + num*multBy[index]); 
     index++;
  }while (index < 12);

  }
}