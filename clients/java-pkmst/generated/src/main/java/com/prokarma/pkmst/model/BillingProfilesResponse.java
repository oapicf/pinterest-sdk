package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BillingProfilesResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BillingProfilesResponse   {
  @JsonProperty("id")
  private String id;

  /**
   * Type of the card.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardTypeEnum fromValue(String text) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("card_type")
  private CardTypeEnum cardType;

  /**
   * Status of the billing.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("advertiser_id")
  private String advertiserId;

  /**
   * Brand of the payment method.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodBrandEnum fromValue(String text) {
      for (PaymentMethodBrandEnum b : PaymentMethodBrandEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("payment_method_brand")
  private PaymentMethodBrandEnum paymentMethodBrand;

  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Billing ID.
   * @return id
   */
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingProfilesResponse cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Type of the card.
   * @return cardType
   */
  @ApiModelProperty(example = "VISA", value = "Type of the card.")
  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public BillingProfilesResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the billing.
   * @return status
   */
  @ApiModelProperty(example = "INVALID", value = "Status of the billing.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Advertiser ID of the billing.
   * @return advertiserId
   */
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public BillingProfilesResponse paymentMethodBrand(PaymentMethodBrandEnum paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

  /**
   * Brand of the payment method.
   * @return paymentMethodBrand
   */
  @ApiModelProperty(example = "VISA", value = "Brand of the payment method.")
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
    return Objects.equals(this.id, billingProfilesResponse.id) &&
        Objects.equals(this.cardType, billingProfilesResponse.cardType) &&
        Objects.equals(this.status, billingProfilesResponse.status) &&
        Objects.equals(this.advertiserId, billingProfilesResponse.advertiserId) &&
        Objects.equals(this.paymentMethodBrand, billingProfilesResponse.paymentMethodBrand);
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

