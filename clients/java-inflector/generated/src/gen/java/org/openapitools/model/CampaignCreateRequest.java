package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsCreate;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.ObjectiveType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignCreateRequest   {
  @JsonProperty("bid_options")
  private CampaignBidOptionsCreate bidOptions;

  @JsonProperty("intended_promotion_type")
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
  private Boolean isPerformancePlus = false;

  @JsonProperty("is_top_of_search")
  private Boolean isTopOfSearch = false;

  @JsonProperty("objective_type")
  private ObjectiveType objectiveType;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("daily_spend_cap")
  private Integer dailySpendCap;

  @JsonProperty("default_ad_group_budget_in_micro_currency")
  private Integer defaultAdGroupBudgetInMicroCurrency;

  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("lifetime_spend_cap")
  private Integer lifetimeSpendCap;

  @JsonProperty("name")
  private String name;

  @JsonProperty("order_line_id")
  private String orderLineId;

  @JsonProperty("start_time")
  private Integer startTime;

  @JsonProperty("tracking_urls")
  private Object trackingUrls;

  /**
   **/
  public CampaignCreateRequest bidOptions(CampaignBidOptionsCreate bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bid_options")
  public CampaignBidOptionsCreate getBidOptions() {
    return bidOptions;
  }
  public void setBidOptions(CampaignBidOptionsCreate bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   **/
  public CampaignCreateRequest intendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("intended_promotion_type")
  public IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }
  public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
   **/
  public CampaignCreateRequest isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

  
  @ApiModelProperty(value = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES")
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   **/
  public CampaignCreateRequest isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

  
  @ApiModelProperty(value = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.")
  @JsonProperty("is_campaign_budget_optimization")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }
  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   **/
  public CampaignCreateRequest isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

  
  @ApiModelProperty(value = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.")
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   **/
  public CampaignCreateRequest isLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
  @JsonProperty("is_ltv_optimized")
  public Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }
  public void setIsLtvOptimized(Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
   **/
  public CampaignCreateRequest isPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  
  @ApiModelProperty(value = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.")
  @JsonProperty("is_performance_plus")
  public Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }
  public void setIsPerformancePlus(Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
   **/
  public CampaignCreateRequest isTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.")
  @JsonProperty("is_top_of_search")
  public Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }
  public void setIsTopOfSearch(Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  /**
   **/
  public CampaignCreateRequest objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   **/
  public CampaignCreateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   **/
  public CampaignCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
   **/
  public CampaignCreateRequest dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

  
  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.")
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   **/
  public CampaignCreateRequest defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }
  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   **/
  public CampaignCreateRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1644023526", value = "Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
   **/
  public CampaignCreateRequest lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

  
  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.")
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  /**
   * Campaign name.
   **/
  public CampaignCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "ACME Tools", required = true, value = "Campaign name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Order line ID that appears on the invoice.
   **/
  public CampaignCreateRequest orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
  @JsonProperty("order_line_id")
  public String getOrderLineId() {
    return orderLineId;
  }
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   **/
  public CampaignCreateRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "1580865126", value = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  public CampaignCreateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    CampaignCreateRequest campaignCreateRequest = (CampaignCreateRequest) o;
    return Objects.equals(bidOptions, campaignCreateRequest.bidOptions) &&
        Objects.equals(intendedPromotionType, campaignCreateRequest.intendedPromotionType) &&
        Objects.equals(isAutomatedCampaign, campaignCreateRequest.isAutomatedCampaign) &&
        Objects.equals(isCampaignBudgetOptimization, campaignCreateRequest.isCampaignBudgetOptimization) &&
        Objects.equals(isFlexibleDailyBudgets, campaignCreateRequest.isFlexibleDailyBudgets) &&
        Objects.equals(isLtvOptimized, campaignCreateRequest.isLtvOptimized) &&
        Objects.equals(isPerformancePlus, campaignCreateRequest.isPerformancePlus) &&
        Objects.equals(isTopOfSearch, campaignCreateRequest.isTopOfSearch) &&
        Objects.equals(objectiveType, campaignCreateRequest.objectiveType) &&
        Objects.equals(status, campaignCreateRequest.status) &&
        Objects.equals(adAccountId, campaignCreateRequest.adAccountId) &&
        Objects.equals(dailySpendCap, campaignCreateRequest.dailySpendCap) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignCreateRequest.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(endTime, campaignCreateRequest.endTime) &&
        Objects.equals(lifetimeSpendCap, campaignCreateRequest.lifetimeSpendCap) &&
        Objects.equals(name, campaignCreateRequest.name) &&
        Objects.equals(orderLineId, campaignCreateRequest.orderLineId) &&
        Objects.equals(startTime, campaignCreateRequest.startTime) &&
        Objects.equals(trackingUrls, campaignCreateRequest.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOptions, intendedPromotionType, isAutomatedCampaign, isCampaignBudgetOptimization, isFlexibleDailyBudgets, isLtvOptimized, isPerformancePlus, isTopOfSearch, objectiveType, status, adAccountId, dailySpendCap, defaultAdGroupBudgetInMicroCurrency, endTime, lifetimeSpendCap, name, orderLineId, startTime, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateRequest {\n");
    
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

