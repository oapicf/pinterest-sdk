/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOAccountAddress   {
  
  private String display;
  private String purpose;
  private String addressId;
  private String orderLegalEntity;

  /**
   * Address display
   */
  public SSIOAccountAddress display(String display) {
    this.display = display;
    return this;
  }

  
  @ApiModelProperty(example = "475 Brannan Street, San Francisco, CA 94103", value = "Address display")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   * Purpose for which the address is used, usually Billing or Businness
   */
  public SSIOAccountAddress purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @ApiModelProperty(example = "Billing", value = "Purpose for which the address is used, usually Billing or Businness")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * Salesforce id for address
   */
  public SSIOAccountAddress addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

  
  @ApiModelProperty(example = "a1C1N000004MUrLUAW", value = "Salesforce id for address")
  @JsonProperty("address_id")
  public String getAddressId() {
    return addressId;
  }
  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  /**
   * Legal entity for this insertion order
   */
  public SSIOAccountAddress orderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
    return this;
  }

  
  @ApiModelProperty(example = "PIN US OU", value = "Legal entity for this insertion order")
  @JsonProperty("order_legal_entity")
  public String getOrderLegalEntity() {
    return orderLegalEntity;
  }
  public void setOrderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
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
    return Objects.equals(display, ssIOAccountAddress.display) &&
        Objects.equals(purpose, ssIOAccountAddress.purpose) &&
        Objects.equals(addressId, ssIOAccountAddress.addressId) &&
        Objects.equals(orderLegalEntity, ssIOAccountAddress.orderLegalEntity);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

