package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CartingRetailer
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingRetailer   {
  @JsonProperty("retailer_id")
  private String retailerId;

  @JsonProperty("retailer_name")
  private String retailerName;

  public CartingRetailer retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

  /**
   * Unique identifier for the retailer
   * @return retailerId
   */
  @ApiModelProperty(required = true, value = "Unique identifier for the retailer")
  public String getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  public CartingRetailer retailerName(String retailerName) {
    this.retailerName = retailerName;
    return this;
  }

  /**
   * Name of the retailer
   * @return retailerName
   */
  @ApiModelProperty(required = true, value = "Name of the retailer")
  public String getRetailerName() {
    return retailerName;
  }

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

