package org.openapitools.model;

import org.openapitools.model.PriceFilterPrice;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PriceFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private PriceFilterPrice PRICE;
 /**
  * Get PRICE
  * @return PRICE
  */
  @JsonProperty("PRICE")
  @NotNull
  public PriceFilterPrice getPRICE() {
    return PRICE;
  }

  /**
   * Sets the <code>PRICE</code> property.
   */
 public void setPRICE(PriceFilterPrice PRICE) {
    this.PRICE = PRICE;
  }

  /**
   * Sets the <code>PRICE</code> property.
   */
  public PriceFilter PRICE(PriceFilterPrice PRICE) {
    this.PRICE = PRICE;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceFilter priceFilter = (PriceFilter) o;
    return Objects.equals(this.PRICE, priceFilter.PRICE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRICE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceFilter {\n");
    
    sb.append("    PRICE: ").append(toIndentedString(PRICE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

