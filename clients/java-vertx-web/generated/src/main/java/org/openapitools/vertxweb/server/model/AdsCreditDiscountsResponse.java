package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdsCreditDiscountType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsCreditDiscountsResponse   {
  
  private Boolean active;
  private String advertiserId;
  private String discountCurrency;
  private BigDecimal discountInMicroCurrency;
  private AdsCreditDiscountType discountType;
  private BigDecimal remainingDiscountInMicroCurrency;
  private String title;

  public AdsCreditDiscountsResponse () {

  }

  public AdsCreditDiscountsResponse (Boolean active, String advertiserId, String discountCurrency, BigDecimal discountInMicroCurrency, AdsCreditDiscountType discountType, BigDecimal remainingDiscountInMicroCurrency, String title) {
    this.active = active;
    this.advertiserId = advertiserId;
    this.discountCurrency = discountCurrency;
    this.discountInMicroCurrency = discountInMicroCurrency;
    this.discountType = discountType;
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
    this.title = title;
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

    
  @JsonProperty("discountCurrency")
  public String getDiscountCurrency() {
    return discountCurrency;
  }
  public void setDiscountCurrency(String discountCurrency) {
    this.discountCurrency = discountCurrency;
  }

    
  @JsonProperty("discountInMicroCurrency")
  public BigDecimal getDiscountInMicroCurrency() {
    return discountInMicroCurrency;
  }
  public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
    this.discountInMicroCurrency = discountInMicroCurrency;
  }

    
  @JsonProperty("discountType")
  public AdsCreditDiscountType getDiscountType() {
    return discountType;
  }
  public void setDiscountType(AdsCreditDiscountType discountType) {
    this.discountType = discountType;
  }

    
  @JsonProperty("remainingDiscountInMicroCurrency")
  public BigDecimal getRemainingDiscountInMicroCurrency() {
    return remainingDiscountInMicroCurrency;
  }
  public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
    this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
  }

    
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
    return Objects.equals(active, adsCreditDiscountsResponse.active) &&
        Objects.equals(advertiserId, adsCreditDiscountsResponse.advertiserId) &&
        Objects.equals(discountCurrency, adsCreditDiscountsResponse.discountCurrency) &&
        Objects.equals(discountInMicroCurrency, adsCreditDiscountsResponse.discountInMicroCurrency) &&
        Objects.equals(discountType, adsCreditDiscountsResponse.discountType) &&
        Objects.equals(remainingDiscountInMicroCurrency, adsCreditDiscountsResponse.remainingDiscountInMicroCurrency) &&
        Objects.equals(title, adsCreditDiscountsResponse.title);
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
