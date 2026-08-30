package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CartingRetailer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CartingRetailer   {
  @JsonProperty("retailer_id")
  @NotNull

  private String retailerId;

  @JsonProperty("retailer_name")
  @NotNull

  private String retailerName;

  public CartingRetailer retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Unique identifier for the retailer
   * @return retailerId
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

