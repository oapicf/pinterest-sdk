package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CartingRetailer implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier for the retailer
   */
  @JsonProperty("retailer_id")
  private String retailerId;

  /**
   * Name of the retailer
   */
  @JsonProperty("retailer_name")
  private String retailerName;

  /**
   * Unique identifier for the retailer
   * @return retailerId
   */
  public String getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  /**
   * Name of the retailer
   * @return retailerName
   */
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
