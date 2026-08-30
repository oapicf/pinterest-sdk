package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BillingProfileCardType;
import org.openapitools.model.BillingProfilePaymentMethodBrand;
import org.openapitools.model.BillingProfileStatus;
import org.openapitools.model.BillingType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BillingProfilesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingProfilesResponse   {
  private String advertiserId;
  private BillingType billingType;
  private BillingProfileCardType cardType;
  private String id;
  private BillingProfilePaymentMethodBrand paymentMethodBrand;
  private BillingProfileStatus status;

  public BillingProfilesResponse() {
  }

  /**
   * Advertiser ID of the billing.
   **/
  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")
  @JsonProperty("advertiser_id")
   @Pattern(regexp="^\\d+$")public String getAdvertiserId() {
    return advertiserId;
  }

  @JsonProperty("advertiser_id")
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * Billing type of the advertiser
   **/
  public BillingProfilesResponse billingType(BillingType billingType) {
    this.billingType = billingType;
    return this;
  }

  
  @ApiModelProperty(example = "CREDIT_CARD", value = "Billing type of the advertiser")
  @JsonProperty("billing_type")
  public BillingType getBillingType() {
    return billingType;
  }

  @JsonProperty("billing_type")
  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

  /**
   * Type of the card.
   **/
  public BillingProfilesResponse cardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
    return this;
  }

  
  @ApiModelProperty(example = "VISA", value = "Type of the card.")
  @JsonProperty("card_type")
  public BillingProfileCardType getCardType() {
    return cardType;
  }

  @JsonProperty("card_type")
  public void setCardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
  }

  /**
   * Billing ID.
   **/
  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")
  @JsonProperty("id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Brand of the payment method.
   **/
  public BillingProfilesResponse paymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

  
  @ApiModelProperty(example = "VISA", value = "Brand of the payment method.")
  @JsonProperty("payment_method_brand")
  public BillingProfilePaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  @JsonProperty("payment_method_brand")
  public void setPaymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  /**
   * Status of the billing.
   **/
  public BillingProfilesResponse status(BillingProfileStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "INVALID", value = "Status of the billing.")
  @JsonProperty("status")
  public BillingProfileStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(BillingProfileStatus status) {
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
    BillingProfilesResponse billingProfilesResponse = (BillingProfilesResponse) o;
    return Objects.equals(this.advertiserId, billingProfilesResponse.advertiserId) &&
        Objects.equals(this.billingType, billingProfilesResponse.billingType) &&
        Objects.equals(this.cardType, billingProfilesResponse.cardType) &&
        Objects.equals(this.id, billingProfilesResponse.id) &&
        Objects.equals(this.paymentMethodBrand, billingProfilesResponse.paymentMethodBrand) &&
        Objects.equals(this.status, billingProfilesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, billingType, cardType, id, paymentMethodBrand, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingProfilesResponse {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
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
