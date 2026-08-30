package org.openapitools.model;

import org.openapitools.model.BillingProfileCardType;
import org.openapitools.model.BillingProfilePaymentMethodBrand;
import org.openapitools.model.BillingProfileStatus;
import org.openapitools.model.BillingType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillingProfilesResponse  {
  
 /**
  * Advertiser ID of the billing.
  */
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")

  private String advertiserId;

 /**
  * Billing type of the advertiser
  */
  @ApiModelProperty(example = "CREDIT_CARD", value = "Billing type of the advertiser")

  private BillingType billingType;

 /**
  * Type of the card.
  */
  @ApiModelProperty(example = "VISA", value = "Type of the card.")

  private BillingProfileCardType cardType;

 /**
  * Billing ID.
  */
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")

  private String id;

 /**
  * Brand of the payment method.
  */
  @ApiModelProperty(example = "VISA", value = "Brand of the payment method.")

  private BillingProfilePaymentMethodBrand paymentMethodBrand;

 /**
  * Status of the billing.
  */
  @ApiModelProperty(example = "INVALID", value = "Status of the billing.")

  private BillingProfileStatus status;
 /**
   * Advertiser ID of the billing.
   * @return advertiserId
  **/
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

 /**
   * Billing type of the advertiser
   * @return billingType
  **/
  @JsonProperty("billing_type")
  public BillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

  public BillingProfilesResponse billingType(BillingType billingType) {
    this.billingType = billingType;
    return this;
  }

 /**
   * Type of the card.
   * @return cardType
  **/
  @JsonProperty("card_type")
  public BillingProfileCardType getCardType() {
    return cardType;
  }

  public void setCardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
  }

  public BillingProfilesResponse cardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
    return this;
  }

 /**
   * Billing ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Brand of the payment method.
   * @return paymentMethodBrand
  **/
  @JsonProperty("payment_method_brand")
  public BillingProfilePaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  public void setPaymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  public BillingProfilesResponse paymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

 /**
   * Status of the billing.
   * @return status
  **/
  @JsonProperty("status")
  public BillingProfileStatus getStatus() {
    return status;
  }

  public void setStatus(BillingProfileStatus status) {
    this.status = status;
  }

  public BillingProfilesResponse status(BillingProfileStatus status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

