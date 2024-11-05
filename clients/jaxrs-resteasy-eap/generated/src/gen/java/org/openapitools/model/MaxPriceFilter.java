package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupPricingCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MaxPriceFilter   {
  
  private CatalogsProductGroupPricingCriteria MAX_PRICE;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MAX_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }
  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

