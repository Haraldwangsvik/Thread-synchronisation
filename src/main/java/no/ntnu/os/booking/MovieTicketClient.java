package no.ntnu.os.booking;

public class MovieTicketClient extends Thread {
  private String customerName;
  private int numberOfTickets;
  public MovieTicketServer movieTicketServer;

  public MovieTicketClient(String customerName, int numberOfTickets, MovieTicketServer movieTicketServer) {
    this.customerName = customerName;
    this.numberOfTickets = numberOfTickets;
    this.movieTicketServer = movieTicketServer;
  }

  public void run() {
    try {
      movieTicketServer.bookTicket(this.customerName, this.numberOfTickets);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}