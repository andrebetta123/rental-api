package edu.unifacef.rentalapi.gateways.inputs.http.responses;

import static java.util.Optional.ofNullable;

import java.io.Serializable;
import java.time.LocalDateTime;

import edu.unifacef.rentalapi.domains.RentalCar;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RentalCarResponse implements Serializable {

  private static final long serialVersionUID = 2433564720627372962L;

  @ApiModelProperty(position = 1)
  private String carBoard;

  @ApiModelProperty(position = 2)
  private CarResponse car;

  @ApiModelProperty(position = 3)
  private PriceResponse price;

  @ApiModelProperty(position = 5)
  private LocalDateTime createdDate;

  @ApiModelProperty(position = 6)
  private LocalDateTime lastModifiedDate;

  public RentalCarResponse(final RentalCar rentalCar) {
    this.carBoard = rentalCar.getCarBoard();
    this.car = ofNullable(rentalCar.getCar()).map(CarResponse::new).orElse(null);
    this.price = ofNullable(rentalCar.getPrice()).map(PriceResponse::new).orElse(null);
    this.createdDate = rentalCar.getCreatedDate();
    this.lastModifiedDate = rentalCar.getLastModifiedDate();
  }
}
