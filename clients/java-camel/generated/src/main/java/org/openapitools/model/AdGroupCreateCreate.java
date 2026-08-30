package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "AdGroupCreateCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupCreateCreate {

  private Boolean autoTargetingEnabled;

  private JsonNullable<Integer> bidInMicroCurrency = JsonNullable.<Integer>undefined();

  private BigDecimal bidMultiplier;

  private JsonNullable<BidStrategyType> bidStrategyType = JsonNullable.<BidStrategyType>undefined();

  private ActionType billableEvent;

  private JsonNullable<Integer> budgetInMicroCurrency = JsonNullable.<Integer>undefined();

  private BudgetType budgetType;

  private String campaignId;

  private String customerSegmentId;

  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  private JsonNullable<AdgroupTrackingFeatures> extFeatures = JsonNullable.<AdgroupTrackingFeatures>undefined();

  private String feedProfileId;

  private JsonNullable<Boolean> isCreativeOptimization = JsonNullable.<Boolean>undefined();

  private Boolean isLocalInventory;

  private Integer lifetimeFrequencyCap;

  private BigDecimal localInventoryRadiusInMiles;

  private String name;

  private JsonNullable<NullableOptimizationGoalMetadata> optimizationGoalMetadata = JsonNullable.<NullableOptimizationGoalMetadata>undefined();

  private PacingDeliveryType pacingDeliveryType;

  private JsonNullable<PerformancePlusCampaignSettings> performancePlusCampaignSettings = JsonNullable.<PerformancePlusCampaignSettings>undefined();

  private PlacementGroupType placementGroup;

  private JsonNullable<PlacementTrafficType> placementTrafficType = JsonNullable.<PlacementTrafficType>undefined();

  private JsonNullable<PromotionApplicationLevel> promotionApplicationLevel = JsonNullable.<PromotionApplicationLevel>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> promotionId = JsonNullable.<String>undefined();

  @Valid
  private List<String> promotionIds = new ArrayList<>();

  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  private EntityStatus status;

  private TargetingSpecOptimal targetingSpec;

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> targetingTemplateIds = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  private JsonNullable<AdGroupTrackingURLs> trackingUrls = JsonNullable.<AdGroupTrackingURLs>undefined();

  public AdGroupCreateCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdGroupCreateCreate(ActionType billableEvent, String campaignId, String name) {
    this.billableEvent = billableEvent;
    this.campaignId = campaignId;
    this.name = name;
  }

  public AdGroupCreateCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", description = "Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupCreateCreate bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = JsonNullable.of(bidInMicroCurrency);
    return this;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
   */
  
  @Schema(name = "bid_in_micro_currency", description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_in_micro_currency")
  public JsonNullable<Integer> getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(JsonNullable<Integer> bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupCreateCreate bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  /**
   * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
   * minimum: 0
   * maximum: 10
   * @return bidMultiplier
   */
  @Valid @DecimalMin(value = "0") @DecimalMax(value = "10") 
  @Schema(name = "bid_multiplier", description = "[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_multiplier")
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupCreateCreate bidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = JsonNullable.of(bidStrategyType);
    return this;
  }

  /**
   * Get bidStrategyType
   * @return bidStrategyType
   */
  @Valid 
  @Schema(name = "bid_strategy_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_strategy_type")
  public JsonNullable<BidStrategyType> getBidStrategyType() {
    return bidStrategyType;
  }

  public void setBidStrategyType(JsonNullable<BidStrategyType> bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  public AdGroupCreateCreate billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  /**
   * Get billableEvent
   * @return billableEvent
   */
  @NotNull @Valid 
  @Schema(name = "billable_event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupCreateCreate budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = JsonNullable.of(budgetInMicroCurrency);
    return this;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
   */
  
  @Schema(name = "budget_in_micro_currency", description = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_in_micro_currency")
  public JsonNullable<Integer> getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(JsonNullable<Integer> budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  public AdGroupCreateCreate budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

  /**
   * Get budgetType
   * @return budgetType
   */
  @Valid 
  @Schema(name = "budget_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  public AdGroupCreateCreate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Campaign ID of the ad group.
   * @return campaignId
   */
  @NotNull @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "campaign_id", description = "Campaign ID of the ad group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupCreateCreate customerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
    return this;
  }

  /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
   * @return customerSegmentId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "customer_segment_id", description = "Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer_segment_id")
  public String getCustomerSegmentId() {
    return customerSegmentId;
  }

  public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

  public AdGroupCreateCreate endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   * @return endTime
   */
  
  @Schema(name = "end_time", description = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public AdGroupCreateCreate extFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = JsonNullable.of(extFeatures);
    return this;
  }

  /**
   * Get extFeatures
   * @return extFeatures
   */
  @Valid 
  @Schema(name = "ext_features", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ext_features")
  public JsonNullable<AdgroupTrackingFeatures> getExtFeatures() {
    return extFeatures;
  }

  public void setExtFeatures(JsonNullable<AdgroupTrackingFeatures> extFeatures) {
    this.extFeatures = extFeatures;
  }

  public AdGroupCreateCreate feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  /**
   * Feed Profile ID associated to the adgroup.
   * @return feedProfileId
   */
  
  @Schema(name = "feed_profile_id", description = "Feed Profile ID associated to the adgroup.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public AdGroupCreateCreate isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = JsonNullable.of(isCreativeOptimization);
    return this;
  }

  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   * @return isCreativeOptimization
   */
  
  @Schema(name = "is_creative_optimization", description = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_creative_optimization")
  public JsonNullable<Boolean> getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  public void setIsCreativeOptimization(JsonNullable<Boolean> isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  public AdGroupCreateCreate isLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
    return this;
  }

  /**
   * Indicates whether the ad group should use the local inventory.
   * @return isLocalInventory
   */
  
  @Schema(name = "is_local_inventory", description = "Indicates whether the ad group should use the local inventory.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_local_inventory")
  public Boolean getIsLocalInventory() {
    return isLocalInventory;
  }

  public void setIsLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
  }

  public AdGroupCreateCreate lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
   * @return lifetimeFrequencyCap
   */
  
  @Schema(name = "lifetime_frequency_cap", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupCreateCreate localInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
    return this;
  }

  /**
   * The targeting radius of the local inventory ads in miles.
   * @return localInventoryRadiusInMiles
   */
  @Valid 
  @Schema(name = "local_inventory_radius_in_miles", description = "The targeting radius of the local inventory ads in miles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("local_inventory_radius_in_miles")
  public BigDecimal getLocalInventoryRadiusInMiles() {
    return localInventoryRadiusInMiles;
  }

  public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
  }

  public AdGroupCreateCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Ad group name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Ad group name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdGroupCreateCreate optimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = JsonNullable.of(optimizationGoalMetadata);
    return this;
  }

  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
   * @return optimizationGoalMetadata
   */
  @Valid 
  @Schema(name = "optimization_goal_metadata", description = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimization_goal_metadata")
  public JsonNullable<NullableOptimizationGoalMetadata> getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(JsonNullable<NullableOptimizationGoalMetadata> optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupCreateCreate pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

  /**
   * Get pacingDeliveryType
   * @return pacingDeliveryType
   */
  @Valid 
  @Schema(name = "pacing_delivery_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  public AdGroupCreateCreate performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = JsonNullable.of(performancePlusCampaignSettings);
    return this;
  }

  /**
   * Pinterest Performance+ campaign settings.
   * @return performancePlusCampaignSettings
   */
  @Valid 
  @Schema(name = "performance_plus_campaign_settings", description = "Pinterest Performance+ campaign settings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performance_plus_campaign_settings")
  public JsonNullable<PerformancePlusCampaignSettings> getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  public void setPerformancePlusCampaignSettings(JsonNullable<PerformancePlusCampaignSettings> performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  public AdGroupCreateCreate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
   * @return placementGroup
   */
  @Valid 
  @Schema(name = "placement_group", description = "[Placement group](https://help.pinterest.com/en/business/article/placement-groups).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupCreateCreate placementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = JsonNullable.of(placementTrafficType);
    return this;
  }

  /**
   * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
   * @return placementTrafficType
   */
  @Valid 
  @Schema(name = "placement_traffic_type", description = "A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_traffic_type")
  public JsonNullable<PlacementTrafficType> getPlacementTrafficType() {
    return placementTrafficType;
  }

  public void setPlacementTrafficType(JsonNullable<PlacementTrafficType> placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
  }

  public AdGroupCreateCreate promotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = JsonNullable.of(promotionApplicationLevel);
    return this;
  }

  /**
   * Specify if the promotion is applied at ad group or item level
   * @return promotionApplicationLevel
   */
  @Valid 
  @Schema(name = "promotion_application_level", example = "ITEM", description = "Specify if the promotion is applied at ad group or item level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_application_level")
  public JsonNullable<PromotionApplicationLevel> getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  public void setPromotionApplicationLevel(JsonNullable<PromotionApplicationLevel> promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  public AdGroupCreateCreate promotionId(String promotionId) {
    this.promotionId = JsonNullable.of(promotionId);
    return this;
  }

  /**
   * Promotion ID. To clear this field, set to null.
   * @return promotionId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "promotion_id", description = "Promotion ID. To clear this field, set to null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(JsonNullable<String> promotionId) {
    this.promotionId = promotionId;
  }

  public AdGroupCreateCreate promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  public AdGroupCreateCreate addPromotionIdsItem(String promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

  /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   * @return promotionIds
   */
  
  @Schema(name = "promotion_ids", description = "Promotion IDs list. To clear this field, set to an empty array [].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_ids")
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  public AdGroupCreateCreate startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return startTime
   */
  
  @Schema(name = "start_time", description = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public AdGroupCreateCreate status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Ad group/entity status.
   * @return status
   */
  @Valid 
  @Schema(name = "status", description = "Ad group/entity status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdGroupCreateCreate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  /**
   * Get targetingSpec
   * @return targetingSpec
   */
  @Valid 
  @Schema(name = "targeting_spec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_spec")
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupCreateCreate targetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = JsonNullable.of(targetingTemplateIds);
    return this;
  }

  public AdGroupCreateCreate addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    if (this.targetingTemplateIds == null || !this.targetingTemplateIds.isPresent()) {
      this.targetingTemplateIds = JsonNullable.of(new ArrayList<>());
    }
    this.targetingTemplateIds.get().add(targetingTemplateIdsItem);
    return this;
  }

  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
   * @return targetingTemplateIds
   */
  @Size(max = 1) 
  @Schema(name = "targeting_template_ids", description = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_template_ids")
  public JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }

  public void setTargetingTemplateIds(JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }

  public AdGroupCreateCreate trackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @Valid 
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<AdGroupTrackingURLs> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<AdGroupTrackingURLs> trackingUrls) {
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
    AdGroupCreateCreate adGroupCreateCreate = (AdGroupCreateCreate) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupCreateCreate.autoTargetingEnabled) &&
        equalsNullable(this.bidInMicroCurrency, adGroupCreateCreate.bidInMicroCurrency) &&
        Objects.equals(this.bidMultiplier, adGroupCreateCreate.bidMultiplier) &&
        equalsNullable(this.bidStrategyType, adGroupCreateCreate.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroupCreateCreate.billableEvent) &&
        equalsNullable(this.budgetInMicroCurrency, adGroupCreateCreate.budgetInMicroCurrency) &&
        Objects.equals(this.budgetType, adGroupCreateCreate.budgetType) &&
        Objects.equals(this.campaignId, adGroupCreateCreate.campaignId) &&
        Objects.equals(this.customerSegmentId, adGroupCreateCreate.customerSegmentId) &&
        equalsNullable(this.endTime, adGroupCreateCreate.endTime) &&
        equalsNullable(this.extFeatures, adGroupCreateCreate.extFeatures) &&
        Objects.equals(this.feedProfileId, adGroupCreateCreate.feedProfileId) &&
        equalsNullable(this.isCreativeOptimization, adGroupCreateCreate.isCreativeOptimization) &&
        Objects.equals(this.isLocalInventory, adGroupCreateCreate.isLocalInventory) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupCreateCreate.lifetimeFrequencyCap) &&
        Objects.equals(this.localInventoryRadiusInMiles, adGroupCreateCreate.localInventoryRadiusInMiles) &&
        Objects.equals(this.name, adGroupCreateCreate.name) &&
        equalsNullable(this.optimizationGoalMetadata, adGroupCreateCreate.optimizationGoalMetadata) &&
        Objects.equals(this.pacingDeliveryType, adGroupCreateCreate.pacingDeliveryType) &&
        equalsNullable(this.performancePlusCampaignSettings, adGroupCreateCreate.performancePlusCampaignSettings) &&
        Objects.equals(this.placementGroup, adGroupCreateCreate.placementGroup) &&
        equalsNullable(this.placementTrafficType, adGroupCreateCreate.placementTrafficType) &&
        equalsNullable(this.promotionApplicationLevel, adGroupCreateCreate.promotionApplicationLevel) &&
        equalsNullable(this.promotionId, adGroupCreateCreate.promotionId) &&
        Objects.equals(this.promotionIds, adGroupCreateCreate.promotionIds) &&
        equalsNullable(this.startTime, adGroupCreateCreate.startTime) &&
        Objects.equals(this.status, adGroupCreateCreate.status) &&
        Objects.equals(this.targetingSpec, adGroupCreateCreate.targetingSpec) &&
        equalsNullable(this.targetingTemplateIds, adGroupCreateCreate.targetingTemplateIds) &&
        equalsNullable(this.trackingUrls, adGroupCreateCreate.trackingUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, hashCodeNullable(bidInMicroCurrency), bidMultiplier, hashCodeNullable(bidStrategyType), billableEvent, hashCodeNullable(budgetInMicroCurrency), budgetType, campaignId, customerSegmentId, hashCodeNullable(endTime), hashCodeNullable(extFeatures), feedProfileId, hashCodeNullable(isCreativeOptimization), isLocalInventory, lifetimeFrequencyCap, localInventoryRadiusInMiles, name, hashCodeNullable(optimizationGoalMetadata), pacingDeliveryType, hashCodeNullable(performancePlusCampaignSettings), placementGroup, hashCodeNullable(placementTrafficType), hashCodeNullable(promotionApplicationLevel), hashCodeNullable(promotionId), promotionIds, hashCodeNullable(startTime), status, targetingSpec, hashCodeNullable(targetingTemplateIds), hashCodeNullable(trackingUrls));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

