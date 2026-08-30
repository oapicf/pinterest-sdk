package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CampaignBidOptions;
import com.prokarma.pkmst.model.CampaignObjectiveType;
import com.prokarma.pkmst.model.IntendedPromotionType;
import com.prokarma.pkmst.model.NullableEntityStatus;
import com.prokarma.pkmst.model.PerformancePlusCampaignSettings;
import com.prokarma.pkmst.model.SummaryStatus;
import com.prokarma.pkmst.model.TrackingUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Campaign data in batch response, with all fields optional to support error cases where data may be empty.
 */
@ApiModel(description = "Campaign data in batch response, with all fields optional to support error cases where data may be empty.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBatchResponseData   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("bid_options")
  private CampaignBidOptions bidOptions;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("daily_spend_cap")
  private Integer dailySpendCap;

  @JsonProperty("default_ad_group_budget_in_micro_currency")
  private Integer defaultAdGroupBudgetInMicroCurrency;

  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("id")
  private String id;

  @JsonProperty("intended_promotion_type")
  private IntendedPromotionType intendedPromotionType;

  @JsonProperty("is_automated_campaign")
  private Boolean isAutomatedCampaign;

  @JsonProperty("is_campaign_budget_optimization")
  private Boolean isCampaignBudgetOptimization;

  @JsonProperty("is_carting")
  private Boolean isCarting;

  @JsonProperty("is_flexible_daily_budgets")
  private Boolean isFlexibleDailyBudgets;

  @JsonProperty("is_ltv_optimized")
  private Boolean isLtvOptimized;

  @JsonProperty("is_performance_plus")
  private Boolean isPerformancePlus;

  @JsonProperty("is_top_of_search")
  private Boolean isTopOfSearch;

  @JsonProperty("lifetime_spend_cap")
  private Integer lifetimeSpendCap;

  @JsonProperty("name")
  private String name;

  @JsonProperty("objective_type")
  private CampaignObjectiveType objectiveType;

  @JsonProperty("order_line_id")
  private String orderLineId;

  @JsonProperty("performance_plus_campaign_settings")
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;

  @JsonProperty("start_time")
  private Integer startTime;

  @JsonProperty("status")
  private NullableEntityStatus status;

  @JsonProperty("summary_status")
  private SummaryStatus summaryStatus;

  @JsonProperty("tracking_urls")
  private TrackingUrls trackingUrls;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  public CampaignBatchResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Campaign's Advertiser ID.
   * @return adAccountId
   */
  @ApiModelProperty(example = "549755885175", value = "Campaign's Advertiser ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignBatchResponseData bidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  /**
   * [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
   * @return bidOptions
   */
  @ApiModelProperty(value = "[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.")
  public CampaignBidOptions getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignBatchResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Campaign creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  @ApiModelProperty(example = "1432744744", readOnly = true, value = "Campaign creation time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public CampaignBatchResponseData dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

  /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return dailySpendCap
   */
  @ApiModelProperty(example = "1432744744", value = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignBatchResponseData defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
   */
  @ApiModelProperty(example = "0", value = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignBatchResponseData endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return endTime
   */
  @ApiModelProperty(example = "1644023526", value = "Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignBatchResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Campaign ID.
   * @return id
   */
  @ApiModelProperty(example = "549755885175", value = "Campaign ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CampaignBatchResponseData intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

  /**
   * Get intendedPromotionType
   * @return intendedPromotionType
   */
  @ApiModelProperty(value = "")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignBatchResponseData isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
   * @return isAutomatedCampaign
   */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignBatchResponseData isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   * @return isCampaignBudgetOptimization
   */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  public CampaignBatchResponseData isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

  /**
   * Whether the campaign contains a carting(where-to-buy link) ad.
   * @return isCarting
   */
  @ApiModelProperty(example = "true", readOnly = true, value = "Whether the campaign contains a carting(where-to-buy link) ad.")
  public Boolean getIsCarting() {
    return isCarting;
  }

  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  public CampaignBatchResponseData isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

  /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   * @return isFlexibleDailyBudgets
   */
  @ApiModelProperty(example = "true", value = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignBatchResponseData isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
   */
  @ApiModelProperty(example = "true", value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public CampaignBatchResponseData isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
   * @return isPerformancePlus
   */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignBatchResponseData isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
   * @return isTopOfSearch
   */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignBatchResponseData lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

  /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return lifetimeSpendCap
   */
  @ApiModelProperty(example = "1432744744", value = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignBatchResponseData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name - 255 chars max.
   * @return name
   */
  @ApiModelProperty(example = "ACME Tools", value = "Campaign name - 255 chars max.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignBatchResponseData objectiveType(CampaignObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @ApiModelProperty(value = "")
  public CampaignObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(CampaignObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignBatchResponseData orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

  /**
   * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
   * @return orderLineId
   */
  @ApiModelProperty(example = "549755885175", value = "Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.")
  public String getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignBatchResponseData performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    return this;
  }

  /**
   * Pinterest Performance+ campaign settings.
   * @return performancePlusCampaignSettings
   */
  @ApiModelProperty(value = "Pinterest Performance+ campaign settings.")
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  public CampaignBatchResponseData startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return startTime
   */
  @ApiModelProperty(example = "1580865126", value = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignBatchResponseData status(NullableEntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public NullableEntityStatus getStatus() {
    return status;
  }

  public void setStatus(NullableEntityStatus status) {
    this.status = status;
  }

  public CampaignBatchResponseData summaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Get summaryStatus
   * @return summaryStatus
   */
  @ApiModelProperty(readOnly = true, value = "")
  public SummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public CampaignBatchResponseData trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @ApiModelProperty(value = "")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignBatchResponseData type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"campaign\".
   * @return type
   */
  @ApiModelProperty(example = "campaign", readOnly = true, value = "Always \"campaign\".")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CampaignBatchResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * UTC timestamp. Last update time.
   * @return updatedTime
   */
  @ApiModelProperty(example = "1432744744", readOnly = true, value = "UTC timestamp. Last update time.")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
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
    CampaignBatchResponseData campaignBatchResponseData = (CampaignBatchResponseData) o;
    return Objects.equals(this.adAccountId, campaignBatchResponseData.adAccountId) &&
        Objects.equals(this.bidOptions, campaignBatchResponseData.bidOptions) &&
        Objects.equals(this.createdTime, campaignBatchResponseData.createdTime) &&
        Objects.equals(this.dailySpendCap, campaignBatchResponseData.dailySpendCap) &&
        Objects.equals(this.defaultAdGroupBudgetInMicroCurrency, campaignBatchResponseData.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(this.endTime, campaignBatchResponseData.endTime) &&
        Objects.equals(this.id, campaignBatchResponseData.id) &&
        Objects.equals(this.intendedPromotionType, campaignBatchResponseData.intendedPromotionType) &&
        Objects.equals(this.isAutomatedCampaign, campaignBatchResponseData.isAutomatedCampaign) &&
        Objects.equals(this.isCampaignBudgetOptimization, campaignBatchResponseData.isCampaignBudgetOptimization) &&
        Objects.equals(this.isCarting, campaignBatchResponseData.isCarting) &&
        Objects.equals(this.isFlexibleDailyBudgets, campaignBatchResponseData.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignBatchResponseData.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignBatchResponseData.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignBatchResponseData.isTopOfSearch) &&
        Objects.equals(this.lifetimeSpendCap, campaignBatchResponseData.lifetimeSpendCap) &&
        Objects.equals(this.name, campaignBatchResponseData.name) &&
        Objects.equals(this.objectiveType, campaignBatchResponseData.objectiveType) &&
        Objects.equals(this.orderLineId, campaignBatchResponseData.orderLineId) &&
        Objects.equals(this.performancePlusCampaignSettings, campaignBatchResponseData.performancePlusCampaignSettings) &&
        Objects.equals(this.startTime, campaignBatchResponseData.startTime) &&
        Objects.equals(this.status, campaignBatchResponseData.status) &&
        Objects.equals(this.summaryStatus, campaignBatchResponseData.summaryStatus) &&
        Objects.equals(this.trackingUrls, campaignBatchResponseData.trackingUrls) &&
        Objects.equals(this.type, campaignBatchResponseData.type) &&
        Objects.equals(this.updatedTime, campaignBatchResponseData.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, bidOptions, createdTime, dailySpendCap, defaultAdGroupBudgetInMicroCurrency, endTime, id, intendedPromotionType, isAutomatedCampaign, isCampaignBudgetOptimization, isCarting, isFlexibleDailyBudgets, isLtvOptimized, isPerformancePlus, isTopOfSearch, lifetimeSpendCap, name, objectiveType, orderLineId, performancePlusCampaignSettings, startTime, status, summaryStatus, trackingUrls, type, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBatchResponseData {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

