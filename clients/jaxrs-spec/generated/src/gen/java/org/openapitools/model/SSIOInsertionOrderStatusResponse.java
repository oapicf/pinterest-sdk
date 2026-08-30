package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SSIO insertion order status response for a single pin order id lookup.
 **/
@ApiModel(description = "SSIO insertion order status response for a single pin order id lookup.")
@JsonTypeName("SSIOInsertionOrderStatusResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOInsertionOrderStatusResponse   {
  private String creationTime;
  private String pinOrderId;
  private String status;

  public SSIOInsertionOrderStatusResponse() {
  }

  /**
   * Salesforce insertion order creation time
   **/
  public SSIOInsertionOrderStatusResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  
  @ApiModelProperty(example = "2017-06-21T23:11:11.000Z", value = "Salesforce insertion order creation time")
  @JsonProperty("creation_time")
  public String getCreationTime() {
    return creationTime;
  }

  @JsonProperty("creation_time")
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Salesforce order id
   **/
  public SSIOInsertionOrderStatusResponse pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

  
  @ApiModelProperty(example = "0Q01N0000015hekSAB", value = "Salesforce order id")
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }

  @JsonProperty("pin_order_id")
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * Salesforce insertion order status
   **/
  public SSIOInsertionOrderStatusResponse status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "Approved", value = "Salesforce insertion order status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
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
