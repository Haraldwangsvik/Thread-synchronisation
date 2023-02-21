package no.ntnu.os.booking;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MovieTicketServer {
  // TBD
  private String movieName;
  private int availableSeats;

  public MovieTicketServer(String movieName, int availableSeats) {
    this.movieName = movieName;
    this.availableSeats = availableSeats;
  }

  synchronized void bookTicket(String customerName, int numberOfSeats) throws InterruptedException {
    Thread.sleep(400);

    System.out.println("Hi," + customerName + ":\n" + this.availableSeats +
        " Seats available for " + movieName);


    if ((this.availableSeats - numberOfSeats) < 0) {
      System.out.println("Hi," + customerName +
          ":\n" + numberOfSeats + " Seats not available for " + movieName);
    } else {
      System.out.println("Hi," + customerName + ":\n" +
          numberOfSeats + " Seats booked successfully for " + movieName);
      this.availableSeats -= numberOfSeats;
    }
  }

}
