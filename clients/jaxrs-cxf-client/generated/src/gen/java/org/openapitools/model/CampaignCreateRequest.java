package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignCreateRequest  {
  
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
 /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "ACME Tools", required = true, value = "Campaign name.")
 /**
   * Campaign name.
  **/
  private String name;

  @ApiModelProperty(value = "")
  private EntityStatus status = "ACTIVE";

  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.")
 /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  **/
  private Integer lifetimeSpendCap;

  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.")
 /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  **/
  private Integer dailySpendCap;

  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
 /**
   * Order line ID that appears on the invoice.
  **/
  private String orderLineId;

  @ApiModelProperty(value = "")
  private AdCommonTrackingUrls trackingUrls;

  @ApiModelProperty(example = "1580865126", value = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
 /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  **/
  private Integer startTime;

  @ApiModelProperty(example = "1644023526", value = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
 /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  **/
  private Integer endTime;

  @ApiModelProperty(value = "")
  private CampaignSummaryStatus summaryStatus;

  @ApiModelProperty(example = "true", value = "Determine if a campaign has flexible daily budgets setup.")
 /**
   * Determine if a campaign has flexible daily budgets setup.
  **/
  private Boolean isFlexibleDailyBudgets = false;

  @ApiModelProperty(example = "0", value = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
 /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  **/
  private Integer defaultAdGroupBudgetInMicroCurrency;

  @ApiModelProperty(example = "true", value = "Specifies whether the campaign was created in the automated campaign flow")
 /**
   * Specifies whether the campaign was created in the automated campaign flow
  **/
  private Boolean isAutomatedCampaign = false;

  @ApiModelProperty(required = true, value = "")
  private ObjectiveType objectiveType;
 /**
   * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Campaign name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignCreateRequest name(String name) {
    this.name = name;
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

  public CampaignCreateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
   * @return lifetimeSpendCap
  **/
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignCreateRequest lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

 /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
   * @return dailySpendCap
  **/
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignCreateRequest dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

 /**
   * Order line ID that appears on the invoice.
   * @return orderLineId
  **/
  @JsonProperty("order_line_id")
  public String getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignCreateRequest orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignCreateRequest trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignCreateRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignCreateRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get summaryStatus
   * @return summaryStatus
  **/
  @JsonProperty("summary_status")
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public CampaignCreateRequest summaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

 /**
   * Determine if a campaign has flexible daily budgets setup.
   * @return isFlexibleDailyBudgets
  **/
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignCreateRequest isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

 /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
  **/
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignCreateRequest defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

 /**
   * Specifies whether the campaign was created in the automated campaign flow
   * @return isAutomatedCampaign
  **/
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignCreateRequest isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

 /**
   * Get objectiveType
   * @return objectiveType
  **/
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignCreateRequest objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
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
    CampaignCreateRequest campaignCreateRequest = (CampaignCreateRequest) o;
    return Objects.equals(this.adAccountId, campaignCreateRequest.adAccountId) &&
        Objects.equals(this.name, campaignCreateRequest.name) &&
        Objects.equals(this.status, campaignCreateRequest.status) &&
        Objects.equals(this.lifetimeSpendCap, campaignCreateRequest.lifetimeSpendCap) &&
        Objects.equals(this.dailySpendCap, campaignCreateRequest.dailySpendCap) &&
        Objects.equals(this.orderLineId, campaignCreateRequest.orderLineId) &&
        Objects.equals(this.trackingUrls, campaignCreateRequest.trackingUrls) &&
        Objects.equals(this.startTime, campaignCreateRequest.startTime) &&
        Objects.equals(this.endTime, campaignCreateRequest.endTime) &&
        Objects.equals(this.summaryStatus, campaignCreateRequest.summaryStatus) &&
        Objects.equals(this.isFlexibleDailyBudgets, campaignCreateRequest.isFlexibleDailyBudgets) &&
        Objects.equals(this.defaultAdGroupBudgetInMicroCurrency, campaignCreateRequest.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(this.isAutomatedCampaign, campaignCreateRequest.isAutomatedCampaign) &&
        Objects.equals(this.objectiveType, campaignCreateRequest.objectiveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, summaryStatus, isFlexibleDailyBudgets, defaultAdGroupBudgetInMicroCurrency, isAutomatedCampaign, objectiveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateRequest {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

