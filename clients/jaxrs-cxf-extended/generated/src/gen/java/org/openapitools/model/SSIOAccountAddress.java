package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOAccountAddress  {
  
 /**
  * Address display
  */
  @ApiModelProperty(example = "475 Brannan Street, San Francisco, CA 94103", value = "Address display")
  private String display;

 /**
  * Purpose for which the address is used, usually Billing or Businness
  */
  @ApiModelProperty(example = "Billing", value = "Purpose for which the address is used, usually Billing or Businness")
  private String purpose;

 /**
  * Salesforce id for address
  */
  @ApiModelProperty(example = "a1C1N000004MUrLUAW", value = "Salesforce id for address")
  private String addressId;

 /**
  * Legal entity for this insertion order
  */
  @ApiModelProperty(example = "PIN US OU", value = "Legal entity for this insertion order")
  private String orderLegalEntity;
 /**
  * Address display
  * @return display
  */
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  /**
   * Sets the <code>display</code> property.
   */
 public void setDisplay(String display) {
    this.display = display;
  }

  /**
   * Sets the <code>display</code> property.
   */
  public SSIOAccountAddress display(String display) {
    this.display = display;
    return this;
  }

 /**
  * Purpose for which the address is used, usually Billing or Businness
  * @return purpose
  */
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  /**
   * Sets the <code>purpose</code> property.
   */
 public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * Sets the <code>purpose</code> property.
   */
  public SSIOAccountAddress purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
  * Salesforce id for address
  * @return addressId
  */
  @JsonProperty("address_id")
  public String getAddressId() {
    return addressId;
  }

  /**
   * Sets the <code>addressId</code> property.
   */
 public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  /**
   * Sets the <code>addressId</code> property.
   */
  public SSIOAccountAddress addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

 /**
  * Legal entity for this insertion order
  * @return orderLegalEntity
  */
  @JsonProperty("order_legal_entity")
  public String getOrderLegalEntity() {
    return orderLegalEntity;
  }

  /**
   * Sets the <code>orderLegalEntity</code> property.
   */
 public void setOrderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
  }

  /**
   * Sets the <code>orderLegalEntity</code> property.
   */
  public SSIOAccountAddress orderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
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
    SSIOAccountAddress ssIOAccountAddress = (SSIOAccountAddress) o;
    return Objects.equals(this.display, ssIOAccountAddress.display) &&
        Objects.equals(this.purpose, ssIOAccountAddress.purpose) &&
        Objects.equals(this.addressId, ssIOAccountAddress.addressId) &&
        Objects.equals(this.orderLegalEntity, ssIOAccountAddress.orderLegalEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, purpose, addressId, orderLegalEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountAddress {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    orderLegalEntity: ").append(toIndentedString(orderLegalEntity)).append("\n");
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

