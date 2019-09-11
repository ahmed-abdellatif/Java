// objects be swapping members. 

// A Vehicle with number class Vehicle 
class Vehicle 
{ 
	int setNumber; 
	Vehicle(int setNumber) { this.setNumber = setNumber; } 
} 

// A class that uses Vehicle objects 
public class Main 
{ 
	// To swap v1 and v2 
	public static void swap(Vehicle v1, Vehicle v2) 
	{ 
		int temp = v1.setNumber; 
		v1.setNumber = v2.setNumber; 
		v2.setNumber = temp; 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		Vehicle v1 = new Vehicle(1); 
		Vehicle v2 = new Vehicle(2); 
		swap(v1, v2); 
		System.out.println("Vehicle 1" + " Set: " + v1.setNumber); 
		System.out.println("Vehicle 2" + " Set: " + v2.setNumber); 
	} 
} 