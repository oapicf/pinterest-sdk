package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignCommon;
import org.openapitools.model.CampaignResponseAllOf;
import org.openapitools.model.CampaignResponseAllOf1;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignResponse  {
  
 /**
  * Campaign ID.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign ID.")
  private String id;

 /**
  * Campaign's Advertiser ID.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Campaign's Advertiser ID.")
  private String adAccountId;

 /**
  * Campaign name.
  */
  @ApiModelProperty(example = "ACME Tools", value = "Campaign name.")
  private String name;

  @ApiModelProperty(value = "")
  private EntityStatus status = "ACTIVE";

 /**
  * Campaign total spending cap.
  */
  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap.")
  private Integer lifetimeSpendCap;

 /**
  * Campaign daily spending cap.
  */
  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap.")
  private Integer dailySpendCap;

 /**
  * Order line ID that appears on the invoice.
  */
  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
  private String orderLineId;

  @ApiModelProperty(value = "")
  @Valid
  private TrackingUrls trackingUrls;

 /**
  * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  */
  @ApiModelProperty(example = "1580865126", value = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  private Integer startTime;

 /**
  * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  */
  @ApiModelProperty(example = "1644023526", value = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  private Integer endTime;

  @ApiModelProperty(value = "")
  @Valid
  private ObjectiveType objectiveType;

 /**
  * Campaign creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1432744744", value = "Campaign creation time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * UTC timestamp. Last update time.
  */
  @ApiModelProperty(example = "1432744744", value = "UTC timestamp. Last update time.")
  private Integer updatedTime;

 /**
  * Always \"campaign\".
  */
  @ApiModelProperty(example = "campaign", value = "Always \"campaign\".")
  private String type;
 /**
  * Campaign ID.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CampaignResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Campaign&#39;s Advertiser ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public CampaignResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Campaign name.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CampaignResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CampaignResponse status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Campaign total spending cap.
  * @return lifetimeSpendCap
  */
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  /**
   * Sets the <code>lifetimeSpendCap</code> property.
   */
 public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  /**
   * Sets the <code>lifetimeSpendCap</code> property.
   */
  public CampaignResponse lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

 /**
  * Campaign daily spending cap.
  * @return dailySpendCap
  */
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  /**
   * Sets the <code>dailySpendCap</code> property.
   */
 public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  /**
   * Sets the <code>dailySpendCap</code> property.
   */
  public CampaignResponse dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

 /**
  * Order line ID that appears on the invoice.
  * @return orderLineId
  */
  @JsonProperty("order_line_id")
 @Pattern(regexp="^\\d+$")  public String getOrderLineId() {
    return orderLineId;
  }

  /**
   * Sets the <code>orderLineId</code> property.
   */
 public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  /**
   * Sets the <code>orderLineId</code> property.
   */
  public CampaignResponse orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

 /**
  * Get trackingUrls
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public CampaignResponse trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  /**
   * Puts a new item into the <code>trackingUrls</code> map.
   */
  public CampaignResponse putTrackingUrlsItem(String key,  trackingUrlsItem) {
    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
  }

 /**
  * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @return startTime
  */
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public CampaignResponse startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @return endTime
  */
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
 public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
  public CampaignResponse endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Get objectiveType
  * @return objectiveType
  */
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
 public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
  public CampaignResponse objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

 /**
  * Campaign creation time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public CampaignResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * UTC timestamp. Last update time.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public CampaignResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * Always \&quot;campaign\&quot;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CampaignResponse type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

