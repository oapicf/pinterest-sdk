package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupPricingCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MaxPriceFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupPricingCriteria MAX_PRICE;
 /**
   * Get MAX_PRICE
   * @return MAX_PRICE
  **/
  @JsonProperty("MAX_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }

  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }

  public MaxPriceFilter MAX_PRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
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
    MaxPriceFilter maxPriceFilter = (MaxPriceFilter) o;
    return Objects.equals(this.MAX_PRICE, maxPriceFilter.MAX_PRICE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MAX_PRICE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaxPriceFilter {\n");
    
    sb.append("    MAX_PRICE: ").append(toIndentedString(MAX_PRICE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

