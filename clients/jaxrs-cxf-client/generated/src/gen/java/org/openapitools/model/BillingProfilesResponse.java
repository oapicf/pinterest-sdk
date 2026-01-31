package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillingProfilesResponse  {
  
 /**
  * Advertiser ID of the billing.
  */
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")

  private String advertiserId;

public enum BillingTypeEnum {

CREDIT_CARD(String.valueOf("CREDIT_CARD")), INVOICE(String.valueOf("INVOICE")), INTERNAL(String.valueOf("INTERNAL")), RECURRING(String.valueOf("RECURRING")), PREPAID(String.valueOf("PREPAID"));


    private String value;

    BillingTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BillingTypeEnum fromValue(String value) {
        for (BillingTypeEnum b : BillingTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Billing type of the advertiser
  */
  @ApiModelProperty(example = "CREDIT_CARD", value = "Billing type of the advertiser")

  private BillingTypeEnum billingType;

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

 /**
  * Type of the card.
  */
  @ApiModelProperty(example = "VISA", value = "Type of the card.")

  private CardTypeEnum cardType;

 /**
  * Billing ID.
  */
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")

  private String id;

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

 /**
  * Brand of the payment method.
  */
  @ApiModelProperty(example = "VISA", value = "Brand of the payment method.")

  private PaymentMethodBrandEnum paymentMethodBrand;

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

 /**
  * Status of the billing.
  */
  @ApiModelProperty(example = "INVALID", value = "Status of the billing.")

  private StatusEnum status;
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
  public String getBillingType() {
    if (billingType == null) {
      return null;
    }
    return billingType.value();
  }

  public void setBillingType(BillingTypeEnum billingType) {
    this.billingType = billingType;
  }

  public BillingProfilesResponse billingType(BillingTypeEnum billingType) {
    this.billingType = billingType;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

