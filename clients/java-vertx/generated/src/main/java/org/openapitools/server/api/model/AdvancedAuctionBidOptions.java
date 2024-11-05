package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.AppTypeMultipliers;
import org.openapitools.server.api.model.PlacementMultipliers;

/**
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionBidOptions   {
  
  private Long bidInMicroCurrency;
  private AppTypeMultipliers appTypeMultipliers;
  private PlacementMultipliers placementMultipliers;

  public AdvancedAuctionBidOptions () {

  }

  public AdvancedAuctionBidOptions (Long bidInMicroCurrency, AppTypeMultipliers appTypeMultipliers, PlacementMultipliers placementMultipliers) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    this.appTypeMultipliers = appTypeMultipliers;
    this.placementMultipliers = placementMultipliers;
  }

    
  @JsonProperty("bid_in_micro_currency")
  public Long getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

    
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

    
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }
  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
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
    return Objects.equals(bidInMicroCurrency, advancedAuctionBidOptions.bidInMicroCurrency) &&
        Objects.equals(appTypeMultipliers, advancedAuctionBidOptions.appTypeMultipliers) &&
        Objects.equals(placementMultipliers, advancedAuctionBidOptions.placementMultipliers);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
