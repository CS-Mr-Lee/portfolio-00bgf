/**
Name: Lucy and Eric
Date: March 10th 2022
Description: the Main class used to test our superclass Device and subclasses LaptopDevice and CellphoneDevice.
*/
class Main {
  public static void main(String[] args) {

    Device[] myDevices = new Device[4];
    myDevices[1] = new CellphoneDevice("Apple", "White", "Metal??", 52, 1000, true, "1234567890", false, true);
    myDevices[2] = new CellphoneDevice("Samsung", "Black", "Metal??", 0, 500, false, "1234567890", true, false);
    myDevices[3] = new LaptopDevice();
    myDevices[4] = new LaptopDevice("apple", "pink", "chrome", 33, 3000,	false,"mac", true, false);
      
  }
}