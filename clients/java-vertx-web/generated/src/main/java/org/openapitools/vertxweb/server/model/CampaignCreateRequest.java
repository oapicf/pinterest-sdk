package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CampaignBidOptionsCreate;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.ObjectiveType;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignCreateRequest   {
  
  private String adAccountId;
  private Integer dailySpendCap;
  private Integer endTime;
  private Boolean isAutomatedCampaign = false;
  private Boolean isFlexibleDailyBudgets = false;
  private Integer lifetimeSpendCap;
  private String name;
  private String orderLineId;
  private Integer startTime;
  private EntityStatus status = "ACTIVE";
  private TrackingUrls trackingUrls;
  private Integer defaultAdGroupBudgetInMicroCurrency;
  private Boolean isCampaignBudgetOptimization;
  private CampaignBidOptionsCreate bidOptions;
  private Boolean isPerformancePlus = false;
  private ObjectiveType objectiveType;

  public CampaignCreateRequest () {

  }

  public CampaignCreateRequest (String adAccountId, Integer dailySpendCap, Integer endTime, Boolean isAutomatedCampaign, Boolean isFlexibleDailyBudgets, Integer lifetimeSpendCap, String name, String orderLineId, Integer startTime, EntityStatus status, TrackingUrls trackingUrls, Integer defaultAdGroupBudgetInMicroCurrency, Boolean isCampaignBudgetOptimization, CampaignBidOptionsCreate bidOptions, Boolean isPerformancePlus, ObjectiveType objectiveType) {
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
    this.bidOptions = bidOptions;
    this.isPerformancePlus = isPerformancePlus;
    this.objectiveType = objectiveType;
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

    
  @JsonProperty("bid_options")
  public CampaignBidOptionsCreate getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(CampaignBidOptionsCreate bidOptions) {
    this.bidOptions = bidOptions;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateRequest campaignCreateRequest = (CampaignCreateRequest) o;
    return Objects.equals(adAccountId, campaignCreateRequest.adAccountId) &&
        Objects.equals(dailySpendCap, campaignCreateRequest.dailySpendCap) &&
        Objects.equals(endTime, campaignCreateRequest.endTime) &&
        Objects.equals(isAutomatedCampaign, campaignCreateRequest.isAutomatedCampaign) &&
        Objects.equals(isFlexibleDailyBudgets, campaignCreateRequest.isFlexibleDailyBudgets) &&
        Objects.equals(lifetimeSpendCap, campaignCreateRequest.lifetimeSpendCap) &&
        Objects.equals(name, campaignCreateRequest.name) &&
        Objects.equals(orderLineId, campaignCreateRequest.orderLineId) &&
        Objects.equals(startTime, campaignCreateRequest.startTime) &&
        Objects.equals(status, campaignCreateRequest.status) &&
        Objects.equals(trackingUrls, campaignCreateRequest.trackingUrls) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignCreateRequest.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(isCampaignBudgetOptimization, campaignCreateRequest.isCampaignBudgetOptimization) &&
        Objects.equals(bidOptions, campaignCreateRequest.bidOptions) &&
        Objects.equals(isPerformancePlus, campaignCreateRequest.isPerformancePlus) &&
        Objects.equals(objectiveType, campaignCreateRequest.objectiveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, dailySpendCap, endTime, isAutomatedCampaign, isFlexibleDailyBudgets, lifetimeSpendCap, name, orderLineId, startTime, status, trackingUrls, defaultAdGroupBudgetInMicroCurrency, isCampaignBudgetOptimization, bidOptions, isPerformancePlus, objectiveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateRequest {\n");
    
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
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
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
