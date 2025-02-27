package Ticket_Booking_Service.Ticket_Booking_Service.Service;
import Ticket_Booking_Service.Ticket_Booking_Service.entity.Ticket;
import Ticket_Booking_Service.Ticket_Booking_Service.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public void cancelTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}

