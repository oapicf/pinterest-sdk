package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.EntityStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Campaign Data
 **/
@ApiModel(description="Campaign Data")

public class CampaignCommon  {
  
  @ApiModelProperty(example = "549755885175", value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
 /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "ACME Tools", value = "Campaign name.")
 /**
   * Campaign name.
  **/
  private String name;

  @ApiModelProperty(value = "")
  private EntityStatus status;

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

  public CampaignCommon adAccountId(String adAccountId) {
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

  public CampaignCommon name(String name) {
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

  public CampaignCommon status(EntityStatus status) {
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

  public CampaignCommon lifetimeSpendCap(Integer lifetimeSpendCap) {
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

  public CampaignCommon dailySpendCap(Integer dailySpendCap) {
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

  public CampaignCommon orderLineId(String orderLineId) {
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

  public CampaignCommon trackingUrls(AdCommonTrackingUrls trackingUrls) {
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

  public CampaignCommon startTime(Integer startTime) {
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

  public CampaignCommon endTime(Integer endTime) {
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

  public CampaignCommon summaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
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
    CampaignCommon campaignCommon = (CampaignCommon) o;
    return Objects.equals(this.adAccountId, campaignCommon.adAccountId) &&
        Objects.equals(this.name, campaignCommon.name) &&
        Objects.equals(this.status, campaignCommon.status) &&
        Objects.equals(this.lifetimeSpendCap, campaignCommon.lifetimeSpendCap) &&
        Objects.equals(this.dailySpendCap, campaignCommon.dailySpendCap) &&
        Objects.equals(this.orderLineId, campaignCommon.orderLineId) &&
        Objects.equals(this.trackingUrls, campaignCommon.trackingUrls) &&
        Objects.equals(this.startTime, campaignCommon.startTime) &&
        Objects.equals(this.endTime, campaignCommon.endTime) &&
        Objects.equals(this.summaryStatus, campaignCommon.summaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, summaryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCommon {\n");
    
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

