/**
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

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ActionType;
import org.openapitools.client.model.BudgetType;
import org.openapitools.client.model.EntityStatus;
import org.openapitools.client.model.OptimizationGoalMetadata;
import org.openapitools.client.model.PacingDeliveryType;
import org.openapitools.client.model.PlacementGroupType;
import org.openapitools.client.model.TargetingSpec;
import org.openapitools.client.model.TrackingUrls;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AdGroupCommon {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("status")
  private EntityStatus status = null;
  @SerializedName("budget_in_micro_currency")
  private Integer budgetInMicroCurrency = null;
  @SerializedName("bid_in_micro_currency")
  private Integer bidInMicroCurrency = null;
  @SerializedName("optimization_goal_metadata")
  private OptimizationGoalMetadata optimizationGoalMetadata = null;
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
  private TrackingUrls trackingUrls = null;
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
  @SerializedName("targeting_template_ids")
  private List<String> targetingTemplateIds = null;

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
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
   **/
  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
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
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   **/
  @ApiModelProperty(value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
   **/
  @ApiModelProperty(value = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
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
   * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
   **/
  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
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
   * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
   **/
  @ApiModelProperty(value = "Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.")
  public BidStrategyTypeEnum getBidStrategyType() {
    return bidStrategyType;
  }
  public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
   **/
  @ApiModelProperty(value = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
  public List<String> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }
  public void setTargetingTemplateIds(List<String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCommon adGroupCommon = (AdGroupCommon) o;
    return (this.name == null ? adGroupCommon.name == null : this.name.equals(adGroupCommon.name)) &&
        (this.status == null ? adGroupCommon.status == null : this.status.equals(adGroupCommon.status)) &&
        (this.budgetInMicroCurrency == null ? adGroupCommon.budgetInMicroCurrency == null : this.budgetInMicroCurrency.equals(adGroupCommon.budgetInMicroCurrency)) &&
        (this.bidInMicroCurrency == null ? adGroupCommon.bidInMicroCurrency == null : this.bidInMicroCurrency.equals(adGroupCommon.bidInMicroCurrency)) &&
        (this.optimizationGoalMetadata == null ? adGroupCommon.optimizationGoalMetadata == null : this.optimizationGoalMetadata.equals(adGroupCommon.optimizationGoalMetadata)) &&
        (this.budgetType == null ? adGroupCommon.budgetType == null : this.budgetType.equals(adGroupCommon.budgetType)) &&
        (this.startTime == null ? adGroupCommon.startTime == null : this.startTime.equals(adGroupCommon.startTime)) &&
        (this.endTime == null ? adGroupCommon.endTime == null : this.endTime.equals(adGroupCommon.endTime)) &&
        (this.targetingSpec == null ? adGroupCommon.targetingSpec == null : this.targetingSpec.equals(adGroupCommon.targetingSpec)) &&
        (this.lifetimeFrequencyCap == null ? adGroupCommon.lifetimeFrequencyCap == null : this.lifetimeFrequencyCap.equals(adGroupCommon.lifetimeFrequencyCap)) &&
        (this.trackingUrls == null ? adGroupCommon.trackingUrls == null : this.trackingUrls.equals(adGroupCommon.trackingUrls)) &&
        (this.autoTargetingEnabled == null ? adGroupCommon.autoTargetingEnabled == null : this.autoTargetingEnabled.equals(adGroupCommon.autoTargetingEnabled)) &&
        (this.placementGroup == null ? adGroupCommon.placementGroup == null : this.placementGroup.equals(adGroupCommon.placementGroup)) &&
        (this.pacingDeliveryType == null ? adGroupCommon.pacingDeliveryType == null : this.pacingDeliveryType.equals(adGroupCommon.pacingDeliveryType)) &&
        (this.campaignId == null ? adGroupCommon.campaignId == null : this.campaignId.equals(adGroupCommon.campaignId)) &&
        (this.billableEvent == null ? adGroupCommon.billableEvent == null : this.billableEvent.equals(adGroupCommon.billableEvent)) &&
        (this.bidStrategyType == null ? adGroupCommon.bidStrategyType == null : this.bidStrategyType.equals(adGroupCommon.bidStrategyType)) &&
        (this.targetingTemplateIds == null ? adGroupCommon.targetingTemplateIds == null : this.targetingTemplateIds.equals(adGroupCommon.targetingTemplateIds));
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
    result = 31 * result + (this.targetingTemplateIds == null ? 0: this.targetingTemplateIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCommon {\n");
    
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
    sb.append("  targetingTemplateIds: ").append(targetingTemplateIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
