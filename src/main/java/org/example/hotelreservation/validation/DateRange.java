package org.example.hotelreservation.validation;

import java.time.LocalDate;

public interface DateRange {
    LocalDate getCheckIn();
    LocalDate getCheckout();
}
