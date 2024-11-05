package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsCreditDiscountsResponse  {
  
  @ApiModelProperty(example = "true", value = "True if the offer code is currently active.")
 /**
   * True if the offer code is currently active.
  **/
  private Boolean active;

  @ApiModelProperty(example = "12312451231", value = "Advertiser ID the offer was applied to.")
 /**
   * Advertiser ID the offer was applied to.
  **/
  private String advertiserId;

public enum DiscountTypeEnum {

COUPON(String.valueOf("COUPON")), CREDIT(String.valueOf("CREDIT")), COUPON_APPLIED(String.valueOf("COUPON_APPLIED")), CREDIT_APPLIED(String.valueOf("CREDIT_APPLIED")), MARKETING_OFFER_CREDIT(String.valueOf("MARKETING_OFFER_CREDIT")), MARKETING_OFFER_CREDIT_APPLIED(String.valueOf("MARKETING_OFFER_CREDIT_APPLIED")), GOODWILL_CREDIT(String.valueOf("GOODWILL_CREDIT")), GOODWILL_CREDIT_APPLIED(String.valueOf("GOODWILL_CREDIT_APPLIED")), INTERNAL_CREDIT(String.valueOf("INTERNAL_CREDIT")), INTERNAL_CREDIT_APPLIED(String.valueOf("INTERNAL_CREDIT_APPLIED")), PREPAID_CREDIT(String.valueOf("PREPAID_CREDIT")), PREPAID_CREDIT_APPLIED(String.valueOf("PREPAID_CREDIT_APPLIED")), SALES_INCENTIVE_CREDIT(String.valueOf("SALES_INCENTIVE_CREDIT")), SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("SALES_INCENTIVE_CREDIT_APPLIED")), CREDIT_EXPIRED(String.valueOf("CREDIT_EXPIRED")), FUTURE_CREDIT(String.valueOf("FUTURE_CREDIT")), REFERRAL_CREDIT(String.valueOf("REFERRAL_CREDIT")), INVOICE_SALES_INCENTIVE_CREDIT(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT")), INVOICE_SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED")), PREPAID_CREDIT_REFUND(String.valueOf("PREPAID_CREDIT_REFUND"));


    private String value;

    DiscountTypeEnum (String v) {
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
    public static DiscountTypeEnum fromValue(String value) {
        for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The type of discount of this credit")
 /**
   * The type of discount of this credit
  **/
  private DiscountTypeEnum discountType;

  @ApiModelProperty(example = "125000000", value = "The discount applied in the offer’s currency value.")
  @Valid
 /**
   * The discount applied in the offer’s currency value.
  **/
  private BigDecimal discountInMicroCurrency;

  @ApiModelProperty(example = "USD", value = "Currency value for the discount.")
 /**
   * Currency value for the discount.
  **/
  private String discountCurrency;

  @ApiModelProperty(example = "Ads Credits", value = "Human readable title of the offer code.")
 /**
   * Human readable title of the offer code.
  **/
  private String title;

  @ApiModelProperty(example = "125000000", value = "The credits left to spend.")
  @Valid
 /**
   * The credits left to spend.
  **/
  private BigDecimal remainingDiscountInMicroCurrency;
 /**
   * True if the offer code is currently active.
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AdsCreditDiscountsResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Advertiser ID the offer was applied to.
   * @return advertiserId
  **/
  @JsonProperty("advertiser_id")
 @Pattern(regexp="^\\d+$")  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdsCreditDiscountsResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

 /**
   * The type of discount of this credit
   * @return discountType
  **/
  @JsonProperty("discountType")
  public String getDiscountType() {
    if (discountType == null) {
      return null;
    }
    return discountType.value();
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public AdsCreditDiscountsResponse discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

 /**
   * The discount applied in the offer’s currency value.
   * @return discountInMicroCurrency
  **/
  @JsonProperty("discountInMicroCurrency")
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }

  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  public AdsCreditDiscountsResponse discountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
    return this;
  }

 /**
   * Currency value for the discount.
   * @return discountCurrency
  **/
  @JsonProperty("discountCurrency")
  public String getDiscountCurrency() {
    return discountCurrency;
  }

  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  public AdsCreditDiscountsResponse discountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
    return this;
  }

 /**
   * Human readable title of the offer code.
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdsCreditDiscountsResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * The credits left to spend.
   * @return remainingDiscountInMicroCurrency
  **/
  @JsonProperty("remainingDiscountInMicroCurrency")
  public BigDecimal getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }

  public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
  }

  public AdsCreditDiscountsResponse remainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
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
    AdsCreditDiscountsResponse adsCreditDiscountsResponse = (AdsCreditDiscountsResponse) o;
    return Objects.equals(this.active, adsCreditDiscountsResponse.active) &&
        Objects.equals(this.advertiserId, adsCreditDiscountsResponse.advertiserId) &&
        Objects.equals(this.discountType, adsCreditDiscountsResponse.discountType) &&
        Objects.equals(this.discountInMicroCurrency, adsCreditDiscountsResponse.discountInMicroCurrency) &&
        Objects.equals(this.discountCurrency, adsCreditDiscountsResponse.discountCurrency) &&
        Objects.equals(this.title, adsCreditDiscountsResponse.title) &&
        Objects.equals(this.remainingDiscountInMicroCurrency, adsCreditDiscountsResponse.remainingDiscountInMicroCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, advertiserId, discountType, discountInMicroCurrency, discountCurrency, title, remainingDiscountInMicroCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditDiscountsResponse {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountInMicroCurrency: ").append(toIndentedString(discountInMicroCurrency)).append("\n");
    sb.append("    discountCurrency: ").append(toIndentedString(discountCurrency)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    remainingDiscountInMicroCurrency: ").append(toIndentedString(remainingDiscountInMicroCurrency)).append("\n");
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

