package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOAccountAddress  {
  
  @ApiModelProperty(example = "475 Brannan Street, San Francisco, CA 94103", value = "Address display")
 /**
   * Address display
  **/
  private String display;

  @ApiModelProperty(example = "Billing", value = "Purpose for which the address is used, usually Billing or Businness")
 /**
   * Purpose for which the address is used, usually Billing or Businness
  **/
  private String purpose;

  @ApiModelProperty(example = "a1C1N000004MUrLUAW", value = "Salesforce id for address")
 /**
   * Salesforce id for address
  **/
  private String addressId;

  @ApiModelProperty(example = "PIN US OU", value = "Legal entity for this insertion order")
 /**
   * Legal entity for this insertion order
  **/
  private String orderLegalEntity;
 /**
   * Address display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public SSIOAccountAddress display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Purpose for which the address is used, usually Billing or Businness
   * @return purpose
  **/
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SSIOAccountAddress purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
   * Salesforce id for address
   * @return addressId
  **/
  @JsonProperty("address_id")
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public SSIOAccountAddress addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

 /**
   * Legal entity for this insertion order
   * @return orderLegalEntity
  **/
  @JsonProperty("order_legal_entity")
  public String getOrderLegalEntity() {
    return orderLegalEntity;
  }

  public void setOrderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
  }

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

