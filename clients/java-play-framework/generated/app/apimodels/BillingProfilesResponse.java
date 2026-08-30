package apimodels;

import apimodels.BillingProfileCardType;
import apimodels.BillingProfilePaymentMethodBrand;
import apimodels.BillingProfileStatus;
import apimodels.BillingType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BillingProfilesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BillingProfilesResponse   {
  @JsonProperty("advertiser_id")
  @Pattern(regexp="^\\d+$")

  private String advertiserId;

  @JsonProperty("billing_type")
  @Valid

  private BillingType billingType;

  @JsonProperty("card_type")
  @Valid

  private BillingProfileCardType cardType;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("payment_method_brand")
  @Valid

  private BillingProfilePaymentMethodBrand paymentMethodBrand;

  @JsonProperty("status")
  @Valid

  private BillingProfileStatus status;

  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID of the billing.
   * @return advertiserId
  **/
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
    return Objects.equals(advertiserId, billingProfilesResponse.advertiserId) &&
        Objects.equals(billingType, billingProfilesResponse.billingType) &&
        Objects.equals(cardType, billingProfilesResponse.cardType) &&
        Objects.equals(id, billingProfilesResponse.id) &&
        Objects.equals(paymentMethodBrand, billingProfilesResponse.paymentMethodBrand) &&
        Objects.equals(status, billingProfilesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, billingType, cardType, id, paymentMethodBrand, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

