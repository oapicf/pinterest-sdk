/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingRetailer   {
  
  private String retailerId;
  private String retailerName;

  /**
   * Unique identifier for the retailer
   */
  public CartingRetailer retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier for the retailer")
  @JsonProperty("retailer_id")
  public String getRetailerId() {
    return retailerId;
  }
  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  /**
   * Name of the retailer
   */
  public CartingRetailer retailerName(String retailerName) {
    this.retailerName = retailerName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the retailer")
  @JsonProperty("retailer_name")
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
    return Objects.equals(retailerId, cartingRetailer.retailerId) &&
        Objects.equals(retailerName, cartingRetailer.retailerName);
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

