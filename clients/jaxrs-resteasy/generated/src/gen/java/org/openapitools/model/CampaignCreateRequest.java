package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CampaignCreateRequest   {
  
  private String adAccountId;
  private String name;
  private EntityStatus status = "ACTIVE";
  private Integer lifetimeSpendCap;
  private Integer dailySpendCap;
  private String orderLineId;
  private AdCommonTrackingUrls trackingUrls;
  private Integer startTime;
  private Integer endTime;
  private CampaignSummaryStatus summaryStatus;
  private Boolean isFlexibleDailyBudgets = false;
  private Integer defaultAdGroupBudgetInMicroCurrency;
  private Boolean isAutomatedCampaign = false;
  private ObjectiveType objectiveType;

  /**
   * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   **/
  
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Campaign name.
   **/
  
  @ApiModelProperty(example = "ACME Tools", required = true, value = "Campaign name.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  @Valid
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
   **/
  
  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.")
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
   **/
  
  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.")
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  /**
   * Order line ID that appears on the invoice.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
  @JsonProperty("order_line_id")
 @Pattern(regexp="^\\d+$")  public String getOrderLineId() {
    return orderLineId;
  }
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  @Valid
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   **/
  
  @ApiModelProperty(example = "1580865126", value = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   **/
  
  @ApiModelProperty(example = "1644023526", value = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("summary_status")
  @Valid
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  /**
   * Determine if a campaign has flexible daily budgets setup.
   **/
  
  @ApiModelProperty(example = "true", value = "Determine if a campaign has flexible daily budgets setup.")
  @JsonProperty("is_flexible_daily_budgets")
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }
  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   **/
  
  @ApiModelProperty(example = "0", value = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public Integer getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }
  public void setDefaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  /**
   * Specifies whether the campaign was created in the automated campaign flow
   **/
  
  @ApiModelProperty(example = "true", value = "Specifies whether the campaign was created in the automated campaign flow")
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("objective_type")
  @NotNull
  @Valid
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

