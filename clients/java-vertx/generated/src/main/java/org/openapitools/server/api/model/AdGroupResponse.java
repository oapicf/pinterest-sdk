package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ActionType;
import org.openapitools.server.api.model.AdGroupCommonOptimizationGoalMetadata;
import org.openapitools.server.api.model.AdGroupCommonTrackingUrls;
import org.openapitools.server.api.model.AdGroupSummaryStatus;
import org.openapitools.server.api.model.BudgetType;
import org.openapitools.server.api.model.EntityStatus;
import org.openapitools.server.api.model.PacingDeliveryType;
import org.openapitools.server.api.model.PlacementGroupType;
import org.openapitools.server.api.model.TargetingSpec;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupResponse   {
  
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
  private String id;
  private String adAccountId;
  private Integer createdTime;
  private Integer updatedTime;
  private String type = "adgroup";


  public enum ConversionLearningModeTypeEnum {
    NOT_ACTIVE("NOT_ACTIVE"),
    ACTIVE("ACTIVE"),
    NULL("null");

    private String value;

    ConversionLearningModeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ConversionLearningModeTypeEnum conversionLearningModeType;
  private AdGroupSummaryStatus summaryStatus;
  private String feedProfileId;
  private Object dcaAssets = null;

  public AdGroupResponse () {

  }

  public AdGroupResponse (String name, EntityStatus status, Integer budgetInMicroCurrency, Integer bidInMicroCurrency, AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata, BudgetType budgetType, Integer startTime, Integer endTime, TargetingSpec targetingSpec, Integer lifetimeFrequencyCap, AdGroupCommonTrackingUrls trackingUrls, Boolean autoTargetingEnabled, PlacementGroupType placementGroup, PacingDeliveryType pacingDeliveryType, String campaignId, ActionType billableEvent, BidStrategyTypeEnum bidStrategyType, String id, String adAccountId, Integer createdTime, Integer updatedTime, String type, ConversionLearningModeTypeEnum conversionLearningModeType, AdGroupSummaryStatus summaryStatus, String feedProfileId, Object dcaAssets) {
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
    this.id = id;
    this.adAccountId = adAccountId;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.type = type;
    this.conversionLearningModeType = conversionLearningModeType;
    this.summaryStatus = summaryStatus;
    this.feedProfileId = feedProfileId;
    this.dcaAssets = dcaAssets;
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

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("conversion_learning_mode_type")
  public ConversionLearningModeTypeEnum getConversionLearningModeType() {
    return conversionLearningModeType;
  }
  public void setConversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

    
  @JsonProperty("summary_status")
  public AdGroupSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

    
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

    
  @JsonProperty("dca_assets")
  public Object getDcaAssets() {
    return dcaAssets;
  }
  public void setDcaAssets(Object dcaAssets) {
    this.dcaAssets = dcaAssets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupResponse adGroupResponse = (AdGroupResponse) o;
    return Objects.equals(name, adGroupResponse.name) &&
        Objects.equals(status, adGroupResponse.status) &&
        Objects.equals(budgetInMicroCurrency, adGroupResponse.budgetInMicroCurrency) &&
        Objects.equals(bidInMicroCurrency, adGroupResponse.bidInMicroCurrency) &&
        Objects.equals(optimizationGoalMetadata, adGroupResponse.optimizationGoalMetadata) &&
        Objects.equals(budgetType, adGroupResponse.budgetType) &&
        Objects.equals(startTime, adGroupResponse.startTime) &&
        Objects.equals(endTime, adGroupResponse.endTime) &&
        Objects.equals(targetingSpec, adGroupResponse.targetingSpec) &&
        Objects.equals(lifetimeFrequencyCap, adGroupResponse.lifetimeFrequencyCap) &&
        Objects.equals(trackingUrls, adGroupResponse.trackingUrls) &&
        Objects.equals(autoTargetingEnabled, adGroupResponse.autoTargetingEnabled) &&
        Objects.equals(placementGroup, adGroupResponse.placementGroup) &&
        Objects.equals(pacingDeliveryType, adGroupResponse.pacingDeliveryType) &&
        Objects.equals(campaignId, adGroupResponse.campaignId) &&
        Objects.equals(billableEvent, adGroupResponse.billableEvent) &&
        Objects.equals(bidStrategyType, adGroupResponse.bidStrategyType) &&
        Objects.equals(id, adGroupResponse.id) &&
        Objects.equals(adAccountId, adGroupResponse.adAccountId) &&
        Objects.equals(createdTime, adGroupResponse.createdTime) &&
        Objects.equals(updatedTime, adGroupResponse.updatedTime) &&
        Objects.equals(type, adGroupResponse.type) &&
        Objects.equals(conversionLearningModeType, adGroupResponse.conversionLearningModeType) &&
        Objects.equals(summaryStatus, adGroupResponse.summaryStatus) &&
        Objects.equals(feedProfileId, adGroupResponse.feedProfileId) &&
        Objects.equals(dcaAssets, adGroupResponse.dcaAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, optimizationGoalMetadata, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, campaignId, billableEvent, bidStrategyType, id, adAccountId, createdTime, updatedTime, type, conversionLearningModeType, summaryStatus, feedProfileId, dcaAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupResponse {\n");
    
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
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conversionLearningModeType: ").append(toIndentedString(conversionLearningModeType)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
    sb.append("    dcaAssets: ").append(toIndentedString(dcaAssets)).append("\n");
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
