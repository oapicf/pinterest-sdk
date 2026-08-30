package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Salesforce address information.
 */
public class SSIOAccountAddress implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Salesforce id for address
   */
  @JsonProperty("address_id")
  private String addressId;

  /**
   * Address display
   */
  @JsonProperty("display")
  private String display;

  /**
   * Legal entity for this insertion order
   */
  @JsonProperty("order_legal_entity")
  private String orderLegalEntity;

  /**
   * Purpose for which the address is used, usually Billing or Businness
   */
  @JsonProperty("purpose")
  private String purpose;

  /**
   * Salesforce id for address
   * @return addressId
   */
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  /**
   * Address display
   * @return display
   */
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   * Legal entity for this insertion order
   * @return orderLegalEntity
   */
  public String getOrderLegalEntity() {
    return orderLegalEntity;
  }

  public void setOrderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
  }

  /**
   * Purpose for which the address is used, usually Billing or Businness
   * @return purpose
   */
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
    return Objects.equals(this.addressId, ssIOAccountAddress.addressId) &&
        Objects.equals(this.display, ssIOAccountAddress.display) &&
        Objects.equals(this.orderLegalEntity, ssIOAccountAddress.orderLegalEntity) &&
        Objects.equals(this.purpose, ssIOAccountAddress.purpose);
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
