package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SSIOInsertionOrderStatusResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOInsertionOrderStatusResponse {

  private String pinOrderId;

  private String status;

  private JsonNullable<String> creationTime = JsonNullable.<String>undefined();

  public SSIOInsertionOrderStatusResponse pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

  /**
   * Salesforce order id
   * @return pinOrderId
  */
  
  @Schema(name = "pin_order_id", example = "0Q01N0000015hekSAB", description = "Salesforce order id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }

  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  public SSIOInsertionOrderStatusResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Salesforce insertion order status
   * @return status
  */
  
  @Schema(name = "status", example = "Approved", description = "Salesforce insertion order status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SSIOInsertionOrderStatusResponse creationTime(String creationTime) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse = (SSIOInsertionOrderStatusResponse) o;
    return Objects.equals(this.pinOrderId, ssIOInsertionOrderStatusResponse.pinOrderId) &&
        Objects.equals(this.status, ssIOInsertionOrderStatusResponse.status) &&
        equalsNullable(this.creationTime, ssIOInsertionOrderStatusResponse.creationTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinOrderId, status, hashCodeNullable(creationTime));
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
    sb.append("class SSIOInsertionOrderStatusResponse {\n");
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

