package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdsCreditDiscountType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdsCreditDiscountsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsCreditDiscountsResponse   {
  private Boolean active;
  private String advertiserId;
  private String discountCurrency;
  private BigDecimal discountInMicroCurrency;
  private AdsCreditDiscountType discountType;
  private BigDecimal remainingDiscountInMicroCurrency;
  private String title;

  public AdsCreditDiscountsResponse() {
  }

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

  @JsonProperty("active")
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
   @Pattern(regexp="^\\d+$")public String getAdvertiserId() {
    return advertiserId;
  }

  @JsonProperty("advertiser_id")
  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
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

  @JsonProperty("discountCurrency")
  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  /**
   * The discount applied in the offer&#39;s currency value.
   **/
  public AdsCreditDiscountsResponse discountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "125000000", value = "The discount applied in the offer's currency value.")
  @JsonProperty("discountInMicroCurrency")
  @Valid public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }

  @JsonProperty("discountInMicroCurrency")
  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  /**
   * The type of discount of this credit
   **/
  public AdsCreditDiscountsResponse discountType(AdsCreditDiscountType discountType) {
    this.discountType = discountType;
    return this;
  }

  
  @ApiModelProperty(value = "The type of discount of this credit")
  @JsonProperty("discountType")
  public AdsCreditDiscountType getDiscountType() {
    return discountType;
  }

  @JsonProperty("discountType")
  public void setDiscountType(AdsCreditDiscountType discountType) {
    this.discountType = discountType;
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
  @Valid public BigDecimal getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }

  @JsonProperty("remainingDiscountInMicroCurrency")
  public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
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

  @JsonProperty("title")
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
