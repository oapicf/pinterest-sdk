package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CampaignBidOptions;
import org.openapitools.vertxweb.server.model.CampaignSummaryStatus;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.ObjectiveType;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignCreateResponseData   {
  
  private String adAccountId;
  private Integer dailySpendCap;
  private Integer endTime;
  private Boolean isAutomatedCampaign;
  private Boolean isFlexibleDailyBudgets;
  private Integer lifetimeSpendCap;
  private String name;
  private String orderLineId;
  private Integer startTime;
  private EntityStatus status;
  private TrackingUrls trackingUrls;
  private Integer defaultAdGroupBudgetInMicroCurrency;
  private Boolean isCampaignBudgetOptimization;
  private String id;
  private CampaignBidOptions bidOptions;
  private Integer createdTime;
  private Boolean isPerformancePlus;
  private ObjectiveType objectiveType;
  private CampaignSummaryStatus summaryStatus;
  private String type;
  private Integer updatedTime;

  public CampaignCreateResponseData () {

  }

  public CampaignCreateResponseData (String adAccountId, Integer dailySpendCap, Integer endTime, Boolean isAutomatedCampaign, Boolean isFlexibleDailyBudgets, Integer lifetimeSpendCap, String name, String orderLineId, Integer startTime, EntityStatus status, TrackingUrls trackingUrls, Integer defaultAdGroupBudgetInMicroCurrency, Boolean isCampaignBudgetOptimization, String id, CampaignBidOptions bidOptions, Integer createdTime, Boolean isPerformancePlus, ObjectiveType objectiveType, CampaignSummaryStatus summaryStatus, String type, Integer updatedTime) {
    this.adAccountId = adAccountId;
    this.dailySpendCap = dailySpendCap;
    this.endTime = endTime;
    this.isAutomatedCampaign = isAutomatedCampaign;
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    this.lifetimeSpendCap = lifetimeSpendCap;
    this.name = name;
    this.orderLineId = orderLineId;
    this.startTime = startTime;
    this.status = status;
    this.trackingUrls = trackingUrls;
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    this.id = id;
    this.bidOptions = bidOptions;
    this.createdTime = createdTime;
    this.isPerformancePlus = isPerformancePlus;
    this.objectiveType = objectiveType;
    this.summaryStatus = summaryStatus;
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

    
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

    
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
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

    
  @JsonProperty("order_line_id")
  public String getOrderLineId() {
    return orderLineId;
  }
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
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

    
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }
  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

    
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }
  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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

    
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }
  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

    
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("summary_status")
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
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
    CampaignCreateResponseData campaignCreateResponseData = (CampaignCreateResponseData) o;
    return Objects.equals(adAccountId, campaignCreateResponseData.adAccountId) &&
        Objects.equals(dailySpendCap, campaignCreateResponseData.dailySpendCap) &&
        Objects.equals(endTime, campaignCreateResponseData.endTime) &&
        Objects.equals(isAutomatedCampaign, campaignCreateResponseData.isAutomatedCampaign) &&
        Objects.equals(isFlexibleDailyBudgets, campaignCreateResponseData.isFlexibleDailyBudgets) &&
        Objects.equals(lifetimeSpendCap, campaignCreateResponseData.lifetimeSpendCap) &&
        Objects.equals(name, campaignCreateResponseData.name) &&
        Objects.equals(orderLineId, campaignCreateResponseData.orderLineId) &&
        Objects.equals(startTime, campaignCreateResponseData.startTime) &&
        Objects.equals(status, campaignCreateResponseData.status) &&
        Objects.equals(trackingUrls, campaignCreateResponseData.trackingUrls) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignCreateResponseData.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(isCampaignBudgetOptimization, campaignCreateResponseData.isCampaignBudgetOptimization) &&
        Objects.equals(id, campaignCreateResponseData.id) &&
        Objects.equals(bidOptions, campaignCreateResponseData.bidOptions) &&
        Objects.equals(createdTime, campaignCreateResponseData.createdTime) &&
        Objects.equals(isPerformancePlus, campaignCreateResponseData.isPerformancePlus) &&
        Objects.equals(objectiveType, campaignCreateResponseData.objectiveType) &&
        Objects.equals(summaryStatus, campaignCreateResponseData.summaryStatus) &&
        Objects.equals(type, campaignCreateResponseData.type) &&
        Objects.equals(updatedTime, campaignCreateResponseData.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, dailySpendCap, endTime, isAutomatedCampaign, isFlexibleDailyBudgets, lifetimeSpendCap, name, orderLineId, startTime, status, trackingUrls, defaultAdGroupBudgetInMicroCurrency, isCampaignBudgetOptimization, id, bidOptions, createdTime, isPerformancePlus, objectiveType, summaryStatus, type, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateResponseData {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
