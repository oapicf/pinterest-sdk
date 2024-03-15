package apimodels;

import apimodels.AdCommonTrackingUrls;
import apimodels.CampaignSummaryStatus;
import apimodels.EntityStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CampaignCreateCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignCreateCommon   {
  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("status")
  @Valid

  private EntityStatus status = "ACTIVE";

  @JsonProperty("lifetime_spend_cap")
  
  private Integer lifetimeSpendCap;

  @JsonProperty("daily_spend_cap")
  
  private Integer dailySpendCap;

  @JsonProperty("order_line_id")
  @Pattern(regexp="^\\d+$")

  private String orderLineId;

  @JsonProperty("tracking_urls")
  @Valid

  private AdCommonTrackingUrls trackingUrls;

  @JsonProperty("start_time")
  
  private Integer startTime;

  @JsonProperty("end_time")
  
  private Integer endTime;

  @JsonProperty("summary_status")
  @Valid

  private CampaignSummaryStatus summaryStatus;

  @JsonProperty("is_flexible_daily_budgets")
  
  private Boolean isFlexibleDailyBudgets = false;

  @JsonProperty("default_ad_group_budget_in_micro_currency")
  
  private Integer defaultAdGroupBudgetInMicroCurrency;

  @JsonProperty("is_automated_campaign")
  
  private Boolean isAutomatedCampaign = false;

  public CampaignCreateCommon adAccountId(String adAccountId) {
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

  public CampaignCreateCommon name(String name) {
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

  public CampaignCreateCommon status(EntityStatus status) {
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

  public CampaignCreateCommon lifetimeSpendCap(Integer lifetimeSpendCap) {
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

  public CampaignCreateCommon dailySpendCap(Integer dailySpendCap) {
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

  public CampaignCreateCommon orderLineId(String orderLineId) {
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

  public CampaignCreateCommon trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignCreateCommon startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return startTime
  **/
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignCreateCommon endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return endTime
  **/
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignCreateCommon summaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

   /**
   * Get summaryStatus
   * @return summaryStatus
  **/
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public CampaignCreateCommon isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

   /**
   * Determine if a campaign has flexible daily budgets setup.
   * @return isFlexibleDailyBudgets
  **/
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignCreateCommon defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
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

  public CampaignCreateCommon isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

   /**
   * Specifies whether the campaign was created in the automated campaign flow
   * @return isAutomatedCampaign
  **/
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateCommon campaignCreateCommon = (CampaignCreateCommon) o;
    return Objects.equals(adAccountId, campaignCreateCommon.adAccountId) &&
        Objects.equals(name, campaignCreateCommon.name) &&
        Objects.equals(status, campaignCreateCommon.status) &&
        Objects.equals(lifetimeSpendCap, campaignCreateCommon.lifetimeSpendCap) &&
        Objects.equals(dailySpendCap, campaignCreateCommon.dailySpendCap) &&
        Objects.equals(orderLineId, campaignCreateCommon.orderLineId) &&
        Objects.equals(trackingUrls, campaignCreateCommon.trackingUrls) &&
        Objects.equals(startTime, campaignCreateCommon.startTime) &&
        Objects.equals(endTime, campaignCreateCommon.endTime) &&
        Objects.equals(summaryStatus, campaignCreateCommon.summaryStatus) &&
        Objects.equals(isFlexibleDailyBudgets, campaignCreateCommon.isFlexibleDailyBudgets) &&
        Objects.equals(defaultAdGroupBudgetInMicroCurrency, campaignCreateCommon.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(isAutomatedCampaign, campaignCreateCommon.isAutomatedCampaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, summaryStatus, isFlexibleDailyBudgets, defaultAdGroupBudgetInMicroCurrency, isAutomatedCampaign);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateCommon {\n");
    
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

