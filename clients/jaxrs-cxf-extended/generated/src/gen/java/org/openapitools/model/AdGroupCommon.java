package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupCommonOptimizationGoalMetadata;
import org.openapitools.model.AdGroupCommonTrackingUrls;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupCommon  {
  
 /**
  * Ad group name.
  */
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", value = "Ad group name.")
  private String name;

 /**
  * Ad group/entity status.
  */
  @ApiModelProperty(value = "Ad group/entity status.")
  @Valid
  private EntityStatus status;

 /**
  * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  */
  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  private Integer budgetInMicroCurrency;

 /**
  * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  */
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  private Integer bidInMicroCurrency;

  @ApiModelProperty(value = "")
  @Valid
  private AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata;

  @ApiModelProperty(value = "")
  @Valid
  private BudgetType budgetType;

 /**
  * Ad group start time. Unix timestamp in seconds. Defaults to current time.
  */
  @ApiModelProperty(example = "5686848000", value = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
  private Integer startTime;

 /**
  * Ad group end time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "5705424000", value = "Ad group end time. Unix timestamp in seconds.")
  private Integer endTime;

  @ApiModelProperty(value = "")
  @Valid
  private TargetingSpec targetingSpec;

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  */
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  private Integer lifetimeFrequencyCap;

  @ApiModelProperty(value = "")
  @Valid
  private AdGroupCommonTrackingUrls trackingUrls;

 /**
  * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  */
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  private Boolean autoTargetingEnabled;

 /**
  * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
  */
  @ApiModelProperty(value = "<a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.")
  @Valid
  private PlacementGroupType placementGroup;

  @ApiModelProperty(value = "")
  @Valid
  private PacingDeliveryType pacingDeliveryType;

 /**
  * Campaign ID of the ad group.
  */
  @ApiModelProperty(example = "626736533506", value = "Campaign ID of the ad group.")
  private String campaignId;

  @ApiModelProperty(value = "")
  @Valid
  private ActionType billableEvent;

public enum BidStrategyTypeEnum {

    @JsonProperty("AUTOMATIC_BID") AUTOMATIC_BID(String.valueOf("AUTOMATIC_BID")),
    @JsonProperty("MAX_BID") MAX_BID(String.valueOf("MAX_BID")),
    @JsonProperty("TARGET_AVG") TARGET_AVG(String.valueOf("TARGET_AVG")),
    @JsonProperty("null") NULL(String.valueOf("null"));

    private String value;

    BidStrategyTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BidStrategyTypeEnum fromValue(String value) {
        for (BidStrategyTypeEnum b : BidStrategyTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * Bid strategy type
  */
  @ApiModelProperty(example = "MAX_BID", value = "Bid strategy type")
  private BidStrategyTypeEnum bidStrategyType;
 /**
  * Ad group name.
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
  public AdGroupCommon name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Ad group/entity status.
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
  public AdGroupCommon status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  * @return budgetInMicroCurrency
  */
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  /**
   * Sets the <code>budgetInMicroCurrency</code> property.
   */
 public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  /**
   * Sets the <code>budgetInMicroCurrency</code> property.
   */
  public AdGroupCommon budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

 /**
  * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  * @return bidInMicroCurrency
  */
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  /**
   * Sets the <code>bidInMicroCurrency</code> property.
   */
 public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * Sets the <code>bidInMicroCurrency</code> property.
   */
  public AdGroupCommon bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
  * Get optimizationGoalMetadata
  * @return optimizationGoalMetadata
  */
  @JsonProperty("optimization_goal_metadata")
  public AdGroupCommonOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  /**
   * Sets the <code>optimizationGoalMetadata</code> property.
   */
 public void setOptimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   * Sets the <code>optimizationGoalMetadata</code> property.
   */
  public AdGroupCommon optimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

 /**
  * Get budgetType
  * @return budgetType
  */
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }

  /**
   * Sets the <code>budgetType</code> property.
   */
 public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Sets the <code>budgetType</code> property.
   */
  public AdGroupCommon budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

 /**
  * Ad group start time. Unix timestamp in seconds. Defaults to current time.
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
  public AdGroupCommon startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * Ad group end time. Unix timestamp in seconds.
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
  public AdGroupCommon endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Get targetingSpec
  * @return targetingSpec
  */
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
 public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
  public AdGroupCommon targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
  * @return lifetimeFrequencyCap
  */
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  /**
   * Sets the <code>lifetimeFrequencyCap</code> property.
   */
 public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * Sets the <code>lifetimeFrequencyCap</code> property.
   */
  public AdGroupCommon lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

 /**
  * Get trackingUrls
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public AdGroupCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public AdGroupCommon trackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
  * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
  * @return autoTargetingEnabled
  */
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
 public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
  public AdGroupCommon autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
  * &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
  * @return placementGroup
  */
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
 public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
  public AdGroupCommon placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
  * Get pacingDeliveryType
  * @return pacingDeliveryType
  */
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  /**
   * Sets the <code>pacingDeliveryType</code> property.
   */
 public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * Sets the <code>pacingDeliveryType</code> property.
   */
  public AdGroupCommon pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

 /**
  * Campaign ID of the ad group.
  * @return campaignId
  */
  @JsonProperty("campaign_id")
 @Pattern(regexp="^[C]?\\d+$")  public String getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public AdGroupCommon campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Get billableEvent
  * @return billableEvent
  */
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  /**
   * Sets the <code>billableEvent</code> property.
   */
 public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * Sets the <code>billableEvent</code> property.
   */
  public AdGroupCommon billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

 /**
  * Bid strategy type
  * @return bidStrategyType
  */
  @JsonProperty("bid_strategy_type")
  public String getBidStrategyType() {
    return bidStrategyType == null ? null : bidStrategyType.value();
  }

  /**
   * Sets the <code>bidStrategyType</code> property.
   */
 public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  /**
   * Sets the <code>bidStrategyType</code> property.
   */
  public AdGroupCommon bidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
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
    return Objects.equals(this.name, adGroupCommon.name) &&
        Objects.equals(this.status, adGroupCommon.status) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupCommon.budgetInMicroCurrency) &&
        Objects.equals(this.bidInMicroCurrency, adGroupCommon.bidInMicroCurrency) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupCommon.optimizationGoalMetadata) &&
        Objects.equals(this.budgetType, adGroupCommon.budgetType) &&
        Objects.equals(this.startTime, adGroupCommon.startTime) &&
        Objects.equals(this.endTime, adGroupCommon.endTime) &&
        Objects.equals(this.targetingSpec, adGroupCommon.targetingSpec) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupCommon.lifetimeFrequencyCap) &&
        Objects.equals(this.trackingUrls, adGroupCommon.trackingUrls) &&
        Objects.equals(this.autoTargetingEnabled, adGroupCommon.autoTargetingEnabled) &&
        Objects.equals(this.placementGroup, adGroupCommon.placementGroup) &&
        Objects.equals(this.pacingDeliveryType, adGroupCommon.pacingDeliveryType) &&
        Objects.equals(this.campaignId, adGroupCommon.campaignId) &&
        Objects.equals(this.billableEvent, adGroupCommon.billableEvent) &&
        Objects.equals(this.bidStrategyType, adGroupCommon.bidStrategyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, optimizationGoalMetadata, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, campaignId, billableEvent, bidStrategyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCommon {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
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

