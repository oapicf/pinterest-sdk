package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.PlacementMultipliers;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing a retail catalog item's bid options (bid price and bid multipliers).
 */
@ApiModel(description="Object describing a retail catalog item's bid options (bid price and bid multipliers).")

public class AdvancedAuctionBidOptions  {
  
 /**
  * Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
  */
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.")
  private Long bidInMicroCurrency;

  @ApiModelProperty(value = "")
  @Valid
  private AppTypeMultipliers appTypeMultipliers;

  @ApiModelProperty(value = "")
  @Valid
  private PlacementMultipliers placementMultipliers;
 /**
  * Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.
  * @return bidInMicroCurrency
  */
  @JsonProperty("bid_in_micro_currency")
  public Long getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  /**
   * Sets the <code>bidInMicroCurrency</code> property.
   */
 public void setBidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * Sets the <code>bidInMicroCurrency</code> property.
   */
  public AdvancedAuctionBidOptions bidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
  * Get appTypeMultipliers
  * @return appTypeMultipliers
  */
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  /**
   * Sets the <code>appTypeMultipliers</code> property.
   */
 public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   * Sets the <code>appTypeMultipliers</code> property.
   */
  public AdvancedAuctionBidOptions appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

 /**
  * Get placementMultipliers
  * @return placementMultipliers
  */
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  /**
   * Sets the <code>placementMultipliers</code> property.
   */
 public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  /**
   * Sets the <code>placementMultipliers</code> property.
   */
  public AdvancedAuctionBidOptions placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
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
    AdvancedAuctionBidOptions advancedAuctionBidOptions = (AdvancedAuctionBidOptions) o;
    return Objects.equals(this.bidInMicroCurrency, advancedAuctionBidOptions.bidInMicroCurrency) &&
        Objects.equals(this.appTypeMultipliers, advancedAuctionBidOptions.appTypeMultipliers) &&
        Objects.equals(this.placementMultipliers, advancedAuctionBidOptions.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidInMicroCurrency, appTypeMultipliers, placementMultipliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionBidOptions {\n");
    
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
    sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

