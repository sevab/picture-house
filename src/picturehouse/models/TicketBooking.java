package picturehouse.models;

import org.javalite.activejdbc.Model;

/**
*
* @author Armand, sevabaskin
*/
public class TicketBooking extends Model {
    static {
        validatePresenceOf("customer_id").message("Error: a ticket must belong to someone");
        validatePresenceOf("screening_id").message("You forgot to choose a movie screening for this ticket, please choose one");
        validatePresenceOf("seat_id").message("A seat id is required");
        validatePresenceOf("is_printed").message("A ticket booking must have a printed status");
        
    }
    
}