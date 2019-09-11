
 class Vehicle 
{ 
    int VehicleID, setNumber, shiftNumber; 
  
    Vehicle(int VehicleID, int setNumber, int shiftNumber) 
    { 
        this.VehicleID = VehicleID; 
        this.setNumber = setNumber; 
        this.shiftNumber = shiftNumber;
    } 
  
    void print() 
    { 
        System.out.println(" Vehicle ID = " + VehicleID + "\n" +
                           " Set Number = " + setNumber + "\n" +
                           " Shift = " + shiftNumber +"\n"); 
    } 
} 
  
class VehicleWrapper 
{ 
   Vehicle c; 
  
   VehicleWrapper(Vehicle c)   {this.c = c;} 
} 
  
public class Main  { 
    public static void swap(VehicleWrapper swapVehicle1,  
                            VehicleWrapper swapVehicle2) 
    { 
        Vehicle temp = swapVehicle2.c; 
        swapVehicle2.c = swapVehicle1.c; 
        swapVehicle1.c = temp; 
    } 
  
    public static void main(String[] args) 
    { 
        Vehicle vehicle1 = new Vehicle(164719, 2,4); 
        Vehicle vehicle2 = new Vehicle(164719, 1,4); 
        VehicleWrapper swapVehicle1 = new VehicleWrapper(vehicle1); 
        VehicleWrapper swapVehicle2 = new VehicleWrapper(vehicle2); 
        swap(swapVehicle1, swapVehicle2); 
        swapVehicle1.c.print(); 
        swapVehicle2.c.print(); 
    } 
} 