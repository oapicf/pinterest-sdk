package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSIO insertion order status item in a list response.
 */
@ApiModel(description="SSIO insertion order status item in a list response.")

public class SSIOInsertionOrderStatus  {
  
 /**
  * Salesforce insertion order creation time
  */
  @ApiModelProperty(example = "2017-06-21T23:11:11.000Z", value = "Salesforce insertion order creation time")

  private String creationTime;

 /**
  * Salesforce order id
  */
  @ApiModelProperty(example = "0Q01N0000015hekSAB", value = "Salesforce order id")

  private String pinOrderId;

 /**
  * Salesforce insertion order status
  */
  @ApiModelProperty(example = "Approved", value = "Salesforce insertion order status")

  private String status;
 /**
   * Salesforce insertion order creation time
   * @return creationTime
  **/
  @JsonProperty("creation_time")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public SSIOInsertionOrderStatus creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

 /**
   * Salesforce order id
   * @return pinOrderId
  **/
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }

  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  public SSIOInsertionOrderStatus pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

 /**
   * Salesforce insertion order status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SSIOInsertionOrderStatus status(String status) {
    this.status = status;
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
    SSIOInsertionOrderStatus ssIOInsertionOrderStatus = (SSIOInsertionOrderStatus) o;
    return Objects.equals(this.creationTime, ssIOInsertionOrderStatus.creationTime) &&
        Objects.equals(this.pinOrderId, ssIOInsertionOrderStatus.pinOrderId) &&
        Objects.equals(this.status, ssIOInsertionOrderStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, pinOrderId, status);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

