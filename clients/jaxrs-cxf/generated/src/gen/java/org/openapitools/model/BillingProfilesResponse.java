package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillingProfilesResponse  {
  
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")
 /**
   * Billing ID.
  **/
  private String id;

public enum CardTypeEnum {

UNKNOWN(String.valueOf("UNKNOWN")), VISA(String.valueOf("VISA")), MASTERCARD(String.valueOf("MASTERCARD")), AMERICAN_EXPRESS(String.valueOf("AMERICAN_EXPRESS")), DISCOVER(String.valueOf("DISCOVER")), ELO(String.valueOf("ELO"));


    private String value;

    CardTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CardTypeEnum fromValue(String value) {
        for (CardTypeEnum b : CardTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "VISA", value = "Type of the card.")
 /**
   * Type of the card.
  **/
  private CardTypeEnum cardType;

public enum StatusEnum {

UNSPECIFIED(String.valueOf("UNSPECIFIED")), VALID(String.valueOf("VALID")), INVALID(String.valueOf("INVALID")), PENDING(String.valueOf("PENDING")), DELETED(String.valueOf("DELETED")), SECONDARY(String.valueOf("SECONDARY")), PENDING_SECONDARY(String.valueOf("PENDING_SECONDARY"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "INVALID", value = "Status of the billing.")
 /**
   * Status of the billing.
  **/
  private StatusEnum status;

  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")
 /**
   * Advertiser ID of the billing.
  **/
  private String advertiserId;

public enum PaymentMethodBrandEnum {

UNKNOWN(String.valueOf("UNKNOWN")), VISA(String.valueOf("VISA")), MASTERCARD(String.valueOf("MASTERCARD")), AMERICAN_EXPRESS(String.valueOf("AMERICAN_EXPRESS")), DISCOVER(String.valueOf("DISCOVER")), SOFORT(String.valueOf("SOFORT")), DINERS_CLUB(String.valueOf("DINERS_CLUB")), ELO(String.valueOf("ELO")), CARTE_BANCAIRE(String.valueOf("CARTE_BANCAIRE"));


    private String value;

    PaymentMethodBrandEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodBrandEnum fromValue(String value) {
        for (PaymentMethodBrandEnum b : PaymentMethodBrandEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "VISA", value = "Brand of the payment method.")
 /**
   * Brand of the payment method.
  **/
  private PaymentMethodBrandEnum paymentMethodBrand;
 /**
   * Billing ID.
   * @return id
  **/
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
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
   * Type of the card.
   * @return cardType
  **/
  @JsonProperty("card_type")
  public String getCardType() {
    if (cardType == null) {
      return null;
    }
    return cardType.value();
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public BillingProfilesResponse cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

 /**
   * Status of the billing.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BillingProfilesResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Advertiser ID of the billing.
   * @return advertiserId
  **/
  @JsonProperty("advertiser_id")
 @Pattern(regexp="^\\d+$")  public String getAdvertiserId() {
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
   * Brand of the payment method.
   * @return paymentMethodBrand
  **/
  @JsonProperty("payment_method_brand")
  public String getPaymentMethodBrand() {
    if (paymentMethodBrand == null) {
      return null;
    }
    return paymentMethodBrand.value();
  }

  public void setPaymentMethodBrand(PaymentMethodBrandEnum paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  public BillingProfilesResponse paymentMethodBrand(PaymentMethodBrandEnum paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

