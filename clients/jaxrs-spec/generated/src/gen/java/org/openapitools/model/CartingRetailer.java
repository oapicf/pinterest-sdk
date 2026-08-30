package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CartingRetailer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingRetailer   {
  private String retailerId;
  private String retailerName;

  public CartingRetailer() {
  }

  @JsonCreator
  public CartingRetailer(
    @JsonProperty(required = true, value = "retailer_id") String retailerId,
    @JsonProperty(required = true, value = "retailer_name") String retailerName
  ) {
    this.retailerId = retailerId;
    this.retailerName = retailerName;
  }

  /**
   * Unique identifier for the retailer
   **/
  public CartingRetailer retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier for the retailer")
  @JsonProperty(required = true, value = "retailer_id")
  @NotNull public String getRetailerId() {
    return retailerId;
  }

  @JsonProperty(required = true, value = "retailer_id")
  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  /**
   * Name of the retailer
   **/
  public CartingRetailer retailerName(String retailerName) {
    this.retailerName = retailerName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the retailer")
  @JsonProperty(required = true, value = "retailer_name")
  @NotNull public String getRetailerName() {
    return retailerName;
  }

  @JsonProperty(required = true, value = "retailer_name")
  public void setRetailerName(String retailerName) {
    this.retailerName = retailerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartingRetailer cartingRetailer = (CartingRetailer) o;
    return Objects.equals(this.retailerId, cartingRetailer.retailerId) &&
        Objects.equals(this.retailerName, cartingRetailer.retailerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, retailerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartingRetailer {\n");
    
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    retailerName: ").append(toIndentedString(retailerName)).append("\n");
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
