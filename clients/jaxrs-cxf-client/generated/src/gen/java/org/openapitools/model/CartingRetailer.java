package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CartingRetailer  {
  
 /**
  * Unique identifier for the retailer
  */
  @ApiModelProperty(required = true, value = "Unique identifier for the retailer")

  private String retailerId;

 /**
  * Name of the retailer
  */
  @ApiModelProperty(required = true, value = "Name of the retailer")

  private String retailerName;
 /**
   * Unique identifier for the retailer
   * @return retailerId
  **/
  @JsonProperty("retailer_id")
  public String getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  public CartingRetailer retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

 /**
   * Name of the retailer
   * @return retailerName
  **/
  @JsonProperty("retailer_name")
  public String getRetailerName() {
    return retailerName;
  }

  public void setRetailerName(String retailerName) {
    this.retailerName = retailerName;
  }

  public CartingRetailer retailerName(String retailerName) {
    this.retailerName = retailerName;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

