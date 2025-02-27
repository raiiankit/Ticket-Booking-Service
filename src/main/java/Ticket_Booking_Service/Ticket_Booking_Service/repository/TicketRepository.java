package Ticket_Booking_Service.Ticket_Booking_Service.repository;
import Ticket_Booking_Service.Ticket_Booking_Service.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}

