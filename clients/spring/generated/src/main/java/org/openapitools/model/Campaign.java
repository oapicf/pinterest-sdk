package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptions;
import org.openapitools.model.CampaignObjectiveType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.PerformancePlusCampaignSettings;
import org.openapitools.model.SummaryStatus;
import org.openapitools.model.TrackingUrls;
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
 * Campaign
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Campaign {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CampaignBidOptions> bidOptions = JsonNullable.<CampaignBidOptions>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer createdTime;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> dailySpendCap = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  private String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable IntendedPromotionType intendedPromotionType;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isAutomatedCampaign = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isCampaignBudgetOptimization = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isCarting;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isFlexibleDailyBudgets = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isLtvOptimized;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isPerformancePlus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isTopOfSearch;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> lifetimeSpendCap = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  private CampaignObjectiveType objectiveType;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d+$") String> orderLineId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<PerformancePlusCampaignSettings> performancePlusCampaignSettings = JsonNullable.<PerformancePlusCampaignSettings>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EntityStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SummaryStatus summaryStatus;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer updatedTime;

  public Campaign() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Campaign(String id, CampaignObjectiveType objectiveType) {
    this.id = id;
    this.objectiveType = objectiveType;
  }

  public Campaign adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Campaign's Advertiser ID.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Campaign's Advertiser ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public Campaign bidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = JsonNullable.of(bidOptions);
    return this;
  }

  /**
   * [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
   * @return bidOptions
   */
  @Valid 
  @Schema(name = "bid_options", description = "[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_options")
  public JsonNullable<CampaignBidOptions> getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(JsonNullable<CampaignBidOptions> bidOptions) {
    this.bidOptions = bidOptions;
  }

  public Campaign createdTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Campaign creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, example = "1432744744", description = "Campaign creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public @Nullable Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
  }

  public Campaign dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = JsonNullable.of(dailySpendCap);
    return this;
  }

  /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return dailySpendCap
   */
  
  @Schema(name = "daily_spend_cap", example = "1432744744", description = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daily_spend_cap")
  public JsonNullable<Integer> getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(JsonNullable<Integer> dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public Campaign defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = JsonNullable.of(defaultAdGroupBudgetInMicroCurrency);
    return this;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
   */
  
  @Schema(name = "default_ad_group_budget_in_micro_currency", example = "0", description = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public JsonNullable<Integer> getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public Campaign endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return endTime
   */
  
  @Schema(name = "end_time", example = "1644023526", description = "Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public Campaign id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Campaign ID, must be associated with the ad account ID provided in the path.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", example = "549755885175", description = "Campaign ID, must be associated with the ad account ID provided in the path.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public Campaign intendedPromotionType(@Nullable IntendedPromotionType intendedPromotionType) {
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

  public Campaign isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = JsonNullable.of(isAutomatedCampaign);
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
   * @return isAutomatedCampaign
   */
  
  @Schema(name = "is_automated_campaign", example = "true", description = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_automated_campaign")
  public JsonNullable<Boolean> getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(JsonNullable<Boolean> isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public Campaign isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = JsonNullable.of(isCampaignBudgetOptimization);
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   * @return isCampaignBudgetOptimization
   */
  
  @Schema(name = "is_campaign_budget_optimization", example = "true", description = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_campaign_budget_optimization")
  public JsonNullable<Boolean> getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(JsonNullable<Boolean> isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  public Campaign isCarting(@Nullable Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

  /**
   * Whether the campaign contains a carting(where-to-buy link) ad.
   * @return isCarting
   */
  
  @Schema(name = "is_carting", accessMode = Schema.AccessMode.READ_ONLY, example = "true", description = "Whether the campaign contains a carting(where-to-buy link) ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_carting")
  public @Nullable Boolean getIsCarting() {
    return isCarting;
  }

  @JsonProperty("is_carting")
  public void setIsCarting(@Nullable Boolean isCarting) {
    this.isCarting = isCarting;
  }

  public Campaign isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = JsonNullable.of(isFlexibleDailyBudgets);
    return this;
  }

  /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   * @return isFlexibleDailyBudgets
   */
  
  @Schema(name = "is_flexible_daily_budgets", example = "true", description = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_flexible_daily_budgets")
  public JsonNullable<Boolean> getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(JsonNullable<Boolean> isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public Campaign isLtvOptimized(@Nullable Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
   */
  
  @Schema(name = "is_ltv_optimized", example = "true", description = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_ltv_optimized")
  public @Nullable Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  @JsonProperty("is_ltv_optimized")
  public void setIsLtvOptimized(@Nullable Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public Campaign isPerformancePlus(@Nullable Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
   * @return isPerformancePlus
   */
  
  @Schema(name = "is_performance_plus", example = "true", description = "Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_performance_plus")
  public @Nullable Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  @JsonProperty("is_performance_plus")
  public void setIsPerformancePlus(@Nullable Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public Campaign isTopOfSearch(@Nullable Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
   * @return isTopOfSearch
   */
  
  @Schema(name = "is_top_of_search", example = "true", description = "Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_top_of_search")
  public @Nullable Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  @JsonProperty("is_top_of_search")
  public void setIsTopOfSearch(@Nullable Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public Campaign lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = JsonNullable.of(lifetimeSpendCap);
    return this;
  }

  /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return lifetimeSpendCap
   */
  
  @Schema(name = "lifetime_spend_cap", example = "1432744744", description = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_spend_cap")
  public JsonNullable<Integer> getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(JsonNullable<Integer> lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public Campaign name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name - 255 chars max.
   * @return name
   */
  
  @Schema(name = "name", example = "ACME Tools", description = "Campaign name - 255 chars max.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Campaign objectiveType(CampaignObjectiveType objectiveType) {
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
  public CampaignObjectiveType getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
  public void setObjectiveType(CampaignObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public Campaign orderLineId(String orderLineId) {
    this.orderLineId = JsonNullable.of(orderLineId);
    return this;
  }

  /**
   * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
   * @return orderLineId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "order_line_id", example = "549755885175", description = "Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_line_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(JsonNullable<String> orderLineId) {
    this.orderLineId = orderLineId;
  }

  public Campaign performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = JsonNullable.of(performancePlusCampaignSettings);
    return this;
  }

  /**
   * Pinterest Performance+ campaign settings.
   * @return performancePlusCampaignSettings
   */
  @Valid 
  @Schema(name = "performance_plus_campaign_settings", description = "Pinterest Performance+ campaign settings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performance_plus_campaign_settings")
  public JsonNullable<PerformancePlusCampaignSettings> getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  public void setPerformancePlusCampaignSettings(JsonNullable<PerformancePlusCampaignSettings> performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  public Campaign startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return startTime
   */
  
  @Schema(name = "start_time", example = "1580865126", description = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public Campaign status(@Nullable EntityStatus status) {
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

  public Campaign summaryStatus(@Nullable SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Get summaryStatus
   * @return summaryStatus
   */
  @Valid 
  @Schema(name = "summary_status", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary_status")
  public @Nullable SummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  @JsonProperty("summary_status")
  public void setSummaryStatus(@Nullable SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public Campaign trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @Valid 
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<TrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<TrackingUrls> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public Campaign type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"campaign\".
   * @return type
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, example = "campaign", description = "Always \"campaign\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
    this.type = type;
  }

  public Campaign updatedTime(@Nullable Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * UTC timestamp. Last update time.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, example = "1432744744", description = "UTC timestamp. Last update time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public @Nullable Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(@Nullable Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.adAccountId, campaign.adAccountId) &&
        equalsNullable(this.bidOptions, campaign.bidOptions) &&
        Objects.equals(this.createdTime, campaign.createdTime) &&
        equalsNullable(this.dailySpendCap, campaign.dailySpendCap) &&
        equalsNullable(this.defaultAdGroupBudgetInMicroCurrency, campaign.defaultAdGroupBudgetInMicroCurrency) &&
        equalsNullable(this.endTime, campaign.endTime) &&
        Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.intendedPromotionType, campaign.intendedPromotionType) &&
        equalsNullable(this.isAutomatedCampaign, campaign.isAutomatedCampaign) &&
        equalsNullable(this.isCampaignBudgetOptimization, campaign.isCampaignBudgetOptimization) &&
        Objects.equals(this.isCarting, campaign.isCarting) &&
        equalsNullable(this.isFlexibleDailyBudgets, campaign.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaign.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaign.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaign.isTopOfSearch) &&
        equalsNullable(this.lifetimeSpendCap, campaign.lifetimeSpendCap) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.objectiveType, campaign.objectiveType) &&
        equalsNullable(this.orderLineId, campaign.orderLineId) &&
        equalsNullable(this.performancePlusCampaignSettings, campaign.performancePlusCampaignSettings) &&
        equalsNullable(this.startTime, campaign.startTime) &&
        Objects.equals(this.status, campaign.status) &&
        Objects.equals(this.summaryStatus, campaign.summaryStatus) &&
        equalsNullable(this.trackingUrls, campaign.trackingUrls) &&
        Objects.equals(this.type, campaign.type) &&
        Objects.equals(this.updatedTime, campaign.updatedTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, hashCodeNullable(bidOptions), createdTime, hashCodeNullable(dailySpendCap), hashCodeNullable(defaultAdGroupBudgetInMicroCurrency), hashCodeNullable(endTime), id, intendedPromotionType, hashCodeNullable(isAutomatedCampaign), hashCodeNullable(isCampaignBudgetOptimization), isCarting, hashCodeNullable(isFlexibleDailyBudgets), isLtvOptimized, isPerformancePlus, isTopOfSearch, hashCodeNullable(lifetimeSpendCap), name, objectiveType, hashCodeNullable(orderLineId), hashCodeNullable(performancePlusCampaignSettings), hashCodeNullable(startTime), status, summaryStatus, hashCodeNullable(trackingUrls), type, updatedTime);
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
    sb.append("class Campaign {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    isCarting: ").append(toIndentedString(isCarting)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    performancePlusCampaignSettings: ").append(toIndentedString(performancePlusCampaignSettings)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

