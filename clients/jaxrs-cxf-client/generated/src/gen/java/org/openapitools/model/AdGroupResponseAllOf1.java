package org.openapitools.model;

import org.openapitools.model.ActionType;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdGroupResponseAllOf1  {
  
  @ApiModelProperty(example = "626736533506", value = "Campaign ID of the ad group.")
 /**
   * Campaign ID of the ad group.
  **/
  private String campaignId;

  @ApiModelProperty(value = "")
  private ActionType billableEvent;

  @ApiModelProperty(example = "2680060704746", value = "Ad group ID.")
 /**
   * Ad group ID.
  **/
  private String id;

  @ApiModelProperty(value = "Always \"adgroup\".")
 /**
   * Always \"adgroup\".
  **/
  private String type;

  @ApiModelProperty(example = "549755885175", value = "Advertiser ID.")
 /**
   * Advertiser ID.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "1476477189", value = "Ad group creation time. Unix timestamp in seconds.")
 /**
   * Ad group creation time. Unix timestamp in seconds.
  **/
  private Integer createdTime;

  @ApiModelProperty(example = "1476477189", value = "Ad group last update time. Unix timestamp in seconds.")
 /**
   * Ad group last update time. Unix timestamp in seconds.
  **/
  private Integer updatedTime;
 /**
   * Campaign ID of the ad group.
   * @return campaignId
  **/
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupResponseAllOf1 campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Get billableEvent
   * @return billableEvent
  **/
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupResponseAllOf1 billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

 /**
   * Ad group ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdGroupResponseAllOf1 id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Always \&quot;adgroup\&quot;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdGroupResponseAllOf1 type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Advertiser ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdGroupResponseAllOf1 adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Ad group creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdGroupResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
   * Ad group last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdGroupResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupResponseAllOf1 {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

