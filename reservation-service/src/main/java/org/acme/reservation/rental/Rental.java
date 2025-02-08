package org.acme.reservation.rental;

import java.time.LocalDate;

public record Rental(Long id,
                     String userId,
                     Long reservationId,
                     LocalDate startDate) {

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", reservationId=" + reservationId +
                ", startDate=" + startDate +
                '}';
    }
}
