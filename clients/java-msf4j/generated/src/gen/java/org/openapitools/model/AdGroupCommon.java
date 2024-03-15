package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupCommonOptimizationGoalMetadata;
import org.openapitools.model.AdGroupCommonTrackingUrls;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;

/**
 * AdGroupCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupCommon   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("budget_in_micro_currency")
  private Integer budgetInMicroCurrency;

  @JsonProperty("bid_in_micro_currency")
  private Integer bidInMicroCurrency;

  @JsonProperty("optimization_goal_metadata")
  private AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata;

  @JsonProperty("budget_type")
  private BudgetType budgetType;

  @JsonProperty("start_time")
  private Integer startTime;

  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("targeting_spec")
  private TargetingSpec targetingSpec;

  @JsonProperty("lifetime_frequency_cap")
  private Integer lifetimeFrequencyCap;

  @JsonProperty("tracking_urls")
  private AdGroupCommonTrackingUrls trackingUrls;

  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled;

  @JsonProperty("placement_group")
  private PlacementGroupType placementGroup;

  @JsonProperty("pacing_delivery_type")
  private PacingDeliveryType pacingDeliveryType;

  @JsonProperty("campaign_id")
  private String campaignId;

  @JsonProperty("billable_event")
  private ActionType billableEvent;

  /**
   * Bid strategy type
   */
  public enum BidStrategyTypeEnum {
    AUTOMATIC_BID("AUTOMATIC_BID"),
    
    MAX_BID("MAX_BID"),
    
    TARGET_AVG("TARGET_AVG"),
    
    NULL("null");

    private String value;

    BidStrategyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BidStrategyTypeEnum fromValue(String text) {
      for (BidStrategyTypeEnum b : BidStrategyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("bid_strategy_type")
  private BidStrategyTypeEnum bidStrategyType;

  public AdGroupCommon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Ad group name.
   * @return name
  **/
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", value = "Ad group name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdGroupCommon status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Ad group/entity status.
   * @return status
  **/
  @ApiModelProperty(value = "Ad group/entity status.")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdGroupCommon budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

   /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
  **/
  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  public AdGroupCommon bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

   /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
  **/
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupCommon optimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

   /**
   * Get optimizationGoalMetadata
   * @return optimizationGoalMetadata
  **/
  @ApiModelProperty(value = "")
  public AdGroupCommonOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupCommon budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

   /**
   * Get budgetType
   * @return budgetType
  **/
  @ApiModelProperty(value = "")
  public BudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  public AdGroupCommon startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   * @return startTime
  **/
  @ApiModelProperty(example = "5686848000", value = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public AdGroupCommon endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Ad group end time. Unix timestamp in seconds.
   * @return endTime
  **/
  @ApiModelProperty(example = "5705424000", value = "Ad group end time. Unix timestamp in seconds.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public AdGroupCommon targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @ApiModelProperty(value = "")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupCommon lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

   /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   * @return lifetimeFrequencyCap
  **/
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupCommon trackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @ApiModelProperty(value = "")
  public AdGroupCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdGroupCommon autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

   /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   * @return autoTargetingEnabled
  **/
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupCommon placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

   /**
   * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
   * @return placementGroup
  **/
  @ApiModelProperty(value = "<a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupCommon pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

   /**
   * Get pacingDeliveryType
   * @return pacingDeliveryType
  **/
  @ApiModelProperty(value = "")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  public AdGroupCommon campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign ID of the ad group.
   * @return campaignId
  **/
  @ApiModelProperty(example = "626736533506", value = "Campaign ID of the ad group.")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupCommon billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

   /**
   * Get billableEvent
   * @return billableEvent
  **/
  @ApiModelProperty(value = "")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupCommon bidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
  }

   /**
   * Bid strategy type
   * @return bidStrategyType
  **/
  @ApiModelProperty(example = "MAX_BID", value = "Bid strategy type")
  public BidStrategyTypeEnum getBidStrategyType() {
    return bidStrategyType;
  }

  public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

