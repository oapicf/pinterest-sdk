package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CartingRetailer
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingRetailer {

  private String retailerId;

  private String retailerName;

  public CartingRetailer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CartingRetailer(String retailerId, String retailerName) {
    this.retailerId = retailerId;
    this.retailerName = retailerName;
  }

  public CartingRetailer retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

  /**
   * Unique identifier for the retailer
   * @return retailerId
   */
  @NotNull 
  @Schema(name = "retailer_id", description = "Unique identifier for the retailer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("retailer_id")
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
  @NotNull 
  @Schema(name = "retailer_name", description = "Name of the retailer", requiredMode = Schema.RequiredMode.REQUIRED)
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

