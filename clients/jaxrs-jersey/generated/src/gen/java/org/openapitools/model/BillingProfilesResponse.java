/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * BillingProfilesResponse
 */
@JsonPropertyOrder({
  BillingProfilesResponse.JSON_PROPERTY_ID,
  BillingProfilesResponse.JSON_PROPERTY_CARD_TYPE,
  BillingProfilesResponse.JSON_PROPERTY_STATUS,
  BillingProfilesResponse.JSON_PROPERTY_ADVERTISER_ID,
  BillingProfilesResponse.JSON_PROPERTY_PAYMENT_METHOD_BRAND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BillingProfilesResponse   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
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
    public static CardTypeEnum fromValue(String value) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CARD_TYPE = "card_type";
  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private StatusEnum status;

  public static final String JSON_PROPERTY_ADVERTISER_ID = "advertiser_id";
  @JsonProperty(JSON_PROPERTY_ADVERTISER_ID)
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
    public static PaymentMethodBrandEnum fromValue(String value) {
      for (PaymentMethodBrandEnum b : PaymentMethodBrandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_METHOD_BRAND = "payment_method_brand";
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_BRAND)
  private PaymentMethodBrandEnum paymentMethodBrand;

  public BillingProfilesResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Billing ID.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(example = "12312451231", value = "Billing ID.")
   @Pattern(regexp="^\\d+$")
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
   **/
  @JsonProperty(value = "card_type")
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
   **/
  @JsonProperty(value = "status")
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
   **/
  @JsonProperty(value = "advertiser_id")
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID of the billing.")
   @Pattern(regexp="^\\d+$")
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
   **/
  @JsonProperty(value = "payment_method_brand")
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

