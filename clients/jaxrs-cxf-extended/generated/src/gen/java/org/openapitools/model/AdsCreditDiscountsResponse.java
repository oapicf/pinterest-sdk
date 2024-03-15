package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsCreditDiscountsResponse  {
  
 /**
  * True if the offer code is currently active.
  */
  @ApiModelProperty(example = "true", value = "True if the offer code is currently active.")
  private Boolean active;

 /**
  * Advertiser ID the offer was applied to.
  */
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID the offer was applied to.")
  private String advertiserId;

public enum DiscountTypeEnum {

    @JsonProperty("COUPON") COUPON(String.valueOf("COUPON")),
    @JsonProperty("CREDIT") CREDIT(String.valueOf("CREDIT")),
    @JsonProperty("COUPON_APPLIED") COUPON_APPLIED(String.valueOf("COUPON_APPLIED")),
    @JsonProperty("CREDIT_APPLIED") CREDIT_APPLIED(String.valueOf("CREDIT_APPLIED")),
    @JsonProperty("MARKETING_OFFER_CREDIT") MARKETING_OFFER_CREDIT(String.valueOf("MARKETING_OFFER_CREDIT")),
    @JsonProperty("MARKETING_OFFER_CREDIT_APPLIED") MARKETING_OFFER_CREDIT_APPLIED(String.valueOf("MARKETING_OFFER_CREDIT_APPLIED")),
    @JsonProperty("GOODWILL_CREDIT") GOODWILL_CREDIT(String.valueOf("GOODWILL_CREDIT")),
    @JsonProperty("GOODWILL_CREDIT_APPLIED") GOODWILL_CREDIT_APPLIED(String.valueOf("GOODWILL_CREDIT_APPLIED")),
    @JsonProperty("INTERNAL_CREDIT") INTERNAL_CREDIT(String.valueOf("INTERNAL_CREDIT")),
    @JsonProperty("INTERNAL_CREDIT_APPLIED") INTERNAL_CREDIT_APPLIED(String.valueOf("INTERNAL_CREDIT_APPLIED")),
    @JsonProperty("PREPAID_CREDIT") PREPAID_CREDIT(String.valueOf("PREPAID_CREDIT")),
    @JsonProperty("PREPAID_CREDIT_APPLIED") PREPAID_CREDIT_APPLIED(String.valueOf("PREPAID_CREDIT_APPLIED")),
    @JsonProperty("SALES_INCENTIVE_CREDIT") SALES_INCENTIVE_CREDIT(String.valueOf("SALES_INCENTIVE_CREDIT")),
    @JsonProperty("SALES_INCENTIVE_CREDIT_APPLIED") SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("SALES_INCENTIVE_CREDIT_APPLIED")),
    @JsonProperty("CREDIT_EXPIRED") CREDIT_EXPIRED(String.valueOf("CREDIT_EXPIRED")),
    @JsonProperty("FUTURE_CREDIT") FUTURE_CREDIT(String.valueOf("FUTURE_CREDIT")),
    @JsonProperty("REFERRAL_CREDIT") REFERRAL_CREDIT(String.valueOf("REFERRAL_CREDIT")),
    @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT") INVOICE_SALES_INCENTIVE_CREDIT(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT")),
    @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED") INVOICE_SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED")),
    @JsonProperty("PREPAID_CREDIT_REFUND") PREPAID_CREDIT_REFUND(String.valueOf("PREPAID_CREDIT_REFUND")),
    @JsonProperty("null") NULL(String.valueOf("null"));

    private String value;

    DiscountTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiscountTypeEnum fromValue(String value) {
        for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * The type of discount of this credit
  */
  @ApiModelProperty(value = "The type of discount of this credit")
  private DiscountTypeEnum discountType;

 /**
  * The discount applied in the offer’s currency value.
  */
  @ApiModelProperty(example = "125000000", value = "The discount applied in the offer’s currency value.")
  @Valid
  private BigDecimal discountInMicroCurrency;

 /**
  * Currency value for the discount.
  */
  @ApiModelProperty(example = "USD", value = "Currency value for the discount.")
  private String discountCurrency;

 /**
  * Human readable title of the offer code.
  */
  @ApiModelProperty(example = "Ads Credits", value = "Human readable title of the offer code.")
  private String title;

 /**
  * The credits left to spend.
  */
  @ApiModelProperty(example = "125000000", value = "The credits left to spend.")
  @Valid
  private BigDecimal remainingDiscountInMicroCurrency;
 /**
  * True if the offer code is currently active.
  * @return active
  */
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  /**
   * Sets the <code>active</code> property.
   */
 public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * Sets the <code>active</code> property.
   */
  public AdsCreditDiscountsResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
  * Advertiser ID the offer was applied to.
  * @return advertiserId
  */
  @JsonProperty("advertiser_id")
 @Pattern(regexp="^\\d+$")  public String getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Sets the <code>advertiserId</code> property.
   */
 public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * Sets the <code>advertiserId</code> property.
   */
  public AdsCreditDiscountsResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

 /**
  * The type of discount of this credit
  * @return discountType
  */
  @JsonProperty("discountType")
  public String getDiscountType() {
    return discountType == null ? null : discountType.value();
  }

  /**
   * Sets the <code>discountType</code> property.
   */
 public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  /**
   * Sets the <code>discountType</code> property.
   */
  public AdsCreditDiscountsResponse discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

 /**
  * The discount applied in the offer’s currency value.
  * @return discountInMicroCurrency
  */
  @JsonProperty("discountInMicroCurrency")
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }

  /**
   * Sets the <code>discountInMicroCurrency</code> property.
   */
 public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  /**
   * Sets the <code>discountInMicroCurrency</code> property.
   */
  public AdsCreditDiscountsResponse discountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
    return this;
  }

 /**
  * Currency value for the discount.
  * @return discountCurrency
  */
  @JsonProperty("discountCurrency")
  public String getDiscountCurrency() {
    return discountCurrency;
  }

  /**
   * Sets the <code>discountCurrency</code> property.
   */
 public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  /**
   * Sets the <code>discountCurrency</code> property.
   */
  public AdsCreditDiscountsResponse discountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
    return this;
  }

 /**
  * Human readable title of the offer code.
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public AdsCreditDiscountsResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
  * The credits left to spend.
  * @return remainingDiscountInMicroCurrency
  */
  @JsonProperty("remainingDiscountInMicroCurrency")
  public BigDecimal getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }

  /**
   * Sets the <code>remainingDiscountInMicroCurrency</code> property.
   */
 public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
  }

  /**
   * Sets the <code>remainingDiscountInMicroCurrency</code> property.
   */
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

