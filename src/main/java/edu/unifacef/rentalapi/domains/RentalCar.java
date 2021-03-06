package edu.unifacef.rentalapi.domains;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentalCar {

	private String carBoard;
	private Car car;
	private Price price;
	private Kilometers kilometers;
	private TankStatus tankStatus;
	private LocalDateTime createdDate;
	private LocalDateTime lastModifiedDate;

	public RentalCar(final String carBoard) {
		this.carBoard = carBoard;
	}

}
