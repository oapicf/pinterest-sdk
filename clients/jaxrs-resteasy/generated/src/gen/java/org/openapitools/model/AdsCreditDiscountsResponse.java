package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdsCreditDiscountType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsCreditDiscountsResponse   {
  
  private Boolean active;
  private String advertiserId;
  private String discountCurrency;
  private BigDecimal discountInMicroCurrency;
  private AdsCreditDiscountType discountType;
  private BigDecimal remainingDiscountInMicroCurrency;
  private String title;

  /**
   * True if the offer code is currently active.
   **/
  
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
  
  @ApiModelProperty(example = "12312451231", value = "Advertiser ID the offer was applied to.")
  @JsonProperty("advertiser_id")
 @Pattern(regexp="^\\d+$")  public String getAdvertiserId() {
    return advertiserId;
  }
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  /**
   * Currency value for the discount.
   **/
  
  @ApiModelProperty(example = "USD", value = "Currency value for the discount.")
  @JsonProperty("discountCurrency")
  public String getDiscountCurrency() {
    return discountCurrency;
  }
  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  /**
   * The discount applied in the offer&#39;s currency value.
   **/
  
  @ApiModelProperty(example = "125000000", value = "The discount applied in the offer's currency value.")
  @JsonProperty("discountInMicroCurrency")
  @Valid
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }
  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  /**
   * The type of discount of this credit
   **/
  
  @ApiModelProperty(value = "The type of discount of this credit")
  @JsonProperty("discountType")
  @Valid
  public AdsCreditDiscountType getDiscountType() {
    return discountType;
  }
  public void setDiscountType(AdsCreditDiscountType discountType) {
    this.discountType = discountType;
  }

  /**
   * The credits left to spend.
   **/
  
  @ApiModelProperty(example = "125000000", value = "The credits left to spend.")
  @JsonProperty("remainingDiscountInMicroCurrency")
  @Valid
  public BigDecimal getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }
  public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
  }

  /**
   * Human readable title of the offer code.
   **/
  
  @ApiModelProperty(example = "Ads Credits", value = "Human readable title of the offer code.")
  @JsonProperty("title")
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

