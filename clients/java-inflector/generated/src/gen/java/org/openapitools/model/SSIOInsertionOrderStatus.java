package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOInsertionOrderStatus   {
  @JsonProperty("pin_order_id")
  private String pinOrderId;

  @JsonProperty("status")
  private String status;

  @JsonProperty("creation_time")
  private String creationTime;

  /**
   * Salesforce order id
   **/
  public SSIOInsertionOrderStatus pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

  
  @ApiModelProperty(example = "0Q01N0000015hekSAB", value = "Salesforce order id")
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * Salesforce insertion order status
   **/
  public SSIOInsertionOrderStatus status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "Approved", value = "Salesforce insertion order status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Salesforce insertion order creation time
   **/
  public SSIOInsertionOrderStatus creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  
  @ApiModelProperty(example = "2017-06-21T23:11:11.000Z", value = "Salesforce insertion order creation time")
  @JsonProperty("creation_time")
  public String getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(String creationTime) {
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
    SSIOInsertionOrderStatus ssIOInsertionOrderStatus = (SSIOInsertionOrderStatus) o;
    return Objects.equals(pinOrderId, ssIOInsertionOrderStatus.pinOrderId) &&
        Objects.equals(status, ssIOInsertionOrderStatus.status) &&
        Objects.equals(creationTime, ssIOInsertionOrderStatus.creationTime);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

