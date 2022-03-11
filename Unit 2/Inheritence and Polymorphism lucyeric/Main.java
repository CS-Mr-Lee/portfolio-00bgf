/**
Name: Lucy and Eric
Date: March 10th 2022
Description: the Main class used to test our superclass Device and subclasses LaptopDevice and CellphoneDevice.
Note: Device superclass was a collaborative effort, CellphoneDevice was done by Lucy and LaptopDevice was done by
Eric indepedently, and we were both primarily in charge of our subclasses in the Main.
*/
class Main {
  public static void main(String[] args) {
    //Creats an array filled with 2 phones and 2 laptops
    Device[] myDevices = new Device[4];
    myDevices[0] = new CellphoneDevice("Apple", "White", "Metal??", 52, 1000, true, "1234567890", false, true);
    myDevices[1] = new CellphoneDevice("Samsung", "Black", "Metal??", 0, 500, false, "1234567890", true, false);
    myDevices[2] = new LaptopDevice();
    myDevices[3] = new LaptopDevice("apple", "pink", "chrome", 33, 3000,	false, false, "mac", false);

    //Runs through the array and tests unique and overriden methods for each subclass
    for (int i = 0; i < 4; i++){
      System.out.println("Device #" + (i + 1) + " " + myDevices[i].getColour() + " " + myDevices[i].getBrand());
      if (myDevices[i] instanceof CellphoneDevice){
        ((CellphoneDevice)myDevices[i]).text("4164961680", "dingdong");
        System.out.println("Using phone for 2 hours: the new battery level is "+ (myDevices[i]).use(2) + "%");
      }
      if (myDevices[i] instanceof LaptopDevice) {
        ((LaptopDevice)myDevices[i]).runGames(3);
        System.out.println("Charging laptop for 6 hours: the new battery is " + (myDevices[i]).charge(6) + "%");
      }

    }
    //Tests a superclass method, .breakScreen(boolean mad)
    System.out.println((myDevices[0]).breakScreen(true));
    System.out.println((myDevices[0]).getIsBroken());
    

  }
}