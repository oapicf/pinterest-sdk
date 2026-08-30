package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupTrackingURLs;
import org.openapitools.model.AdgroupTrackingFeatures;
import org.openapitools.model.BidStrategyType;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.NullableOptimizationGoalMetadata;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PerformancePlusCampaignSettings;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.PlacementTrafficType;
import org.openapitools.model.PromotionApplicationLevel;
import org.openapitools.model.TargetingSpecOperations;
import org.openapitools.model.TargetingSpecOptimal;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdGroupUpdateBatchUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   */
  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled;

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   */
  @JsonProperty("bid_in_micro_currency")
  private Integer bidInMicroCurrency;

  /**
   * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
   */
  @JsonProperty("bid_multiplier")
  private BigDecimal bidMultiplier;

  @JsonProperty("bid_strategy_type")
  private BidStrategyType bidStrategyType;

  @JsonProperty("billable_event")
  private ActionType billableEvent;

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   */
  @JsonProperty("budget_in_micro_currency")
  private Integer budgetInMicroCurrency;

  @JsonProperty("budget_type")
  private BudgetType budgetType;

  /**
   * Campaign ID of the ad group.
   */
  @JsonProperty("campaign_id")
  private String campaignId;

  /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
   */
  @JsonProperty("customer_segment_id")
  private String customerSegmentId;

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   */
  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("ext_features")
  private AdgroupTrackingFeatures extFeatures;

  /**
   * Feed Profile ID associated to the adgroup.
   */
  @JsonProperty("feed_profile_id")
  private String feedProfileId;

  /**
   * Ad group ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   */
  @JsonProperty("is_creative_optimization")
  private Boolean isCreativeOptimization;

  /**
   * Indicates whether the ad group should use the local inventory.
   */
  @JsonProperty("is_local_inventory")
  private Boolean isLocalInventory;

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   */
  @JsonProperty("lifetime_frequency_cap")
  private Integer lifetimeFrequencyCap;

  /**
   * The targeting radius of the local inventory ads in miles.
   */
  @JsonProperty("local_inventory_radius_in_miles")
  private BigDecimal localInventoryRadiusInMiles;

  /**
   * Ad group name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
   */
  @JsonProperty("optimization_goal_metadata")
  private NullableOptimizationGoalMetadata optimizationGoalMetadata;

  @JsonProperty("pacing_delivery_type")
  private PacingDeliveryType pacingDeliveryType;

  /**
   * Pinterest Performance+ campaign settings.
   */
  @JsonProperty("performance_plus_campaign_settings")
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;

  /**
   * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
   */
  @JsonProperty("placement_group")
  private PlacementGroupType placementGroup;

  /**
   * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
   */
  @JsonProperty("placement_traffic_type")
  private PlacementTrafficType placementTrafficType;

  /**
   * Specify if the promotion is applied at ad group or item level
   */
  @JsonProperty("promotion_application_level")
  private PromotionApplicationLevel promotionApplicationLevel;

  /**
   * Promotion ID. To clear this field, set to null.
   */
  @JsonProperty("promotion_id")
  private String promotionId = "0";

  /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   */
  @JsonProperty("promotion_ids")
  private List<String> promotionIds = new ArrayList<>();

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   */
  @JsonProperty("start_time")
  private Integer startTime;

  /**
   * Ad group/entity status.
   */
  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("targeting_spec")
  private TargetingSpecOptimal targetingSpec;

  @JsonProperty("targeting_spec_operations")
  private List<TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();

  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
   */
  @JsonProperty("targeting_template_ids")
  private List<String> targetingTemplateIds;

  @JsonProperty("tracking_urls")
  private AdGroupTrackingURLs trackingUrls;

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
   */
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
   */
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
   * @return bidMultiplier
   */
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  /**
   * 
   * @return bidStrategyType
   */
  public BidStrategyType getBidStrategyType() {
    return bidStrategyType;
  }

  public void setBidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  /**
   * 
   * @return billableEvent
   */
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
   */
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  /**
   * 
   * @return budgetType
   */
  public BudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Campaign ID of the ad group.
   * @return campaignId
   */
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
   * @return customerSegmentId
   */
  public String getCustomerSegmentId() {
    return customerSegmentId;
  }

  public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   * @return endTime
   */
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * 
   * @return extFeatures
   */
  public AdgroupTrackingFeatures getExtFeatures() {
    return extFeatures;
  }

  public void setExtFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
  }

  /**
   * Feed Profile ID associated to the adgroup.
   * @return feedProfileId
   */
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * Ad group ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   * @return isCreativeOptimization
   */
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  /**
   * Indicates whether the ad group should use the local inventory.
   * @return isLocalInventory
   */
  public Boolean getIsLocalInventory() {
    return isLocalInventory;
  }

  public void setIsLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   * @return lifetimeFrequencyCap
   */
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * The targeting radius of the local inventory ads in miles.
   * @return localInventoryRadiusInMiles
   */
  public BigDecimal getLocalInventoryRadiusInMiles() {
    return localInventoryRadiusInMiles;
  }

  public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
  }

  /**
   * Ad group name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
   * @return optimizationGoalMetadata
   */
  public NullableOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   * 
   * @return pacingDeliveryType
   */
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * Pinterest Performance+ campaign settings.
   * @return performancePlusCampaignSettings
   */
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  /**
   * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
   * @return placementGroup
   */
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
   * @return placementTrafficType
   */
  public PlacementTrafficType getPlacementTrafficType() {
    return placementTrafficType;
  }

  public void setPlacementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
  }

  /**
   * Specify if the promotion is applied at ad group or item level
   * @return promotionApplicationLevel
   */
  public PromotionApplicationLevel getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  public void setPromotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  /**
   * Promotion ID. To clear this field, set to null.
   * @return promotionId
   */
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   * @return promotionIds
   */
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return startTime
   */
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Ad group/entity status.
   * @return status
   */
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * 
   * @return targetingSpec
   */
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * 
   * @return targetingSpecOperations
   */
  public List<TargetingSpecOperations> getTargetingSpecOperations() {
    return targetingSpecOperations;
  }

  public void setTargetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
  }

  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
   * @return targetingTemplateIds
   */
  public List<String> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }

  public void setTargetingTemplateIds(List<String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }

  /**
   * 
   * @return trackingUrls
   */
  public AdGroupTrackingURLs getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdGroupTrackingURLs trackingUrls) {
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
    AdGroupUpdateBatchUpdate adGroupUpdateBatchUpdate = (AdGroupUpdateBatchUpdate) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupUpdateBatchUpdate.autoTargetingEnabled) &&
        Objects.equals(this.bidInMicroCurrency, adGroupUpdateBatchUpdate.bidInMicroCurrency) &&
        Objects.equals(this.bidMultiplier, adGroupUpdateBatchUpdate.bidMultiplier) &&
        Objects.equals(this.bidStrategyType, adGroupUpdateBatchUpdate.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroupUpdateBatchUpdate.billableEvent) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupUpdateBatchUpdate.budgetInMicroCurrency) &&
        Objects.equals(this.budgetType, adGroupUpdateBatchUpdate.budgetType) &&
        Objects.equals(this.campaignId, adGroupUpdateBatchUpdate.campaignId) &&
        Objects.equals(this.customerSegmentId, adGroupUpdateBatchUpdate.customerSegmentId) &&
        Objects.equals(this.endTime, adGroupUpdateBatchUpdate.endTime) &&
        Objects.equals(this.extFeatures, adGroupUpdateBatchUpdate.extFeatures) &&
        Objects.equals(this.feedProfileId, adGroupUpdateBatchUpdate.feedProfileId) &&
        Objects.equals(this.id, adGroupUpdateBatchUpdate.id) &&
        Objects.equals(this.isCreativeOptimization, adGroupUpdateBatchUpdate.isCreativeOptimization) &&
        Objects.equals(this.isLocalInventory, adGroupUpdateBatchUpdate.isLocalInventory) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupUpdateBatchUpdate.lifetimeFrequencyCap) &&
        Objects.equals(this.localInventoryRadiusInMiles, adGroupUpdateBatchUpdate.localInventoryRadiusInMiles) &&
        Objects.equals(this.name, adGroupUpdateBatchUpdate.name) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupUpdateBatchUpdate.optimizationGoalMetadata) &&
        Objects.equals(this.pacingDeliveryType, adGroupUpdateBatchUpdate.pacingDeliveryType) &&
        Objects.equals(this.performancePlusCampaignSettings, adGroupUpdateBatchUpdate.performancePlusCampaignSettings) &&
        Objects.equals(this.placementGroup, adGroupUpdateBatchUpdate.placementGroup) &&
        Objects.equals(this.placementTrafficType, adGroupUpdateBatchUpdate.placementTrafficType) &&
        Objects.equals(this.promotionApplicationLevel, adGroupUpdateBatchUpdate.promotionApplicationLevel) &&
        Objects.equals(this.promotionId, adGroupUpdateBatchUpdate.promotionId) &&
        Objects.equals(this.promotionIds, adGroupUpdateBatchUpdate.promotionIds) &&
        Objects.equals(this.startTime, adGroupUpdateBatchUpdate.startTime) &&
        Objects.equals(this.status, adGroupUpdateBatchUpdate.status) &&
        Objects.equals(this.targetingSpec, adGroupUpdateBatchUpdate.targetingSpec) &&
        Objects.equals(this.targetingSpecOperations, adGroupUpdateBatchUpdate.targetingSpecOperations) &&
        Objects.equals(this.targetingTemplateIds, adGroupUpdateBatchUpdate.targetingTemplateIds) &&
        Objects.equals(this.trackingUrls, adGroupUpdateBatchUpdate.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, bidInMicroCurrency, bidMultiplier, bidStrategyType, billableEvent, budgetInMicroCurrency, budgetType, campaignId, customerSegmentId, endTime, extFeatures, feedProfileId, id, isCreativeOptimization, isLocalInventory, lifetimeFrequencyCap, localInventoryRadiusInMiles, name, optimizationGoalMetadata, pacingDeliveryType, performancePlusCampaignSettings, placementGroup, placementTrafficType, promotionApplicationLevel, promotionId, promotionIds, startTime, status, targetingSpec, targetingSpecOperations, targetingTemplateIds, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupUpdateBatchUpdate {\n");
    
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    customerSegmentId: ").append(toIndentedString(customerSegmentId)).append("\n");
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
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
    sb.append("    performancePlusCampaignSettings: ").append(toIndentedString(performancePlusCampaignSettings)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    placementTrafficType: ").append(toIndentedString(placementTrafficType)).append("\n");
    sb.append("    promotionApplicationLevel: ").append(toIndentedString(promotionApplicationLevel)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    targetingSpecOperations: ").append(toIndentedString(targetingSpecOperations)).append("\n");
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
