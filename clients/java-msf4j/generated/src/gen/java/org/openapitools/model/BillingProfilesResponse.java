package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BillingProfileCardType;
import org.openapitools.model.BillingProfilePaymentMethodBrand;
import org.openapitools.model.BillingProfileStatus;
import org.openapitools.model.BillingType;

/**
 * BillingProfilesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingProfilesResponse   {
  @JsonProperty("advertiser_id")
  private String advertiserId;

  @JsonProperty("billing_type")
  private BillingType billingType;

  @JsonProperty("card_type")
  private BillingProfileCardType cardType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("payment_method_brand")
  private BillingProfilePaymentMethodBrand paymentMethodBrand;

  @JsonProperty("status")
  private BillingProfileStatus status;

  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID of the billing.
   * @return advertiserId
  **/
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public BillingProfilesResponse billingType(BillingType billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Billing type of the advertiser
   * @return billingType
  **/
  @ApiModelProperty(example = "CREDIT_CARD", value = "Billing type of the advertiser")
  public BillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

  public BillingProfilesResponse cardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Type of the card.
   * @return cardType
  **/
  @ApiModelProperty(example = "VISA", value = "Type of the card.")
  public BillingProfileCardType getCardType() {
    return cardType;
  }

  public void setCardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
  }

  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Billing ID.
   * @return id
  **/
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingProfilesResponse paymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

   /**
   * Brand of the payment method.
   * @return paymentMethodBrand
  **/
  @ApiModelProperty(example = "VISA", value = "Brand of the payment method.")
  public BillingProfilePaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  public void setPaymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  public BillingProfilesResponse status(BillingProfileStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the billing.
   * @return status
  **/
  @ApiModelProperty(example = "INVALID", value = "Status of the billing.")
  public BillingProfileStatus getStatus() {
    return status;
  }

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

