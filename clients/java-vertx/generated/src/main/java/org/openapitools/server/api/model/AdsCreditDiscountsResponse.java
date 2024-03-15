package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsCreditDiscountsResponse   {
  
  private Boolean active;
  private String advertiserId;


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
    PREPAID_CREDIT_REFUND("PREPAID_CREDIT_REFUND"),
    NULL("null");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DiscountTypeEnum discountType;
  private BigDecimal discountInMicroCurrency;
  private String discountCurrency;
  private String title;
  private BigDecimal remainingDiscountInMicroCurrency;

  public AdsCreditDiscountsResponse () {

  }

  public AdsCreditDiscountsResponse (Boolean active, String advertiserId, DiscountTypeEnum discountType, BigDecimal discountInMicroCurrency, String discountCurrency, String title, BigDecimal remainingDiscountInMicroCurrency) {
    this.active = active;
    this.advertiserId = advertiserId;
    this.discountType = discountType;
    this.discountInMicroCurrency = discountInMicroCurrency;
    this.discountCurrency = discountCurrency;
    this.title = title;
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
  }

    
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

    
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

    
  @JsonProperty("discountType")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }
  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

    
  @JsonProperty("discountInMicroCurrency")
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }
  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

    
  @JsonProperty("discountCurrency")
  public String getDiscountCurrency() {
    return discountCurrency;
  }
  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
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
    return Objects.equals(active, adsCreditDiscountsResponse.active) &&
        Objects.equals(advertiserId, adsCreditDiscountsResponse.advertiserId) &&
        Objects.equals(discountType, adsCreditDiscountsResponse.discountType) &&
        Objects.equals(discountInMicroCurrency, adsCreditDiscountsResponse.discountInMicroCurrency) &&
        Objects.equals(discountCurrency, adsCreditDiscountsResponse.discountCurrency) &&
        Objects.equals(title, adsCreditDiscountsResponse.title) &&
        Objects.equals(remainingDiscountInMicroCurrency, adsCreditDiscountsResponse.remainingDiscountInMicroCurrency);
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
