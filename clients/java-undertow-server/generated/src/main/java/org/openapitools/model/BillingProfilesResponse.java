/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

  /**
   * Billing ID.
   */
  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Type of the card.
   */
  public BillingProfilesResponse cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

  
  @ApiModelProperty(example = "VISA", value = "Type of the card.")
  @JsonProperty("card_type")
  public CardTypeEnum getCardType() {
    return cardType;
  }
  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  /**
   * Status of the billing.
   */
  public BillingProfilesResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "INVALID", value = "Status of the billing.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Advertiser ID of the billing.
   */
  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * Brand of the payment method.
   */
  public BillingProfilesResponse paymentMethodBrand(PaymentMethodBrandEnum paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

  
  @ApiModelProperty(example = "VISA", value = "Brand of the payment method.")
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

