package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdsCreditDiscountsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdsCreditDiscountsResponse {

  private Boolean active;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  private JsonNullable<DiscountTypeEnum> discountType = JsonNullable.<DiscountTypeEnum>undefined();

  private JsonNullable<BigDecimal> discountInMicroCurrency = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<String> discountCurrency = JsonNullable.<String>undefined();

  private JsonNullable<String> title = JsonNullable.<String>undefined();

  private JsonNullable<BigDecimal> remainingDiscountInMicroCurrency = JsonNullable.<BigDecimal>undefined();

  public AdsCreditDiscountsResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * True if the offer code is currently active.
   * @return active
   */
  
  @Schema(name = "active", example = "true", description = "True if the offer code is currently active.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
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
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "advertiser_id", example = "12312451231", description = "Advertiser ID the offer was applied to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advertiser_id")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdsCreditDiscountsResponse discountType(DiscountTypeEnum discountType) {
    this.discountType = JsonNullable.of(discountType);
    return this;
  }

  /**
   * The type of discount of this credit
   * @return discountType
   */
  
  @Schema(name = "discountType", description = "The type of discount of this credit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountType")
  public JsonNullable<DiscountTypeEnum> getDiscountType() {
    return discountType;
  }

  public void setDiscountType(JsonNullable<DiscountTypeEnum> discountType) {
    this.discountType = discountType;
  }

  public AdsCreditDiscountsResponse discountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = JsonNullable.of(discountInMicroCurrency);
    return this;
  }

  /**
   * The discount applied in the offer’s currency value.
   * @return discountInMicroCurrency
   */
  @Valid 
  @Schema(name = "discountInMicroCurrency", example = "125000000", description = "The discount applied in the offer’s currency value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountInMicroCurrency")
  public JsonNullable<BigDecimal> getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }

  public void setDiscountInMicroCurrency(JsonNullable<BigDecimal> discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

  public AdsCreditDiscountsResponse discountCurrency(String discountCurrency) {
    this.discountCurrency = JsonNullable.of(discountCurrency);
    return this;
  }

  /**
   * Currency value for the discount.
   * @return discountCurrency
   */
  
  @Schema(name = "discountCurrency", example = "USD", description = "Currency value for the discount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountCurrency")
  public JsonNullable<String> getDiscountCurrency() {
    return discountCurrency;
  }

  public void setDiscountCurrency(JsonNullable<String> discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

  public AdsCreditDiscountsResponse title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Human readable title of the offer code.
   * @return title
   */
  
  @Schema(name = "title", example = "Ads Credits", description = "Human readable title of the offer code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  public AdsCreditDiscountsResponse remainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = JsonNullable.of(remainingDiscountInMicroCurrency);
    return this;
  }

  /**
   * The credits left to spend.
   * @return remainingDiscountInMicroCurrency
   */
  @Valid 
  @Schema(name = "remainingDiscountInMicroCurrency", example = "125000000", description = "The credits left to spend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remainingDiscountInMicroCurrency")
  public JsonNullable<BigDecimal> getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }

  public void setRemainingDiscountInMicroCurrency(JsonNullable<BigDecimal> remainingDiscountInMicroCurrency) {
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
        equalsNullable(this.discountType, adsCreditDiscountsResponse.discountType) &&
        equalsNullable(this.discountInMicroCurrency, adsCreditDiscountsResponse.discountInMicroCurrency) &&
        equalsNullable(this.discountCurrency, adsCreditDiscountsResponse.discountCurrency) &&
        equalsNullable(this.title, adsCreditDiscountsResponse.title) &&
        equalsNullable(this.remainingDiscountInMicroCurrency, adsCreditDiscountsResponse.remainingDiscountInMicroCurrency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, advertiserId, hashCodeNullable(discountType), hashCodeNullable(discountInMicroCurrency), hashCodeNullable(discountCurrency), hashCodeNullable(title), hashCodeNullable(remainingDiscountInMicroCurrency));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

