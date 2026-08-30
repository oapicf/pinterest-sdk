package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsUpdate;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.ObjectiveType;
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
 * CampaignUpdateRequestAllOf2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignUpdateRequestAllOf2 {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CampaignBidOptionsUpdate> bidOptions = JsonNullable.<CampaignBidOptionsUpdate>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable IntendedPromotionType intendedPromotionType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isLtvOptimized;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isPerformancePlus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isTopOfSearch;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<ObjectiveType> objectiveType = JsonNullable.<ObjectiveType>undefined();

  public CampaignUpdateRequestAllOf2 bidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = JsonNullable.of(bidOptions);
    return this;
  }

  /**
   * Get bidOptions
   * @return bidOptions
   */
  @Valid 
  @Schema(name = "bid_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_options")
  public JsonNullable<CampaignBidOptionsUpdate> getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(JsonNullable<CampaignBidOptionsUpdate> bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignUpdateRequestAllOf2 intendedPromotionType(@Nullable IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

  /**
   * Get intendedPromotionType
   * @return intendedPromotionType
   */
  @Valid 
  @Schema(name = "intended_promotion_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intended_promotion_type")
  public @Nullable IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  @JsonProperty("intended_promotion_type")
  public void setIntendedPromotionType(@Nullable IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignUpdateRequestAllOf2 isLtvOptimized(@Nullable Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
   */
  
  @Schema(name = "is_ltv_optimized", description = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_ltv_optimized")
  public @Nullable Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  @JsonProperty("is_ltv_optimized")
  public void setIsLtvOptimized(@Nullable Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public CampaignUpdateRequestAllOf2 isPerformancePlus(@Nullable Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isPerformancePlus
   */
  
  @Schema(name = "is_performance_plus", description = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_performance_plus")
  public @Nullable Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  @JsonProperty("is_performance_plus")
  public void setIsPerformancePlus(@Nullable Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignUpdateRequestAllOf2 isTopOfSearch(@Nullable Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  /**
   * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isTopOfSearch
   */
  
  @Schema(name = "is_top_of_search", description = "Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_top_of_search")
  public @Nullable Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  @JsonProperty("is_top_of_search")
  public void setIsTopOfSearch(@Nullable Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignUpdateRequestAllOf2 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = JsonNullable.of(objectiveType);
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @Valid 
  @Schema(name = "objective_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objective_type")
  public JsonNullable<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(JsonNullable<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignUpdateRequestAllOf2 campaignUpdateRequestAllOf2 = (CampaignUpdateRequestAllOf2) o;
    return equalsNullable(this.bidOptions, campaignUpdateRequestAllOf2.bidOptions) &&
        Objects.equals(this.intendedPromotionType, campaignUpdateRequestAllOf2.intendedPromotionType) &&
        Objects.equals(this.isLtvOptimized, campaignUpdateRequestAllOf2.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignUpdateRequestAllOf2.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignUpdateRequestAllOf2.isTopOfSearch) &&
        equalsNullable(this.objectiveType, campaignUpdateRequestAllOf2.objectiveType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bidOptions), intendedPromotionType, isLtvOptimized, isPerformancePlus, isTopOfSearch, hashCodeNullable(objectiveType));
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
    sb.append("class CampaignUpdateRequestAllOf2 {\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
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

