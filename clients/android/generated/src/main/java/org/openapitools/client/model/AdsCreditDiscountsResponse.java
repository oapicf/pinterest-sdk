/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AdsCreditDiscountsResponse {
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("advertiser_id")
  private String advertiserId = null;
  public enum DiscountTypeEnum {
     COUPON,  CREDIT,  COUPON_APPLIED,  CREDIT_APPLIED,  MARKETING_OFFER_CREDIT,  MARKETING_OFFER_CREDIT_APPLIED,  GOODWILL_CREDIT,  GOODWILL_CREDIT_APPLIED,  INTERNAL_CREDIT,  INTERNAL_CREDIT_APPLIED,  PREPAID_CREDIT,  PREPAID_CREDIT_APPLIED,  SALES_INCENTIVE_CREDIT,  SALES_INCENTIVE_CREDIT_APPLIED,  CREDIT_EXPIRED,  FUTURE_CREDIT,  REFERRAL_CREDIT,  INVOICE_SALES_INCENTIVE_CREDIT,  INVOICE_SALES_INCENTIVE_CREDIT_APPLIED,  PREPAID_CREDIT_REFUND,  , 
  };
  @SerializedName("discountType")
  private DiscountTypeEnum discountType = null;
  @SerializedName("discountInMicroCurrency")
  private BigDecimal discountInMicroCurrency = null;
  @SerializedName("discountCurrency")
  private String discountCurrency = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("remainingDiscountInMicroCurrency")
  private BigDecimal remainingDiscountInMicroCurrency = null;

  /**
   * True if the offer code is currently active.
   **/
  @ApiModelProperty(value = "True if the offer code is currently active.")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * Advertiser ID the offer was applied to.
   **/
  @ApiModelProperty(value = "Advertiser ID the offer was applied to.")
  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * The type of discount of this credit
   **/
  @ApiModelProperty(value = "The type of discount of this credit")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }
  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  /**
   * The discount applied in the offer’s currency value.
   **/
  @ApiModelProperty(value = "The discount applied in the offer’s currency value.")
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }
  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  /**
   * Currency value for the discount.
   **/
  @ApiModelProperty(value = "Currency value for the discount.")
  public String getDiscountCurrency() {
    return discountCurrency;
  }
  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  /**
   * Human readable title of the offer code.
   **/
  @ApiModelProperty(value = "Human readable title of the offer code.")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The credits left to spend.
   **/
  @ApiModelProperty(value = "The credits left to spend.")
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
    return (this.active == null ? adsCreditDiscountsResponse.active == null : this.active.equals(adsCreditDiscountsResponse.active)) &&
        (this.advertiserId == null ? adsCreditDiscountsResponse.advertiserId == null : this.advertiserId.equals(adsCreditDiscountsResponse.advertiserId)) &&
        (this.discountType == null ? adsCreditDiscountsResponse.discountType == null : this.discountType.equals(adsCreditDiscountsResponse.discountType)) &&
        (this.discountInMicroCurrency == null ? adsCreditDiscountsResponse.discountInMicroCurrency == null : this.discountInMicroCurrency.equals(adsCreditDiscountsResponse.discountInMicroCurrency)) &&
        (this.discountCurrency == null ? adsCreditDiscountsResponse.discountCurrency == null : this.discountCurrency.equals(adsCreditDiscountsResponse.discountCurrency)) &&
        (this.title == null ? adsCreditDiscountsResponse.title == null : this.title.equals(adsCreditDiscountsResponse.title)) &&
        (this.remainingDiscountInMicroCurrency == null ? adsCreditDiscountsResponse.remainingDiscountInMicroCurrency == null : this.remainingDiscountInMicroCurrency.equals(adsCreditDiscountsResponse.remainingDiscountInMicroCurrency));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.advertiserId == null ? 0: this.advertiserId.hashCode());
    result = 31 * result + (this.discountType == null ? 0: this.discountType.hashCode());
    result = 31 * result + (this.discountInMicroCurrency == null ? 0: this.discountInMicroCurrency.hashCode());
    result = 31 * result + (this.discountCurrency == null ? 0: this.discountCurrency.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.remainingDiscountInMicroCurrency == null ? 0: this.remainingDiscountInMicroCurrency.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditDiscountsResponse {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  advertiserId: ").append(advertiserId).append("\n");
    sb.append("  discountType: ").append(discountType).append("\n");
    sb.append("  discountInMicroCurrency: ").append(discountInMicroCurrency).append("\n");
    sb.append("  discountCurrency: ").append(discountCurrency).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  remainingDiscountInMicroCurrency: ").append(remainingDiscountInMicroCurrency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}