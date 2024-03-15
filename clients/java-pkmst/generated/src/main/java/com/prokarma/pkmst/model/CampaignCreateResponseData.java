package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdCommonTrackingUrls;
import com.prokarma.pkmst.model.CampaignSummaryStatus;
import com.prokarma.pkmst.model.EntityStatus;
import com.prokarma.pkmst.model.ObjectiveType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CampaignCreateResponseData
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CampaignCreateResponseData   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("lifetime_spend_cap")
  private Integer lifetimeSpendCap;

  @JsonProperty("daily_spend_cap")
  private Integer dailySpendCap;

  @JsonProperty("order_line_id")
  private String orderLineId;

  @JsonProperty("tracking_urls")
  private AdCommonTrackingUrls trackingUrls;

  @JsonProperty("start_time")
  private Integer startTime;

  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("summary_status")
  private CampaignSummaryStatus summaryStatus;

  @JsonProperty("is_flexible_daily_budgets")
  private Boolean isFlexibleDailyBudgets;

  @JsonProperty("default_ad_group_budget_in_micro_currency")
  private Integer defaultAdGroupBudgetInMicroCurrency;

  @JsonProperty("is_automated_campaign")
  private Boolean isAutomatedCampaign = false;

  @JsonProperty("id")
  private String id;

  @JsonProperty("objective_type")
  private ObjectiveType objectiveType;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("type")
  private String type;

  @JsonProperty("is_campaign_budget_optimization")
  private Boolean isCampaignBudgetOptimization;

  public CampaignCreateResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   * @return adAccountId
  **/
  @ApiModelProperty(example = "549755885175", value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignCreateResponseData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Campaign name.
   * @return name
  **/
  @ApiModelProperty(example = "ACME Tools", value = "Campaign name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignCreateResponseData status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CampaignCreateResponseData lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

   /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
   * @return lifetimeSpendCap
  **/
  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignCreateResponseData dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

   /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
   * @return dailySpendCap
  **/
  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignCreateResponseData orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

   /**
   * Order line ID that appears on the invoice.
   * @return orderLineId
  **/
  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
  public String getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignCreateResponseData trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @ApiModelProperty(value = "")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignCreateResponseData startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return startTime
  **/
  @ApiModelProperty(example = "1580865126", value = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignCreateResponseData endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return endTime
  **/
  @ApiModelProperty(example = "1644023526", value = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignCreateResponseData summaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

   /**
   * Get summaryStatus
   * @return summaryStatus
  **/
  @ApiModelProperty(value = "")
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public CampaignCreateResponseData isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

   /**
   * Determines if a campaign has flexible daily budgets setup.
   * @return isFlexibleDailyBudgets
  **/
  @ApiModelProperty(example = "true", value = "Determines if a campaign has flexible daily budgets setup.")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignCreateResponseData defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

   /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
  **/
  @ApiModelProperty(example = "0", value = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignCreateResponseData isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

   /**
   * Specifies whether the campaign was created in the automated campaign flow
   * @return isAutomatedCampaign
  **/
  @ApiModelProperty(example = "true", value = "Specifies whether the campaign was created in the automated campaign flow")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignCreateResponseData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Campaign ID.
   * @return id
  **/
  @ApiModelProperty(example = "549755885175", value = "Campaign ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CampaignCreateResponseData objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  @ApiModelProperty(value = "")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignCreateResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Campaign creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @ApiModelProperty(example = "1432744744", value = "Campaign creation time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public CampaignCreateResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * UTC timestamp. Last update time.
   * @return updatedTime
  **/
  @ApiModelProperty(example = "1432744744", value = "UTC timestamp. Last update time.")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public CampaignCreateResponseData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always \"campaign\".
   * @return type
  **/
  @ApiModelProperty(example = "campaign", value = "Always \"campaign\".")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CampaignCreateResponseData isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

   /**
   * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
   * @return isCampaignBudgetOptimization
  **/
  @ApiModelProperty(example = "true", value = "Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.")
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
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
    return Objects.equals(this.adAccountId, campaignCreateResponseData.adAccountId) &&
        Objects.equals(this.name, campaignCreateResponseData.name) &&
        Objects.equals(this.status, campaignCreateResponseData.status) &&
        Objects.equals(this.lifetimeSpendCap, campaignCreateResponseData.lifetimeSpendCap) &&
        Objects.equals(this.dailySpendCap, campaignCreateResponseData.dailySpendCap) &&
        Objects.equals(this.orderLineId, campaignCreateResponseData.orderLineId) &&
        Objects.equals(this.trackingUrls, campaignCreateResponseData.trackingUrls) &&
        Objects.equals(this.startTime, campaignCreateResponseData.startTime) &&
        Objects.equals(this.endTime, campaignCreateResponseData.endTime) &&
        Objects.equals(this.summaryStatus, campaignCreateResponseData.summaryStatus) &&
        Objects.equals(this.isFlexibleDailyBudgets, campaignCreateResponseData.isFlexibleDailyBudgets) &&
        Objects.equals(this.defaultAdGroupBudgetInMicroCurrency, campaignCreateResponseData.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(this.isAutomatedCampaign, campaignCreateResponseData.isAutomatedCampaign) &&
        Objects.equals(this.id, campaignCreateResponseData.id) &&
        Objects.equals(this.objectiveType, campaignCreateResponseData.objectiveType) &&
        Objects.equals(this.createdTime, campaignCreateResponseData.createdTime) &&
        Objects.equals(this.updatedTime, campaignCreateResponseData.updatedTime) &&
        Objects.equals(this.type, campaignCreateResponseData.type) &&
        Objects.equals(this.isCampaignBudgetOptimization, campaignCreateResponseData.isCampaignBudgetOptimization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, summaryStatus, isFlexibleDailyBudgets, defaultAdGroupBudgetInMicroCurrency, isAutomatedCampaign, id, objectiveType, createdTime, updatedTime, type, isCampaignBudgetOptimization);
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
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
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

