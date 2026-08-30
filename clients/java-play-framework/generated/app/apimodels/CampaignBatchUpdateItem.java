package apimodels;

import apimodels.CampaignBidOptionsUpdate;
import apimodels.ConversionObjectiveType;
import apimodels.EntityStatus;
import apimodels.IntendedPromotionType;
import apimodels.MobileAppPlatform;
import apimodels.PerformancePlusCampaignSettings;
import apimodels.TrackingUrls;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Single campaign update item with update-specific bid options.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignBatchUpdateItem   {
  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("app_id")
  
  private String appId;

  @JsonProperty("app_platform")
  @Valid

  private MobileAppPlatform appPlatform;

  @JsonProperty("bid_options")
  @Valid

  private CampaignBidOptionsUpdate bidOptions;

  @JsonProperty("daily_spend_cap")
  
  private Integer dailySpendCap;

  @JsonProperty("default_ad_group_budget_in_micro_currency")
  
  private Integer defaultAdGroupBudgetInMicroCurrency;

  @JsonProperty("end_time")
  
  private Integer endTime;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("intended_promotion_type")
  @Valid

  private IntendedPromotionType intendedPromotionType;

  @JsonProperty("is_automated_campaign")
  
  private Boolean isAutomatedCampaign;

  @JsonProperty("is_campaign_budget_optimization")
  
  private Boolean isCampaignBudgetOptimization;

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
  @Valid

  private ConversionObjectiveType objectiveType;

  @JsonProperty("order_line_id")
  @Pattern(regexp="^\\d+$")

  private String orderLineId;

  @JsonProperty("performance_plus_campaign_settings")
  @Valid

  private PerformancePlusCampaignSettings performancePlusCampaignSettings;

  @JsonProperty("start_time")
  
  private Integer startTime;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("tracking_urls")
  @Valid

  private TrackingUrls trackingUrls;

  public CampaignBatchUpdateItem adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Setting this field does nothing. The ad account ID gets set from the path parameter.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

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
  **/
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
  **/
  public MobileAppPlatform getAppPlatform() {
    return appPlatform;
  }

  public void setAppPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }

  public CampaignBatchUpdateItem bidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

   /**
   * Object describing an update to the campaign level bid multipliers.
   * @return bidOptions
  **/
  public CampaignBidOptionsUpdate getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignBatchUpdateItem dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

   /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return dailySpendCap
  **/
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignBatchUpdateItem defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

   /**
   * Setting this field does nothing.
   * @return defaultAdGroupBudgetInMicroCurrency
  **/
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignBatchUpdateItem endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return endTime
  **/
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignBatchUpdateItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Campaign ID, must be associated with the ad account ID provided in the path.
   * @return id
  **/
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
  **/
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignBatchUpdateItem isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

   /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
   * @return isAutomatedCampaign
  **/
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignBatchUpdateItem isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

   /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   * @return isCampaignBudgetOptimization
  **/
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  public CampaignBatchUpdateItem isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

   /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   * @return isFlexibleDailyBudgets
  **/
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignBatchUpdateItem isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

   /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
  **/
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
  **/
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
  **/
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignBatchUpdateItem lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

   /**
   * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
   * @return lifetimeSpendCap
  **/
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignBatchUpdateItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Campaign name - 255 chars max.
   * @return name
  **/
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
  **/
  public ConversionObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignBatchUpdateItem orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

   /**
   * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
   * @return orderLineId
  **/
  public String getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignBatchUpdateItem performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    return this;
  }

   /**
   * Pinterest Performance+ campaign settings.
   * @return performancePlusCampaignSettings
  **/
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  public CampaignBatchUpdateItem startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return startTime
  **/
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignBatchUpdateItem status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CampaignBatchUpdateItem trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
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
    return Objects.equals(adAccountId, campaignBatchUpdateItem.adAccountId) &&
        Objects.equals(appId, campaignBatchUpdateItem.appId) &&
        Objects.equals(appPlatform, campaignBatchUpdateItem.appPlatform) &&
        Objects.equals(bidOptions, campaignBatchUpdateItem.bidOptions) &&
        Objects.equals(dailySpendCap, campaignBatchUpdateItem.dailySpendCap) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignBatchUpdateItem.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(endTime, campaignBatchUpdateItem.endTime) &&
        Objects.equals(id, campaignBatchUpdateItem.id) &&
        Objects.equals(intendedPromotionType, campaignBatchUpdateItem.intendedPromotionType) &&
        Objects.equals(isAutomatedCampaign, campaignBatchUpdateItem.isAutomatedCampaign) &&
        Objects.equals(isCampaignBudgetOptimization, campaignBatchUpdateItem.isCampaignBudgetOptimization) &&
        Objects.equals(isFlexibleDailyBudgets, campaignBatchUpdateItem.isFlexibleDailyBudgets) &&
        Objects.equals(isLtvOptimized, campaignBatchUpdateItem.isLtvOptimized) &&
        Objects.equals(isPerformancePlus, campaignBatchUpdateItem.isPerformancePlus) &&
        Objects.equals(isTopOfSearch, campaignBatchUpdateItem.isTopOfSearch) &&
        Objects.equals(lifetimeSpendCap, campaignBatchUpdateItem.lifetimeSpendCap) &&
        Objects.equals(name, campaignBatchUpdateItem.name) &&
        Objects.equals(objectiveType, campaignBatchUpdateItem.objectiveType) &&
        Objects.equals(orderLineId, campaignBatchUpdateItem.orderLineId) &&
        Objects.equals(performancePlusCampaignSettings, campaignBatchUpdateItem.performancePlusCampaignSettings) &&
        Objects.equals(startTime, campaignBatchUpdateItem.startTime) &&
        Objects.equals(status, campaignBatchUpdateItem.status) &&
        Objects.equals(trackingUrls, campaignBatchUpdateItem.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, appId, appPlatform, bidOptions, dailySpendCap, defaultAdGroupBudgetInMicroCurrency, endTime, id, intendedPromotionType, isAutomatedCampaign, isCampaignBudgetOptimization, isFlexibleDailyBudgets, isLtvOptimized, isPerformancePlus, isTopOfSearch, lifetimeSpendCap, name, objectiveType, orderLineId, performancePlusCampaignSettings, startTime, status, trackingUrls);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

