package apimodels;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdsCreditDiscountsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsCreditDiscountsResponse   {
  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("advertiser_id")
  @Pattern(regexp="^\\d+$")

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
    
    PREPAID_CREDIT_REFUND("PREPAID_CREDIT_REFUND"),
    
    NULL("null");

    private final String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("discountType")
  
  private DiscountTypeEnum discountType;

  @JsonProperty("discountInMicroCurrency")
  @Valid

  private BigDecimal discountInMicroCurrency;

  @JsonProperty("discountCurrency")
  
  private String discountCurrency;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("remainingDiscountInMicroCurrency")
  @Valid

  private BigDecimal remainingDiscountInMicroCurrency;

  public AdsCreditDiscountsResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * True if the offer code is currently active.
   * @return active
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

