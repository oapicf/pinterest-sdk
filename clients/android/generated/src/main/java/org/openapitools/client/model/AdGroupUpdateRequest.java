/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ActionType;
import org.openapitools.client.model.AdGroupCommonOptimizationGoalMetadata;
import org.openapitools.client.model.AdGroupCommonTrackingUrls;
import org.openapitools.client.model.BudgetType;
import org.openapitools.client.model.EntityStatus;
import org.openapitools.client.model.PacingDeliveryType;
import org.openapitools.client.model.PlacementGroupType;
import org.openapitools.client.model.TargetingSpec;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AdGroupUpdateRequest {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("status")
  private EntityStatus status = null;
  @SerializedName("budget_in_micro_currency")
  private Integer budgetInMicroCurrency = null;
  @SerializedName("bid_in_micro_currency")
  private Integer bidInMicroCurrency = null;
  @SerializedName("optimization_goal_metadata")
  private AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata = null;
  @SerializedName("budget_type")
  private BudgetType budgetType = null;
  @SerializedName("start_time")
  private Integer startTime = null;
  @SerializedName("end_time")
  private Integer endTime = null;
  @SerializedName("targeting_spec")
  private TargetingSpec targetingSpec = null;
  @SerializedName("lifetime_frequency_cap")
  private Integer lifetimeFrequencyCap = null;
  @SerializedName("tracking_urls")
  private AdGroupCommonTrackingUrls trackingUrls = null;
  @SerializedName("auto_targeting_enabled")
  private Boolean autoTargetingEnabled = null;
  @SerializedName("placement_group")
  private PlacementGroupType placementGroup = null;
  @SerializedName("pacing_delivery_type")
  private PacingDeliveryType pacingDeliveryType = null;
  @SerializedName("campaign_id")
  private String campaignId = null;
  @SerializedName("billable_event")
  private ActionType billableEvent = null;
  public enum BidStrategyTypeEnum {
     AUTOMATIC_BID,  MAX_BID,  TARGET_AVG,  , 
  };
  @SerializedName("bid_strategy_type")
  private BidStrategyTypeEnum bidStrategyType = null;
  @SerializedName("id")
  private String id = null;

  /**
   * Ad group name.
   **/
  @ApiModelProperty(value = "Ad group name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Ad group/entity status.
   **/
  @ApiModelProperty(value = "Ad group/entity status.")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   **/
  @ApiModelProperty(value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   **/
  @ApiModelProperty(value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AdGroupCommonOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BudgetType getBudgetType() {
    return budgetType;
  }
  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   **/
  @ApiModelProperty(value = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Ad group end time. Unix timestamp in seconds.
   **/
  @ApiModelProperty(value = "Ad group end time. Unix timestamp in seconds.")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   **/
  @ApiModelProperty(value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AdGroupCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   **/
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
   **/
  @ApiModelProperty(value = "<a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * Campaign ID of the ad group.
   **/
  @ApiModelProperty(value = "Campaign ID of the ad group.")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * Bid strategy type
   **/
  @ApiModelProperty(value = "Bid strategy type")
  public BidStrategyTypeEnum getBidStrategyType() {
    return bidStrategyType;
  }
  public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  /**
   * Ad group ID.
   **/
  @ApiModelProperty(required = true, value = "Ad group ID.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupUpdateRequest adGroupUpdateRequest = (AdGroupUpdateRequest) o;
    return (this.name == null ? adGroupUpdateRequest.name == null : this.name.equals(adGroupUpdateRequest.name)) &&
        (this.status == null ? adGroupUpdateRequest.status == null : this.status.equals(adGroupUpdateRequest.status)) &&
        (this.budgetInMicroCurrency == null ? adGroupUpdateRequest.budgetInMicroCurrency == null : this.budgetInMicroCurrency.equals(adGroupUpdateRequest.budgetInMicroCurrency)) &&
        (this.bidInMicroCurrency == null ? adGroupUpdateRequest.bidInMicroCurrency == null : this.bidInMicroCurrency.equals(adGroupUpdateRequest.bidInMicroCurrency)) &&
        (this.optimizationGoalMetadata == null ? adGroupUpdateRequest.optimizationGoalMetadata == null : this.optimizationGoalMetadata.equals(adGroupUpdateRequest.optimizationGoalMetadata)) &&
        (this.budgetType == null ? adGroupUpdateRequest.budgetType == null : this.budgetType.equals(adGroupUpdateRequest.budgetType)) &&
        (this.startTime == null ? adGroupUpdateRequest.startTime == null : this.startTime.equals(adGroupUpdateRequest.startTime)) &&
        (this.endTime == null ? adGroupUpdateRequest.endTime == null : this.endTime.equals(adGroupUpdateRequest.endTime)) &&
        (this.targetingSpec == null ? adGroupUpdateRequest.targetingSpec == null : this.targetingSpec.equals(adGroupUpdateRequest.targetingSpec)) &&
        (this.lifetimeFrequencyCap == null ? adGroupUpdateRequest.lifetimeFrequencyCap == null : this.lifetimeFrequencyCap.equals(adGroupUpdateRequest.lifetimeFrequencyCap)) &&
        (this.trackingUrls == null ? adGroupUpdateRequest.trackingUrls == null : this.trackingUrls.equals(adGroupUpdateRequest.trackingUrls)) &&
        (this.autoTargetingEnabled == null ? adGroupUpdateRequest.autoTargetingEnabled == null : this.autoTargetingEnabled.equals(adGroupUpdateRequest.autoTargetingEnabled)) &&
        (this.placementGroup == null ? adGroupUpdateRequest.placementGroup == null : this.placementGroup.equals(adGroupUpdateRequest.placementGroup)) &&
        (this.pacingDeliveryType == null ? adGroupUpdateRequest.pacingDeliveryType == null : this.pacingDeliveryType.equals(adGroupUpdateRequest.pacingDeliveryType)) &&
        (this.campaignId == null ? adGroupUpdateRequest.campaignId == null : this.campaignId.equals(adGroupUpdateRequest.campaignId)) &&
        (this.billableEvent == null ? adGroupUpdateRequest.billableEvent == null : this.billableEvent.equals(adGroupUpdateRequest.billableEvent)) &&
        (this.bidStrategyType == null ? adGroupUpdateRequest.bidStrategyType == null : this.bidStrategyType.equals(adGroupUpdateRequest.bidStrategyType)) &&
        (this.id == null ? adGroupUpdateRequest.id == null : this.id.equals(adGroupUpdateRequest.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.budgetInMicroCurrency == null ? 0: this.budgetInMicroCurrency.hashCode());
    result = 31 * result + (this.bidInMicroCurrency == null ? 0: this.bidInMicroCurrency.hashCode());
    result = 31 * result + (this.optimizationGoalMetadata == null ? 0: this.optimizationGoalMetadata.hashCode());
    result = 31 * result + (this.budgetType == null ? 0: this.budgetType.hashCode());
    result = 31 * result + (this.startTime == null ? 0: this.startTime.hashCode());
    result = 31 * result + (this.endTime == null ? 0: this.endTime.hashCode());
    result = 31 * result + (this.targetingSpec == null ? 0: this.targetingSpec.hashCode());
    result = 31 * result + (this.lifetimeFrequencyCap == null ? 0: this.lifetimeFrequencyCap.hashCode());
    result = 31 * result + (this.trackingUrls == null ? 0: this.trackingUrls.hashCode());
    result = 31 * result + (this.autoTargetingEnabled == null ? 0: this.autoTargetingEnabled.hashCode());
    result = 31 * result + (this.placementGroup == null ? 0: this.placementGroup.hashCode());
    result = 31 * result + (this.pacingDeliveryType == null ? 0: this.pacingDeliveryType.hashCode());
    result = 31 * result + (this.campaignId == null ? 0: this.campaignId.hashCode());
    result = 31 * result + (this.billableEvent == null ? 0: this.billableEvent.hashCode());
    result = 31 * result + (this.bidStrategyType == null ? 0: this.bidStrategyType.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupUpdateRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  budgetInMicroCurrency: ").append(budgetInMicroCurrency).append("\n");
    sb.append("  bidInMicroCurrency: ").append(bidInMicroCurrency).append("\n");
    sb.append("  optimizationGoalMetadata: ").append(optimizationGoalMetadata).append("\n");
    sb.append("  budgetType: ").append(budgetType).append("\n");
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  endTime: ").append(endTime).append("\n");
    sb.append("  targetingSpec: ").append(targetingSpec).append("\n");
    sb.append("  lifetimeFrequencyCap: ").append(lifetimeFrequencyCap).append("\n");
    sb.append("  trackingUrls: ").append(trackingUrls).append("\n");
    sb.append("  autoTargetingEnabled: ").append(autoTargetingEnabled).append("\n");
    sb.append("  placementGroup: ").append(placementGroup).append("\n");
    sb.append("  pacingDeliveryType: ").append(pacingDeliveryType).append("\n");
    sb.append("  campaignId: ").append(campaignId).append("\n");
    sb.append("  billableEvent: ").append(billableEvent).append("\n");
    sb.append("  bidStrategyType: ").append(bidStrategyType).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}