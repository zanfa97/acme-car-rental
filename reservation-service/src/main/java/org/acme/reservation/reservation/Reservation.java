package org.acme.reservation.reservation;

import java.time.LocalDate;

public class Reservation {

    private Long id;
    private Long carId;
    private LocalDate startDate;
    private LocalDate endDate;

    public boolean isReserved(LocalDate startDate, LocalDate endDate) {
        return (!(this.endDate.isBefore(startDate)) || this.startDate.isBefore(endDate));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
