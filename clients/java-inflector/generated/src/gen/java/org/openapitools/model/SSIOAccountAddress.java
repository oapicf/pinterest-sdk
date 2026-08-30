package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Salesforce address information.
 **/

@ApiModel(description = "Salesforce address information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOAccountAddress   {
  @JsonProperty("address_id")
  private String addressId;

  @JsonProperty("display")
  private String display;

  @JsonProperty("order_legal_entity")
  private String orderLegalEntity;

  @JsonProperty("purpose")
  private String purpose;

  /**
   * Salesforce id for address
   **/
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
   * Address display
   **/
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
   * Legal entity for this insertion order
   **/
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

  /**
   * Purpose for which the address is used, usually Billing or Businness
   **/
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOAccountAddress ssIOAccountAddress = (SSIOAccountAddress) o;
    return Objects.equals(addressId, ssIOAccountAddress.addressId) &&
        Objects.equals(display, ssIOAccountAddress.display) &&
        Objects.equals(orderLegalEntity, ssIOAccountAddress.orderLegalEntity) &&
        Objects.equals(purpose, ssIOAccountAddress.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, display, orderLegalEntity, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountAddress {\n");
    
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    orderLegalEntity: ").append(toIndentedString(orderLegalEntity)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

