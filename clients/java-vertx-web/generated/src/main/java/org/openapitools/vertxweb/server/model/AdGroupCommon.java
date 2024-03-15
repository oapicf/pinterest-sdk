package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ActionType;
import org.openapitools.vertxweb.server.model.AdGroupCommonOptimizationGoalMetadata;
import org.openapitools.vertxweb.server.model.AdGroupCommonTrackingUrls;
import org.openapitools.vertxweb.server.model.BudgetType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.PacingDeliveryType;
import org.openapitools.vertxweb.server.model.PlacementGroupType;
import org.openapitools.vertxweb.server.model.TargetingSpec;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupCommon   {
  
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
      return value;
    }
  }

  private BidStrategyTypeEnum bidStrategyType;

  public AdGroupCommon () {

  }

  public AdGroupCommon (String name, EntityStatus status, Integer budgetInMicroCurrency, Integer bidInMicroCurrency, AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata, BudgetType budgetType, Integer startTime, Integer endTime, TargetingSpec targetingSpec, Integer lifetimeFrequencyCap, AdGroupCommonTrackingUrls trackingUrls, Boolean autoTargetingEnabled, PlacementGroupType placementGroup, PacingDeliveryType pacingDeliveryType, String campaignId, ActionType billableEvent, BidStrategyTypeEnum bidStrategyType) {
    this.name = name;
    this.status = status;
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    this.bidInMicroCurrency = bidInMicroCurrency;
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    this.budgetType = budgetType;
    this.startTime = startTime;
    this.endTime = endTime;
    this.targetingSpec = targetingSpec;
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    this.trackingUrls = trackingUrls;
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.placementGroup = placementGroup;
    this.pacingDeliveryType = pacingDeliveryType;
    this.campaignId = campaignId;
    this.billableEvent = billableEvent;
    this.bidStrategyType = bidStrategyType;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

    
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

    
  @JsonProperty("optimization_goal_metadata")
  public AdGroupCommonOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

    
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }
  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

    
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

    
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

    
  @JsonProperty("tracking_urls")
  public AdGroupCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

    
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

    
  @JsonProperty("bid_strategy_type")
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
    return Objects.equals(name, adGroupCommon.name) &&
        Objects.equals(status, adGroupCommon.status) &&
        Objects.equals(budgetInMicroCurrency, adGroupCommon.budgetInMicroCurrency) &&
        Objects.equals(bidInMicroCurrency, adGroupCommon.bidInMicroCurrency) &&
        Objects.equals(optimizationGoalMetadata, adGroupCommon.optimizationGoalMetadata) &&
        Objects.equals(budgetType, adGroupCommon.budgetType) &&
        Objects.equals(startTime, adGroupCommon.startTime) &&
        Objects.equals(endTime, adGroupCommon.endTime) &&
        Objects.equals(targetingSpec, adGroupCommon.targetingSpec) &&
        Objects.equals(lifetimeFrequencyCap, adGroupCommon.lifetimeFrequencyCap) &&
        Objects.equals(trackingUrls, adGroupCommon.trackingUrls) &&
        Objects.equals(autoTargetingEnabled, adGroupCommon.autoTargetingEnabled) &&
        Objects.equals(placementGroup, adGroupCommon.placementGroup) &&
        Objects.equals(pacingDeliveryType, adGroupCommon.pacingDeliveryType) &&
        Objects.equals(campaignId, adGroupCommon.campaignId) &&
        Objects.equals(billableEvent, adGroupCommon.billableEvent) &&
        Objects.equals(bidStrategyType, adGroupCommon.bidStrategyType);
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
