package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Salesforce address information.
 */

@Schema(name = "SSIOAccountAddress", description = "Salesforce address information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOAccountAddress {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String addressId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String display;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String orderLegalEntity;

  @JsonInclude(JsonInclude.Include.NON_NULL)
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

  @JsonProperty("address_id")
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

  @JsonProperty("display")
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

  @JsonProperty("order_legal_entity")
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

  @JsonProperty("purpose")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

