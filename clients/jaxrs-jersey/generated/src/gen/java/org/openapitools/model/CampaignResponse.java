/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.TrackingUrls;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CampaignResponse
 */
@JsonPropertyOrder({
  CampaignResponse.JSON_PROPERTY_ID,
  CampaignResponse.JSON_PROPERTY_AD_ACCOUNT_ID,
  CampaignResponse.JSON_PROPERTY_NAME,
  CampaignResponse.JSON_PROPERTY_STATUS,
  CampaignResponse.JSON_PROPERTY_LIFETIME_SPEND_CAP,
  CampaignResponse.JSON_PROPERTY_DAILY_SPEND_CAP,
  CampaignResponse.JSON_PROPERTY_ORDER_LINE_ID,
  CampaignResponse.JSON_PROPERTY_TRACKING_URLS,
  CampaignResponse.JSON_PROPERTY_START_TIME,
  CampaignResponse.JSON_PROPERTY_END_TIME,
  CampaignResponse.JSON_PROPERTY_IS_FLEXIBLE_DAILY_BUDGETS,
  CampaignResponse.JSON_PROPERTY_OBJECTIVE_TYPE,
  CampaignResponse.JSON_PROPERTY_CREATED_TIME,
  CampaignResponse.JSON_PROPERTY_UPDATED_TIME,
  CampaignResponse.JSON_PROPERTY_TYPE,
  CampaignResponse.JSON_PROPERTY_IS_CAMPAIGN_BUDGET_OPTIMIZATION,
  CampaignResponse.JSON_PROPERTY_SUMMARY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CampaignResponse   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_AD_ACCOUNT_ID = "ad_account_id";
  @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
  private String adAccountId;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private EntityStatus status;

  public static final String JSON_PROPERTY_LIFETIME_SPEND_CAP = "lifetime_spend_cap";
  @JsonProperty(JSON_PROPERTY_LIFETIME_SPEND_CAP)
  private Integer lifetimeSpendCap;

  public static final String JSON_PROPERTY_DAILY_SPEND_CAP = "daily_spend_cap";
  @JsonProperty(JSON_PROPERTY_DAILY_SPEND_CAP)
  private Integer dailySpendCap;

  public static final String JSON_PROPERTY_ORDER_LINE_ID = "order_line_id";
  @JsonProperty(JSON_PROPERTY_ORDER_LINE_ID)
  private String orderLineId;

  public static final String JSON_PROPERTY_TRACKING_URLS = "tracking_urls";
  @JsonProperty(JSON_PROPERTY_TRACKING_URLS)
  private TrackingUrls trackingUrls;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  @JsonProperty(JSON_PROPERTY_START_TIME)
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  @JsonProperty(JSON_PROPERTY_END_TIME)
  private Integer endTime;

  public static final String JSON_PROPERTY_IS_FLEXIBLE_DAILY_BUDGETS = "is_flexible_daily_budgets";
  @JsonProperty(JSON_PROPERTY_IS_FLEXIBLE_DAILY_BUDGETS)
  private Boolean isFlexibleDailyBudgets;

  public static final String JSON_PROPERTY_OBJECTIVE_TYPE = "objective_type";
  @JsonProperty(JSON_PROPERTY_OBJECTIVE_TYPE)
  private ObjectiveType objectiveType;

  public static final String JSON_PROPERTY_CREATED_TIME = "created_time";
  @JsonProperty(JSON_PROPERTY_CREATED_TIME)
  private Integer createdTime;

  public static final String JSON_PROPERTY_UPDATED_TIME = "updated_time";
  @JsonProperty(JSON_PROPERTY_UPDATED_TIME)
  private Integer updatedTime;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public static final String JSON_PROPERTY_IS_CAMPAIGN_BUDGET_OPTIMIZATION = "is_campaign_budget_optimization";
  @JsonProperty(JSON_PROPERTY_IS_CAMPAIGN_BUDGET_OPTIMIZATION)
  private Boolean isCampaignBudgetOptimization;

  public static final String JSON_PROPERTY_SUMMARY_STATUS = "summary_status";
  @JsonProperty(JSON_PROPERTY_SUMMARY_STATUS)
  private CampaignSummaryStatus summaryStatus;

  public CampaignResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Campaign ID.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(example = "549755885175", value = "Campaign ID.")
   @Pattern(regexp="^\\d+$")
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
   * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   * @return adAccountId
   **/
  @JsonProperty(value = "ad_account_id")
  @ApiModelProperty(example = "549755885175", value = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
   @Pattern(regexp="^\\d+$")
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
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(example = "ACME Tools", value = "Campaign name.")
  
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
   **/
  @JsonProperty(value = "status")
  @ApiModelProperty(value = "")
  
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CampaignResponse lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

  /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
   * @return lifetimeSpendCap
   **/
  @JsonProperty(value = "lifetime_spend_cap")
  @ApiModelProperty(example = "1432744744", value = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.")
  
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignResponse dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

  /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
   * @return dailySpendCap
   **/
  @JsonProperty(value = "daily_spend_cap")
  @ApiModelProperty(example = "1432744744", value = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.")
  
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignResponse orderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

  /**
   * Order line ID that appears on the invoice.
   * @return orderLineId
   **/
  @JsonProperty(value = "order_line_id")
  @ApiModelProperty(example = "549755885175", value = "Order line ID that appears on the invoice.")
   @Pattern(regexp="^\\d+$")
  public String getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignResponse trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   **/
  @JsonProperty(value = "tracking_urls")
  @ApiModelProperty(value = "")
  @Valid 
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignResponse startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return startTime
   **/
  @JsonProperty(value = "start_time")
  @ApiModelProperty(example = "1580865126", value = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CampaignResponse endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return endTime
   **/
  @JsonProperty(value = "end_time")
  @ApiModelProperty(example = "1644023526", value = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
  
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public CampaignResponse isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    return this;
  }

  /**
   * Determine if a campaign has flexible daily budgets setup.
   * @return isFlexibleDailyBudgets
   **/
  @JsonProperty(value = "is_flexible_daily_budgets")
  @ApiModelProperty(example = "true", value = "Determine if a campaign has flexible daily budgets setup.")
  
  public Boolean getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignResponse objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   **/
  @JsonProperty(value = "objective_type")
  @ApiModelProperty(value = "")
  
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
   **/
  @JsonProperty(value = "created_time")
  @ApiModelProperty(example = "1432744744", value = "Campaign creation time. Unix timestamp in seconds.")
  
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
   **/
  @JsonProperty(value = "updated_time")
  @ApiModelProperty(example = "1432744744", value = "UTC timestamp. Last update time.")
  
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
   * Always \&quot;campaign\&quot;.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(example = "campaign", value = "Always \"campaign\".")
  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CampaignResponse isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    return this;
  }

  /**
   * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
   * @return isCampaignBudgetOptimization
   **/
  @JsonProperty(value = "is_campaign_budget_optimization")
  @ApiModelProperty(example = "true", value = "Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.")
  
  public Boolean getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  public CampaignResponse summaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Get summaryStatus
   * @return summaryStatus
   **/
  @JsonProperty(value = "summary_status")
  @ApiModelProperty(value = "")
  
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
        Objects.equals(this.isFlexibleDailyBudgets, campaignResponse.isFlexibleDailyBudgets) &&
        Objects.equals(this.objectiveType, campaignResponse.objectiveType) &&
        Objects.equals(this.createdTime, campaignResponse.createdTime) &&
        Objects.equals(this.updatedTime, campaignResponse.updatedTime) &&
        Objects.equals(this.type, campaignResponse.type) &&
        Objects.equals(this.isCampaignBudgetOptimization, campaignResponse.isCampaignBudgetOptimization) &&
        Objects.equals(this.summaryStatus, campaignResponse.summaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, isFlexibleDailyBudgets, objectiveType, createdTime, updatedTime, type, isCampaignBudgetOptimization, summaryStatus);
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
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
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

