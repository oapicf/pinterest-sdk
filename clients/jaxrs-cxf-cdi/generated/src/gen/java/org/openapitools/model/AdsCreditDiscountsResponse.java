package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AdsCreditDiscountsResponse   {
  
  private Boolean active;

  private String advertiserId;


public enum DiscountTypeEnum {

    @JsonProperty("COUPON") COUPON(String.valueOf("COUPON")), @JsonProperty("CREDIT") CREDIT(String.valueOf("CREDIT")), @JsonProperty("COUPON_APPLIED") COUPON_APPLIED(String.valueOf("COUPON_APPLIED")), @JsonProperty("CREDIT_APPLIED") CREDIT_APPLIED(String.valueOf("CREDIT_APPLIED")), @JsonProperty("MARKETING_OFFER_CREDIT") MARKETING_OFFER_CREDIT(String.valueOf("MARKETING_OFFER_CREDIT")), @JsonProperty("MARKETING_OFFER_CREDIT_APPLIED") MARKETING_OFFER_CREDIT_APPLIED(String.valueOf("MARKETING_OFFER_CREDIT_APPLIED")), @JsonProperty("GOODWILL_CREDIT") GOODWILL_CREDIT(String.valueOf("GOODWILL_CREDIT")), @JsonProperty("GOODWILL_CREDIT_APPLIED") GOODWILL_CREDIT_APPLIED(String.valueOf("GOODWILL_CREDIT_APPLIED")), @JsonProperty("INTERNAL_CREDIT") INTERNAL_CREDIT(String.valueOf("INTERNAL_CREDIT")), @JsonProperty("INTERNAL_CREDIT_APPLIED") INTERNAL_CREDIT_APPLIED(String.valueOf("INTERNAL_CREDIT_APPLIED")), @JsonProperty("PREPAID_CREDIT") PREPAID_CREDIT(String.valueOf("PREPAID_CREDIT")), @JsonProperty("PREPAID_CREDIT_APPLIED") PREPAID_CREDIT_APPLIED(String.valueOf("PREPAID_CREDIT_APPLIED")), @JsonProperty("SALES_INCENTIVE_CREDIT") SALES_INCENTIVE_CREDIT(String.valueOf("SALES_INCENTIVE_CREDIT")), @JsonProperty("SALES_INCENTIVE_CREDIT_APPLIED") SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("SALES_INCENTIVE_CREDIT_APPLIED")), @JsonProperty("CREDIT_EXPIRED") CREDIT_EXPIRED(String.valueOf("CREDIT_EXPIRED")), @JsonProperty("FUTURE_CREDIT") FUTURE_CREDIT(String.valueOf("FUTURE_CREDIT")), @JsonProperty("REFERRAL_CREDIT") REFERRAL_CREDIT(String.valueOf("REFERRAL_CREDIT")), @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT") INVOICE_SALES_INCENTIVE_CREDIT(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT")), @JsonProperty("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED") INVOICE_SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED")), @JsonProperty("PREPAID_CREDIT_REFUND") PREPAID_CREDIT_REFUND(String.valueOf("PREPAID_CREDIT_REFUND")), @JsonProperty("null") NULL(String.valueOf("null"));


    private String value;

    DiscountTypeEnum(String v) {
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

  private DiscountTypeEnum discountType;

  private BigDecimal discountInMicroCurrency;

  private String discountCurrency;

  private String title;

  private BigDecimal remainingDiscountInMicroCurrency;

  /**
   * True if the offer code is currently active.
   **/
  public AdsCreditDiscountsResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "True if the offer code is currently active.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   * Advertiser ID the offer was applied to.
   **/
  public AdsCreditDiscountsResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID the offer was applied to.")
  @JsonProperty("advertiser_id")
 @Pattern(regexp="^\\d+$")  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  /**
   * The type of discount of this credit
   **/
  public AdsCreditDiscountsResponse discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

  
  @ApiModelProperty(value = "The type of discount of this credit")
  @JsonProperty("discountType")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }
  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }


  /**
   * The discount applied in the offer’s currency value.
   **/
  public AdsCreditDiscountsResponse discountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "125000000", value = "The discount applied in the offer’s currency value.")
  @JsonProperty("discountInMicroCurrency")
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }
  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }


  /**
   * Currency value for the discount.
   **/
  public AdsCreditDiscountsResponse discountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "USD", value = "Currency value for the discount.")
  @JsonProperty("discountCurrency")
  public String getDiscountCurrency() {
    return discountCurrency;
  }
  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }


  /**
   * Human readable title of the offer code.
   **/
  public AdsCreditDiscountsResponse title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "Ads Credits", value = "Human readable title of the offer code.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The credits left to spend.
   **/
  public AdsCreditDiscountsResponse remainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "125000000", value = "The credits left to spend.")
  @JsonProperty("remainingDiscountInMicroCurrency")
  public BigDecimal getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }
  public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

