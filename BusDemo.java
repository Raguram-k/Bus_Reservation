package Bus_reservation;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		buses.add(new Bus(1,true,2));    // creating object using arraylist for bus class object
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		
		
		char userOpt = 'y';
		
		Scanner in=new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
      while(userOpt!='n') {
		System.out.println("Enter Y  to Book and N to exit ");
		userOpt = in.next().charAt(0);
		
		if(userOpt == 'y') {
			
			Booking booking=new Booking();
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your booking is confirmed");
			}
			else {
				System.out.println("sry,Bus is full. Try another bus or date.");
			}
			
		}
	}
	}

}
