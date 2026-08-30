package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdsCreditDiscountType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

 /**
  * Currency value for the discount.
  */
  @ApiModelProperty(example = "USD", value = "Currency value for the discount.")

  private String discountCurrency;

 /**
  * The discount applied in the offer's currency value.
  */
  @ApiModelProperty(example = "125000000", value = "The discount applied in the offer's currency value.")

  private BigDecimal discountInMicroCurrency;

 /**
  * The type of discount of this credit
  */
  @ApiModelProperty(value = "The type of discount of this credit")

  private AdsCreditDiscountType discountType;

 /**
  * The credits left to spend.
  */
  @ApiModelProperty(example = "125000000", value = "The credits left to spend.")

  private BigDecimal remainingDiscountInMicroCurrency;

 /**
  * Human readable title of the offer code.
  */
  @ApiModelProperty(example = "Ads Credits", value = "Human readable title of the offer code.")

  private String title;
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
  public String getAdvertiserId() {
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
   * The discount applied in the offer&#39;s currency value.
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
   * The type of discount of this credit
   * @return discountType
  **/
  @JsonProperty("discountType")
  public AdsCreditDiscountType getDiscountType() {
    return discountType;
  }

  public void setDiscountType(AdsCreditDiscountType discountType) {
    this.discountType = discountType;
  }

  public AdsCreditDiscountsResponse discountType(AdsCreditDiscountType discountType) {
    this.discountType = discountType;
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
        Objects.equals(this.discountCurrency, adsCreditDiscountsResponse.discountCurrency) &&
        Objects.equals(this.discountInMicroCurrency, adsCreditDiscountsResponse.discountInMicroCurrency) &&
        Objects.equals(this.discountType, adsCreditDiscountsResponse.discountType) &&
        Objects.equals(this.remainingDiscountInMicroCurrency, adsCreditDiscountsResponse.remainingDiscountInMicroCurrency) &&
        Objects.equals(this.title, adsCreditDiscountsResponse.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, advertiserId, discountCurrency, discountInMicroCurrency, discountType, remainingDiscountInMicroCurrency, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditDiscountsResponse {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    discountCurrency: ").append(toIndentedString(discountCurrency)).append("\n");
    sb.append("    discountInMicroCurrency: ").append(toIndentedString(discountInMicroCurrency)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    remainingDiscountInMicroCurrency: ").append(toIndentedString(remainingDiscountInMicroCurrency)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

