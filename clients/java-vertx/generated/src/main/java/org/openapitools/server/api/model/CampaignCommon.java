package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.AdCommonTrackingUrls;
import org.openapitools.server.api.model.CampaignSummaryStatus;
import org.openapitools.server.api.model.EntityStatus;

/**
 * Campaign Data
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignCommon   {
  
  private String adAccountId;
  private String name;
  private EntityStatus status;
  private Integer lifetimeSpendCap;
  private Integer dailySpendCap;
  private String orderLineId;
  private AdCommonTrackingUrls trackingUrls;
  private Integer startTime;
  private Integer endTime;
  private CampaignSummaryStatus summaryStatus;

  public CampaignCommon () {

  }

  public CampaignCommon (String adAccountId, String name, EntityStatus status, Integer lifetimeSpendCap, Integer dailySpendCap, String orderLineId, AdCommonTrackingUrls trackingUrls, Integer startTime, Integer endTime, CampaignSummaryStatus summaryStatus) {
    this.adAccountId = adAccountId;
    this.name = name;
    this.status = status;
    this.lifetimeSpendCap = lifetimeSpendCap;
    this.dailySpendCap = dailySpendCap;
    this.orderLineId = orderLineId;
    this.trackingUrls = trackingUrls;
    this.startTime = startTime;
    this.endTime = endTime;
    this.summaryStatus = summaryStatus;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

    
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

    
  @JsonProperty("order_line_id")
  public String getOrderLineId() {
    return orderLineId;
  }
  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

    
  @JsonProperty("tracking_urls")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("summary_status")
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
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
    return Objects.equals(adAccountId, campaignCommon.adAccountId) &&
        Objects.equals(name, campaignCommon.name) &&
        Objects.equals(status, campaignCommon.status) &&
        Objects.equals(lifetimeSpendCap, campaignCommon.lifetimeSpendCap) &&
        Objects.equals(dailySpendCap, campaignCommon.dailySpendCap) &&
        Objects.equals(orderLineId, campaignCommon.orderLineId) &&
        Objects.equals(trackingUrls, campaignCommon.trackingUrls) &&
        Objects.equals(startTime, campaignCommon.startTime) &&
        Objects.equals(endTime, campaignCommon.endTime) &&
        Objects.equals(summaryStatus, campaignCommon.summaryStatus);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
