package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BillingProfilesResponse   {
  
  private String id;


public enum CardTypeEnum {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("VISA") VISA(String.valueOf("VISA")), @JsonProperty("MASTERCARD") MASTERCARD(String.valueOf("MASTERCARD")), @JsonProperty("AMERICAN_EXPRESS") AMERICAN_EXPRESS(String.valueOf("AMERICAN_EXPRESS")), @JsonProperty("DISCOVER") DISCOVER(String.valueOf("DISCOVER")), @JsonProperty("ELO") ELO(String.valueOf("ELO"));


    private String value;

    CardTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CardTypeEnum fromValue(String value) {
        for (CardTypeEnum b : CardTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CardTypeEnum cardType;


public enum StatusEnum {

    @JsonProperty("UNSPECIFIED") UNSPECIFIED(String.valueOf("UNSPECIFIED")), @JsonProperty("VALID") VALID(String.valueOf("VALID")), @JsonProperty("INVALID") INVALID(String.valueOf("INVALID")), @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("DELETED") DELETED(String.valueOf("DELETED")), @JsonProperty("SECONDARY") SECONDARY(String.valueOf("SECONDARY")), @JsonProperty("PENDING_SECONDARY") PENDING_SECONDARY(String.valueOf("PENDING_SECONDARY"));


    private String value;

    StatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;

  private String advertiserId;


public enum PaymentMethodBrandEnum {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("VISA") VISA(String.valueOf("VISA")), @JsonProperty("MASTERCARD") MASTERCARD(String.valueOf("MASTERCARD")), @JsonProperty("AMERICAN_EXPRESS") AMERICAN_EXPRESS(String.valueOf("AMERICAN_EXPRESS")), @JsonProperty("DISCOVER") DISCOVER(String.valueOf("DISCOVER")), @JsonProperty("SOFORT") SOFORT(String.valueOf("SOFORT")), @JsonProperty("DINERS_CLUB") DINERS_CLUB(String.valueOf("DINERS_CLUB")), @JsonProperty("ELO") ELO(String.valueOf("ELO")), @JsonProperty("CARTE_BANCAIRE") CARTE_BANCAIRE(String.valueOf("CARTE_BANCAIRE"));


    private String value;

    PaymentMethodBrandEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentMethodBrandEnum fromValue(String value) {
        for (PaymentMethodBrandEnum b : PaymentMethodBrandEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private PaymentMethodBrandEnum paymentMethodBrand;

  /**
   * Billing ID.
   **/
  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Type of the card.
   **/
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
   **/
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
   **/
  public BillingProfilesResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")
  @JsonProperty("advertiser_id")
 @Pattern(regexp="^\\d+$")  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  /**
   * Brand of the payment method.
   **/
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

