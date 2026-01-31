package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SSIOAccountAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SSIOAccountAddress {

  private @Nullable String addressId;

  private @Nullable String display;

  private @Nullable String orderLegalEntity;

  private @Nullable String purpose;

  public SSIOAccountAddress addressId(@Nullable String addressId) {
    this.addressId = addressId;
    return this;
  }

  /**
   * Salesforce id for address
   * @return addressId
   */
  
  @Schema(name = "address_id", example = "a1C1N000004MUrLUAW", description = "Salesforce id for address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address_id")
  public @Nullable String getAddressId() {
    return addressId;
  }

  public void setAddressId(@Nullable String addressId) {
    this.addressId = addressId;
  }

  public SSIOAccountAddress display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Address display
   * @return display
   */
  
  @Schema(name = "display", example = "475 Brannan Street, San Francisco, CA 94103", description = "Address display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public SSIOAccountAddress orderLegalEntity(@Nullable String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
    return this;
  }

  /**
   * Legal entity for this insertion order
   * @return orderLegalEntity
   */
  
  @Schema(name = "order_legal_entity", example = "PIN US OU", description = "Legal entity for this insertion order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_legal_entity")
  public @Nullable String getOrderLegalEntity() {
    return orderLegalEntity;
  }

  public void setOrderLegalEntity(@Nullable String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
  }

  public SSIOAccountAddress purpose(@Nullable String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Purpose for which the address is used, usually Billing or Businness
   * @return purpose
   */
  
  @Schema(name = "purpose", example = "Billing", description = "Purpose for which the address is used, usually Billing or Businness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purpose")
  public @Nullable String getPurpose() {
    return purpose;
  }

  public void setPurpose(@Nullable String purpose) {
    this.purpose = purpose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOAccountAddress ssIOAccountAddress = (SSIOAccountAddress) o;
    return Objects.equals(this.addressId, ssIOAccountAddress.addressId) &&
        Objects.equals(this.display, ssIOAccountAddress.display) &&
        Objects.equals(this.orderLegalEntity, ssIOAccountAddress.orderLegalEntity) &&
        Objects.equals(this.purpose, ssIOAccountAddress.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, display, orderLegalEntity, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountAddress {\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    orderLegalEntity: ").append(toIndentedString(orderLegalEntity)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

