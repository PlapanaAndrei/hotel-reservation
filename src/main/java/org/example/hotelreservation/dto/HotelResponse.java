package org.example.hotelreservation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelResponse{private Long id;
private String name;
private String city;
private String adress;
private int stars;
}
