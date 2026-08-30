package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartingRetailer   {
  
  private String retailerId;
  private String retailerName;

  public CartingRetailer () {

  }

  public CartingRetailer (String retailerId, String retailerName) {
    this.retailerId = retailerId;
    this.retailerName = retailerName;
  }

    
  @JsonProperty("retailer_id")
  public String getRetailerId() {
    return retailerId;
  }
  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

    
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
