package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PriceFilterPrice;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PriceFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PriceFilter   {
  private PriceFilterPrice PRICE;

  public PriceFilter() {
  }

  @JsonCreator
  public PriceFilter(
    @JsonProperty(required = true, value = "PRICE") PriceFilterPrice PRICE
  ) {
    this.PRICE = PRICE;
  }

  /**
   **/
  public PriceFilter PRICE(PriceFilterPrice PRICE) {
    this.PRICE = PRICE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "PRICE")
  @NotNull @Valid public PriceFilterPrice getPRICE() {
    return PRICE;
  }

  @JsonProperty(required = true, value = "PRICE")
  public void setPRICE(PriceFilterPrice PRICE) {
    this.PRICE = PRICE;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
