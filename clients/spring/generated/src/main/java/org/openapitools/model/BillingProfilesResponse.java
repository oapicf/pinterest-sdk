package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillingProfilesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BillingProfilesResponse {

  private @Nullable String advertiserId;

  /**
   * Billing type of the advertiser
   */
  public enum BillingTypeEnum {
    CREDIT_CARD("CREDIT_CARD"),
    
    INVOICE("INVOICE"),
    
    INTERNAL("INTERNAL"),
    
    RECURRING("RECURRING"),
    
    PREPAID("PREPAID");

    private final String value;

    BillingTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BillingTypeEnum fromValue(String value) {
      for (BillingTypeEnum b : BillingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable BillingTypeEnum billingType;

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

    private final String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable CardTypeEnum cardType;

  private @Nullable String id;

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

    private final String value;

    PaymentMethodBrandEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable PaymentMethodBrandEnum paymentMethodBrand;

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

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable StatusEnum status;

  public BillingProfilesResponse advertiserId(@Nullable String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Advertiser ID of the billing.
   * @return advertiserId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "advertiser_id", example = "12312451231", description = "Advertiser ID of the billing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advertiser_id")
  public @Nullable String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(@Nullable String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public BillingProfilesResponse billingType(@Nullable BillingTypeEnum billingType) {
    this.billingType = billingType;
    return this;
  }

  /**
   * Billing type of the advertiser
   * @return billingType
   */
  
  @Schema(name = "billing_type", example = "CREDIT_CARD", description = "Billing type of the advertiser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_type")
  public @Nullable BillingTypeEnum getBillingType() {
    return billingType;
  }

  public void setBillingType(@Nullable BillingTypeEnum billingType) {
    this.billingType = billingType;
  }

  public BillingProfilesResponse cardType(@Nullable CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Type of the card.
   * @return cardType
   */
  
  @Schema(name = "card_type", example = "VISA", description = "Type of the card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card_type")
  public @Nullable CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(@Nullable CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public BillingProfilesResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Billing ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "12312451231", description = "Billing ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public BillingProfilesResponse paymentMethodBrand(@Nullable PaymentMethodBrandEnum paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

  /**
   * Brand of the payment method.
   * @return paymentMethodBrand
   */
  
  @Schema(name = "payment_method_brand", example = "VISA", description = "Brand of the payment method.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment_method_brand")
  public @Nullable PaymentMethodBrandEnum getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  public void setPaymentMethodBrand(@Nullable PaymentMethodBrandEnum paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
  }

  public BillingProfilesResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the billing.
   * @return status
   */
  
  @Schema(name = "status", example = "INVALID", description = "Status of the billing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

