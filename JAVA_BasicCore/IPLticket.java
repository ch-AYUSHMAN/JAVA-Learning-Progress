public class IPLticket {
    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
        User user1 = new User(ticketBookingSystem, "User1", 6);
        User user2 = new User (ticketBookingSystem, "User2" , 3);
        User user3 = new User(ticketBookingSystem, "User3", 02);
        user1.start();
        user2.start();
        user3.start();
        
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Available tickets: "+ ticketBookingSystem.getAvailableTickets());

    }
    
}
class TicketBookingSystem{
    private int availableTickets = 10;
    public synchronized boolean bookTicket ( String name, int numberOfTickets){
        if (numberOfTickets <= availableTickets){
            availableTickets -= numberOfTickets;
            System.out.println( name + " successfully booked " + numberOfTickets + " tickets");
            return true;
        }else{
            System.out.println( name + " 's request for " + numberOfTickets + " tickets was denied.");
            return false;
        }
        }
        public int getAvailableTickets(){
            return availableTickets;
        }
    }
class User extends Thread{
    private TicketBookingSystem ticketBookingSystem;
    private String name;
    private int numberOfTickets;
    public User ( TicketBookingSystem ticketBookingSystem, String name , int numberOfTickets){
        this.ticketBookingSystem =ticketBookingSystem;
        this.name = name ;
        this.numberOfTickets = numberOfTickets;
    }
    public void run (){
        ticketBookingSystem.bookTicket(name, numberOfTickets);
    }
}
