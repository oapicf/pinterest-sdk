package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignCommon;
import org.openapitools.model.CampaignResponseAllOf;
import org.openapitools.model.CampaignResponseAllOf1;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.TrackingUrls;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CampaignResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-07T06:40:56.403503Z[Etc/UTC]")
public class CampaignResponse   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private EntityStatus status = "ACTIVE";

  @JsonProperty("lifetime_spend_cap")
  private JsonNullable<Integer> lifetimeSpendCap = JsonNullable.undefined();

  @JsonProperty("daily_spend_cap")
  private JsonNullable<Integer> dailySpendCap = JsonNullable.undefined();

  @JsonProperty("order_line_id")
  private JsonNullable<String> orderLineId = JsonNullable.undefined();

  @JsonProperty("tracking_urls")
  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.undefined();

  @JsonProperty("start_time")
  private JsonNullable<Integer> startTime = JsonNullable.undefined();

  @JsonProperty("end_time")
  private JsonNullable<Integer> endTime = JsonNullable.undefined();

  @JsonProperty("objective_type")
  private ObjectiveType objectiveType;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("type")
  private String type;

  public CampaignResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Campaign ID.
   * @return id
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "549755885175", description = "Campaign ID.", required = true)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CampaignResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Campaign's Advertiser ID.
   * @return adAccountId
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Campaign's Advertiser ID.", required = true)
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name.
   * @return name
  */
  
  @Schema(name = "name", example = "ACME Tools", description = "Campaign name.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignResponse status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CampaignResponse lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = JsonNullable.of(lifetimeSpendCap);
    return this;
  }

  /**
   * Campaign total spending cap.
   * @return lifetimeSpendCap
  */
  
  @Schema(name = "lifetime_spend_cap", example = "1432744744", description = "Campaign total spending cap.", required = false)
  public JsonNullable<Integer> getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(JsonNullable<Integer> lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignResponse dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = JsonNullable.of(dailySpendCap);
    return this;
  }

  /**
   * Campaign daily spending cap.
   * @return dailySpendCap
  */
  
  @Schema(name = "daily_spend_cap", example = "1432744744", description = "Campaign daily spending cap.", required = false)
  public JsonNullable<Integer> getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(JsonNullable<Integer> dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignResponse orderLineId(String orderLineId) {
    this.orderLineId = JsonNullable.of(orderLineId);
    return this;
  }

  /**
   * Order line ID that appears on the invoice.
   * @return orderLineId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "order_line_id", example = "549755885175", description = "Order line ID that appears on the invoice.", required = false)
  public JsonNullable<String> getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(JsonNullable<String> orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignResponse trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  public CampaignResponse putTrackingUrlsItem(String key,  trackingUrlsItem) {
    if (this.trackingUrls == null) {
      this.trackingUrls = ;
    }
    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
  */
  @Valid 
  @Schema(name = "tracking_urls", required = false)
  public JsonNullable<TrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<TrackingUrls> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignResponse startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return startTime
  */
  
  @Schema(name = "start_time", example = "1580865126", description = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.", required = false)
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public CampaignResponse endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return endTime
  */
  
  @Schema(name = "end_time", example = "1644023526", description = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.", required = false)
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public CampaignResponse objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
  */
  @Valid 
  @Schema(name = "objective_type", required = false)
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Campaign creation time. Unix timestamp in seconds.
   * @return createdTime
  */
  
  @Schema(name = "created_time", example = "1432744744", description = "Campaign creation time. Unix timestamp in seconds.", required = false)
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public CampaignResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * UTC timestamp. Last update time.
   * @return updatedTime
  */
  
  @Schema(name = "updated_time", example = "1432744744", description = "UTC timestamp. Last update time.", required = false)
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public CampaignResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"campaign\".
   * @return type
  */
  
  @Schema(name = "type", example = "campaign", description = "Always \"campaign\".", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignResponse campaignResponse = (CampaignResponse) o;
    return Objects.equals(this.id, campaignResponse.id) &&
        Objects.equals(this.adAccountId, campaignResponse.adAccountId) &&
        Objects.equals(this.name, campaignResponse.name) &&
        Objects.equals(this.status, campaignResponse.status) &&
        Objects.equals(this.lifetimeSpendCap, campaignResponse.lifetimeSpendCap) &&
        Objects.equals(this.dailySpendCap, campaignResponse.dailySpendCap) &&
        Objects.equals(this.orderLineId, campaignResponse.orderLineId) &&
        Objects.equals(this.trackingUrls, campaignResponse.trackingUrls) &&
        Objects.equals(this.startTime, campaignResponse.startTime) &&
        Objects.equals(this.endTime, campaignResponse.endTime) &&
        Objects.equals(this.objectiveType, campaignResponse.objectiveType) &&
        Objects.equals(this.createdTime, campaignResponse.createdTime) &&
        Objects.equals(this.updatedTime, campaignResponse.updatedTime) &&
        Objects.equals(this.type, campaignResponse.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, objectiveType, createdTime, updatedTime, type);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

