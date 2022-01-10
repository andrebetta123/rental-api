package edu.unifacef.rentalapi.domains;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {

	private Double from;
	private Double to;

}
