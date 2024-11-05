package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdsCreditDiscountsResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdsCreditDiscountsResponse   {
  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("advertiser_id")
  private String advertiserId;

  /**
   * The type of discount of this credit
   */
  public enum DiscountTypeEnum {
    COUPON("COUPON"),
    
    CREDIT("CREDIT"),
    
    COUPON_APPLIED("COUPON_APPLIED"),
    
    CREDIT_APPLIED("CREDIT_APPLIED"),
    
    MARKETING_OFFER_CREDIT("MARKETING_OFFER_CREDIT"),
    
    MARKETING_OFFER_CREDIT_APPLIED("MARKETING_OFFER_CREDIT_APPLIED"),
    
    GOODWILL_CREDIT("GOODWILL_CREDIT"),
    
    GOODWILL_CREDIT_APPLIED("GOODWILL_CREDIT_APPLIED"),
    
    INTERNAL_CREDIT("INTERNAL_CREDIT"),
    
    INTERNAL_CREDIT_APPLIED("INTERNAL_CREDIT_APPLIED"),
    
    PREPAID_CREDIT("PREPAID_CREDIT"),
    
    PREPAID_CREDIT_APPLIED("PREPAID_CREDIT_APPLIED"),
    
    SALES_INCENTIVE_CREDIT("SALES_INCENTIVE_CREDIT"),
    
    SALES_INCENTIVE_CREDIT_APPLIED("SALES_INCENTIVE_CREDIT_APPLIED"),
    
    CREDIT_EXPIRED("CREDIT_EXPIRED"),
    
    FUTURE_CREDIT("FUTURE_CREDIT"),
    
    REFERRAL_CREDIT("REFERRAL_CREDIT"),
    
    INVOICE_SALES_INCENTIVE_CREDIT("INVOICE_SALES_INCENTIVE_CREDIT"),
    
    INVOICE_SALES_INCENTIVE_CREDIT_APPLIED("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"),
    
    PREPAID_CREDIT_REFUND("PREPAID_CREDIT_REFUND");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiscountTypeEnum fromValue(String text) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("discountType")
  private DiscountTypeEnum discountType;

  @JsonProperty("discountInMicroCurrency")
  private BigDecimal discountInMicroCurrency;

  @JsonProperty("discountCurrency")
  private String discountCurrency;

  @JsonProperty("title")
  private String title;

  @JsonProperty("remainingDiscountInMicroCurrency")
  private BigDecimal remainingDiscountInMicroCurrency;

  public AdsCreditDiscountsResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * True if the offer code is currently active.
   * @return active
   */
  @ApiModelProperty(example = "true", value = "True if the offer code is currently active.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AdsCreditDiscountsResponse advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Advertiser ID the offer was applied to.
   * @return advertiserId
   */
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID the offer was applied to.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdsCreditDiscountsResponse discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * The type of discount of this credit
   * @return discountType
   */
  @ApiModelProperty(value = "The type of discount of this credit")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public AdsCreditDiscountsResponse discountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
    return this;
  }

  /**
   * The discount applied in the offer’s currency value.
   * @return discountInMicroCurrency
   */
  @ApiModelProperty(example = "125000000", value = "The discount applied in the offer’s currency value.")
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }

  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  public AdsCreditDiscountsResponse discountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
    return this;
  }

  /**
   * Currency value for the discount.
   * @return discountCurrency
   */
  @ApiModelProperty(example = "USD", value = "Currency value for the discount.")
  public String getDiscountCurrency() {
    return discountCurrency;
  }

  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  public AdsCreditDiscountsResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Human readable title of the offer code.
   * @return title
   */
  @ApiModelProperty(example = "Ads Credits", value = "Human readable title of the offer code.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdsCreditDiscountsResponse remainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
    return this;
  }

  /**
   * The credits left to spend.
   * @return remainingDiscountInMicroCurrency
   */
  @ApiModelProperty(example = "125000000", value = "The credits left to spend.")
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

