package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptions;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.MobileAppPlatform;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Single campaign create item with create-specific defaults.
 */
@ApiModel(description="Single campaign create item with create-specific defaults.")

public class CampaignCreateItem  {
  
 /**
  * Setting this field does nothing. The ad account ID gets set from the path parameter.
  */
  @ApiModelProperty(example = "549755885175", value = "Setting this field does nothing. The ad account ID gets set from the path parameter.")

  private String adAccountId;

 /**
  * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.
  */
  @ApiModelProperty(example = "429047995", value = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.")

  private String appId;

 /**
  * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.
  */
  @ApiModelProperty(example = "IOS", value = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.")

  @Valid

  private MobileAppPlatform appPlatform;

 /**
  * [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
  */
  @ApiModelProperty(value = "[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.")

  @Valid

  private CampaignBidOptions bidOptions;

 /**
  * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
  */
  @ApiModelProperty(example = "1432744744", value = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")

  private Integer dailySpendCap;

 /**
  * Setting this field does nothing.
  */
  @ApiModelProperty(example = "0", value = "Setting this field does nothing.")

  private Integer defaultAdGroupBudgetInMicroCurrency;

 /**
  * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  */
  @ApiModelProperty(example = "1644023526", value = "Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")

  private Integer endTime;

  @ApiModelProperty(value = "")

  @Valid

  private IntendedPromotionType intendedPromotionType;

 /**
  * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
  */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES")

  private Boolean isAutomatedCampaign = false;

 /**
  * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.")

  private Boolean isCampaignBudgetOptimization = true;

 /**
  * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  */
  @ApiModelProperty(example = "true", value = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.")

  private Boolean isFlexibleDailyBudgets = false;

 /**
  * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  */
  @ApiModelProperty(example = "true", value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")

  private Boolean isLtvOptimized;

 /**
  * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
  */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)")

  private Boolean isPerformancePlus = false;

 /**
  * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
  */
  @ApiModelProperty(example = "true", value = "Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.")

  private Boolean isTopOfSearch = false;

 /**
  * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
  */
  @ApiModelProperty(example = "1432744744", value = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")

  private Integer lifetimeSpendCap;

 /**
  * Campaign name - 255 chars max.
  */
  @ApiModelProperty(example = "ACME Tools", required = true, value = "Campaign name - 255 chars max.")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ConversionObjectiveType objectiveType;

 /**
  * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
  */
  @ApiModelProperty(example = "549755885175", value = "Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.")

  private String orderLineId;

 /**
  * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  */
  @ApiModelProperty(example = "1580865126", value = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")

  private Integer startTime;

  @ApiModelProperty(value = "")

  @Valid

  private EntityStatus status;

  @ApiModelProperty(value = "")

  @Valid

  private TrackingUrls trackingUrls;
 /**
   * Setting this field does nothing. The ad account ID gets set from the path parameter.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignCreateItem adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.
   * @return appId
  **/
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public CampaignCreateItem appId(String appId) {
    this.appId = appId;
    return this;
  }

 /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.
   * @return appPlatform
  **/
  @JsonProperty("app_platform")
  public MobileAppPlatform getAppPlatform() {
    return appPlatform;
  }

  public void setAppPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }

  public CampaignCreateItem appPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
    return this;
  }

 /**
   * [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
   * @return bidOptions
  **/
  @JsonProperty("bid_options")
  public CampaignBidOptions getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignCreateItem bidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

 /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return dailySpendCap
  **/
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignCreateItem dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

 /**
   * Setting this field does nothing.
   * @return defaultAdGroupBudgetInMicroCurrency
  **/
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignCreateItem defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

 /**
   * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignCreateItem endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get intendedPromotionType
   * @return intendedPromotionType
  **/
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignCreateItem intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

 /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
   * @return isAutomatedCampaign
  **/
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignCreateItem isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

 /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   * @return isCampaignBudgetOptimization
  **/
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  public CampaignCreateItem isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

 /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   * @return isFlexibleDailyBudgets
  **/
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignCreateItem isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

 /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
  **/
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public CampaignCreateItem isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

 /**
   * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
   * @return isPerformancePlus
  **/
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignCreateItem isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

 /**
   * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
   * @return isTopOfSearch
  **/
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignCreateItem isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

 /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return lifetimeSpendCap
  **/
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignCreateItem lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

 /**
   * Campaign name - 255 chars max.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignCreateItem name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get objectiveType
   * @return objectiveType
  **/
  @JsonProperty("objective_type")
  @NotNull
  public ConversionObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignCreateItem objectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

 /**
   * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
   * @return orderLineId
  **/
  @JsonProperty("order_line_id")
 @Pattern(regexp="^\\d+$")  public String getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignCreateItem orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

 /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignCreateItem startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CampaignCreateItem status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignCreateItem trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
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
    CampaignCreateItem campaignCreateItem = (CampaignCreateItem) o;
    return Objects.equals(this.adAccountId, campaignCreateItem.adAccountId) &&
        Objects.equals(this.appId, campaignCreateItem.appId) &&
        Objects.equals(this.appPlatform, campaignCreateItem.appPlatform) &&
        Objects.equals(this.bidOptions, campaignCreateItem.bidOptions) &&
        Objects.equals(this.dailySpendCap, campaignCreateItem.dailySpendCap) &&
        Objects.equals(this.defaultAdGroupBudgetInMicroCurrency, campaignCreateItem.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(this.endTime, campaignCreateItem.endTime) &&
        Objects.equals(this.intendedPromotionType, campaignCreateItem.intendedPromotionType) &&
        Objects.equals(this.isAutomatedCampaign, campaignCreateItem.isAutomatedCampaign) &&
        Objects.equals(this.isCampaignBudgetOptimization, campaignCreateItem.isCampaignBudgetOptimization) &&
        Objects.equals(this.isFlexibleDailyBudgets, campaignCreateItem.isFlexibleDailyBudgets) &&
        Objects.equals(this.isLtvOptimized, campaignCreateItem.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignCreateItem.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignCreateItem.isTopOfSearch) &&
        Objects.equals(this.lifetimeSpendCap, campaignCreateItem.lifetimeSpendCap) &&
        Objects.equals(this.name, campaignCreateItem.name) &&
        Objects.equals(this.objectiveType, campaignCreateItem.objectiveType) &&
        Objects.equals(this.orderLineId, campaignCreateItem.orderLineId) &&
        Objects.equals(this.startTime, campaignCreateItem.startTime) &&
        Objects.equals(this.status, campaignCreateItem.status) &&
        Objects.equals(this.trackingUrls, campaignCreateItem.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, appId, appPlatform, bidOptions, dailySpendCap, defaultAdGroupBudgetInMicroCurrency, endTime, intendedPromotionType, isAutomatedCampaign, isCampaignBudgetOptimization, isFlexibleDailyBudgets, isLtvOptimized, isPerformancePlus, isTopOfSearch, lifetimeSpendCap, name, objectiveType, orderLineId, startTime, status, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateItem {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPlatform: ").append(toIndentedString(appPlatform)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

