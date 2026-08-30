package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import org.openapitools.model.TargetingSpecOptimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class AdGroupCreateCreate  {
  
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
  @Valid
  private BigDecimal bidMultiplier;

  @ApiModelProperty(value = "")
  @Valid
  private BidStrategyType bidStrategyType;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ActionType billableEvent;

 /**
  * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  */
  @ApiModelProperty(value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  private Integer budgetInMicroCurrency;

  @ApiModelProperty(value = "")
  @Valid
  private BudgetType budgetType;

 /**
  * Campaign ID of the ad group.
  */
  @ApiModelProperty(required = true, value = "Campaign ID of the ad group.")
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
  @Valid
  private AdgroupTrackingFeatures extFeatures;

 /**
  * Feed Profile ID associated to the adgroup.
  */
  @ApiModelProperty(value = "Feed Profile ID associated to the adgroup.")
  private String feedProfileId;

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
  @Valid
  private BigDecimal localInventoryRadiusInMiles;

 /**
  * Ad group name.
  */
  @ApiModelProperty(required = true, value = "Ad group name.")
  private String name;

 /**
  * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  */
  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
  @Valid
  private NullableOptimizationGoalMetadata optimizationGoalMetadata;

  @ApiModelProperty(value = "")
  @Valid
  private PacingDeliveryType pacingDeliveryType;

 /**
  * Pinterest Performance+ campaign settings.
  */
  @ApiModelProperty(value = "Pinterest Performance+ campaign settings.")
  @Valid
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;

 /**
  * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
  */
  @ApiModelProperty(value = "[Placement group](https://help.pinterest.com/en/business/article/placement-groups).")
  @Valid
  private PlacementGroupType placementGroup;

 /**
  * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
  */
  @ApiModelProperty(value = "A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both")
  @Valid
  private PlacementTrafficType placementTrafficType;

 /**
  * Specify if the promotion is applied at ad group or item level
  */
  @ApiModelProperty(example = "ITEM", value = "Specify if the promotion is applied at ad group or item level")
  @Valid
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
  @Valid
  private EntityStatus status;

  @ApiModelProperty(value = "")
  @Valid
  private TargetingSpecOptimal targetingSpec;

 /**
  * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  */
  @ApiModelProperty(value = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
  private List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds;

  @ApiModelProperty(value = "")
  @Valid
  private AdGroupTrackingURLs trackingUrls;
 /**
  * Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).
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
  public AdGroupCreateCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
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
  public AdGroupCreateCreate bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
  * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
  * minimum: 0
  * maximum: 10
  * @return bidMultiplier
  */
  @JsonProperty("bid_multiplier")
 @DecimalMin("0") @DecimalMax("10")  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  /**
   * Sets the <code>bidMultiplier</code> property.
   */
 public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  /**
   * Sets the <code>bidMultiplier</code> property.
   */
  public AdGroupCreateCreate bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

 /**
  * Get bidStrategyType
  * @return bidStrategyType
  */
  @JsonProperty("bid_strategy_type")
  public BidStrategyType getBidStrategyType() {
    return bidStrategyType;
  }

  /**
   * Sets the <code>bidStrategyType</code> property.
   */
 public void setBidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  /**
   * Sets the <code>bidStrategyType</code> property.
   */
  public AdGroupCreateCreate bidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
  }

 /**
  * Get billableEvent
  * @return billableEvent
  */
  @JsonProperty("billable_event")
  @NotNull
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
  public AdGroupCreateCreate billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
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
  public AdGroupCreateCreate budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
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
  public AdGroupCreateCreate budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

 /**
  * Campaign ID of the ad group.
  * @return campaignId
  */
  @JsonProperty("campaign_id")
  @NotNull
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
  public AdGroupCreateCreate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
  * @return customerSegmentId
  */
  @JsonProperty("customer_segment_id")
 @Pattern(regexp="^\\d+$")  public String getCustomerSegmentId() {
    return customerSegmentId;
  }

  /**
   * Sets the <code>customerSegmentId</code> property.
   */
 public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

  /**
   * Sets the <code>customerSegmentId</code> property.
   */
  public AdGroupCreateCreate customerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
    return this;
  }

 /**
  * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
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
  public AdGroupCreateCreate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Get extFeatures
  * @return extFeatures
  */
  @JsonProperty("ext_features")
  public AdgroupTrackingFeatures getExtFeatures() {
    return extFeatures;
  }

  /**
   * Sets the <code>extFeatures</code> property.
   */
 public void setExtFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
  }

  /**
   * Sets the <code>extFeatures</code> property.
   */
  public AdGroupCreateCreate extFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
    return this;
  }

 /**
  * Feed Profile ID associated to the adgroup.
  * @return feedProfileId
  */
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
 public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
  public AdGroupCreateCreate feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

 /**
  * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  * @return isCreativeOptimization
  */
  @JsonProperty("is_creative_optimization")
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  /**
   * Sets the <code>isCreativeOptimization</code> property.
   */
 public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  /**
   * Sets the <code>isCreativeOptimization</code> property.
   */
  public AdGroupCreateCreate isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
    return this;
  }

 /**
  * Indicates whether the ad group should use the local inventory.
  * @return isLocalInventory
  */
  @JsonProperty("is_local_inventory")
  public Boolean getIsLocalInventory() {
    return isLocalInventory;
  }

  /**
   * Sets the <code>isLocalInventory</code> property.
   */
 public void setIsLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
  }

  /**
   * Sets the <code>isLocalInventory</code> property.
   */
  public AdGroupCreateCreate isLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
    return this;
  }

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
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
  public AdGroupCreateCreate lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

 /**
  * The targeting radius of the local inventory ads in miles.
  * @return localInventoryRadiusInMiles
  */
  @JsonProperty("local_inventory_radius_in_miles")
  public BigDecimal getLocalInventoryRadiusInMiles() {
    return localInventoryRadiusInMiles;
  }

  /**
   * Sets the <code>localInventoryRadiusInMiles</code> property.
   */
 public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
  }

  /**
   * Sets the <code>localInventoryRadiusInMiles</code> property.
   */
  public AdGroupCreateCreate localInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
    return this;
  }

 /**
  * Ad group name.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
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
  public AdGroupCreateCreate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
  * @return optimizationGoalMetadata
  */
  @JsonProperty("optimization_goal_metadata")
  public NullableOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  /**
   * Sets the <code>optimizationGoalMetadata</code> property.
   */
 public void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   * Sets the <code>optimizationGoalMetadata</code> property.
   */
  public AdGroupCreateCreate optimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
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
  public AdGroupCreateCreate pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

 /**
  * Pinterest Performance+ campaign settings.
  * @return performancePlusCampaignSettings
  */
  @JsonProperty("performance_plus_campaign_settings")
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  /**
   * Sets the <code>performancePlusCampaignSettings</code> property.
   */
 public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  /**
   * Sets the <code>performancePlusCampaignSettings</code> property.
   */
  public AdGroupCreateCreate performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    return this;
  }

 /**
  * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
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
  public AdGroupCreateCreate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
  * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
  * @return placementTrafficType
  */
  @JsonProperty("placement_traffic_type")
  public PlacementTrafficType getPlacementTrafficType() {
    return placementTrafficType;
  }

  /**
   * Sets the <code>placementTrafficType</code> property.
   */
 public void setPlacementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
  }

  /**
   * Sets the <code>placementTrafficType</code> property.
   */
  public AdGroupCreateCreate placementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
    return this;
  }

 /**
  * Specify if the promotion is applied at ad group or item level
  * @return promotionApplicationLevel
  */
  @JsonProperty("promotion_application_level")
  public PromotionApplicationLevel getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  /**
   * Sets the <code>promotionApplicationLevel</code> property.
   */
 public void setPromotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  /**
   * Sets the <code>promotionApplicationLevel</code> property.
   */
  public AdGroupCreateCreate promotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
    return this;
  }

 /**
  * Promotion ID. To clear this field, set to null.
  * @return promotionId
  */
  @JsonProperty("promotion_id")
 @Pattern(regexp="^\\d+$")  public String getPromotionId() {
    return promotionId;
  }

  /**
   * Sets the <code>promotionId</code> property.
   */
 public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Sets the <code>promotionId</code> property.
   */
  public AdGroupCreateCreate promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

 /**
  * Promotion IDs list. To clear this field, set to an empty array [].
  * @return promotionIds
  */
  @JsonProperty("promotion_ids")
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  /**
   * Sets the <code>promotionIds</code> property.
   */
 public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  /**
   * Sets the <code>promotionIds</code> property.
   */
  public AdGroupCreateCreate promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  /**
   * Adds a new item to the <code>promotionIds</code> list.
   */
  public AdGroupCreateCreate addPromotionIdsItem(String promotionIdsItem) {
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

 /**
  * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
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
  public AdGroupCreateCreate startTime(Integer startTime) {
    this.startTime = startTime;
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
  public AdGroupCreateCreate status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Get targetingSpec
  * @return targetingSpec
  */
  @JsonProperty("targeting_spec")
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
 public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
  public AdGroupCreateCreate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

 /**
  * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
  * @return targetingTemplateIds
  */
  @JsonProperty("targeting_template_ids")
 @Size(max=1)  public List<@Pattern(regexp = "^\\d+$")String> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }

  /**
   * Sets the <code>targetingTemplateIds</code> property.
   */
 public void setTargetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }

  /**
   * Sets the <code>targetingTemplateIds</code> property.
   */
  public AdGroupCreateCreate targetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
    return this;
  }

  /**
   * Adds a new item to the <code>targetingTemplateIds</code> list.
   */
  public AdGroupCreateCreate addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    this.targetingTemplateIds.add(targetingTemplateIdsItem);
    return this;
  }

 /**
  * Get trackingUrls
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public AdGroupTrackingURLs getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public AdGroupCreateCreate trackingUrls(AdGroupTrackingURLs trackingUrls) {
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
    AdGroupCreateCreate adGroupCreateCreate = (AdGroupCreateCreate) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupCreateCreate.autoTargetingEnabled) &&
        Objects.equals(this.bidInMicroCurrency, adGroupCreateCreate.bidInMicroCurrency) &&
        Objects.equals(this.bidMultiplier, adGroupCreateCreate.bidMultiplier) &&
        Objects.equals(this.bidStrategyType, adGroupCreateCreate.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroupCreateCreate.billableEvent) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupCreateCreate.budgetInMicroCurrency) &&
        Objects.equals(this.budgetType, adGroupCreateCreate.budgetType) &&
        Objects.equals(this.campaignId, adGroupCreateCreate.campaignId) &&
        Objects.equals(this.customerSegmentId, adGroupCreateCreate.customerSegmentId) &&
        Objects.equals(this.endTime, adGroupCreateCreate.endTime) &&
        Objects.equals(this.extFeatures, adGroupCreateCreate.extFeatures) &&
        Objects.equals(this.feedProfileId, adGroupCreateCreate.feedProfileId) &&
        Objects.equals(this.isCreativeOptimization, adGroupCreateCreate.isCreativeOptimization) &&
        Objects.equals(this.isLocalInventory, adGroupCreateCreate.isLocalInventory) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupCreateCreate.lifetimeFrequencyCap) &&
        Objects.equals(this.localInventoryRadiusInMiles, adGroupCreateCreate.localInventoryRadiusInMiles) &&
        Objects.equals(this.name, adGroupCreateCreate.name) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupCreateCreate.optimizationGoalMetadata) &&
        Objects.equals(this.pacingDeliveryType, adGroupCreateCreate.pacingDeliveryType) &&
        Objects.equals(this.performancePlusCampaignSettings, adGroupCreateCreate.performancePlusCampaignSettings) &&
        Objects.equals(this.placementGroup, adGroupCreateCreate.placementGroup) &&
        Objects.equals(this.placementTrafficType, adGroupCreateCreate.placementTrafficType) &&
        Objects.equals(this.promotionApplicationLevel, adGroupCreateCreate.promotionApplicationLevel) &&
        Objects.equals(this.promotionId, adGroupCreateCreate.promotionId) &&
        Objects.equals(this.promotionIds, adGroupCreateCreate.promotionIds) &&
        Objects.equals(this.startTime, adGroupCreateCreate.startTime) &&
        Objects.equals(this.status, adGroupCreateCreate.status) &&
        Objects.equals(this.targetingSpec, adGroupCreateCreate.targetingSpec) &&
        Objects.equals(this.targetingTemplateIds, adGroupCreateCreate.targetingTemplateIds) &&
        Objects.equals(this.trackingUrls, adGroupCreateCreate.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, bidInMicroCurrency, bidMultiplier, bidStrategyType, billableEvent, budgetInMicroCurrency, budgetType, campaignId, customerSegmentId, endTime, extFeatures, feedProfileId, isCreativeOptimization, isLocalInventory, lifetimeFrequencyCap, localInventoryRadiusInMiles, name, optimizationGoalMetadata, pacingDeliveryType, performancePlusCampaignSettings, placementGroup, placementTrafficType, promotionApplicationLevel, promotionId, promotionIds, startTime, status, targetingSpec, targetingTemplateIds, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCreateCreate {\n");
    
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

