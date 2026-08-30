package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Salesforce address information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOAccountAddress   {
  @JsonProperty("address_id")
  
  private String addressId;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("order_legal_entity")
  
  private String orderLegalEntity;

  @JsonProperty("purpose")
  
  private String purpose;

  public SSIOAccountAddress addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Salesforce id for address
   * @return addressId
  **/
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public SSIOAccountAddress display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Address display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public SSIOAccountAddress orderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
    return this;
  }

   /**
   * Legal entity for this insertion order
   * @return orderLegalEntity
  **/
  public String getOrderLegalEntity() {
    return orderLegalEntity;
  }

  public void setOrderLegalEntity(String orderLegalEntity) {
    this.orderLegalEntity = orderLegalEntity;
  }

  public SSIOAccountAddress purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose for which the address is used, usually Billing or Businness
   * @return purpose
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

