package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CampaignCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CampaignCreateRequest   {
  private @Valid String adAccountId;
  private @Valid String name;
  private @Valid EntityStatus status = "ACTIVE";
  private @Valid Integer lifetimeSpendCap;
  private @Valid Integer dailySpendCap;
  private @Valid String orderLineId;
  private @Valid AdCommonTrackingUrls trackingUrls;
  private @Valid Integer startTime;
  private @Valid Integer endTime;
  private @Valid CampaignSummaryStatus summaryStatus;
  private @Valid Boolean isFlexibleDailyBudgets = false;
  private @Valid Integer defaultAdGroupBudgetInMicroCurrency;
  private @Valid Boolean isAutomatedCampaign = false;
  private @Valid ObjectiveType objectiveType;

  /**
   * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   **/
  public CampaignCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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
  @NotNull
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
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

  @JsonProperty("status")
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
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

  @JsonProperty("lifetime_spend_cap")
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
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

  @JsonProperty("daily_spend_cap")
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
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
 @Pattern(regexp="^\\d+$")  public String getOrderLineId() {
    return orderLineId;
  }

  @JsonProperty("order_line_id")
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  /**
   **/
  public CampaignCreateRequest trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  @JsonProperty("tracking_urls")
  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   **/
  public CampaignCreateRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "1580865126", value = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  @JsonProperty("start_time")
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   **/
  public CampaignCreateRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1644023526", value = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  @JsonProperty("end_time")
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  public CampaignCreateRequest summaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("summary_status")
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  @JsonProperty("summary_status")
  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  /**
   * Determine if a campaign has flexible daily budgets setup.
   **/
  public CampaignCreateRequest isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Determine if a campaign has flexible daily budgets setup.")
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  @JsonProperty("is_flexible_daily_budgets")
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   **/
  public CampaignCreateRequest defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  /**
   * Specifies whether the campaign was created in the automated campaign flow
   **/
  public CampaignCreateRequest isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Specifies whether the campaign was created in the automated campaign flow")
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  @JsonProperty("is_automated_campaign")
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  /**
   **/
  public CampaignCreateRequest objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("objective_type")
  @NotNull
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

