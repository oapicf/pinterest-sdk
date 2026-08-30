package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdsCreditDiscountType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdsCreditDiscountsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * True if the offer code is currently active.
   */
  @JsonProperty("active")
  private Boolean active;

  /**
   * Advertiser ID the offer was applied to.
   */
  @JsonProperty("advertiser_id")
  private String advertiserId;

  /**
   * Currency value for the discount.
   */
  @JsonProperty("discountCurrency")
  private String discountCurrency;

  /**
   * The discount applied in the offer&#39;s currency value.
   */
  @JsonProperty("discountInMicroCurrency")
  private BigDecimal discountInMicroCurrency;

  /**
   * The type of discount of this credit
   */
  @JsonProperty("discountType")
  private AdsCreditDiscountType discountType;

  /**
   * The credits left to spend.
   */
  @JsonProperty("remainingDiscountInMicroCurrency")
  private BigDecimal remainingDiscountInMicroCurrency;

  /**
   * Human readable title of the offer code.
   */
  @JsonProperty("title")
  private String title;

  /**
   * True if the offer code is currently active.
   * @return active
   */
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * Advertiser ID the offer was applied to.
   * @return advertiserId
   */
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * Currency value for the discount.
   * @return discountCurrency
   */
  public String getDiscountCurrency() {
    return discountCurrency;
  }

  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  /**
   * The discount applied in the offer&#39;s currency value.
   * @return discountInMicroCurrency
   */
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }

  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  /**
   * The type of discount of this credit
   * @return discountType
   */
  public AdsCreditDiscountType getDiscountType() {
    return discountType;
  }

  public void setDiscountType(AdsCreditDiscountType discountType) {
    this.discountType = discountType;
  }

  /**
   * The credits left to spend.
   * @return remainingDiscountInMicroCurrency
   */
  public BigDecimal getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }

  public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
  }

  /**
   * Human readable title of the offer code.
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
