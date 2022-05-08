package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ActionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdGroupResponseAllOf1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-08T00:42:02.037116Z[Etc/UTC]")
public class AdGroupResponseAllOf1   {

  @JsonProperty("campaign_id")
  private String campaignId;

  @JsonProperty("billable_event")
  private ActionType billableEvent;

  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  public AdGroupResponseAllOf1 campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Campaign ID of the ad group.
   * @return campaignId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "campaign_id", example = "626736533506", description = "Campaign ID of the ad group.", required = false)
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupResponseAllOf1 billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  /**
   * Get billableEvent
   * @return billableEvent
  */
  @Valid 
  @Schema(name = "billable_event", required = false)
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupResponseAllOf1 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Ad group ID.
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "2680060704746", description = "Ad group ID.", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdGroupResponseAllOf1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"adgroup\".
   * @return type
  */
  
  @Schema(name = "type", description = "Always \"adgroup\".", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdGroupResponseAllOf1 adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Advertiser ID.
   * @return adAccountId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Advertiser ID.", required = false)
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdGroupResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Ad group creation time. Unix timestamp in seconds.
   * @return createdTime
  */
  
  @Schema(name = "created_time", example = "1476477189", description = "Ad group creation time. Unix timestamp in seconds.", required = false)
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdGroupResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Ad group last update time. Unix timestamp in seconds.
   * @return updatedTime
  */
  
  @Schema(name = "updated_time", example = "1476477189", description = "Ad group last update time. Unix timestamp in seconds.", required = false)
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupResponseAllOf1 adGroupResponseAllOf1 = (AdGroupResponseAllOf1) o;
    return Objects.equals(this.campaignId, adGroupResponseAllOf1.campaignId) &&
        Objects.equals(this.billableEvent, adGroupResponseAllOf1.billableEvent) &&
        Objects.equals(this.id, adGroupResponseAllOf1.id) &&
        Objects.equals(this.type, adGroupResponseAllOf1.type) &&
        Objects.equals(this.adAccountId, adGroupResponseAllOf1.adAccountId) &&
        Objects.equals(this.createdTime, adGroupResponseAllOf1.createdTime) &&
        Objects.equals(this.updatedTime, adGroupResponseAllOf1.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, billableEvent, id, type, adAccountId, createdTime, updatedTime);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

