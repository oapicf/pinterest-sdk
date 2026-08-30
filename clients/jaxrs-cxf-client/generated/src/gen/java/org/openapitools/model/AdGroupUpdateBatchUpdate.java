package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupUpdateBatchUpdate  {
  
 /**
  * Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
  */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).")

  private Boolean autoTargetingEnabled;

 /**
  * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  */
  @ApiModelProperty(value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")

  private Integer bidInMicroCurrency;

 /**
  * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
  */
  @ApiModelProperty(value = "[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).")

  private BigDecimal bidMultiplier;

  @ApiModelProperty(value = "")

  private BidStrategyType bidStrategyType;

  @ApiModelProperty(value = "")

  private ActionType billableEvent;

 /**
  * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  */
  @ApiModelProperty(value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")

  private Integer budgetInMicroCurrency;

  @ApiModelProperty(value = "")

  private BudgetType budgetType;

 /**
  * Campaign ID of the ad group.
  */
  @ApiModelProperty(value = "Campaign ID of the ad group.")

  private String campaignId;

 /**
  * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
  */
  @ApiModelProperty(value = "Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.")

  private String customerSegmentId;

 /**
  * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
  */
  @ApiModelProperty(value = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.")

  private Integer endTime;

  @ApiModelProperty(value = "")

  private AdgroupTrackingFeatures extFeatures;

 /**
  * Feed Profile ID associated to the adgroup.
  */
  @ApiModelProperty(value = "Feed Profile ID associated to the adgroup.")

  private String feedProfileId;

 /**
  * Ad group ID.
  */
  @ApiModelProperty(required = true, value = "Ad group ID.")

  private String id;

 /**
  * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  */
  @ApiModelProperty(value = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")

  private Boolean isCreativeOptimization;

 /**
  * Indicates whether the ad group should use the local inventory.
  */
  @ApiModelProperty(value = "Indicates whether the ad group should use the local inventory.")

  private Boolean isLocalInventory;

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
  */
  @ApiModelProperty(value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.")

  private Integer lifetimeFrequencyCap;

 /**
  * The targeting radius of the local inventory ads in miles.
  */
  @ApiModelProperty(value = "The targeting radius of the local inventory ads in miles.")

  private BigDecimal localInventoryRadiusInMiles;

 /**
  * Ad group name.
  */
  @ApiModelProperty(value = "Ad group name.")

  private String name;

 /**
  * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  */
  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")

  private NullableOptimizationGoalMetadata optimizationGoalMetadata;

  @ApiModelProperty(value = "")

  private PacingDeliveryType pacingDeliveryType;

 /**
  * Pinterest Performance+ campaign settings.
  */
  @ApiModelProperty(value = "Pinterest Performance+ campaign settings.")

  private PerformancePlusCampaignSettings performancePlusCampaignSettings;

 /**
  * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
  */
  @ApiModelProperty(value = "[Placement group](https://help.pinterest.com/en/business/article/placement-groups).")

  private PlacementGroupType placementGroup;

 /**
  * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
  */
  @ApiModelProperty(value = "A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both")

  private PlacementTrafficType placementTrafficType;

 /**
  * Specify if the promotion is applied at ad group or item level
  */
  @ApiModelProperty(example = "ITEM", value = "Specify if the promotion is applied at ad group or item level")

  private PromotionApplicationLevel promotionApplicationLevel;

 /**
  * Promotion ID. To clear this field, set to null.
  */
  @ApiModelProperty(value = "Promotion ID. To clear this field, set to null.")

  private String promotionId = "0";

 /**
  * Promotion IDs list. To clear this field, set to an empty array [].
  */
  @ApiModelProperty(value = "Promotion IDs list. To clear this field, set to an empty array [].")

  private List<String> promotionIds = new ArrayList<>();

 /**
  * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  */
  @ApiModelProperty(value = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")

  private Integer startTime;

 /**
  * Ad group/entity status.
  */
  @ApiModelProperty(value = "Ad group/entity status.")

  private EntityStatus status;

  @ApiModelProperty(value = "")

  private TargetingSpecOptimal targetingSpec;

  @ApiModelProperty(value = "")

  private List<TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();

 /**
  * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  */
  @ApiModelProperty(value = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")

  private List<String> targetingTemplateIds;

  @ApiModelProperty(value = "")

  private AdGroupTrackingURLs trackingUrls;
 /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupUpdateBatchUpdate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
  **/
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupUpdateBatchUpdate bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
   * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
   * minimum: 0
   * maximum: 10
   * @return bidMultiplier
  **/
  @JsonProperty("bid_multiplier")
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupUpdateBatchUpdate bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

 /**
   * Get bidStrategyType
   * @return bidStrategyType
  **/
  @JsonProperty("bid_strategy_type")
  public BidStrategyType getBidStrategyType() {
    return bidStrategyType;
  }

  public void setBidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  public AdGroupUpdateBatchUpdate bidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
  }

 /**
   * Get billableEvent
   * @return billableEvent
  **/
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupUpdateBatchUpdate billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

 /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
  **/
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  public AdGroupUpdateBatchUpdate budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

 /**
   * Get budgetType
   * @return budgetType
  **/
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  public AdGroupUpdateBatchUpdate budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

 /**
   * Campaign ID of the ad group.
   * @return campaignId
  **/
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupUpdateBatchUpdate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
   * @return customerSegmentId
  **/
  @JsonProperty("customer_segment_id")
  public String getCustomerSegmentId() {
    return customerSegmentId;
  }

  public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

  public AdGroupUpdateBatchUpdate customerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
    return this;
  }

 /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public AdGroupUpdateBatchUpdate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get extFeatures
   * @return extFeatures
  **/
  @JsonProperty("ext_features")
  public AdgroupTrackingFeatures getExtFeatures() {
    return extFeatures;
  }

  public void setExtFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
  }

  public AdGroupUpdateBatchUpdate extFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
    return this;
  }

 /**
   * Feed Profile ID associated to the adgroup.
   * @return feedProfileId
  **/
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public AdGroupUpdateBatchUpdate feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

 /**
   * Ad group ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdGroupUpdateBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   * @return isCreativeOptimization
  **/
  @JsonProperty("is_creative_optimization")
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  public AdGroupUpdateBatchUpdate isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
    return this;
  }

 /**
   * Indicates whether the ad group should use the local inventory.
   * @return isLocalInventory
  **/
  @JsonProperty("is_local_inventory")
  public Boolean getIsLocalInventory() {
    return isLocalInventory;
  }

  public void setIsLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
  }

  public AdGroupUpdateBatchUpdate isLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
    return this;
  }

 /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   * @return lifetimeFrequencyCap
  **/
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupUpdateBatchUpdate lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

 /**
   * The targeting radius of the local inventory ads in miles.
   * @return localInventoryRadiusInMiles
  **/
  @JsonProperty("local_inventory_radius_in_miles")
  public BigDecimal getLocalInventoryRadiusInMiles() {
    return localInventoryRadiusInMiles;
  }

  public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
  }

  public AdGroupUpdateBatchUpdate localInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
    return this;
  }

 /**
   * Ad group name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdGroupUpdateBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
   * @return optimizationGoalMetadata
  **/
  @JsonProperty("optimization_goal_metadata")
  public NullableOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupUpdateBatchUpdate optimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

 /**
   * Get pacingDeliveryType
   * @return pacingDeliveryType
  **/
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  public AdGroupUpdateBatchUpdate pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

 /**
   * Pinterest Performance+ campaign settings.
   * @return performancePlusCampaignSettings
  **/
  @JsonProperty("performance_plus_campaign_settings")
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  public AdGroupUpdateBatchUpdate performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    return this;
  }

 /**
   * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
   * @return placementGroup
  **/
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupUpdateBatchUpdate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
   * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
   * @return placementTrafficType
  **/
  @JsonProperty("placement_traffic_type")
  public PlacementTrafficType getPlacementTrafficType() {
    return placementTrafficType;
  }

  public void setPlacementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
  }

  public AdGroupUpdateBatchUpdate placementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
    return this;
  }

 /**
   * Specify if the promotion is applied at ad group or item level
   * @return promotionApplicationLevel
  **/
  @JsonProperty("promotion_application_level")
  public PromotionApplicationLevel getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  public void setPromotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  public AdGroupUpdateBatchUpdate promotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
    return this;
  }

 /**
   * Promotion ID. To clear this field, set to null.
   * @return promotionId
  **/
  @JsonProperty("promotion_id")
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public AdGroupUpdateBatchUpdate promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

 /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   * @return promotionIds
  **/
  @JsonProperty("promotion_ids")
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  public AdGroupUpdateBatchUpdate promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  public AdGroupUpdateBatchUpdate addPromotionIdsItem(String promotionIdsItem) {
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

 /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public AdGroupUpdateBatchUpdate startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Ad group/entity status.
   * @return status
  **/
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdGroupUpdateBatchUpdate status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @JsonProperty("targeting_spec")
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupUpdateBatchUpdate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

 /**
   * Get targetingSpecOperations
   * @return targetingSpecOperations
  **/
  @JsonProperty("targeting_spec_operations")
  public List<TargetingSpecOperations> getTargetingSpecOperations() {
    return targetingSpecOperations;
  }

  public void setTargetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
  }

  public AdGroupUpdateBatchUpdate targetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
    return this;
  }

  public AdGroupUpdateBatchUpdate addTargetingSpecOperationsItem(TargetingSpecOperations targetingSpecOperationsItem) {
    this.targetingSpecOperations.add(targetingSpecOperationsItem);
    return this;
  }

 /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
   * @return targetingTemplateIds
  **/
  @JsonProperty("targeting_template_ids")
  public List<String> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }

  public void setTargetingTemplateIds(List<String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }

  public AdGroupUpdateBatchUpdate targetingTemplateIds(List<String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
    return this;
  }

  public AdGroupUpdateBatchUpdate addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    this.targetingTemplateIds.add(targetingTemplateIdsItem);
    return this;
  }

 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public AdGroupTrackingURLs getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdGroupUpdateBatchUpdate trackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

