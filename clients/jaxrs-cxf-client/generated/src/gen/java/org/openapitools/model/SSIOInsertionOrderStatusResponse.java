package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOInsertionOrderStatusResponse  {
  
  @ApiModelProperty(example = "0Q01N0000015hekSAB", value = "Salesforce order id")
 /**
   * Salesforce order id
  **/
  private String pinOrderId;

  @ApiModelProperty(example = "Approved", value = "Salesforce insertion order status")
 /**
   * Salesforce insertion order status
  **/
  private String status;

  @ApiModelProperty(example = "2017-06-21T23:11:11.000Z", value = "Salesforce insertion order creation time")
 /**
   * Salesforce insertion order creation time
  **/
  private String creationTime;
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

  public SSIOInsertionOrderStatusResponse pinOrderId(String pinOrderId) {
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

  public SSIOInsertionOrderStatusResponse status(String status) {
    this.status = status;
    return this;
  }

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

  public SSIOInsertionOrderStatusResponse creationTime(String creationTime) {
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
    SSIOInsertionOrderStatusResponse ssIOInsertionOrderStatusResponse = (SSIOInsertionOrderStatusResponse) o;
    return Objects.equals(this.pinOrderId, ssIOInsertionOrderStatusResponse.pinOrderId) &&
        Objects.equals(this.status, ssIOInsertionOrderStatusResponse.status) &&
        Objects.equals(this.creationTime, ssIOInsertionOrderStatusResponse.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinOrderId, status, creationTime);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

