
package com.bridgelabz.flightschedulind;
import java.util.*;
class Flight<T>{
    private T flightNumber;
    private String departure;
    private String destination;
    public Flight(T flightNumber, String departure, String destination) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }
    public T getFlightNumber() {
        return flightNumber;
    }
    public void displayFlightInfo() {
        System.out.println("Flight: " + flightNumber + " | From: " + departure + " | To: " + destination);
    }
}

class Booking<T>{
    private T bookingId;
    private Flight<?> flight;
    private String passengerName;

    public Booking(T bookingId, Flight<?> flight, String passengerName) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        flight.displayFlightInfo();
    }

}


class FlightManager<T extends Number> {
    private List<Flight<T>> flights = new ArrayList<>();

    public void addFlight(Flight<T> flight) {
        flights.add(flight);
    }

    public void displayAllFlights() {
        for (Flight<T> flight : flights) {
            flight.displayFlightInfo();
        }
    }
}

class FlightUtility {
    public static void displayFlightDetails(List<? extends Flight<?>> flights) {
        for (Flight<?> flight : flights) {
            flight.displayFlightInfo();
        }
    }
}





public class FlightSystem {
    public static void main(String[] args) {
    Flight<Integer>obj=new Flight<>(1234,"Kolkata","Chitkara");
    Flight<String>obj2=new Flight<>("AFFH12","India","England");

    Booking<Integer>book=new Booking<>(109998,obj,"Sumit");
    Booking<String>book1=new Booking<>("jbdbdq112",obj2,"Subha");
        book.displayBookingInfo();
        System.out.println();
        book1.displayBookingInfo();

        System.out.println();
        FlightManager<Integer> st=new FlightManager<>();
        st.addFlight(obj);
       // st.addFlight(obj2);
        st.displayAllFlights();

    }

}
