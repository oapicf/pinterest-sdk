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
import org.openapitools.model.ConversionLearningModeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.NullableOptimizationGoalMetadata;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PerformancePlusCampaignSettings;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.PlacementTrafficType;
import org.openapitools.model.PromotionApplicationLevel;
import org.openapitools.model.SummaryStatus;
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
 * AdGroup
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroup {

  private String adAccountId;

  private JsonNullable<Integer> bidInMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<BidStrategyType> bidStrategyType = JsonNullable.<BidStrategyType>undefined();

  private ActionType billableEvent;

  private JsonNullable<Integer> budgetInMicroCurrency = JsonNullable.<Integer>undefined();

  private String campaignId;

  private JsonNullable<ConversionLearningModeType> conversionLearningModeType = JsonNullable.<ConversionLearningModeType>undefined();

  private Integer createdTime;

  private String customerSegmentId;

  private JsonNullable<Object> dcaAssets = JsonNullable.<Object>undefined();

  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  private JsonNullable<AdgroupTrackingFeatures> extFeatures = JsonNullable.<AdgroupTrackingFeatures>undefined();

  private String feedProfileId;

  private String id;

  private JsonNullable<Boolean> isCreativeOptimization = JsonNullable.<Boolean>undefined();

  private Boolean isLocalInventory;

  private Integer lifetimeFrequencyCap;

  private BigDecimal localInventoryRadiusInMiles;

  private String name;

  private JsonNullable<NullableOptimizationGoalMetadata> optimizationGoalMetadata = JsonNullable.<NullableOptimizationGoalMetadata>undefined();

  private JsonNullable<PerformancePlusCampaignSettings> performancePlusCampaignSettings = JsonNullable.<PerformancePlusCampaignSettings>undefined();

  private PlacementGroupType placementGroup;

  private JsonNullable<PlacementTrafficType> placementTrafficType = JsonNullable.<PlacementTrafficType>undefined();

  private JsonNullable<PromotionApplicationLevel> promotionApplicationLevel = JsonNullable.<PromotionApplicationLevel>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> promotionId = JsonNullable.<String>undefined();

  @Valid
  private List<String> promotionIds = new ArrayList<>();

  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  private EntityStatus status;

  private SummaryStatus summaryStatus;

  private TargetingSpecOptimal targetingSpec;

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> targetingTemplateIds = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  private JsonNullable<AdGroupTrackingURLs> trackingUrls = JsonNullable.<AdGroupTrackingURLs>undefined();

  private String type = "adgroup";

  private Integer updatedTime;

  private JsonNullable<Boolean> autoTargetingEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "10") BigDecimal> bidMultiplier = JsonNullable.<BigDecimal>undefined();

  private BudgetType budgetType;

  private PacingDeliveryType pacingDeliveryType;

  public AdGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdGroup(ActionType billableEvent, String campaignId, ConversionLearningModeType conversionLearningModeType, Integer createdTime, String id, String name, SummaryStatus summaryStatus, String type, Integer updatedTime) {
    this.billableEvent = billableEvent;
    this.campaignId = campaignId;
    this.conversionLearningModeType = JsonNullable.of(conversionLearningModeType);
    this.createdTime = createdTime;
    this.id = id;
    this.name = name;
    this.summaryStatus = summaryStatus;
    this.type = type;
    this.updatedTime = updatedTime;
  }

  public AdGroup adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Advertiser ID.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, description = "Advertiser ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdGroup bidInMicroCurrency(Integer bidInMicroCurrency) {
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

  public AdGroup bidStrategyType(BidStrategyType bidStrategyType) {
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

  public AdGroup billableEvent(ActionType billableEvent) {
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

  public AdGroup budgetInMicroCurrency(Integer budgetInMicroCurrency) {
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

  public AdGroup campaignId(String campaignId) {
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

  public AdGroup conversionLearningModeType(ConversionLearningModeType conversionLearningModeType) {
    this.conversionLearningModeType = JsonNullable.of(conversionLearningModeType);
    return this;
  }

  /**
   * oCPM learn mode
   * @return conversionLearningModeType
   */
  @Valid 
  @Schema(name = "conversion_learning_mode_type", accessMode = Schema.AccessMode.READ_ONLY, description = "oCPM learn mode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conversion_learning_mode_type")
  public JsonNullable<ConversionLearningModeType> getConversionLearningModeType() {
    return conversionLearningModeType;
  }

  public void setConversionLearningModeType(JsonNullable<ConversionLearningModeType> conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

  public AdGroup createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Ad group creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Ad group creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdGroup customerSegmentId(String customerSegmentId) {
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

  public AdGroup dcaAssets(Object dcaAssets) {
    this.dcaAssets = JsonNullable.of(dcaAssets);
    return this;
  }

  /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
   * @return dcaAssets
   */
  
  @Schema(name = "dca_assets", accessMode = Schema.AccessMode.READ_ONLY, description = "[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dca_assets")
  public JsonNullable<Object> getDcaAssets() {
    return dcaAssets;
  }

  public void setDcaAssets(JsonNullable<Object> dcaAssets) {
    this.dcaAssets = dcaAssets;
  }

  public AdGroup endTime(Integer endTime) {
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

  public AdGroup extFeatures(AdgroupTrackingFeatures extFeatures) {
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

  public AdGroup feedProfileId(String feedProfileId) {
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

  public AdGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Ad group ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", description = "Ad group ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdGroup isCreativeOptimization(Boolean isCreativeOptimization) {
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

  public AdGroup isLocalInventory(Boolean isLocalInventory) {
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

  public AdGroup lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
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

  public AdGroup localInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
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

  public AdGroup name(String name) {
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

  public AdGroup optimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
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

  public AdGroup performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
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

  public AdGroup placementGroup(PlacementGroupType placementGroup) {
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

  public AdGroup placementTrafficType(PlacementTrafficType placementTrafficType) {
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

  public AdGroup promotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
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

  public AdGroup promotionId(String promotionId) {
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

  public AdGroup promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  public AdGroup addPromotionIdsItem(String promotionIdsItem) {
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

  public AdGroup startTime(Integer startTime) {
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

  public AdGroup status(EntityStatus status) {
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

  public AdGroup summaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Get summaryStatus
   * @return summaryStatus
   */
  @Valid 
  @Schema(name = "summary_status", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("summary_status")
  public SummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdGroup targetingSpec(TargetingSpecOptimal targetingSpec) {
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

  public AdGroup targetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = JsonNullable.of(targetingTemplateIds);
    return this;
  }

  public AdGroup addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
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

  public AdGroup trackingUrls(AdGroupTrackingURLs trackingUrls) {
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

  public AdGroup type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"adgroup\".
   * @return type
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "Always \"adgroup\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdGroup updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Ad group last update time. Unix timestamp in seconds.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Ad group last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdGroup autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = JsonNullable.of(autoTargetingEnabled);
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", description = "Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public JsonNullable<Boolean> getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(JsonNullable<Boolean> autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroup bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = JsonNullable.of(bidMultiplier);
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
  public JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "10") BigDecimal> getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(JsonNullable<BigDecimal> bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroup budgetType(BudgetType budgetType) {
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

  public AdGroup pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroup adGroup = (AdGroup) o;
    return Objects.equals(this.adAccountId, adGroup.adAccountId) &&
        equalsNullable(this.bidInMicroCurrency, adGroup.bidInMicroCurrency) &&
        equalsNullable(this.bidStrategyType, adGroup.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroup.billableEvent) &&
        equalsNullable(this.budgetInMicroCurrency, adGroup.budgetInMicroCurrency) &&
        Objects.equals(this.campaignId, adGroup.campaignId) &&
        Objects.equals(this.conversionLearningModeType, adGroup.conversionLearningModeType) &&
        Objects.equals(this.createdTime, adGroup.createdTime) &&
        Objects.equals(this.customerSegmentId, adGroup.customerSegmentId) &&
        equalsNullable(this.dcaAssets, adGroup.dcaAssets) &&
        equalsNullable(this.endTime, adGroup.endTime) &&
        equalsNullable(this.extFeatures, adGroup.extFeatures) &&
        Objects.equals(this.feedProfileId, adGroup.feedProfileId) &&
        Objects.equals(this.id, adGroup.id) &&
        equalsNullable(this.isCreativeOptimization, adGroup.isCreativeOptimization) &&
        Objects.equals(this.isLocalInventory, adGroup.isLocalInventory) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroup.lifetimeFrequencyCap) &&
        Objects.equals(this.localInventoryRadiusInMiles, adGroup.localInventoryRadiusInMiles) &&
        Objects.equals(this.name, adGroup.name) &&
        equalsNullable(this.optimizationGoalMetadata, adGroup.optimizationGoalMetadata) &&
        equalsNullable(this.performancePlusCampaignSettings, adGroup.performancePlusCampaignSettings) &&
        Objects.equals(this.placementGroup, adGroup.placementGroup) &&
        equalsNullable(this.placementTrafficType, adGroup.placementTrafficType) &&
        equalsNullable(this.promotionApplicationLevel, adGroup.promotionApplicationLevel) &&
        equalsNullable(this.promotionId, adGroup.promotionId) &&
        Objects.equals(this.promotionIds, adGroup.promotionIds) &&
        equalsNullable(this.startTime, adGroup.startTime) &&
        Objects.equals(this.status, adGroup.status) &&
        Objects.equals(this.summaryStatus, adGroup.summaryStatus) &&
        Objects.equals(this.targetingSpec, adGroup.targetingSpec) &&
        equalsNullable(this.targetingTemplateIds, adGroup.targetingTemplateIds) &&
        equalsNullable(this.trackingUrls, adGroup.trackingUrls) &&
        Objects.equals(this.type, adGroup.type) &&
        Objects.equals(this.updatedTime, adGroup.updatedTime) &&
        equalsNullable(this.autoTargetingEnabled, adGroup.autoTargetingEnabled) &&
        equalsNullable(this.bidMultiplier, adGroup.bidMultiplier) &&
        Objects.equals(this.budgetType, adGroup.budgetType) &&
        Objects.equals(this.pacingDeliveryType, adGroup.pacingDeliveryType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, hashCodeNullable(bidInMicroCurrency), hashCodeNullable(bidStrategyType), billableEvent, hashCodeNullable(budgetInMicroCurrency), campaignId, conversionLearningModeType, createdTime, customerSegmentId, hashCodeNullable(dcaAssets), hashCodeNullable(endTime), hashCodeNullable(extFeatures), feedProfileId, id, hashCodeNullable(isCreativeOptimization), isLocalInventory, lifetimeFrequencyCap, localInventoryRadiusInMiles, name, hashCodeNullable(optimizationGoalMetadata), hashCodeNullable(performancePlusCampaignSettings), placementGroup, hashCodeNullable(placementTrafficType), hashCodeNullable(promotionApplicationLevel), hashCodeNullable(promotionId), promotionIds, hashCodeNullable(startTime), status, summaryStatus, targetingSpec, hashCodeNullable(targetingTemplateIds), hashCodeNullable(trackingUrls), type, updatedTime, hashCodeNullable(autoTargetingEnabled), hashCodeNullable(bidMultiplier), budgetType, pacingDeliveryType);
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
    sb.append("class AdGroup {\n");
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
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
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

