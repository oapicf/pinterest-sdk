package org.openapitools.model;

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
import org.openapitools.model.EntityStatus;
import org.openapitools.model.NullableOptimizationGoalMetadata;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PerformancePlusCampaignSettings;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.PlacementTrafficType;
import org.openapitools.model.PromotionApplicationLevel;
import org.openapitools.model.TargetingSpecOperations;
import org.openapitools.model.TargetingSpecOptimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdGroupUpdateBatchUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupUpdateBatchUpdate   {
  private Boolean autoTargetingEnabled;
  private Integer bidInMicroCurrency;
  private BigDecimal bidMultiplier;
  private BidStrategyType bidStrategyType;
  private ActionType billableEvent;
  private Integer budgetInMicroCurrency;
  private BudgetType budgetType;
  private String campaignId;
  private String customerSegmentId;
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
  private PacingDeliveryType pacingDeliveryType;
  private PerformancePlusCampaignSettings performancePlusCampaignSettings;
  private PlacementGroupType placementGroup;
  private PlacementTrafficType placementTrafficType;
  private PromotionApplicationLevel promotionApplicationLevel;
  private String promotionId = "0";
  private @Valid List<String> promotionIds = new ArrayList<>();
  private Integer startTime;
  private EntityStatus status;
  private TargetingSpecOptimal targetingSpec;
  private @Valid List<@Valid TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();
  private @Valid List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds;
  private AdGroupTrackingURLs trackingUrls;

  public AdGroupUpdateBatchUpdate() {
  }

  @JsonCreator
  public AdGroupUpdateBatchUpdate(
    @JsonProperty(required = true, value = "id") String id
  ) {
    this.id = id;
  }

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   **/
  public AdGroupUpdateBatchUpdate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   **/
  public AdGroupUpdateBatchUpdate bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  @JsonProperty("bid_in_micro_currency")
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
   * minimum: 0
   * maximum: 10
   **/
  public AdGroupUpdateBatchUpdate bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  
  @ApiModelProperty(value = "[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).")
  @JsonProperty("bid_multiplier")
  @Valid  @DecimalMin("0") @DecimalMax("10")public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  @JsonProperty("bid_multiplier")
  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  /**
   **/
  public AdGroupUpdateBatchUpdate bidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bid_strategy_type")
  public BidStrategyType getBidStrategyType() {
    return bidStrategyType;
  }

  @JsonProperty("bid_strategy_type")
  public void setBidStrategyType(BidStrategyType bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  /**
   **/
  public AdGroupUpdateBatchUpdate billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  @JsonProperty("billable_event")
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   **/
  public AdGroupUpdateBatchUpdate budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  @JsonProperty("budget_in_micro_currency")
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  /**
   **/
  public AdGroupUpdateBatchUpdate budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }

  @JsonProperty("budget_type")
  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Campaign ID of the ad group.
   **/
  public AdGroupUpdateBatchUpdate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(value = "Campaign ID of the ad group.")
  @JsonProperty("campaign_id")
   @Pattern(regexp="^[C]?\\d+$")public String getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaign_id")
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.
   **/
  public AdGroupUpdateBatchUpdate customerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
    return this;
  }

  
  @ApiModelProperty(value = "Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.")
  @JsonProperty("customer_segment_id")
   @Pattern(regexp="^\\d+$")public String getCustomerSegmentId() {
    return customerSegmentId;
  }

  @JsonProperty("customer_segment_id")
  public void setCustomerSegmentId(String customerSegmentId) {
    this.customerSegmentId = customerSegmentId;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
   **/
  public AdGroupUpdateBatchUpdate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  @JsonProperty("end_time")
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  public AdGroupUpdateBatchUpdate extFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ext_features")
  @Valid public AdgroupTrackingFeatures getExtFeatures() {
    return extFeatures;
  }

  @JsonProperty("ext_features")
  public void setExtFeatures(AdgroupTrackingFeatures extFeatures) {
    this.extFeatures = extFeatures;
  }

  /**
   * Feed Profile ID associated to the adgroup.
   **/
  public AdGroupUpdateBatchUpdate feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  
  @ApiModelProperty(value = "Feed Profile ID associated to the adgroup.")
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  @JsonProperty("feed_profile_id")
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * Ad group ID.
   **/
  public AdGroupUpdateBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ad group ID.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   **/
  public AdGroupUpdateBatchUpdate isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
    return this;
  }

  
  @ApiModelProperty(value = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")
  @JsonProperty("is_creative_optimization")
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  @JsonProperty("is_creative_optimization")
  public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  /**
   * Indicates whether the ad group should use the local inventory.
   **/
  public AdGroupUpdateBatchUpdate isLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates whether the ad group should use the local inventory.")
  @JsonProperty("is_local_inventory")
  public Boolean getIsLocalInventory() {
    return isLocalInventory;
  }

  @JsonProperty("is_local_inventory")
  public void setIsLocalInventory(Boolean isLocalInventory) {
    this.isLocalInventory = isLocalInventory;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   **/
  public AdGroupUpdateBatchUpdate lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  
  @ApiModelProperty(value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.")
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  @JsonProperty("lifetime_frequency_cap")
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * The targeting radius of the local inventory ads in miles.
   **/
  public AdGroupUpdateBatchUpdate localInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
    return this;
  }

  
  @ApiModelProperty(value = "The targeting radius of the local inventory ads in miles.")
  @JsonProperty("local_inventory_radius_in_miles")
  @Valid public BigDecimal getLocalInventoryRadiusInMiles() {
    return localInventoryRadiusInMiles;
  }

  @JsonProperty("local_inventory_radius_in_miles")
  public void setLocalInventoryRadiusInMiles(BigDecimal localInventoryRadiusInMiles) {
    this.localInventoryRadiusInMiles = localInventoryRadiusInMiles;
  }

  /**
   * Ad group name.
   **/
  public AdGroupUpdateBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Ad group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
   **/
  public AdGroupUpdateBatchUpdate optimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
  @JsonProperty("optimization_goal_metadata")
  @Valid public NullableOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  @JsonProperty("optimization_goal_metadata")
  public void setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   **/
  public AdGroupUpdateBatchUpdate pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  @JsonProperty("pacing_delivery_type")
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * Pinterest Performance+ campaign settings.
   **/
  public AdGroupUpdateBatchUpdate performancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
    return this;
  }

  
  @ApiModelProperty(value = "Pinterest Performance+ campaign settings.")
  @JsonProperty("performance_plus_campaign_settings")
  @Valid public PerformancePlusCampaignSettings getPerformancePlusCampaignSettings() {
    return performancePlusCampaignSettings;
  }

  @JsonProperty("performance_plus_campaign_settings")
  public void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performancePlusCampaignSettings) {
    this.performancePlusCampaignSettings = performancePlusCampaignSettings;
  }

  /**
   * [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
   **/
  public AdGroupUpdateBatchUpdate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "[Placement group](https://help.pinterest.com/en/business/article/placement-groups).")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
   **/
  public AdGroupUpdateBatchUpdate placementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
    return this;
  }

  
  @ApiModelProperty(value = "A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both")
  @JsonProperty("placement_traffic_type")
  public PlacementTrafficType getPlacementTrafficType() {
    return placementTrafficType;
  }

  @JsonProperty("placement_traffic_type")
  public void setPlacementTrafficType(PlacementTrafficType placementTrafficType) {
    this.placementTrafficType = placementTrafficType;
  }

  /**
   * Specify if the promotion is applied at ad group or item level
   **/
  public AdGroupUpdateBatchUpdate promotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
    return this;
  }

  
  @ApiModelProperty(example = "ITEM", value = "Specify if the promotion is applied at ad group or item level")
  @JsonProperty("promotion_application_level")
  public PromotionApplicationLevel getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  @JsonProperty("promotion_application_level")
  public void setPromotionApplicationLevel(PromotionApplicationLevel promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  /**
   * Promotion ID. To clear this field, set to null.
   **/
  public AdGroupUpdateBatchUpdate promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  
  @ApiModelProperty(value = "Promotion ID. To clear this field, set to null.")
  @JsonProperty("promotion_id")
   @Pattern(regexp="^\\d+$")public String getPromotionId() {
    return promotionId;
  }

  @JsonProperty("promotion_id")
  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Promotion IDs list. To clear this field, set to an empty array [].
   **/
  public AdGroupUpdateBatchUpdate promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  
  @ApiModelProperty(value = "Promotion IDs list. To clear this field, set to an empty array [].")
  @JsonProperty("promotion_ids")
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  @JsonProperty("promotion_ids")
  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  public AdGroupUpdateBatchUpdate addPromotionIdsItem(String promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }

    this.promotionIds.add(promotionIdsItem);
    return this;
  }

  public AdGroupUpdateBatchUpdate removePromotionIdsItem(String promotionIdsItem) {
    if (promotionIdsItem != null && this.promotionIds != null) {
      this.promotionIds.remove(promotionIdsItem);
    }

    return this;
  }
  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   **/
  public AdGroupUpdateBatchUpdate startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  @JsonProperty("start_time")
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Ad group/entity status.
   **/
  public AdGroupUpdateBatchUpdate status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Ad group/entity status.")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   **/
  public AdGroupUpdateBatchUpdate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  @Valid public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  @JsonProperty("targeting_spec")
  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   **/
  public AdGroupUpdateBatchUpdate targetingSpecOperations(List<@Valid TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec_operations")
  @Valid public List<@Valid TargetingSpecOperations> getTargetingSpecOperations() {
    return targetingSpecOperations;
  }

  @JsonProperty("targeting_spec_operations")
  public void setTargetingSpecOperations(List<@Valid TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
  }

  public AdGroupUpdateBatchUpdate addTargetingSpecOperationsItem(TargetingSpecOperations targetingSpecOperationsItem) {
    if (this.targetingSpecOperations == null) {
      this.targetingSpecOperations = new ArrayList<>();
    }

    this.targetingSpecOperations.add(targetingSpecOperationsItem);
    return this;
  }

  public AdGroupUpdateBatchUpdate removeTargetingSpecOperationsItem(TargetingSpecOperations targetingSpecOperationsItem) {
    if (targetingSpecOperationsItem != null && this.targetingSpecOperations != null) {
      this.targetingSpecOperations.remove(targetingSpecOperationsItem);
    }

    return this;
  }
  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
   **/
  public AdGroupUpdateBatchUpdate targetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
    return this;
  }

  
  @ApiModelProperty(value = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
  @JsonProperty("targeting_template_ids")
   @Size(max=1)public List< @Pattern(regexp="^\\d+$")String> getTargetingTemplateIds() {
    return targetingTemplateIds;
  }

  @JsonProperty("targeting_template_ids")
  public void setTargetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
  }

  public AdGroupUpdateBatchUpdate addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    if (this.targetingTemplateIds == null) {
      this.targetingTemplateIds = new ArrayList<>();
    }

    this.targetingTemplateIds.add(targetingTemplateIdsItem);
    return this;
  }

  public AdGroupUpdateBatchUpdate removeTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    if (targetingTemplateIdsItem != null && this.targetingTemplateIds != null) {
      this.targetingTemplateIds.remove(targetingTemplateIdsItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupUpdateBatchUpdate trackingUrls(AdGroupTrackingURLs trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  @Valid public AdGroupTrackingURLs getTrackingUrls() {
    return trackingUrls;
  }

  @JsonProperty("tracking_urls")
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
