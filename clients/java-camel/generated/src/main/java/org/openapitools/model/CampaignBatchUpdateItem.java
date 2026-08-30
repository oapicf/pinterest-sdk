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
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.MobileAppPlatform;
import org.openapitools.model.PerformancePlusCampaignSettings;
import org.openapitools.model.TrackingUrls;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Single campaign update item with update-specific bid options.
 */

@Schema(name = "CampaignBatchUpdateItem", description = "Single campaign update item with update-specific bid options.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBatchUpdateItem {

  @Deprecated
  private String adAccountId;

  private String appId;

  private MobileAppPlatform appPlatform;

  private JsonNullable<CampaignBidOptionsUpdate> bidOptions = JsonNullable.<CampaignBidOptionsUpdate>undefined();

  private JsonNullable<Integer> dailySpendCap = JsonNullable.<Integer>undefined();

  @Deprecated
  private JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  private String id;

  private IntendedPromotionType intendedPromotionType;

  private JsonNullable<Boolean> isAutomatedCampaign = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isCampaignBudgetOptimization = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isFlexibleDailyBudgets = JsonNullable.<Boolean>undefined();

  private Boolean isLtvOptimized;

  private Boolean isPerformancePlus;

  private Boolean isTopOfSearch;

  private JsonNullable<Integer> lifetimeSpendCap = JsonNullable.<Integer>undefined();

  private String name;

  private ConversionObjectiveType objectiveType;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> orderLineId = JsonNullable.<String>undefined();

  private JsonNullable<PerformancePlusCampaignSettings> performancePlusCampaignSettings = JsonNullable.<PerformancePlusCampaignSettings>undefined();

  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  private EntityStatus status;

  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

  public CampaignBatchUpdateItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignBatchUpdateItem(String id) {
    this.id = id;
  }

  public CampaignBatchUpdateItem adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Setting this field does nothing. The ad account ID gets set from the path parameter.
   * @return adAccountId
   * @deprecated
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Setting this field does nothing. The ad account ID gets set from the path parameter.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  @Deprecated
  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignBatchUpdateItem appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.
   * @return appId
   */
  
  @Schema(name = "app_id", example = "429047995", description = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public CampaignBatchUpdateItem appPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
    return this;
  }

  /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.
   * @return appPlatform
   */
  @Valid 
  @Schema(name = "app_platform", example = "IOS", description = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_platform")
  public MobileAppPlatform getAppPlatform() {
    return appPlatform;
  }

  public void setAppPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }

  public CampaignBatchUpdateItem bidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = JsonNullable.of(bidOptions);
    return this;
  }

  /**
   * Object describing an update to the campaign level bid multipliers.
   * @return bidOptions
   */
  @Valid 
  @Schema(name = "bid_options", description = "Object describing an update to the campaign level bid multipliers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_options")
  public JsonNullable<CampaignBidOptionsUpdate> getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(JsonNullable<CampaignBidOptionsUpdate> bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignBatchUpdateItem dailySpendCap(Integer dailySpendCap) {
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

  public CampaignBatchUpdateItem defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = JsonNullable.of(defaultAdGroupBudgetInMicroCurrency);
    return this;
  }

  /**
   * Setting this field does nothing.
   * @return defaultAdGroupBudgetInMicroCurrency
   * @deprecated
   */
  
  @Schema(name = "default_ad_group_budget_in_micro_currency", example = "0", description = "Setting this field does nothing.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  @Deprecated
  public JsonNullable<Integer> getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setDefaultAdGroupBudgetInMicroCurrency(JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignBatchUpdateItem endTime(Integer endTime) {
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

  public CampaignBatchUpdateItem id(String id) {
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

  public void setId(String id) {
    this.id = id;
  }

  public CampaignBatchUpdateItem intendedPromotionType(IntendedPromotionType intendedPromotionType) {
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
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignBatchUpdateItem isAutomatedCampaign(Boolean isAutomatedCampaign) {
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

  public CampaignBatchUpdateItem isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
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

  public CampaignBatchUpdateItem isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
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

  public CampaignBatchUpdateItem isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
   */
  
  @Schema(name = "is_ltv_optimized", example = "true", description = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public CampaignBatchUpdateItem isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
   * @return isPerformancePlus
   */
  
  @Schema(name = "is_performance_plus", example = "true", description = "Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignBatchUpdateItem isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
   * @return isTopOfSearch
   */
  
  @Schema(name = "is_top_of_search", example = "true", description = "Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignBatchUpdateItem lifetimeSpendCap(Integer lifetimeSpendCap) {
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

  public CampaignBatchUpdateItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name - 255 chars max.
   * @return name
   */
  
  @Schema(name = "name", example = "ACME Tools", description = "Campaign name - 255 chars max.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignBatchUpdateItem objectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @Valid 
  @Schema(name = "objective_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objective_type")
  public ConversionObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignBatchUpdateItem orderLineId(String orderLineId) {
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

  public CampaignBatchUpdateItem performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
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

  public CampaignBatchUpdateItem startTime(Integer startTime) {
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

  public CampaignBatchUpdateItem status(EntityStatus status) {
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
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CampaignBatchUpdateItem trackingUrls(TrackingUrls trackingUrls) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBatchUpdateItem campaignBatchUpdateItem = (CampaignBatchUpdateItem) o;
    return Objects.equals(this.adAccountId, campaignBatchUpdateItem.adAccountId) &&
        Objects.equals(this.appId, campaignBatchUpdateItem.appId) &&
        Objects.equals(this.appPlatform, campaignBatchUpdateItem.appPlatform) &&
        equalsNullable(this.bidOptions, campaignBatchUpdateItem.bidOptions) &&
        equalsNullable(this.dailySpendCap, campaignBatchUpdateItem.dailySpendCap) &&
        equalsNullable(this.defaultAdGroupBudgetInMicroCurrency, campaignBatchUpdateItem.defaultAdGroupBudgetInMicroCurrency) &&
        equalsNullable(this.endTime, campaignBatchUpdateItem.endTime) &&
        Objects.equals(this.id, campaignBatchUpdateItem.id) &&
        Objects.equals(this.intendedPromotionType, campaignBatchUpdateItem.intendedPromotionType) &&
        equalsNullable(this.isAutomatedCampaign, campaignBatchUpdateItem.isAutomatedCampaign) &&
        equalsNullable(this.isCampaignBudgetOptimization, campaignBatchUpdateItem.isCampaignBudgetOptimization) &&
        equalsNullable(this.isFlexibleDailyBudgets, campaignBatchUpdateItem.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignBatchUpdateItem.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignBatchUpdateItem.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignBatchUpdateItem.isTopOfSearch) &&
        equalsNullable(this.lifetimeSpendCap, campaignBatchUpdateItem.lifetimeSpendCap) &&
        Objects.equals(this.name, campaignBatchUpdateItem.name) &&
        Objects.equals(this.objectiveType, campaignBatchUpdateItem.objectiveType) &&
        equalsNullable(this.orderLineId, campaignBatchUpdateItem.orderLineId) &&
        equalsNullable(this.performancePlusCampaignSettings, campaignBatchUpdateItem.performancePlusCampaignSettings) &&
        equalsNullable(this.startTime, campaignBatchUpdateItem.startTime) &&
        Objects.equals(this.status, campaignBatchUpdateItem.status) &&
        equalsNullable(this.trackingUrls, campaignBatchUpdateItem.trackingUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, appId, appPlatform, hashCodeNullable(bidOptions), hashCodeNullable(dailySpendCap), hashCodeNullable(defaultAdGroupBudgetInMicroCurrency), hashCodeNullable(endTime), id, intendedPromotionType, hashCodeNullable(isAutomatedCampaign), hashCodeNullable(isCampaignBudgetOptimization), hashCodeNullable(isFlexibleDailyBudgets), isLtvOptimized, isPerformancePlus, isTopOfSearch, hashCodeNullable(lifetimeSpendCap), name, objectiveType, hashCodeNullable(orderLineId), hashCodeNullable(performancePlusCampaignSettings), hashCodeNullable(startTime), status, hashCodeNullable(trackingUrls));
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
    sb.append("class CampaignBatchUpdateItem {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPlatform: ").append(toIndentedString(appPlatform)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
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
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
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

