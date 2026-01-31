package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.TrackingUrls;

/**
 * Campaign Data
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignCommon   {
  
  private String adAccountId;
  private Integer dailySpendCap;
  private Integer endTime;
  private Boolean isAutomatedCampaign;
  private Boolean isFlexibleDailyBudgets;
  private Integer lifetimeSpendCap;
  private String name;
  private String orderLineId;
  private Integer startTime;
  private EntityStatus status;
  private TrackingUrls trackingUrls;

  public CampaignCommon () {

  }

  public CampaignCommon (String adAccountId, Integer dailySpendCap, Integer endTime, Boolean isAutomatedCampaign, Boolean isFlexibleDailyBudgets, Integer lifetimeSpendCap, String name, String orderLineId, Integer startTime, EntityStatus status, TrackingUrls trackingUrls) {
    this.adAccountId = adAccountId;
    this.dailySpendCap = dailySpendCap;
    this.endTime = endTime;
    this.isAutomatedCampaign = isAutomatedCampaign;
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    this.lifetimeSpendCap = lifetimeSpendCap;
    this.name = name;
    this.orderLineId = orderLineId;
    this.startTime = startTime;
    this.status = status;
    this.trackingUrls = trackingUrls;
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

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }
  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
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
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
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
    CampaignCommon campaignCommon = (CampaignCommon) o;
    return Objects.equals(adAccountId, campaignCommon.adAccountId) &&
        Objects.equals(dailySpendCap, campaignCommon.dailySpendCap) &&
        Objects.equals(endTime, campaignCommon.endTime) &&
        Objects.equals(isAutomatedCampaign, campaignCommon.isAutomatedCampaign) &&
        Objects.equals(isFlexibleDailyBudgets, campaignCommon.isFlexibleDailyBudgets) &&
        Objects.equals(lifetimeSpendCap, campaignCommon.lifetimeSpendCap) &&
        Objects.equals(name, campaignCommon.name) &&
        Objects.equals(orderLineId, campaignCommon.orderLineId) &&
        Objects.equals(startTime, campaignCommon.startTime) &&
        Objects.equals(status, campaignCommon.status) &&
        Objects.equals(trackingUrls, campaignCommon.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, dailySpendCap, endTime, isAutomatedCampaign, isFlexibleDailyBudgets, lifetimeSpendCap, name, orderLineId, startTime, status, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCommon {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
