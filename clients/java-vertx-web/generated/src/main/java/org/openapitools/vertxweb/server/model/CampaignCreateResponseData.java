package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CampaignSummaryStatus;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.ObjectiveType;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignCreateResponseData   {
  
  private String adAccountId;
  private String name;
  private EntityStatus status;
  private Integer lifetimeSpendCap;
  private Integer dailySpendCap;
  private String orderLineId;
  private TrackingUrls trackingUrls;
  private Integer startTime;
  private Integer endTime;
  private Boolean isFlexibleDailyBudgets;
  private Integer defaultAdGroupBudgetInMicroCurrency;
  private Boolean isAutomatedCampaign;
  private String id;
  private ObjectiveType objectiveType;
  private Integer createdTime;
  private Integer updatedTime;
  private String type;
  private Boolean isCampaignBudgetOptimization;
  private CampaignSummaryStatus summaryStatus;

  public CampaignCreateResponseData () {

  }

  public CampaignCreateResponseData (String adAccountId, String name, EntityStatus status, Integer lifetimeSpendCap, Integer dailySpendCap, String orderLineId, TrackingUrls trackingUrls, Integer startTime, Integer endTime, Boolean isFlexibleDailyBudgets, Integer defaultAdGroupBudgetInMicroCurrency, Boolean isAutomatedCampaign, String id, ObjectiveType objectiveType, Integer createdTime, Integer updatedTime, String type, Boolean isCampaignBudgetOptimization, CampaignSummaryStatus summaryStatus) {
    this.adAccountId = adAccountId;
    this.name = name;
    this.status = status;
    this.lifetimeSpendCap = lifetimeSpendCap;
    this.dailySpendCap = dailySpendCap;
    this.orderLineId = orderLineId;
    this.trackingUrls = trackingUrls;
    this.startTime = startTime;
    this.endTime = endTime;
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    this.isAutomatedCampaign = isAutomatedCampaign;
    this.id = id;
    this.objectiveType = objectiveType;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.type = type;
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    this.summaryStatus = summaryStatus;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

    
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

    
  @JsonProperty("order_line_id")
  public String getOrderLineId() {
    return orderLineId;
  }
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

    
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }
  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

    
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }
  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

    
  @JsonProperty("summary_status")
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
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
        Objects.equals(name, campaignCreateResponseData.name) &&
        Objects.equals(status, campaignCreateResponseData.status) &&
        Objects.equals(lifetimeSpendCap, campaignCreateResponseData.lifetimeSpendCap) &&
        Objects.equals(dailySpendCap, campaignCreateResponseData.dailySpendCap) &&
        Objects.equals(orderLineId, campaignCreateResponseData.orderLineId) &&
        Objects.equals(trackingUrls, campaignCreateResponseData.trackingUrls) &&
        Objects.equals(startTime, campaignCreateResponseData.startTime) &&
        Objects.equals(endTime, campaignCreateResponseData.endTime) &&
        Objects.equals(isFlexibleDailyBudgets, campaignCreateResponseData.isFlexibleDailyBudgets) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignCreateResponseData.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(isAutomatedCampaign, campaignCreateResponseData.isAutomatedCampaign) &&
        Objects.equals(id, campaignCreateResponseData.id) &&
        Objects.equals(objectiveType, campaignCreateResponseData.objectiveType) &&
        Objects.equals(createdTime, campaignCreateResponseData.createdTime) &&
        Objects.equals(updatedTime, campaignCreateResponseData.updatedTime) &&
        Objects.equals(type, campaignCreateResponseData.type) &&
        Objects.equals(isCampaignBudgetOptimization, campaignCreateResponseData.isCampaignBudgetOptimization) &&
        Objects.equals(summaryStatus, campaignCreateResponseData.summaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, isFlexibleDailyBudgets, defaultAdGroupBudgetInMicroCurrency, isAutomatedCampaign, id, objectiveType, createdTime, updatedTime, type, isCampaignBudgetOptimization, summaryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateResponseData {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
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
