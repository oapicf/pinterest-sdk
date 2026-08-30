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
import org.openapitools.vertxweb.server.model.AdGroupTrackingURLs;
import org.openapitools.vertxweb.server.model.AdgroupTrackingFeatures;
import org.openapitools.vertxweb.server.model.BidStrategyType;
import org.openapitools.vertxweb.server.model.ConversionLearningModeType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.NullableOptimizationGoalMetadata;
import org.openapitools.vertxweb.server.model.PerformancePlusCampaignSettings;
import org.openapitools.vertxweb.server.model.PlacementGroupType;
import org.openapitools.vertxweb.server.model.PlacementTrafficType;
import org.openapitools.vertxweb.server.model.PromotionApplicationLevel;
import org.openapitools.vertxweb.server.model.SummaryStatus;
import org.openapitools.vertxweb.server.model.TargetingSpecOptimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupBase   {
  
  private String adAccountId;
  private Integer bidInMicroCurrency;
  private BidStrategyType bidStrategyType;
  private ActionType billableEvent;
  private Integer budgetInMicroCurrency;
  private String campaignId;
  private ConversionLearningModeType conversionLearningModeType;
  private Integer createdTime;
  private String customerSegmentId;
  private Object dcaAssets = null;
  private Integer endTime;
  private AdgroupTrackingFeatures extFeatures;
  private String feedProfileId;
  private String id;
  private Boolean isCreativeOptimization;
  private Boolean isLocalInventory;
  private Integer lifetimeFrequencyCap;
  private BigDecimal localInventoryRadiusInMiles;
  private String name;
  private NullableOptimizationGoalMetadata optimizationGoalMetadata;
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;
  private PlacementGroupType placementGroup;
  private PlacementTrafficType placementTrafficType;
  private PromotionApplicationLevel promotionApplicationLevel;
  private String promotionId = "0";
  private List<String> promotionIds = new ArrayList<>();
  private Integer startTime;
  private EntityStatus status;
  private SummaryStatus summaryStatus;
  private TargetingSpecOptimal targetingSpec;
  private List<String> targetingTemplateIds;
  private AdGroupTrackingURLs trackingUrls;
  private String type = "adgroup";
  private Integer updatedTime;

  public AdGroupBase () {

  }

  public AdGroupBase (String adAccountId, Integer bidInMicroCurrency, BidStrategyType bidStrategyType, ActionType billableEvent, Integer budgetInMicroCurrency, String campaignId, ConversionLearningModeType conversionLearningModeType, Integer createdTime, String customerSegmentId, Object dcaAssets, Integer endTime, AdgroupTrackingFeatures extFeatures, String feedProfileId, String id, Boolean isCreativeOptimization, Boolean isLocalInventory, Integer lifetimeFrequencyCap, BigDecimal localInventoryRadiusInMiles, String name, NullableOptimizationGoalMetadata optimizationGoalMetadata, PerformancePlusCampaignSettings performancePlusCampaignSettings, PlacementGroupType placementGroup, PlacementTrafficType placementTrafficType, PromotionApplicationLevel promotionApplicationLevel, String promotionId, List<String> promotionIds, Integer startTime, EntityStatus status, SummaryStatus summaryStatus, TargetingSpecOptimal targetingSpec, List<String> targetingTemplateIds, AdGroupTrackingURLs trackingUrls, String type, Integer updatedTime) {
    this.adAccountId = adAccountId;
    this.bidInMicroCurrency = bidInMicroCurrency;
    this.bidStrategyType = bidStrategyType;
    this.billableEvent = billableEvent;
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    this.campaignId = campaignId;
    this.conversionLearningModeType = conversionLearningModeType;
    this.createdTime = createdTime;
    this.customerSegmentId = customerSegmentId;
    this.dcaAssets = dcaAssets;
    this.endTime = endTime;
    this.extFeatures = extFeatures;
    this.feedProfileId = feedProfileId;
    this.id = id;
    this.isCreativeOptimization = isCreativeOptimization;
    this.isLocalInventory = isLocalInventory;
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
    this.name = name;
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    this.placementGroup = placementGroup;
    this.placementTrafficType = placementTrafficType;
    this.promotionApplicationLevel = promotionApplicationLevel;
    this.promotionId = promotionId;
    this.promotionIds = promotionIds;
    this.startTime = startTime;
    this.status = status;
    this.summaryStatus = summaryStatus;
    this.targetingSpec = targetingSpec;
    this.targetingTemplateIds = targetingTemplateIds;
    this.trackingUrls = trackingUrls;
    this.type = type;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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

    
  @JsonProperty("conversion_learning_mode_type")
  public ConversionLearningModeType getConversionLearningModeType() {
    return conversionLearningModeType;
  }
  public void setConversionLearningModeType(ConversionLearningModeType conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("customer_segment_id")
  public String getCustomerSegmentId() {
    return customerSegmentId;
  }
  public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

    
  @JsonProperty("dca_assets")
  public Object getDcaAssets() {
    return dcaAssets;
  }
  public void setDcaAssets(Object dcaAssets) {
    this.dcaAssets = dcaAssets;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("ext_features")
  public AdgroupTrackingFeatures getExtFeatures() {
    return extFeatures;
  }
  public void setExtFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
  }

    
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("is_creative_optimization")
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }
  public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

    
  @JsonProperty("is_local_inventory")
  public Boolean getIsLocalInventory() {
    return isLocalInventory;
  }
  public void setIsLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
  }

    
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

    
  @JsonProperty("local_inventory_radius_in_miles")
  public BigDecimal getLocalInventoryRadiusInMiles() {
    return localInventoryRadiusInMiles;
  }
  public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("optimization_goal_metadata")
  public NullableOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

    
  @JsonProperty("performance_plus_campaign_settings")
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }
  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("placement_traffic_type")
  public PlacementTrafficType getPlacementTrafficType() {
    return placementTrafficType;
  }
  public void setPlacementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
  }

    
  @JsonProperty("promotion_application_level")
  public PromotionApplicationLevel getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }
  public void setPromotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
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

    
  @JsonProperty("summary_status")
  public SummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

    
  @JsonProperty("targeting_spec")
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
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
  public AdGroupTrackingURLs getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupBase adGroupBase = (AdGroupBase) o;
    return Objects.equals(adAccountId, adGroupBase.adAccountId) &&
        Objects.equals(bidInMicroCurrency, adGroupBase.bidInMicroCurrency) &&
        Objects.equals(bidStrategyType, adGroupBase.bidStrategyType) &&
        Objects.equals(billableEvent, adGroupBase.billableEvent) &&
        Objects.equals(budgetInMicroCurrency, adGroupBase.budgetInMicroCurrency) &&
        Objects.equals(campaignId, adGroupBase.campaignId) &&
        Objects.equals(conversionLearningModeType, adGroupBase.conversionLearningModeType) &&
        Objects.equals(createdTime, adGroupBase.createdTime) &&
        Objects.equals(customerSegmentId, adGroupBase.customerSegmentId) &&
        Objects.equals(dcaAssets, adGroupBase.dcaAssets) &&
        Objects.equals(endTime, adGroupBase.endTime) &&
        Objects.equals(extFeatures, adGroupBase.extFeatures) &&
        Objects.equals(feedProfileId, adGroupBase.feedProfileId) &&
        Objects.equals(id, adGroupBase.id) &&
        Objects.equals(isCreativeOptimization, adGroupBase.isCreativeOptimization) &&
        Objects.equals(isLocalInventory, adGroupBase.isLocalInventory) &&
        Objects.equals(lifetimeFrequencyCap, adGroupBase.lifetimeFrequencyCap) &&
        Objects.equals(localInventoryRadiusInMiles, adGroupBase.localInventoryRadiusInMiles) &&
        Objects.equals(name, adGroupBase.name) &&
        Objects.equals(optimizationGoalMetadata, adGroupBase.optimizationGoalMetadata) &&
        Objects.equals(performancePlusCampaignSettings, adGroupBase.performancePlusCampaignSettings) &&
        Objects.equals(placementGroup, adGroupBase.placementGroup) &&
        Objects.equals(placementTrafficType, adGroupBase.placementTrafficType) &&
        Objects.equals(promotionApplicationLevel, adGroupBase.promotionApplicationLevel) &&
        Objects.equals(promotionId, adGroupBase.promotionId) &&
        Objects.equals(promotionIds, adGroupBase.promotionIds) &&
        Objects.equals(startTime, adGroupBase.startTime) &&
        Objects.equals(status, adGroupBase.status) &&
        Objects.equals(summaryStatus, adGroupBase.summaryStatus) &&
        Objects.equals(targetingSpec, adGroupBase.targetingSpec) &&
        Objects.equals(targetingTemplateIds, adGroupBase.targetingTemplateIds) &&
        Objects.equals(trackingUrls, adGroupBase.trackingUrls) &&
        Objects.equals(type, adGroupBase.type) &&
        Objects.equals(updatedTime, adGroupBase.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, bidInMicroCurrency, bidStrategyType, billableEvent, budgetInMicroCurrency, campaignId, conversionLearningModeType, createdTime, customerSegmentId, dcaAssets, endTime, extFeatures, feedProfileId, id, isCreativeOptimization, isLocalInventory, lifetimeFrequencyCap, localInventoryRadiusInMiles, name, optimizationGoalMetadata, performancePlusCampaignSettings, placementGroup, placementTrafficType, promotionApplicationLevel, promotionId, promotionIds, startTime, status, summaryStatus, targetingSpec, targetingTemplateIds, trackingUrls, type, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupBase {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    conversionLearningModeType: ").append(toIndentedString(conversionLearningModeType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    customerSegmentId: ").append(toIndentedString(customerSegmentId)).append("\n");
    sb.append("    dcaAssets: ").append(toIndentedString(dcaAssets)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    extFeatures: ").append(toIndentedString(extFeatures)).append("\n");
    sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCreativeOptimization: ").append(toIndentedString(isCreativeOptimization)).append("\n");
    sb.append("    isLocalInventory: ").append(toIndentedString(isLocalInventory)).append("\n");
    sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
    sb.append("    localInventoryRadiusInMiles: ").append(toIndentedString(localInventoryRadiusInMiles)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("    performancePlusCampaignSettings: ").append(toIndentedString(performancePlusCampaignSettings)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    placementTrafficType: ").append(toIndentedString(placementTrafficType)).append("\n");
    sb.append("    promotionApplicationLevel: ").append(toIndentedString(promotionApplicationLevel)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    targetingTemplateIds: ").append(toIndentedString(targetingTemplateIds)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
