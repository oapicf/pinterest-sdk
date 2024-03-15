package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingProfilesResponse   {
  
  private String id;


  public enum CardTypeEnum {
    UNKNOWN("UNKNOWN"),
    VISA("VISA"),
    MASTERCARD("MASTERCARD"),
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    DISCOVER("DISCOVER"),
    ELO("ELO");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CardTypeEnum cardType;


  public enum StatusEnum {
    UNSPECIFIED("UNSPECIFIED"),
    VALID("VALID"),
    INVALID("INVALID"),
    PENDING("PENDING"),
    DELETED("DELETED"),
    SECONDARY("SECONDARY"),
    PENDING_SECONDARY("PENDING_SECONDARY");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status;
  private String advertiserId;


  public enum PaymentMethodBrandEnum {
    UNKNOWN("UNKNOWN"),
    VISA("VISA"),
    MASTERCARD("MASTERCARD"),
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    DISCOVER("DISCOVER"),
    SOFORT("SOFORT"),
    DINERS_CLUB("DINERS_CLUB"),
    ELO("ELO"),
    CARTE_BANCAIRE("CARTE_BANCAIRE");

    private String value;

    PaymentMethodBrandEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PaymentMethodBrandEnum paymentMethodBrand;

  public BillingProfilesResponse () {

  }

  public BillingProfilesResponse (String id, CardTypeEnum cardType, StatusEnum status, String advertiserId, PaymentMethodBrandEnum paymentMethodBrand) {
    this.id = id;
    this.cardType = cardType;
    this.status = status;
    this.advertiserId = advertiserId;
    this.paymentMethodBrand = paymentMethodBrand;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("card_type")
  public CardTypeEnum getCardType() {
    return cardType;
  }
  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

    
  @JsonProperty("payment_method_brand")
  public PaymentMethodBrandEnum getPaymentMethodBrand() {
    return paymentMethodBrand;
  }
  public void setPaymentMethodBrand(PaymentMethodBrandEnum paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
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
    return Objects.equals(id, billingProfilesResponse.id) &&
        Objects.equals(cardType, billingProfilesResponse.cardType) &&
        Objects.equals(status, billingProfilesResponse.status) &&
        Objects.equals(advertiserId, billingProfilesResponse.advertiserId) &&
        Objects.equals(paymentMethodBrand, billingProfilesResponse.paymentMethodBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardType, status, advertiserId, paymentMethodBrand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingProfilesResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
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
