package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * SSIO insertion order status response for a single pin order id lookup.
 */
public class SSIOInsertionOrderStatusResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Salesforce insertion order creation time
   */
  @JsonProperty("creation_time")
  private String creationTime;

  /**
   * Salesforce order id
   */
  @JsonProperty("pin_order_id")
  private String pinOrderId;

  /**
   * Salesforce insertion order status
   */
  @JsonProperty("status")
  private String status;

  /**
   * Salesforce insertion order creation time
   * @return creationTime
   */
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Salesforce order id
   * @return pinOrderId
   */
  public String getPinOrderId() {
    return pinOrderId;
  }

  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * Salesforce insertion order status
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
    SSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse = (SSIOInsertionOrderStatusResponse) o;
    return Objects.equals(this.creationTime, ssIOInsertionOrderStatusResponse.creationTime) &&
        Objects.equals(this.pinOrderId, ssIOInsertionOrderStatusResponse.pinOrderId) &&
        Objects.equals(this.status, ssIOInsertionOrderStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, pinOrderId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderStatusResponse {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
