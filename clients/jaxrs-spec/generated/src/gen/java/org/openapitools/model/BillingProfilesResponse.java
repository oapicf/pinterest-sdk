package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("BillingProfilesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BillingProfilesResponse   {
  private @Valid String id;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CardTypeEnum fromString(String s) {
        for (CardTypeEnum b : CardTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid CardTypeEnum cardType;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StatusEnum fromString(String s) {
        for (StatusEnum b : StatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid StatusEnum status;
  private @Valid String advertiserId;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static PaymentMethodBrandEnum fromString(String s) {
        for (PaymentMethodBrandEnum b : PaymentMethodBrandEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid PaymentMethodBrandEnum paymentMethodBrand;

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

  @JsonProperty("id")
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

  @JsonProperty("card_type")
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

  @JsonProperty("status")
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

  @JsonProperty("advertiser_id")
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

  @JsonProperty("payment_method_brand")
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

