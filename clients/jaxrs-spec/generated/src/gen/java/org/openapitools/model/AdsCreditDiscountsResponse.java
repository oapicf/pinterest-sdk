package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdsCreditDiscountsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdsCreditDiscountsResponse   {
  private @Valid Boolean active;
  private @Valid String advertiserId;
  public enum DiscountTypeEnum {

    COUPON(String.valueOf("COUPON")), CREDIT(String.valueOf("CREDIT")), COUPON_APPLIED(String.valueOf("COUPON_APPLIED")), CREDIT_APPLIED(String.valueOf("CREDIT_APPLIED")), MARKETING_OFFER_CREDIT(String.valueOf("MARKETING_OFFER_CREDIT")), MARKETING_OFFER_CREDIT_APPLIED(String.valueOf("MARKETING_OFFER_CREDIT_APPLIED")), GOODWILL_CREDIT(String.valueOf("GOODWILL_CREDIT")), GOODWILL_CREDIT_APPLIED(String.valueOf("GOODWILL_CREDIT_APPLIED")), INTERNAL_CREDIT(String.valueOf("INTERNAL_CREDIT")), INTERNAL_CREDIT_APPLIED(String.valueOf("INTERNAL_CREDIT_APPLIED")), PREPAID_CREDIT(String.valueOf("PREPAID_CREDIT")), PREPAID_CREDIT_APPLIED(String.valueOf("PREPAID_CREDIT_APPLIED")), SALES_INCENTIVE_CREDIT(String.valueOf("SALES_INCENTIVE_CREDIT")), SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("SALES_INCENTIVE_CREDIT_APPLIED")), CREDIT_EXPIRED(String.valueOf("CREDIT_EXPIRED")), FUTURE_CREDIT(String.valueOf("FUTURE_CREDIT")), REFERRAL_CREDIT(String.valueOf("REFERRAL_CREDIT")), INVOICE_SALES_INCENTIVE_CREDIT(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT")), INVOICE_SALES_INCENTIVE_CREDIT_APPLIED(String.valueOf("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED")), PREPAID_CREDIT_REFUND(String.valueOf("PREPAID_CREDIT_REFUND")), NULL(String.valueOf("null"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static DiscountTypeEnum fromString(String s) {
        for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        return null;
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

  private @Valid DiscountTypeEnum discountType;
  private @Valid BigDecimal discountInMicroCurrency;
  private @Valid String discountCurrency;
  private @Valid String title;
  private @Valid BigDecimal remainingDiscountInMicroCurrency;

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
 @Pattern(regexp="^\\d+$")  public String getAdvertiserId() {
    return advertiserId;
  }

  @JsonProperty("advertiser_id")
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

  @JsonProperty("discountType")
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

  @JsonProperty("discountInMicroCurrency")
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

  @JsonProperty("discountCurrency")
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

  @JsonProperty("title")
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

  @JsonProperty("remainingDiscountInMicroCurrency")
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

