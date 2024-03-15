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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MinPriceFilter   {
  
  private CatalogsProductGroupPricingCriteria MIN_PRICE;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MIN_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }
  public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinPriceFilter minPriceFilter = (MinPriceFilter) o;
    return Objects.equals(this.MIN_PRICE, minPriceFilter.MIN_PRICE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MIN_PRICE);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

