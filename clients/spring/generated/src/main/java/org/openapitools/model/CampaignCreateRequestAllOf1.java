package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsCreate;
import org.openapitools.model.EntityStatus;
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
 * CampaignCreateRequestAllOf1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignCreateRequestAllOf1 {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CampaignBidOptionsCreate> bidOptions = JsonNullable.<CampaignBidOptionsCreate>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable IntendedPromotionType intendedPromotionType;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isAutomatedCampaign = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isCampaignBudgetOptimization = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isFlexibleDailyBudgets = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isLtvOptimized;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean isPerformancePlus = false;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean isTopOfSearch = false;

  private ObjectiveType objectiveType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EntityStatus status;

  public CampaignCreateRequestAllOf1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignCreateRequestAllOf1(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignCreateRequestAllOf1 bidOptions(CampaignBidOptionsCreate bidOptions) {
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
  public JsonNullable<CampaignBidOptionsCreate> getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(JsonNullable<CampaignBidOptionsCreate> bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignCreateRequestAllOf1 intendedPromotionType(@Nullable IntendedPromotionType intendedPromotionType) {
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

  public CampaignCreateRequestAllOf1 isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = JsonNullable.of(isAutomatedCampaign);
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
   * @return isAutomatedCampaign
   */
  
  @Schema(name = "is_automated_campaign", description = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_automated_campaign")
  public JsonNullable<Boolean> getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(JsonNullable<Boolean> isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignCreateRequestAllOf1 isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = JsonNullable.of(isCampaignBudgetOptimization);
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   * @return isCampaignBudgetOptimization
   */
  
  @Schema(name = "is_campaign_budget_optimization", description = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_campaign_budget_optimization")
  public JsonNullable<Boolean> getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(JsonNullable<Boolean> isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  public CampaignCreateRequestAllOf1 isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = JsonNullable.of(isFlexibleDailyBudgets);
    return this;
  }

  /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   * @return isFlexibleDailyBudgets
   */
  
  @Schema(name = "is_flexible_daily_budgets", description = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_flexible_daily_budgets")
  public JsonNullable<Boolean> getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(JsonNullable<Boolean> isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignCreateRequestAllOf1 isLtvOptimized(@Nullable Boolean isLtvOptimized) {
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

  public CampaignCreateRequestAllOf1 isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
   * @return isPerformancePlus
   */
  
  @Schema(name = "is_performance_plus", description = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  @JsonProperty("is_performance_plus")
  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignCreateRequestAllOf1 isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
   * @return isTopOfSearch
   */
  
  @Schema(name = "is_top_of_search", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  @JsonProperty("is_top_of_search")
  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignCreateRequestAllOf1 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @NotNull @Valid 
  @Schema(name = "objective_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignCreateRequestAllOf1 status(@Nullable EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateRequestAllOf1 campaignCreateRequestAllOf1 = (CampaignCreateRequestAllOf1) o;
    return equalsNullable(this.bidOptions, campaignCreateRequestAllOf1.bidOptions) &&
        Objects.equals(this.intendedPromotionType, campaignCreateRequestAllOf1.intendedPromotionType) &&
        equalsNullable(this.isAutomatedCampaign, campaignCreateRequestAllOf1.isAutomatedCampaign) &&
        equalsNullable(this.isCampaignBudgetOptimization, campaignCreateRequestAllOf1.isCampaignBudgetOptimization) &&
        equalsNullable(this.isFlexibleDailyBudgets, campaignCreateRequestAllOf1.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignCreateRequestAllOf1.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignCreateRequestAllOf1.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignCreateRequestAllOf1.isTopOfSearch) &&
        Objects.equals(this.objectiveType, campaignCreateRequestAllOf1.objectiveType) &&
        Objects.equals(this.status, campaignCreateRequestAllOf1.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bidOptions), intendedPromotionType, hashCodeNullable(isAutomatedCampaign), hashCodeNullable(isCampaignBudgetOptimization), hashCodeNullable(isFlexibleDailyBudgets), isLtvOptimized, isPerformancePlus, isTopOfSearch, objectiveType, status);
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
    sb.append("class CampaignCreateRequestAllOf1 {\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

