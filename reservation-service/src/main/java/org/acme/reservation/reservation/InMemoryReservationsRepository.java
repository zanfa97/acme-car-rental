package org.acme.reservation.reservation;

import jakarta.inject.Singleton;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Singleton
public class InMemoryReservationsRepository implements ReservationsRepository {

    private final AtomicLong ids = new AtomicLong(0);
    private final List<Reservation> store = new CopyOnWriteArrayList<>();


    @Override
    public List<Reservation> findAll() {
        return Collections.unmodifiableList(store);
    }

    @Override
    public Reservation save(Reservation reservation) {
        reservation.setId(ids.getAndIncrement());
        store.add(reservation);
        return reservation;
    }
}
