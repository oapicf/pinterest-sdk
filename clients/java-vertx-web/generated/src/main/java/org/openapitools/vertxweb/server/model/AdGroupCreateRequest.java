package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ActionType;
import org.openapitools.vertxweb.server.model.BidStrategyType;
import org.openapitools.vertxweb.server.model.BudgetType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.PacingDeliveryType;
import org.openapitools.vertxweb.server.model.PlacementGroupType;
import org.openapitools.vertxweb.server.model.TargetingSpec;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupCreateRequest   {
  
  private Boolean autoTargetingEnabled;
  private BigDecimal bidMultiplier;
  private BudgetType budgetType;
  private PacingDeliveryType pacingDeliveryType;
  private Integer bidInMicroCurrency;
  private BidStrategyType bidStrategyType;
  private ActionType billableEvent;
  private Integer budgetInMicroCurrency;
  private String campaignId;
  private Integer endTime;
  private Boolean isCreativeOptimization;
  private Integer lifetimeFrequencyCap;
  private String name;
  private Object optimizationGoalMetadata;
  private PlacementGroupType placementGroup;


  public enum PromotionApplicationLevelEnum {
    NONE("NONE"),
    ITEM("ITEM"),
    AD_GROUP("AD_GROUP");

    private String value;

    PromotionApplicationLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PromotionApplicationLevelEnum promotionApplicationLevel;
  private String promotionId = "0";
  private List<String> promotionIds = new ArrayList<>();
  private Integer startTime;
  private EntityStatus status;
  private TargetingSpec targetingSpec;
  private List<String> targetingTemplateIds;
  private Object trackingUrls;

  public AdGroupCreateRequest () {

  }

  public AdGroupCreateRequest (Boolean autoTargetingEnabled, BigDecimal bidMultiplier, BudgetType budgetType, PacingDeliveryType pacingDeliveryType, Integer bidInMicroCurrency, BidStrategyType bidStrategyType, ActionType billableEvent, Integer budgetInMicroCurrency, String campaignId, Integer endTime, Boolean isCreativeOptimization, Integer lifetimeFrequencyCap, String name, Object optimizationGoalMetadata, PlacementGroupType placementGroup, PromotionApplicationLevelEnum promotionApplicationLevel, String promotionId, List<String> promotionIds, Integer startTime, EntityStatus status, TargetingSpec targetingSpec, List<String> targetingTemplateIds, Object trackingUrls) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.bidMultiplier = bidMultiplier;
    this.budgetType = budgetType;
    this.pacingDeliveryType = pacingDeliveryType;
    this.bidInMicroCurrency = bidInMicroCurrency;
    this.bidStrategyType = bidStrategyType;
    this.billableEvent = billableEvent;
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    this.campaignId = campaignId;
    this.endTime = endTime;
    this.isCreativeOptimization = isCreativeOptimization;
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    this.name = name;
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    this.placementGroup = placementGroup;
    this.promotionApplicationLevel = promotionApplicationLevel;
    this.promotionId = promotionId;
    this.promotionIds = promotionIds;
    this.startTime = startTime;
    this.status = status;
    this.targetingSpec = targetingSpec;
    this.targetingTemplateIds = targetingTemplateIds;
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("bid_multiplier")
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }
  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

    
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }
  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

    
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

    
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

    
  @JsonProperty("bid_strategy_type")
  public BidStrategyType getBidStrategyType() {
    return bidStrategyType;
  }
  public void setBidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

    
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

    
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

    
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("is_creative_optimization")
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }
  public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

    
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("optimization_goal_metadata")
  public Object getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(Object optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("promotion_application_level")
  public PromotionApplicationLevelEnum getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }
  public void setPromotionApplicationLevel(PromotionApplicationLevelEnum promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

    
  @JsonProperty("promotion_id")
  public String getPromotionId() {
    return promotionId;
  }
  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

    
  @JsonProperty("promotion_ids")
  public List<String> getPromotionIds() {
    return promotionIds;
  }
  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

    
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

    
  @JsonProperty("targeting_template_ids")
  public List<String> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }
  public void setTargetingTemplateIds(List<String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }

    
  @JsonProperty("tracking_urls")
  public Object getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCreateRequest adGroupCreateRequest = (AdGroupCreateRequest) o;
    return Objects.equals(autoTargetingEnabled, adGroupCreateRequest.autoTargetingEnabled) &&
        Objects.equals(bidMultiplier, adGroupCreateRequest.bidMultiplier) &&
        Objects.equals(budgetType, adGroupCreateRequest.budgetType) &&
        Objects.equals(pacingDeliveryType, adGroupCreateRequest.pacingDeliveryType) &&
        Objects.equals(bidInMicroCurrency, adGroupCreateRequest.bidInMicroCurrency) &&
        Objects.equals(bidStrategyType, adGroupCreateRequest.bidStrategyType) &&
        Objects.equals(billableEvent, adGroupCreateRequest.billableEvent) &&
        Objects.equals(budgetInMicroCurrency, adGroupCreateRequest.budgetInMicroCurrency) &&
        Objects.equals(campaignId, adGroupCreateRequest.campaignId) &&
        Objects.equals(endTime, adGroupCreateRequest.endTime) &&
        Objects.equals(isCreativeOptimization, adGroupCreateRequest.isCreativeOptimization) &&
        Objects.equals(lifetimeFrequencyCap, adGroupCreateRequest.lifetimeFrequencyCap) &&
        Objects.equals(name, adGroupCreateRequest.name) &&
        Objects.equals(optimizationGoalMetadata, adGroupCreateRequest.optimizationGoalMetadata) &&
        Objects.equals(placementGroup, adGroupCreateRequest.placementGroup) &&
        Objects.equals(promotionApplicationLevel, adGroupCreateRequest.promotionApplicationLevel) &&
        Objects.equals(promotionId, adGroupCreateRequest.promotionId) &&
        Objects.equals(promotionIds, adGroupCreateRequest.promotionIds) &&
        Objects.equals(startTime, adGroupCreateRequest.startTime) &&
        Objects.equals(status, adGroupCreateRequest.status) &&
        Objects.equals(targetingSpec, adGroupCreateRequest.targetingSpec) &&
        Objects.equals(targetingTemplateIds, adGroupCreateRequest.targetingTemplateIds) &&
        Objects.equals(trackingUrls, adGroupCreateRequest.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, bidMultiplier, budgetType, pacingDeliveryType, bidInMicroCurrency, bidStrategyType, billableEvent, budgetInMicroCurrency, campaignId, endTime, isCreativeOptimization, lifetimeFrequencyCap, name, optimizationGoalMetadata, placementGroup, promotionApplicationLevel, promotionId, promotionIds, startTime, status, targetingSpec, targetingTemplateIds, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCreateRequest {\n");
    
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isCreativeOptimization: ").append(toIndentedString(isCreativeOptimization)).append("\n");
    sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    promotionApplicationLevel: ").append(toIndentedString(promotionApplicationLevel)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    targetingTemplateIds: ").append(toIndentedString(targetingTemplateIds)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
