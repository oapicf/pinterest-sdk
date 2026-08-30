package org.openapitools.model;

import org.openapitools.model.BillingProfileCardType;
import org.openapitools.model.BillingProfilePaymentMethodBrand;
import org.openapitools.model.BillingProfileStatus;
import org.openapitools.model.BillingType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BillingProfilesResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Advertiser ID of the billing.
   */
  @JsonProperty("advertiser_id")
  private String advertiserId;

  /**
   * Billing type of the advertiser
   */
  @JsonProperty("billing_type")
  private BillingType billingType;

  /**
   * Type of the card.
   */
  @JsonProperty("card_type")
  private BillingProfileCardType cardType;

  /**
   * Billing ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Brand of the payment method.
   */
  @JsonProperty("payment_method_brand")
  private BillingProfilePaymentMethodBrand paymentMethodBrand;

  /**
   * Status of the billing.
   */
  @JsonProperty("status")
  private BillingProfileStatus status;

  /**
   * Advertiser ID of the billing.
   * @return advertiserId
   */
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * Billing type of the advertiser
   * @return billingType
   */
  public BillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

  /**
   * Type of the card.
   * @return cardType
   */
  public BillingProfileCardType getCardType() {
    return cardType;
  }

  public void setCardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
  }

  /**
   * Billing ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Brand of the payment method.
   * @return paymentMethodBrand
   */
  public BillingProfilePaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  public void setPaymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  /**
   * Status of the billing.
   * @return status
   */
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
