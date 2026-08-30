package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.BillingProfileCardType;
import org.openapitools.vertxweb.server.model.BillingProfilePaymentMethodBrand;
import org.openapitools.vertxweb.server.model.BillingProfileStatus;
import org.openapitools.vertxweb.server.model.BillingType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingProfilesResponse   {
  
  private String advertiserId;
  private BillingType billingType;
  private BillingProfileCardType cardType;
  private String id;
  private BillingProfilePaymentMethodBrand paymentMethodBrand;
  private BillingProfileStatus status;

  public BillingProfilesResponse () {

  }

  public BillingProfilesResponse (String advertiserId, BillingType billingType, BillingProfileCardType cardType, String id, BillingProfilePaymentMethodBrand paymentMethodBrand, BillingProfileStatus status) {
    this.advertiserId = advertiserId;
    this.billingType = billingType;
    this.cardType = cardType;
    this.id = id;
    this.paymentMethodBrand = paymentMethodBrand;
    this.status = status;
  }

    
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

    
  @JsonProperty("billing_type")
  public BillingType getBillingType() {
    return billingType;
  }
  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

    
  @JsonProperty("card_type")
  public BillingProfileCardType getCardType() {
    return cardType;
  }
  public void setCardType(BillingProfileCardType cardType) {
    this.cardType = cardType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("payment_method_brand")
  public BillingProfilePaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }
  public void setPaymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

    
  @JsonProperty("status")
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
