package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CampaignBidOptions;
import org.openapitools.vertxweb.server.model.CampaignObjectiveType;
import org.openapitools.vertxweb.server.model.IntendedPromotionType;
import org.openapitools.vertxweb.server.model.NullableEntityStatus;
import org.openapitools.vertxweb.server.model.PerformancePlusCampaignSettings;
import org.openapitools.vertxweb.server.model.SummaryStatus;
import org.openapitools.vertxweb.server.model.TrackingUrls;

/**
 * Campaign data in batch response, with all fields optional to support error cases where data may be empty.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignBatchResponseData   {
  
  private String adAccountId;
  private CampaignBidOptions bidOptions;
  private Integer createdTime;
  private Integer dailySpendCap;
  private Integer defaultAdGroupBudgetInMicroCurrency;
  private Integer endTime;
  private String id;
  private IntendedPromotionType intendedPromotionType;
  private Boolean isAutomatedCampaign;
  private Boolean isCampaignBudgetOptimization;
  private Boolean isCarting;
  private Boolean isFlexibleDailyBudgets;
  private Boolean isLtvOptimized;
  private Boolean isPerformancePlus;
  private Boolean isTopOfSearch;
  private Integer lifetimeSpendCap;
  private String name;
  private CampaignObjectiveType objectiveType;
  private String orderLineId;
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;
  private Integer startTime;
  private NullableEntityStatus status;
  private SummaryStatus summaryStatus;
  private TrackingUrls trackingUrls;
  private String type;
  private Integer updatedTime;

  public CampaignBatchResponseData () {

  }

  public CampaignBatchResponseData (String adAccountId, CampaignBidOptions bidOptions, Integer createdTime, Integer dailySpendCap, Integer defaultAdGroupBudgetInMicroCurrency, Integer endTime, String id, IntendedPromotionType intendedPromotionType, Boolean isAutomatedCampaign, Boolean isCampaignBudgetOptimization, Boolean isCarting, Boolean isFlexibleDailyBudgets, Boolean isLtvOptimized, Boolean isPerformancePlus, Boolean isTopOfSearch, Integer lifetimeSpendCap, String name, CampaignObjectiveType objectiveType, String orderLineId, PerformancePlusCampaignSettings performancePlusCampaignSettings, Integer startTime, NullableEntityStatus status, SummaryStatus summaryStatus, TrackingUrls trackingUrls, String type, Integer updatedTime) {
    this.adAccountId = adAccountId;
    this.bidOptions = bidOptions;
    this.createdTime = createdTime;
    this.dailySpendCap = dailySpendCap;
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    this.endTime = endTime;
    this.id = id;
    this.intendedPromotionType = intendedPromotionType;
    this.isAutomatedCampaign = isAutomatedCampaign;
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    this.isCarting = isCarting;
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
    this.summaryStatus = summaryStatus;
    this.trackingUrls = trackingUrls;
    this.type = type;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("bid_options")
  public CampaignBidOptions getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(CampaignBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
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

    
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }
  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
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
  public CampaignObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(CampaignObjectiveType objectiveType) {
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
  public NullableEntityStatus getStatus() {
    return status;
  }
  public void setStatus(NullableEntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("summary_status")
  public SummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("updated_time")
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
    return Objects.equals(adAccountId, campaignBatchResponseData.adAccountId) &&
        Objects.equals(bidOptions, campaignBatchResponseData.bidOptions) &&
        Objects.equals(createdTime, campaignBatchResponseData.createdTime) &&
        Objects.equals(dailySpendCap, campaignBatchResponseData.dailySpendCap) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignBatchResponseData.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(endTime, campaignBatchResponseData.endTime) &&
        Objects.equals(id, campaignBatchResponseData.id) &&
        Objects.equals(intendedPromotionType, campaignBatchResponseData.intendedPromotionType) &&
        Objects.equals(isAutomatedCampaign, campaignBatchResponseData.isAutomatedCampaign) &&
        Objects.equals(isCampaignBudgetOptimization, campaignBatchResponseData.isCampaignBudgetOptimization) &&
        Objects.equals(isCarting, campaignBatchResponseData.isCarting) &&
        Objects.equals(isFlexibleDailyBudgets, campaignBatchResponseData.isFlexibleDailyBudgets) &&
        Objects.equals(isLtvOptimized, campaignBatchResponseData.isLtvOptimized) &&
        Objects.equals(isPerformancePlus, campaignBatchResponseData.isPerformancePlus) &&
        Objects.equals(isTopOfSearch, campaignBatchResponseData.isTopOfSearch) &&
        Objects.equals(lifetimeSpendCap, campaignBatchResponseData.lifetimeSpendCap) &&
        Objects.equals(name, campaignBatchResponseData.name) &&
        Objects.equals(objectiveType, campaignBatchResponseData.objectiveType) &&
        Objects.equals(orderLineId, campaignBatchResponseData.orderLineId) &&
        Objects.equals(performancePlusCampaignSettings, campaignBatchResponseData.performancePlusCampaignSettings) &&
        Objects.equals(startTime, campaignBatchResponseData.startTime) &&
        Objects.equals(status, campaignBatchResponseData.status) &&
        Objects.equals(summaryStatus, campaignBatchResponseData.summaryStatus) &&
        Objects.equals(trackingUrls, campaignBatchResponseData.trackingUrls) &&
        Objects.equals(type, campaignBatchResponseData.type) &&
        Objects.equals(updatedTime, campaignBatchResponseData.updatedTime);
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
