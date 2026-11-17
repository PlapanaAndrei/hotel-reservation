package org.example.hotelreservation.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import org.example.hotelreservation.model.RoomType;

import java.util.Set;
import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomRequest{
    @NotBlank(message = "Room number is required") private String roomNumber;
    @NotNull(message = "Room type is required") private RoomType type;
    @Min(value = 1, message = "Capacity must be at leat 1") private int capacity;
    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive") private BigDecimal pricePerNight;
    @NotNull(message = "Hotel id is required") private Long hotelId;
    private Set<Long> amenityIds;

}

