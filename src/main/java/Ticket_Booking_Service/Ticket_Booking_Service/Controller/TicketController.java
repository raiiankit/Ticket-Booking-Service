package Ticket_Booking_Service.Ticket_Booking_Service.Controller;

import Ticket_Booking_Service.Ticket_Booking_Service.Service.TicketService;
import Ticket_Booking_Service.Ticket_Booking_Service.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    // Get all tickets
    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    // Book a ticket
    @PostMapping
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        return ticketService.bookTicket(ticket);
    }

    // Get ticket by ID
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    // Cancel a ticket
    @DeleteMapping("/{id}")
    public String cancelTicket(@PathVariable Long id) {
        ticketService.cancelTicket(id);
        return "Ticket cancelled successfully";
    }
}

