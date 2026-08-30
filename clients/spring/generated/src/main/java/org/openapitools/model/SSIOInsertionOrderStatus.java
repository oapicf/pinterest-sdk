package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SSIO insertion order status item in a list response.
 */

@Schema(name = "SSIOInsertionOrderStatus", description = "SSIO insertion order status item in a list response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOInsertionOrderStatus {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> creationTime = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String pinOrderId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String status;

  public SSIOInsertionOrderStatus creationTime(String creationTime) {
    this.creationTime = JsonNullable.of(creationTime);
    return this;
  }

  /**
   * Salesforce insertion order creation time
   * @return creationTime
   */
  
  @Schema(name = "creation_time", example = "2017-06-21T23:11:11.000Z", description = "Salesforce insertion order creation time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creation_time")
  public JsonNullable<String> getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(JsonNullable<String> creationTime) {
    this.creationTime = creationTime;
  }

  public SSIOInsertionOrderStatus pinOrderId(@Nullable String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

  /**
   * Salesforce order id
   * @return pinOrderId
   */
  
  @Schema(name = "pin_order_id", example = "0Q01N0000015hekSAB", description = "Salesforce order id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_order_id")
  public @Nullable String getPinOrderId() {
    return pinOrderId;
  }

  @JsonProperty("pin_order_id")
  public void setPinOrderId(@Nullable String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  public SSIOInsertionOrderStatus status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Salesforce insertion order status
   * @return status
   */
  
  @Schema(name = "status", example = "Approved", description = "Salesforce insertion order status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrderStatus ssIOInsertionOrderStatus = (SSIOInsertionOrderStatus) o;
    return equalsNullable(this.creationTime, ssIOInsertionOrderStatus.creationTime) &&
        Objects.equals(this.pinOrderId, ssIOInsertionOrderStatus.pinOrderId) &&
        Objects.equals(this.status, ssIOInsertionOrderStatus.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(creationTime), pinOrderId, status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderStatus {\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

