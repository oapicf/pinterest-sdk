package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SSIOAccountAddress
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOAccountAddress   {
  @JsonProperty("display")
  private String display;

  @JsonProperty("purpose")
  private String purpose;

  @JsonProperty("address_id")
  private String addressId;

  @JsonProperty("order_legal_entity")
  private String orderLegalEntity;

  public SSIOAccountAddress display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Address display
   * @return display
  **/
  @ApiModelProperty(example = "475 Brannan Street, San Francisco, CA 94103", value = "Address display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public SSIOAccountAddress purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose for which the address is used, usually Billing or Businness
   * @return purpose
  **/
  @ApiModelProperty(example = "Billing", value = "Purpose for which the address is used, usually Billing or Businness")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SSIOAccountAddress addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Salesforce id for address
   * @return addressId
  **/
  @ApiModelProperty(example = "a1C1N000004MUrLUAW", value = "Salesforce id for address")
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public SSIOAccountAddress orderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
    return this;
  }

   /**
   * Legal entity for this insertion order
   * @return orderLegalEntity
  **/
  @ApiModelProperty(example = "PIN US OU", value = "Legal entity for this insertion order")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

