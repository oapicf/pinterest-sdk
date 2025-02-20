package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOInsertionOrderStatus  {
  
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
  */
  @ApiModelProperty(example = "2017-06-21T23:11:11.000Z", value = "Salesforce insertion order creation time")
  private String creationTime;
 /**
  * Salesforce order id
  * @return pinOrderId
  */
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }

  /**
   * Sets the <code>pinOrderId</code> property.
   */
 public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * Sets the <code>pinOrderId</code> property.
   */
  public SSIOInsertionOrderStatus pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

 /**
  * Salesforce insertion order status
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public SSIOInsertionOrderStatus status(String status) {
    this.status = status;
    return this;
  }

 /**
  * Salesforce insertion order creation time
  * @return creationTime
  */
  @JsonProperty("creation_time")
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Sets the <code>creationTime</code> property.
   */
 public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Sets the <code>creationTime</code> property.
   */
  public SSIOInsertionOrderStatus creationTime(String creationTime) {
    this.creationTime = creationTime;
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
    return Objects.equals(this.pinOrderId, ssIOInsertionOrderStatus.pinOrderId) &&
        Objects.equals(this.status, ssIOInsertionOrderStatus.status) &&
        Objects.equals(this.creationTime, ssIOInsertionOrderStatus.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinOrderId, status, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderStatus {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

