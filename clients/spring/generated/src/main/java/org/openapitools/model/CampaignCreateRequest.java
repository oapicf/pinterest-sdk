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
 * CampaignCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignCreateRequest {

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

  private String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> dailySpendCap = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> lifetimeSpendCap = JsonNullable.<Integer>undefined();

  private String name;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d+$") String> orderLineId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> trackingUrls = JsonNullable.<Object>undefined();

  public CampaignCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignCreateRequest(ObjectiveType objectiveType, String adAccountId, String name) {
    this.objectiveType = objectiveType;
    this.adAccountId = adAccountId;
    this.name = name;
  }

  public CampaignCreateRequest bidOptions(CampaignBidOptionsCreate bidOptions) {
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

  public CampaignCreateRequest intendedPromotionType(@Nullable IntendedPromotionType intendedPromotionType) {
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

  public CampaignCreateRequest isAutomatedCampaign(Boolean isAutomatedCampaign) {
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

  public CampaignCreateRequest isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
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

  public CampaignCreateRequest isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
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

  public CampaignCreateRequest isLtvOptimized(@Nullable Boolean isLtvOptimized) {
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

  public CampaignCreateRequest isPerformancePlus(Boolean isPerformancePlus) {
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

  public CampaignCreateRequest isTopOfSearch(Boolean isTopOfSearch) {
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

  public CampaignCreateRequest objectiveType(ObjectiveType objectiveType) {
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

  public CampaignCreateRequest status(@Nullable EntityStatus status) {
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

  public CampaignCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   * @return adAccountId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignCreateRequest dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = JsonNullable.of(dailySpendCap);
    return this;
  }

  /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
   * @return dailySpendCap
   */
  
  @Schema(name = "daily_spend_cap", example = "1432744744", description = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daily_spend_cap")
  public JsonNullable<Integer> getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(JsonNullable<Integer> dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignCreateRequest defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = JsonNullable.of(defaultAdGroupBudgetInMicroCurrency);
    return this;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
   */
  
  @Schema(name = "default_ad_group_budget_in_micro_currency", description = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public JsonNullable<Integer> getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignCreateRequest endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return endTime
   */
  
  @Schema(name = "end_time", example = "1644023526", description = "Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public CampaignCreateRequest lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = JsonNullable.of(lifetimeSpendCap);
    return this;
  }

  /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
   * @return lifetimeSpendCap
   */
  
  @Schema(name = "lifetime_spend_cap", example = "1432744744", description = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_spend_cap")
  public JsonNullable<Integer> getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(JsonNullable<Integer> lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "ACME Tools", description = "Campaign name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public CampaignCreateRequest orderLineId(String orderLineId) {
    this.orderLineId = JsonNullable.of(orderLineId);
    return this;
  }

  /**
   * Order line ID that appears on the invoice.
   * @return orderLineId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "order_line_id", example = "549755885175", description = "Order line ID that appears on the invoice.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_line_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(JsonNullable<String> orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignCreateRequest startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return startTime
   */
  
  @Schema(name = "start_time", example = "1580865126", description = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public CampaignCreateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<Object> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<Object> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateRequest campaignCreateRequest = (CampaignCreateRequest) o;
    return equalsNullable(this.bidOptions, campaignCreateRequest.bidOptions) &&
        Objects.equals(this.intendedPromotionType, campaignCreateRequest.intendedPromotionType) &&
        equalsNullable(this.isAutomatedCampaign, campaignCreateRequest.isAutomatedCampaign) &&
        equalsNullable(this.isCampaignBudgetOptimization, campaignCreateRequest.isCampaignBudgetOptimization) &&
        equalsNullable(this.isFlexibleDailyBudgets, campaignCreateRequest.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignCreateRequest.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignCreateRequest.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignCreateRequest.isTopOfSearch) &&
        Objects.equals(this.objectiveType, campaignCreateRequest.objectiveType) &&
        Objects.equals(this.status, campaignCreateRequest.status) &&
        Objects.equals(this.adAccountId, campaignCreateRequest.adAccountId) &&
        equalsNullable(this.dailySpendCap, campaignCreateRequest.dailySpendCap) &&
        equalsNullable(this.defaultAdGroupBudgetInMicroCurrency, campaignCreateRequest.defaultAdGroupBudgetInMicroCurrency) &&
        equalsNullable(this.endTime, campaignCreateRequest.endTime) &&
        equalsNullable(this.lifetimeSpendCap, campaignCreateRequest.lifetimeSpendCap) &&
        Objects.equals(this.name, campaignCreateRequest.name) &&
        equalsNullable(this.orderLineId, campaignCreateRequest.orderLineId) &&
        equalsNullable(this.startTime, campaignCreateRequest.startTime) &&
        equalsNullable(this.trackingUrls, campaignCreateRequest.trackingUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bidOptions), intendedPromotionType, hashCodeNullable(isAutomatedCampaign), hashCodeNullable(isCampaignBudgetOptimization), hashCodeNullable(isFlexibleDailyBudgets), isLtvOptimized, isPerformancePlus, isTopOfSearch, objectiveType, status, adAccountId, hashCodeNullable(dailySpendCap), hashCodeNullable(defaultAdGroupBudgetInMicroCurrency), hashCodeNullable(endTime), hashCodeNullable(lifetimeSpendCap), name, hashCodeNullable(orderLineId), hashCodeNullable(startTime), hashCodeNullable(trackingUrls));
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
    sb.append("class CampaignCreateRequest {\n");
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
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
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

