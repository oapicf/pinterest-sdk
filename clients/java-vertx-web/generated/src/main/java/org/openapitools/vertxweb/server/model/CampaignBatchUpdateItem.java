package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CampaignBidOptionsUpdate;
import org.openapitools.vertxweb.server.model.ConversionObjectiveType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.IntendedPromotionType;
import org.openapitools.vertxweb.server.model.MobileAppPlatform;
import org.openapitools.vertxweb.server.model.PerformancePlusCampaignSettings;
import org.openapitools.vertxweb.server.model.TrackingUrls;

/**
 * Single campaign update item with update-specific bid options.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignBatchUpdateItem   {
  
  private String adAccountId;
  private String appId;
  private MobileAppPlatform appPlatform;
  private CampaignBidOptionsUpdate bidOptions;
  private Integer dailySpendCap;
  private Integer defaultAdGroupBudgetInMicroCurrency;
  private Integer endTime;
  private String id;
  private IntendedPromotionType intendedPromotionType;
  private Boolean isAutomatedCampaign;
  private Boolean isCampaignBudgetOptimization;
  private Boolean isFlexibleDailyBudgets;
  private Boolean isLtvOptimized;
  private Boolean isPerformancePlus;
  private Boolean isTopOfSearch;
  private Integer lifetimeSpendCap;
  private String name;
  private ConversionObjectiveType objectiveType;
  private String orderLineId;
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;
  private Integer startTime;
  private EntityStatus status;
  private TrackingUrls trackingUrls;

  public CampaignBatchUpdateItem () {

  }

  public CampaignBatchUpdateItem (String adAccountId, String appId, MobileAppPlatform appPlatform, CampaignBidOptionsUpdate bidOptions, Integer dailySpendCap, Integer defaultAdGroupBudgetInMicroCurrency, Integer endTime, String id, IntendedPromotionType intendedPromotionType, Boolean isAutomatedCampaign, Boolean isCampaignBudgetOptimization, Boolean isFlexibleDailyBudgets, Boolean isLtvOptimized, Boolean isPerformancePlus, Boolean isTopOfSearch, Integer lifetimeSpendCap, String name, ConversionObjectiveType objectiveType, String orderLineId, PerformancePlusCampaignSettings performancePlusCampaignSettings, Integer startTime, EntityStatus status, TrackingUrls trackingUrls) {
    this.adAccountId = adAccountId;
    this.appId = appId;
    this.appPlatform = appPlatform;
    this.bidOptions = bidOptions;
    this.dailySpendCap = dailySpendCap;
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    this.endTime = endTime;
    this.id = id;
    this.intendedPromotionType = intendedPromotionType;
    this.isAutomatedCampaign = isAutomatedCampaign;
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    this.isLtvOptimized = isLtvOptimized;
    this.isPerformancePlus = isPerformancePlus;
    this.isTopOfSearch = isTopOfSearch;
    this.lifetimeSpendCap = lifetimeSpendCap;
    this.name = name;
    this.objectiveType = objectiveType;
    this.orderLineId = orderLineId;
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    this.startTime = startTime;
    this.status = status;
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

    
  @JsonProperty("app_platform")
  public MobileAppPlatform getAppPlatform() {
    return appPlatform;
  }
  public void setAppPlatform(MobileAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }

    
  @JsonProperty("bid_options")
  public CampaignBidOptionsUpdate getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
  }

    
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

    
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }
  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }
  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

    
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

    
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }
  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

    
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

    
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }
  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

    
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }
  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

    
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }
  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

    
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("objective_type")
  public ConversionObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ConversionObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("order_line_id")
  public String getOrderLineId() {
    return orderLineId;
  }
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

    
  @JsonProperty("performance_plus_campaign_settings")
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }
  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

    
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("tracking_urls")
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
