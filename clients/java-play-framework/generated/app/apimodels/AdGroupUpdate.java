package apimodels;

import apimodels.ActionType;
import apimodels.AdGroupTrackingURLs;
import apimodels.AdgroupTrackingFeatures;
import apimodels.BidStrategyType;
import apimodels.BudgetType;
import apimodels.ConversionLearningModeType;
import apimodels.EntityStatus;
import apimodels.NullableOptimizationGoalMetadata;
import apimodels.PacingDeliveryType;
import apimodels.PerformancePlusCampaignSettings;
import apimodels.PlacementGroupType;
import apimodels.PlacementTrafficType;
import apimodels.PromotionApplicationLevel;
import apimodels.SummaryStatus;
import apimodels.TargetingSpecOptimal;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdGroupUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdGroupUpdate   {
  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("bid_in_micro_currency")
  
  private Integer bidInMicroCurrency;

  @JsonProperty("bid_strategy_type")
  @Valid

  private BidStrategyType bidStrategyType;

  @JsonProperty("billable_event")
  @NotNull
@Valid

  private ActionType billableEvent;

  @JsonProperty("budget_in_micro_currency")
  
  private Integer budgetInMicroCurrency;

  @JsonProperty("campaign_id")
  @NotNull
@Pattern(regexp="^[C]?\\d+$")

  private String campaignId;

  @JsonProperty("conversion_learning_mode_type")
  @NotNull
@Valid

  private ConversionLearningModeType conversionLearningModeType;

  @JsonProperty("created_time")
  @NotNull

  private Integer createdTime;

  @JsonProperty("customer_segment_id")
  @Pattern(regexp="^\\d+$")

  private String customerSegmentId;

  @JsonProperty("dca_assets")
  
  private Object dcaAssets;

  @JsonProperty("end_time")
  
  private Integer endTime;

  @JsonProperty("ext_features")
  @Valid

  private AdgroupTrackingFeatures extFeatures;

  @JsonProperty("feed_profile_id")
  
  private String feedProfileId;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("is_creative_optimization")
  
  private Boolean isCreativeOptimization;

  @JsonProperty("is_local_inventory")
  
  private Boolean isLocalInventory;

  @JsonProperty("lifetime_frequency_cap")
  
  private Integer lifetimeFrequencyCap;

  @JsonProperty("local_inventory_radius_in_miles")
  @Valid

  private BigDecimal localInventoryRadiusInMiles;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("optimization_goal_metadata")
  @Valid

  private NullableOptimizationGoalMetadata optimizationGoalMetadata;

  @JsonProperty("performance_plus_campaign_settings")
  @Valid

  private PerformancePlusCampaignSettings performancePlusCampaignSettings;

  @JsonProperty("placement_group")
  @Valid

  private PlacementGroupType placementGroup;

  @JsonProperty("placement_traffic_type")
  @Valid

  private PlacementTrafficType placementTrafficType;

  @JsonProperty("promotion_application_level")
  @Valid

  private PromotionApplicationLevel promotionApplicationLevel;

  @JsonProperty("promotion_id")
  @Pattern(regexp="^\\d+$")

  private String promotionId = "0";

  @JsonProperty("promotion_ids")
  
  private List<String> promotionIds = null;

  @JsonProperty("start_time")
  
  private Integer startTime;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("summary_status")
  @NotNull
@Valid

  private SummaryStatus summaryStatus;

  @JsonProperty("targeting_spec")
  @Valid

  private TargetingSpecOptimal targetingSpec;

  @JsonProperty("targeting_template_ids")
  @Size(max=1)

  private List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds = null;

  @JsonProperty("tracking_urls")
  @Valid

  private AdGroupTrackingURLs trackingUrls;

  @JsonProperty("type")
  @NotNull

  private String type = "adgroup";

  @JsonProperty("updated_time")
  @NotNull

  private Integer updatedTime;

  @JsonProperty("auto_targeting_enabled")
  
  private Boolean autoTargetingEnabled;

  @JsonProperty("bid_multiplier")
  @DecimalMin("0")
@DecimalMax("10")
@Valid

  private BigDecimal bidMultiplier;

  @JsonProperty("budget_type")
  @Valid

  private BudgetType budgetType;

  @JsonProperty("pacing_delivery_type")
  @Valid

  private PacingDeliveryType pacingDeliveryType;

  public AdGroupUpdate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdGroupUpdate bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

   /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
  **/
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
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupUpdate conversionLearningModeType(ConversionLearningModeType conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
    return this;
  }

   /**
   * oCPM learn mode
   * @return conversionLearningModeType
  **/
  public ConversionLearningModeType getConversionLearningModeType() {
    return conversionLearningModeType;
  }

  public void setConversionLearningModeType(ConversionLearningModeType conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

  public AdGroupUpdate createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Ad group creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdGroupUpdate customerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
    return this;
  }

   /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
   * @return customerSegmentId
  **/
  public String getCustomerSegmentId() {
    return customerSegmentId;
  }

  public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

  public AdGroupUpdate dcaAssets(Object dcaAssets) {
    this.dcaAssets = dcaAssets;
    return this;
  }

   /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
   * @return dcaAssets
  **/
  public Object getDcaAssets() {
    return dcaAssets;
  }

  public void setDcaAssets(Object dcaAssets) {
    this.dcaAssets = dcaAssets;
  }

  public AdGroupUpdate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   * @return endTime
  **/
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
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdGroupUpdate summaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

   /**
   * Get summaryStatus
   * @return summaryStatus
  **/
  public SummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(SummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdGroupUpdate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Get targetingSpec
   * @return targetingSpec
  **/
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
      this.targetingTemplateIds = new ArrayList<>();
    }
    this.targetingTemplateIds.add(targetingTemplateIdsItem);
    return this;
  }

   /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
   * @return targetingTemplateIds
  **/
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
  public AdGroupTrackingURLs getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdGroupUpdate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always \"adgroup\".
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdGroupUpdate updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Ad group last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdGroupUpdate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

   /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
  **/
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
    return Objects.equals(adAccountId, adGroupUpdate.adAccountId) &&
        Objects.equals(bidInMicroCurrency, adGroupUpdate.bidInMicroCurrency) &&
        Objects.equals(bidStrategyType, adGroupUpdate.bidStrategyType) &&
        Objects.equals(billableEvent, adGroupUpdate.billableEvent) &&
        Objects.equals(budgetInMicroCurrency, adGroupUpdate.budgetInMicroCurrency) &&
        Objects.equals(campaignId, adGroupUpdate.campaignId) &&
        Objects.equals(conversionLearningModeType, adGroupUpdate.conversionLearningModeType) &&
        Objects.equals(createdTime, adGroupUpdate.createdTime) &&
        Objects.equals(customerSegmentId, adGroupUpdate.customerSegmentId) &&
        Objects.equals(dcaAssets, adGroupUpdate.dcaAssets) &&
        Objects.equals(endTime, adGroupUpdate.endTime) &&
        Objects.equals(extFeatures, adGroupUpdate.extFeatures) &&
        Objects.equals(feedProfileId, adGroupUpdate.feedProfileId) &&
        Objects.equals(id, adGroupUpdate.id) &&
        Objects.equals(isCreativeOptimization, adGroupUpdate.isCreativeOptimization) &&
        Objects.equals(isLocalInventory, adGroupUpdate.isLocalInventory) &&
        Objects.equals(lifetimeFrequencyCap, adGroupUpdate.lifetimeFrequencyCap) &&
        Objects.equals(localInventoryRadiusInMiles, adGroupUpdate.localInventoryRadiusInMiles) &&
        Objects.equals(name, adGroupUpdate.name) &&
        Objects.equals(optimizationGoalMetadata, adGroupUpdate.optimizationGoalMetadata) &&
        Objects.equals(performancePlusCampaignSettings, adGroupUpdate.performancePlusCampaignSettings) &&
        Objects.equals(placementGroup, adGroupUpdate.placementGroup) &&
        Objects.equals(placementTrafficType, adGroupUpdate.placementTrafficType) &&
        Objects.equals(promotionApplicationLevel, adGroupUpdate.promotionApplicationLevel) &&
        Objects.equals(promotionId, adGroupUpdate.promotionId) &&
        Objects.equals(promotionIds, adGroupUpdate.promotionIds) &&
        Objects.equals(startTime, adGroupUpdate.startTime) &&
        Objects.equals(status, adGroupUpdate.status) &&
        Objects.equals(summaryStatus, adGroupUpdate.summaryStatus) &&
        Objects.equals(targetingSpec, adGroupUpdate.targetingSpec) &&
        Objects.equals(targetingTemplateIds, adGroupUpdate.targetingTemplateIds) &&
        Objects.equals(trackingUrls, adGroupUpdate.trackingUrls) &&
        Objects.equals(type, adGroupUpdate.type) &&
        Objects.equals(updatedTime, adGroupUpdate.updatedTime) &&
        Objects.equals(autoTargetingEnabled, adGroupUpdate.autoTargetingEnabled) &&
        Objects.equals(bidMultiplier, adGroupUpdate.bidMultiplier) &&
        Objects.equals(budgetType, adGroupUpdate.budgetType) &&
        Objects.equals(pacingDeliveryType, adGroupUpdate.pacingDeliveryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, bidInMicroCurrency, bidStrategyType, billableEvent, budgetInMicroCurrency, campaignId, conversionLearningModeType, createdTime, customerSegmentId, dcaAssets, endTime, extFeatures, feedProfileId, id, isCreativeOptimization, isLocalInventory, lifetimeFrequencyCap, localInventoryRadiusInMiles, name, optimizationGoalMetadata, performancePlusCampaignSettings, placementGroup, placementTrafficType, promotionApplicationLevel, promotionId, promotionIds, startTime, status, summaryStatus, targetingSpec, targetingTemplateIds, trackingUrls, type, updatedTime, autoTargetingEnabled, bidMultiplier, budgetType, pacingDeliveryType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

