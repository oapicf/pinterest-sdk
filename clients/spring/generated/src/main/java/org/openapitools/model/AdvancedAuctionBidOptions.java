package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.PlacementMultipliers;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 */

@Schema(name = "AdvancedAuctionBidOptions", description = "Object describing a retail catalog item's bid options (bid price and bid multipliers).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvancedAuctionBidOptions {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<AppTypeMultipliers> appTypeMultipliers = JsonNullable.<AppTypeMultipliers>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Long> bidInMicroCurrency = JsonNullable.<Long>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<PlacementMultipliers> placementMultipliers = JsonNullable.<PlacementMultipliers>undefined();

  public AdvancedAuctionBidOptions appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = JsonNullable.of(appTypeMultipliers);
    return this;
  }

  /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
   */
  @Valid 
  @Schema(name = "app_type_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_type_multipliers")
  public JsonNullable<AppTypeMultipliers> getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(JsonNullable<AppTypeMultipliers> appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public AdvancedAuctionBidOptions bidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = JsonNullable.of(bidInMicroCurrency);
    return this;
  }

  /**
   * Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
   * @return bidInMicroCurrency
   */
  
  @Schema(name = "bid_in_micro_currency", description = "Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_in_micro_currency")
  public JsonNullable<Long> getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(JsonNullable<Long> bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdvancedAuctionBidOptions placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = JsonNullable.of(placementMultipliers);
    return this;
  }

  /**
   * Get placementMultipliers
   * @return placementMultipliers
   */
  @Valid 
  @Schema(name = "placement_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_multipliers")
  public JsonNullable<PlacementMultipliers> getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(JsonNullable<PlacementMultipliers> placementMultipliers) {
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
    return equalsNullable(this.appTypeMultipliers, advancedAuctionBidOptions.appTypeMultipliers) &&
        equalsNullable(this.bidInMicroCurrency, advancedAuctionBidOptions.bidInMicroCurrency) &&
        equalsNullable(this.placementMultipliers, advancedAuctionBidOptions.placementMultipliers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(appTypeMultipliers), hashCodeNullable(bidInMicroCurrency), hashCodeNullable(placementMultipliers));
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
    sb.append("class AdvancedAuctionBidOptions {\n");
    sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

