package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An SSIO insertion order.
 */
@ApiModel(description="An SSIO insertion order.")

public class SSIOInsertionOrder  {
  
 /**
  * Salesforce order id
  */
  @ApiModelProperty(example = "9991h00000046NyCAI", value = "Salesforce order id")
  private String pinOrderId;
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
   * <br><em>N.B. <code>pinOrderId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * Sets the <code>pinOrderId</code> property.
   * <br><em>N.B. <code>pinOrderId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SSIOInsertionOrder pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

