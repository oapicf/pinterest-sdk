package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AdGroupUpdateRequest   {
  
  private String name;

  private EntityStatus status;

  private Integer budgetInMicroCurrency;

  private Integer bidInMicroCurrency;

  private AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata;

  private BudgetType budgetType;

  private Integer startTime;

  private Integer endTime;

  private TargetingSpec targetingSpec;

  private Integer lifetimeFrequencyCap;

  private AdGroupCommonTrackingUrls trackingUrls;

  private Boolean autoTargetingEnabled;

  private PlacementGroupType placementGroup;

  private PacingDeliveryType pacingDeliveryType;

  private String campaignId;

  private ActionType billableEvent;


public enum BidStrategyTypeEnum {

    @JsonProperty("AUTOMATIC_BID") AUTOMATIC_BID(String.valueOf("AUTOMATIC_BID")), @JsonProperty("MAX_BID") MAX_BID(String.valueOf("MAX_BID")), @JsonProperty("TARGET_AVG") TARGET_AVG(String.valueOf("TARGET_AVG")), @JsonProperty("null") NULL(String.valueOf("null"));


    private String value;

    BidStrategyTypeEnum(String v) {
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

  private BidStrategyTypeEnum bidStrategyType;

  private String id;

  /**
   * Ad group name.
   **/
  public AdGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", value = "Ad group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Ad group/entity status.
   **/
  public AdGroupUpdateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Ad group/entity status.")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   **/
  public AdGroupUpdateRequest budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }


  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   **/
  public AdGroupUpdateRequest bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }


  /**
   **/
  public AdGroupUpdateRequest optimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("optimization_goal_metadata")
  public AdGroupCommonOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }


  /**
   **/
  public AdGroupUpdateRequest budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }
  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }


  /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   **/
  public AdGroupUpdateRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "5686848000", value = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  /**
   * Ad group end time. Unix timestamp in seconds.
   **/
  public AdGroupUpdateRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "5705424000", value = "Ad group end time. Unix timestamp in seconds.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }


  /**
   **/
  public AdGroupUpdateRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }


  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   **/
  public AdGroupUpdateRequest lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }


  /**
   **/
  public AdGroupUpdateRequest trackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public AdGroupCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }


  /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   **/
  public AdGroupUpdateRequest autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }


  /**
   * &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   **/
  public AdGroupUpdateRequest placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }


  /**
   **/
  public AdGroupUpdateRequest pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }


  /**
   * Campaign ID of the ad group.
   **/
  public AdGroupUpdateRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(example = "626736533506", value = "Campaign ID of the ad group.")
  @JsonProperty("campaign_id")
 @Pattern(regexp="^[C]?\\d+$")  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  /**
   **/
  public AdGroupUpdateRequest billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }


  /**
   * Bid strategy type
   **/
  public AdGroupUpdateRequest bidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
  }

  
  @ApiModelProperty(example = "MAX_BID", value = "Bid strategy type")
  @JsonProperty("bid_strategy_type")
  public BidStrategyTypeEnum getBidStrategyType() {
    return bidStrategyType;
  }
  public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }


  /**
   * Ad group ID.
   **/
  public AdGroupUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2680060704746", required = true, value = "Ad group ID.")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
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
    return Objects.equals(this.name, adGroupUpdateRequest.name) &&
        Objects.equals(this.status, adGroupUpdateRequest.status) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupUpdateRequest.budgetInMicroCurrency) &&
        Objects.equals(this.bidInMicroCurrency, adGroupUpdateRequest.bidInMicroCurrency) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupUpdateRequest.optimizationGoalMetadata) &&
        Objects.equals(this.budgetType, adGroupUpdateRequest.budgetType) &&
        Objects.equals(this.startTime, adGroupUpdateRequest.startTime) &&
        Objects.equals(this.endTime, adGroupUpdateRequest.endTime) &&
        Objects.equals(this.targetingSpec, adGroupUpdateRequest.targetingSpec) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupUpdateRequest.lifetimeFrequencyCap) &&
        Objects.equals(this.trackingUrls, adGroupUpdateRequest.trackingUrls) &&
        Objects.equals(this.autoTargetingEnabled, adGroupUpdateRequest.autoTargetingEnabled) &&
        Objects.equals(this.placementGroup, adGroupUpdateRequest.placementGroup) &&
        Objects.equals(this.pacingDeliveryType, adGroupUpdateRequest.pacingDeliveryType) &&
        Objects.equals(this.campaignId, adGroupUpdateRequest.campaignId) &&
        Objects.equals(this.billableEvent, adGroupUpdateRequest.billableEvent) &&
        Objects.equals(this.bidStrategyType, adGroupUpdateRequest.bidStrategyType) &&
        Objects.equals(this.id, adGroupUpdateRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, optimizationGoalMetadata, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, campaignId, billableEvent, bidStrategyType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupUpdateRequest {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

