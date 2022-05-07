package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Campaign Data
 **/
@ApiModel(description="Campaign Data")
public class CampaignCommon  {
  
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign's Advertiser ID.")
 /**
   * Campaign's Advertiser ID.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "ACME Tools", value = "Campaign name.")
 /**
   * Campaign name.
  **/
  private String name;

  @ApiModelProperty(value = "")
  private EntityStatus status = "ACTIVE";

  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap.")
 /**
   * Campaign total spending cap.
  **/
  private Integer lifetimeSpendCap;

  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap.")
 /**
   * Campaign daily spending cap.
  **/
  private Integer dailySpendCap;

  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
 /**
   * Order line ID that appears on the invoice.
  **/
  private String orderLineId;

  @ApiModelProperty(value = "")
  @Valid
  private TrackingUrls trackingUrls;

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
 /**
   * Campaign&#39;s Advertiser ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
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
   * Campaign total spending cap.
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
   * Campaign daily spending cap.
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
 @Pattern(regexp="^\\d+$")  public String getOrderLineId() {
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
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignCommon trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  public CampaignCommon putTrackingUrlsItem(String key,  trackingUrlsItem) {
    this.trackingUrls.put(key, trackingUrlsItem);
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

