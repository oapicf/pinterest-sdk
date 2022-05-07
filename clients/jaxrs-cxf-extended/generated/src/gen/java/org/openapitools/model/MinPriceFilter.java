package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupPricingCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MinPriceFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupPricingCriteria MIN_PRICE;
 /**
  * Get MIN_PRICE
  * @return MIN_PRICE
  */
  @JsonProperty("MIN_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }

  /**
   * Sets the <code>MIN_PRICE</code> property.
   */
 public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }

  /**
   * Sets the <code>MIN_PRICE</code> property.
   */
  public MinPriceFilter MIN_PRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinPriceFilter {\n");
    
    sb.append("    MIN_PRICE: ").append(toIndentedString(MIN_PRICE)).append("\n");
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

