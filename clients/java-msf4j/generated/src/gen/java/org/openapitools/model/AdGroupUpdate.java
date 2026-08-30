package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * AdGroupUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupUpdate   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("bid_in_micro_currency")
  private Integer bidInMicroCurrency;

  @JsonProperty("bid_strategy_type")
  private BidStrategyType bidStrategyType;

  @JsonProperty("billable_event")
  private ActionType billableEvent;

  @JsonProperty("budget_in_micro_currency")
  private Integer budgetInMicroCurrency;

  @JsonProperty("campaign_id")
  private String campaignId;

  @JsonProperty("conversion_learning_mode_type")
  private ConversionLearningModeType conversionLearningModeType;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("customer_segment_id")
  private String customerSegmentId;

  @JsonProperty("dca_assets")
  private Object dcaAssets;

  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("ext_features")
  private AdgroupTrackingFeatures extFeatures;

  @JsonProperty("feed_profile_id")
  private String feedProfileId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("is_creative_optimization")
  private Boolean isCreativeOptimization;

  @JsonProperty("is_local_inventory")
  private Boolean isLocalInventory;

  @JsonProperty("lifetime_frequency_cap")
  private Integer lifetimeFrequencyCap;

  @JsonProperty("local_inventory_radius_in_miles")
  private BigDecimal localInventoryRadiusInMiles;

  @JsonProperty("name")
  private String name;

  @JsonProperty("optimization_goal_metadata")
  private NullableOptimizationGoalMetadata optimizationGoalMetadata;

  @JsonProperty("performance_plus_campaign_settings")
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;

  @JsonProperty("placement_group")
  private PlacementGroupType placementGroup;

  @JsonProperty("placement_traffic_type")
  private PlacementTrafficType placementTrafficType;

  @JsonProperty("promotion_application_level")
  private PromotionApplicationLevel promotionApplicationLevel;

  @JsonProperty("promotion_id")
  private String promotionId = "0";

  @JsonProperty("promotion_ids")
  private List<String> promotionIds = null;

  @JsonProperty("start_time")
  private Integer startTime;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("summary_status")
  private SummaryStatus summaryStatus;

  @JsonProperty("targeting_spec")
  private TargetingSpecOptimal targetingSpec;

  @JsonProperty("targeting_template_ids")
  private List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds = null;

  @JsonProperty("tracking_urls")
  private AdGroupTrackingURLs trackingUrls;

  @JsonProperty("type")
  private String type = "adgroup";

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled;

  @JsonProperty("bid_multiplier")
  private BigDecimal bidMultiplier;

  @JsonProperty("budget_type")
  private BudgetType budgetType;

  @JsonProperty("pacing_delivery_type")
  private PacingDeliveryType pacingDeliveryType;

   /**
   * Advertiser ID.
   * @return adAccountId
  **/
  @ApiModelProperty(value = "Advertiser ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public AdGroupUpdate bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

   /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
  **/
  @ApiModelProperty(value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupUpdate bidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
  }

   /**
   * Get bidStrategyType
   * @return bidStrategyType
  **/
  @ApiModelProperty(value = "")
  public BidStrategyType getBidStrategyType() {
    return bidStrategyType;
  }

  public void setBidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  public AdGroupUpdate billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

   /**
   * Get billableEvent
   * @return billableEvent
  **/
  @ApiModelProperty(required = true, value = "")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupUpdate budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

   /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
  **/
  @ApiModelProperty(value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  public AdGroupUpdate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign ID of the ad group.
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "Campaign ID of the ad group.")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

   /**
   * oCPM learn mode
   * @return conversionLearningModeType
  **/
  @ApiModelProperty(required = true, value = "oCPM learn mode")
  public ConversionLearningModeType getConversionLearningModeType() {
    return conversionLearningModeType;
  }

   /**
   * Ad group creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @ApiModelProperty(required = true, value = "Ad group creation time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public AdGroupUpdate customerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
    return this;
  }

   /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
   * @return customerSegmentId
  **/
  @ApiModelProperty(value = "Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.")
  public String getCustomerSegmentId() {
    return customerSegmentId;
  }

  public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

   /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
   * @return dcaAssets
  **/
  @ApiModelProperty(value = "[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.")
  public Object getDcaAssets() {
    return dcaAssets;
  }

  public AdGroupUpdate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   * @return endTime
  **/
  @ApiModelProperty(value = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public AdGroupUpdate extFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
    return this;
  }

   /**
   * Get extFeatures
   * @return extFeatures
  **/
  @ApiModelProperty(value = "")
  public AdgroupTrackingFeatures getExtFeatures() {
    return extFeatures;
  }

  public void setExtFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
  }

  public AdGroupUpdate feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

   /**
   * Feed Profile ID associated to the adgroup.
   * @return feedProfileId
  **/
  @ApiModelProperty(value = "Feed Profile ID associated to the adgroup.")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public AdGroupUpdate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Ad group ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Ad group ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdGroupUpdate isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
    return this;
  }

   /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   * @return isCreativeOptimization
  **/
  @ApiModelProperty(value = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  public AdGroupUpdate isLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
    return this;
  }

   /**
   * Indicates whether the ad group should use the local inventory.
   * @return isLocalInventory
  **/
  @ApiModelProperty(value = "Indicates whether the ad group should use the local inventory.")
  public Boolean getIsLocalInventory() {
    return isLocalInventory;
  }

  public void setIsLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
  }

  public AdGroupUpdate lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

   /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
   * @return lifetimeFrequencyCap
  **/
  @ApiModelProperty(value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupUpdate localInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
    return this;
  }

   /**
   * The targeting radius of the local inventory ads in miles.
   * @return localInventoryRadiusInMiles
  **/
  @ApiModelProperty(value = "The targeting radius of the local inventory ads in miles.")
  public BigDecimal getLocalInventoryRadiusInMiles() {
    return localInventoryRadiusInMiles;
  }

  public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
  }

  public AdGroupUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Ad group name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Ad group name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdGroupUpdate optimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

   /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
   * @return optimizationGoalMetadata
  **/
  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
  public NullableOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupUpdate performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    return this;
  }

   /**
   * Pinterest Performance+ campaign settings.
   * @return performancePlusCampaignSettings
  **/
  @ApiModelProperty(value = "Pinterest Performance+ campaign settings.")
  public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  public AdGroupUpdate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

   /**
   * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
   * @return placementGroup
  **/
  @ApiModelProperty(value = "[Placement group](https://help.pinterest.com/en/business/article/placement-groups).")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupUpdate placementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
    return this;
  }

   /**
   * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
   * @return placementTrafficType
  **/
  @ApiModelProperty(value = "A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both")
  public PlacementTrafficType getPlacementTrafficType() {
    return placementTrafficType;
  }

  public void setPlacementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
  }

  public AdGroupUpdate promotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
    return this;
  }

   /**
   * Specify if the promotion is applied at ad group or item level
   * @return promotionApplicationLevel
  **/
  @ApiModelProperty(example = "ITEM", value = "Specify if the promotion is applied at ad group or item level")
  public PromotionApplicationLevel getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  public void setPromotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  public AdGroupUpdate promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * Promotion ID. To clear this field, set to null.
   * @return promotionId
  **/
  @ApiModelProperty(value = "Promotion ID. To clear this field, set to null.")
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public AdGroupUpdate promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  public AdGroupUpdate addPromotionIdsItem(String promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   * @return promotionIds
  **/
  @ApiModelProperty(value = "Promotion IDs list. To clear this field, set to an empty array [].")
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  public AdGroupUpdate startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return startTime
  **/
  @ApiModelProperty(value = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public AdGroupUpdate status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Ad group/entity status.
   * @return status
  **/
  @ApiModelProperty(value = "Ad group/entity status.")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

   /**
   * Get summaryStatus
   * @return summaryStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public SummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public AdGroupUpdate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @ApiModelProperty(value = "")
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupUpdate targetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
    return this;
  }

  public AdGroupUpdate addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    if (this.targetingTemplateIds == null) {
      this.targetingTemplateIds = ;
    }
    this.targetingTemplateIds.add(targetingTemplateIdsItem);
    return this;
  }

   /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
   * @return targetingTemplateIds
  **/
  @ApiModelProperty(value = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
  public List<@Pattern(regexp = "^\\d+$")String> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }

  public void setTargetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }

  public AdGroupUpdate trackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @ApiModelProperty(value = "")
  public AdGroupTrackingURLs getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

   /**
   * Always \"adgroup\".
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Always \"adgroup\".")
  public String getType() {
    return type;
  }

   /**
   * Ad group last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @ApiModelProperty(required = true, value = "Ad group last update time. Unix timestamp in seconds.")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public AdGroupUpdate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

   /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
  **/
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupUpdate bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

   /**
   * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
   * minimum: 0
   * maximum: 10
   * @return bidMultiplier
  **/
  @ApiModelProperty(value = "[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).")
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupUpdate budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

   /**
   * Get budgetType
   * @return budgetType
  **/
  @ApiModelProperty(value = "")
  public BudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  public AdGroupUpdate pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

   /**
   * Get pacingDeliveryType
   * @return pacingDeliveryType
  **/
  @ApiModelProperty(value = "")
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
    AdGroupUpdate adGroupUpdate = (AdGroupUpdate) o;
    return Objects.equals(this.adAccountId, adGroupUpdate.adAccountId) &&
        Objects.equals(this.bidInMicroCurrency, adGroupUpdate.bidInMicroCurrency) &&
        Objects.equals(this.bidStrategyType, adGroupUpdate.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroupUpdate.billableEvent) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupUpdate.budgetInMicroCurrency) &&
        Objects.equals(this.campaignId, adGroupUpdate.campaignId) &&
        Objects.equals(this.conversionLearningModeType, adGroupUpdate.conversionLearningModeType) &&
        Objects.equals(this.createdTime, adGroupUpdate.createdTime) &&
        Objects.equals(this.customerSegmentId, adGroupUpdate.customerSegmentId) &&
        Objects.equals(this.dcaAssets, adGroupUpdate.dcaAssets) &&
        Objects.equals(this.endTime, adGroupUpdate.endTime) &&
        Objects.equals(this.extFeatures, adGroupUpdate.extFeatures) &&
        Objects.equals(this.feedProfileId, adGroupUpdate.feedProfileId) &&
        Objects.equals(this.id, adGroupUpdate.id) &&
        Objects.equals(this.isCreativeOptimization, adGroupUpdate.isCreativeOptimization) &&
        Objects.equals(this.isLocalInventory, adGroupUpdate.isLocalInventory) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupUpdate.lifetimeFrequencyCap) &&
        Objects.equals(this.localInventoryRadiusInMiles, adGroupUpdate.localInventoryRadiusInMiles) &&
        Objects.equals(this.name, adGroupUpdate.name) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupUpdate.optimizationGoalMetadata) &&
        Objects.equals(this.performancePlusCampaignSettings, adGroupUpdate.performancePlusCampaignSettings) &&
        Objects.equals(this.placementGroup, adGroupUpdate.placementGroup) &&
        Objects.equals(this.placementTrafficType, adGroupUpdate.placementTrafficType) &&
        Objects.equals(this.promotionApplicationLevel, adGroupUpdate.promotionApplicationLevel) &&
        Objects.equals(this.promotionId, adGroupUpdate.promotionId) &&
        Objects.equals(this.promotionIds, adGroupUpdate.promotionIds) &&
        Objects.equals(this.startTime, adGroupUpdate.startTime) &&
        Objects.equals(this.status, adGroupUpdate.status) &&
        Objects.equals(this.summaryStatus, adGroupUpdate.summaryStatus) &&
        Objects.equals(this.targetingSpec, adGroupUpdate.targetingSpec) &&
        Objects.equals(this.targetingTemplateIds, adGroupUpdate.targetingTemplateIds) &&
        Objects.equals(this.trackingUrls, adGroupUpdate.trackingUrls) &&
        Objects.equals(this.type, adGroupUpdate.type) &&
        Objects.equals(this.updatedTime, adGroupUpdate.updatedTime) &&
        Objects.equals(this.autoTargetingEnabled, adGroupUpdate.autoTargetingEnabled) &&
        Objects.equals(this.bidMultiplier, adGroupUpdate.bidMultiplier) &&
        Objects.equals(this.budgetType, adGroupUpdate.budgetType) &&
        Objects.equals(this.pacingDeliveryType, adGroupUpdate.pacingDeliveryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, bidInMicroCurrency, bidStrategyType, billableEvent, budgetInMicroCurrency, campaignId, conversionLearningModeType, createdTime, customerSegmentId, dcaAssets, endTime, extFeatures, feedProfileId, id, isCreativeOptimization, isLocalInventory, lifetimeFrequencyCap, localInventoryRadiusInMiles, name, optimizationGoalMetadata, performancePlusCampaignSettings, placementGroup, placementTrafficType, promotionApplicationLevel, promotionId, promotionIds, startTime, status, summaryStatus, targetingSpec, targetingTemplateIds, trackingUrls, type, updatedTime, autoTargetingEnabled, bidMultiplier, budgetType, pacingDeliveryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupUpdate {\n");
    
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

