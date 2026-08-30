package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CampaignBidOptionsUpdate;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.IntendedPromotionType;
import org.openapitools.vertxweb.server.model.ObjectiveType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignUpdateRequest   {
  
  private CampaignBidOptionsUpdate bidOptions;
  private IntendedPromotionType intendedPromotionType;
  private Boolean isLtvOptimized;
  private Boolean isPerformancePlus;
  private Boolean isTopOfSearch;
  private ObjectiveType objectiveType;
  private String adAccountId;
  private Integer dailySpendCap;
  private Integer defaultAdGroupBudgetInMicroCurrency;
  private Integer endTime;
  private String id;
  private Boolean isAutomatedCampaign;
  private Boolean isCampaignBudgetOptimization;
  private Boolean isFlexibleDailyBudgets;
  private Integer lifetimeSpendCap;
  private String name;
  private String orderLineId;
  private Integer startTime;
  private EntityStatus status;
  private Object trackingUrls;

  public CampaignUpdateRequest () {

  }

  public CampaignUpdateRequest (CampaignBidOptionsUpdate bidOptions, IntendedPromotionType intendedPromotionType, Boolean isLtvOptimized, Boolean isPerformancePlus, Boolean isTopOfSearch, ObjectiveType objectiveType, String adAccountId, Integer dailySpendCap, Integer defaultAdGroupBudgetInMicroCurrency, Integer endTime, String id, Boolean isAutomatedCampaign, Boolean isCampaignBudgetOptimization, Boolean isFlexibleDailyBudgets, Integer lifetimeSpendCap, String name, String orderLineId, Integer startTime, EntityStatus status, Object trackingUrls) {
    this.bidOptions = bidOptions;
    this.intendedPromotionType = intendedPromotionType;
    this.isLtvOptimized = isLtvOptimized;
    this.isPerformancePlus = isPerformancePlus;
    this.isTopOfSearch = isTopOfSearch;
    this.objectiveType = objectiveType;
    this.adAccountId = adAccountId;
    this.dailySpendCap = dailySpendCap;
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    this.endTime = endTime;
    this.id = id;
    this.isAutomatedCampaign = isAutomatedCampaign;
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    this.lifetimeSpendCap = lifetimeSpendCap;
    this.name = name;
    this.orderLineId = orderLineId;
    this.startTime = startTime;
    this.status = status;
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("bid_options")
  public CampaignBidOptionsUpdate getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
  }

    
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }
  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
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

    
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ObjectiveType objectiveType) {
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
  public Object getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(Object trackingUrls) {
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
    CampaignUpdateRequest campaignUpdateRequest = (CampaignUpdateRequest) o;
    return Objects.equals(bidOptions, campaignUpdateRequest.bidOptions) &&
        Objects.equals(intendedPromotionType, campaignUpdateRequest.intendedPromotionType) &&
        Objects.equals(isLtvOptimized, campaignUpdateRequest.isLtvOptimized) &&
        Objects.equals(isPerformancePlus, campaignUpdateRequest.isPerformancePlus) &&
        Objects.equals(isTopOfSearch, campaignUpdateRequest.isTopOfSearch) &&
        Objects.equals(objectiveType, campaignUpdateRequest.objectiveType) &&
        Objects.equals(adAccountId, campaignUpdateRequest.adAccountId) &&
        Objects.equals(dailySpendCap, campaignUpdateRequest.dailySpendCap) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignUpdateRequest.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(endTime, campaignUpdateRequest.endTime) &&
        Objects.equals(id, campaignUpdateRequest.id) &&
        Objects.equals(isAutomatedCampaign, campaignUpdateRequest.isAutomatedCampaign) &&
        Objects.equals(isCampaignBudgetOptimization, campaignUpdateRequest.isCampaignBudgetOptimization) &&
        Objects.equals(isFlexibleDailyBudgets, campaignUpdateRequest.isFlexibleDailyBudgets) &&
        Objects.equals(lifetimeSpendCap, campaignUpdateRequest.lifetimeSpendCap) &&
        Objects.equals(name, campaignUpdateRequest.name) &&
        Objects.equals(orderLineId, campaignUpdateRequest.orderLineId) &&
        Objects.equals(startTime, campaignUpdateRequest.startTime) &&
        Objects.equals(status, campaignUpdateRequest.status) &&
        Objects.equals(trackingUrls, campaignUpdateRequest.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOptions, intendedPromotionType, isLtvOptimized, isPerformancePlus, isTopOfSearch, objectiveType, adAccountId, dailySpendCap, defaultAdGroupBudgetInMicroCurrency, endTime, id, isAutomatedCampaign, isCampaignBudgetOptimization, isFlexibleDailyBudgets, lifetimeSpendCap, name, orderLineId, startTime, status, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdateRequest {\n");
    
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
