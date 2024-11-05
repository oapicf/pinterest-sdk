package apimodels;

import apimodels.AppTypeMultipliers;
import apimodels.PlacementMultipliers;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvancedAuctionBidOptions   {
  @JsonProperty("bid_in_micro_currency")
  
  private Long bidInMicroCurrency;

  @JsonProperty("app_type_multipliers")
  @Valid

  private AppTypeMultipliers appTypeMultipliers;

  @JsonProperty("placement_multipliers")
  @Valid

  private PlacementMultipliers placementMultipliers;

  public AdvancedAuctionBidOptions bidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

   /**
   * Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
   * @return bidInMicroCurrency
  **/
  public Long getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdvancedAuctionBidOptions appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

   /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
  **/
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public AdvancedAuctionBidOptions placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

   /**
   * Get placementMultipliers
   * @return placementMultipliers
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

