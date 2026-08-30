package apimodels;

import apimodels.CampaignBidOptionsUpdate;
import apimodels.EntityStatus;
import apimodels.IntendedPromotionType;
import apimodels.ObjectiveType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CampaignUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignUpdateRequest   {
  @JsonProperty("bid_options")
  @Valid

  private CampaignBidOptionsUpdate bidOptions;

  @JsonProperty("intended_promotion_type")
  @Valid

  private IntendedPromotionType intendedPromotionType;

  @JsonProperty("is_ltv_optimized")
  
  private Boolean isLtvOptimized;

  @JsonProperty("is_performance_plus")
  
  private Boolean isPerformancePlus;

  @JsonProperty("is_top_of_search")
  
  private Boolean isTopOfSearch;

  @JsonProperty("objective_type")
  @Valid

  private ObjectiveType objectiveType;

  @JsonProperty("ad_account_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("daily_spend_cap")
  
  private Integer dailySpendCap;

  @JsonProperty("default_ad_group_budget_in_micro_currency")
  
  private Integer defaultAdGroupBudgetInMicroCurrency;

  @JsonProperty("end_time")
  
  private Integer endTime;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("is_automated_campaign")
  
  private Boolean isAutomatedCampaign;

  @JsonProperty("is_campaign_budget_optimization")
  
  private Boolean isCampaignBudgetOptimization;

  @JsonProperty("is_flexible_daily_budgets")
  
  private Boolean isFlexibleDailyBudgets;

  @JsonProperty("lifetime_spend_cap")
  
  private Integer lifetimeSpendCap;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("order_line_id")
  @Pattern(regexp="^\\d+$")

  private String orderLineId;

  @JsonProperty("start_time")
  
  private Integer startTime;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("tracking_urls")
  
  private Object trackingUrls;

  public CampaignUpdateRequest bidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

   /**
   * Get bidOptions
   * @return bidOptions
  **/
  public CampaignBidOptionsUpdate getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignUpdateRequest intendedPromotionType(IntendedPromotionType intendedPromotionType) {
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

  public CampaignUpdateRequest isLtvOptimized(Boolean isLtvOptimized) {
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

  public CampaignUpdateRequest isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

   /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isPerformancePlus
  **/
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignUpdateRequest isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

   /**
   * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isTopOfSearch
  **/
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignUpdateRequest objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignUpdateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignUpdateRequest dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

   /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
   * @return dailySpendCap
  **/
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignUpdateRequest defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

   /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
  **/
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignUpdateRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return endTime
  **/
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Campaign ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CampaignUpdateRequest isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

   /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
   * @return isAutomatedCampaign
  **/
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignUpdateRequest isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
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

  public CampaignUpdateRequest isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
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

  public CampaignUpdateRequest lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

   /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
   * @return lifetimeSpendCap
  **/
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Campaign name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignUpdateRequest orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

   /**
   * Order line ID that appears on the invoice.
   * @return orderLineId
  **/
  public String getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignUpdateRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return startTime
  **/
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignUpdateRequest status(EntityStatus status) {
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

  public CampaignUpdateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

