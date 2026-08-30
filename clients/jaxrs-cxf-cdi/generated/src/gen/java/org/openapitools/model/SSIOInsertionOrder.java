package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An SSIO insertion order.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An SSIO insertion order.")
public class SSIOInsertionOrder   {
  
  private String pinOrderId;

  /**
   * Salesforce order id
   **/
  public SSIOInsertionOrder pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

  
  @ApiModelProperty(example = "9991h00000046NyCAI", value = "Salesforce order id")
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrder ssIOInsertionOrder = (SSIOInsertionOrder) o;
    return Objects.equals(this.pinOrderId, ssIOInsertionOrder.pinOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrder {\n");
    
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
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

