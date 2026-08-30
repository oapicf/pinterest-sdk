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
import org.openapitools.model.BidStrategyType;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdGroupCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupCreateRequest {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean autoTargetingEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal bidMultiplier;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BudgetType budgetType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable PacingDeliveryType pacingDeliveryType;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> bidInMicroCurrency = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<BidStrategyType> bidStrategyType = JsonNullable.<BidStrategyType>undefined();

  private ActionType billableEvent;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> budgetInMicroCurrency = JsonNullable.<Integer>undefined();

  private String campaignId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isCreativeOptimization = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer lifetimeFrequencyCap;

  private String name;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> optimizationGoalMetadata = JsonNullable.<Object>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable PlacementGroupType placementGroup;

  /**
   * Specify if the promotion is applied at ad group or item level
   */
  public enum PromotionApplicationLevelEnum {
    NONE("NONE"),
    
    ITEM("ITEM"),
    
    AD_GROUP("AD_GROUP");

    private final String value;

    PromotionApplicationLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PromotionApplicationLevelEnum fromValue(String value) {
      for (PromotionApplicationLevelEnum b : PromotionApplicationLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<PromotionApplicationLevelEnum> promotionApplicationLevel = JsonNullable.<PromotionApplicationLevelEnum>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d+$") String> promotionId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> promotionIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EntityStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TargetingSpec targetingSpec;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> targetingTemplateIds = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> trackingUrls = JsonNullable.<Object>undefined();

  public AdGroupCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdGroupCreateRequest(ActionType billableEvent, String campaignId, String name) {
    this.billableEvent = billableEvent;
    this.campaignId = campaignId;
    this.name = name;
  }

  public AdGroupCreateRequest autoTargetingEnabled(@Nullable Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", description = "Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public @Nullable Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(@Nullable Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupCreateRequest bidMultiplier(@Nullable BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
   * minimum: 0
   * maximum: 10
   * @return bidMultiplier
   */
  @Valid @DecimalMin(value = "0") @DecimalMax(value = "10") 
  @Schema(name = "bid_multiplier", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_multiplier")
  public @Nullable BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  @JsonProperty("bid_multiplier")
  public void setBidMultiplier(@Nullable BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupCreateRequest budgetType(@Nullable BudgetType budgetType) {
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
  public @Nullable BudgetType getBudgetType() {
    return budgetType;
  }

  @JsonProperty("budget_type")
  public void setBudgetType(@Nullable BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  public AdGroupCreateRequest pacingDeliveryType(@Nullable PacingDeliveryType pacingDeliveryType) {
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
  public @Nullable PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  @JsonProperty("pacing_delivery_type")
  public void setPacingDeliveryType(@Nullable PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  public AdGroupCreateRequest bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = JsonNullable.of(bidInMicroCurrency);
    return this;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
   * @return bidInMicroCurrency
   */
  
  @Schema(name = "bid_in_micro_currency", example = "5000000", description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_in_micro_currency")
  public JsonNullable<Integer> getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(JsonNullable<Integer> bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupCreateRequest bidStrategyType(BidStrategyType bidStrategyType) {
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

  public AdGroupCreateRequest billableEvent(ActionType billableEvent) {
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

  @JsonProperty("billable_event")
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupCreateRequest budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = JsonNullable.of(budgetInMicroCurrency);
    return this;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
   */
  
  @Schema(name = "budget_in_micro_currency", example = "5000000", description = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_in_micro_currency")
  public JsonNullable<Integer> getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(JsonNullable<Integer> budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  public AdGroupCreateRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Campaign ID of the ad group.
   * @return campaignId
   */
  @NotNull @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "campaign_id", example = "626736533506", description = "Campaign ID of the ad group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaign_id")
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupCreateRequest endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return endTime
   */
  
  @Schema(name = "end_time", example = "5705424000", description = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public AdGroupCreateRequest isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = JsonNullable.of(isCreativeOptimization);
    return this;
  }

  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   * @return isCreativeOptimization
   */
  
  @Schema(name = "is_creative_optimization", example = "true", description = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_creative_optimization")
  public JsonNullable<Boolean> getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  public void setIsCreativeOptimization(JsonNullable<Boolean> isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  public AdGroupCreateRequest lifetimeFrequencyCap(@Nullable Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   * @return lifetimeFrequencyCap
   */
  
  @Schema(name = "lifetime_frequency_cap", example = "100", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_frequency_cap")
  public @Nullable Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  @JsonProperty("lifetime_frequency_cap")
  public void setLifetimeFrequencyCap(@Nullable Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Ad group name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Ad Group For Pin: 687195905986", description = "Ad group name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public AdGroupCreateRequest optimizationGoalMetadata(Object optimizationGoalMetadata) {
    this.optimizationGoalMetadata = JsonNullable.of(optimizationGoalMetadata);
    return this;
  }

  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
   * @return optimizationGoalMetadata
   */
  
  @Schema(name = "optimization_goal_metadata", description = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimization_goal_metadata")
  public JsonNullable<Object> getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(JsonNullable<Object> optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupCreateRequest placementGroup(@Nullable PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
   * @return placementGroup
   */
  @Valid 
  @Schema(name = "placement_group", description = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public @Nullable PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(@Nullable PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupCreateRequest promotionApplicationLevel(PromotionApplicationLevelEnum promotionApplicationLevel) {
    this.promotionApplicationLevel = JsonNullable.of(promotionApplicationLevel);
    return this;
  }

  /**
   * Specify if the promotion is applied at ad group or item level
   * @return promotionApplicationLevel
   */
  
  @Schema(name = "promotion_application_level", example = "ITEM", description = "Specify if the promotion is applied at ad group or item level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_application_level")
  public JsonNullable<PromotionApplicationLevelEnum> getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  public void setPromotionApplicationLevel(JsonNullable<PromotionApplicationLevelEnum> promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  public AdGroupCreateRequest promotionId(String promotionId) {
    this.promotionId = JsonNullable.of(promotionId);
    return this;
  }

  /**
   * Promotion ID. To clear this field, set to null.
   * @return promotionId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "promotion_id", example = "7834020347906", description = "Promotion ID. To clear this field, set to null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(JsonNullable<String> promotionId) {
    this.promotionId = promotionId;
  }

  public AdGroupCreateRequest promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  public AdGroupCreateRequest addPromotionIdsItem(String promotionIdsItem) {
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
  
  @Schema(name = "promotion_ids", example = "[\"7834020347906\",\"7834020347907\"]", description = "Promotion IDs list. To clear this field, set to an empty array [].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_ids")
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  @JsonProperty("promotion_ids")
  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  public AdGroupCreateRequest startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return startTime
   */
  
  @Schema(name = "start_time", example = "5686848000", description = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public AdGroupCreateRequest status(@Nullable EntityStatus status) {
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
  public @Nullable EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  public AdGroupCreateRequest targetingSpec(@Nullable TargetingSpec targetingSpec) {
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
  public @Nullable TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  @JsonProperty("targeting_spec")
  public void setTargetingSpec(@Nullable TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupCreateRequest targetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
    this.targetingTemplateIds = JsonNullable.of(targetingTemplateIds);
    return this;
  }

  public AdGroupCreateRequest addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
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

  public AdGroupCreateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
   * @return trackingUrls
   */
  
  @Schema(name = "tracking_urls", description = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<Object> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<Object> trackingUrls) {
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
    AdGroupCreateRequest adGroupCreateRequest = (AdGroupCreateRequest) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupCreateRequest.autoTargetingEnabled) &&
        Objects.equals(this.bidMultiplier, adGroupCreateRequest.bidMultiplier) &&
        Objects.equals(this.budgetType, adGroupCreateRequest.budgetType) &&
        Objects.equals(this.pacingDeliveryType, adGroupCreateRequest.pacingDeliveryType) &&
        equalsNullable(this.bidInMicroCurrency, adGroupCreateRequest.bidInMicroCurrency) &&
        equalsNullable(this.bidStrategyType, adGroupCreateRequest.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroupCreateRequest.billableEvent) &&
        equalsNullable(this.budgetInMicroCurrency, adGroupCreateRequest.budgetInMicroCurrency) &&
        Objects.equals(this.campaignId, adGroupCreateRequest.campaignId) &&
        equalsNullable(this.endTime, adGroupCreateRequest.endTime) &&
        equalsNullable(this.isCreativeOptimization, adGroupCreateRequest.isCreativeOptimization) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupCreateRequest.lifetimeFrequencyCap) &&
        Objects.equals(this.name, adGroupCreateRequest.name) &&
        equalsNullable(this.optimizationGoalMetadata, adGroupCreateRequest.optimizationGoalMetadata) &&
        Objects.equals(this.placementGroup, adGroupCreateRequest.placementGroup) &&
        equalsNullable(this.promotionApplicationLevel, adGroupCreateRequest.promotionApplicationLevel) &&
        equalsNullable(this.promotionId, adGroupCreateRequest.promotionId) &&
        Objects.equals(this.promotionIds, adGroupCreateRequest.promotionIds) &&
        equalsNullable(this.startTime, adGroupCreateRequest.startTime) &&
        Objects.equals(this.status, adGroupCreateRequest.status) &&
        Objects.equals(this.targetingSpec, adGroupCreateRequest.targetingSpec) &&
        equalsNullable(this.targetingTemplateIds, adGroupCreateRequest.targetingTemplateIds) &&
        equalsNullable(this.trackingUrls, adGroupCreateRequest.trackingUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, bidMultiplier, budgetType, pacingDeliveryType, hashCodeNullable(bidInMicroCurrency), hashCodeNullable(bidStrategyType), billableEvent, hashCodeNullable(budgetInMicroCurrency), campaignId, hashCodeNullable(endTime), hashCodeNullable(isCreativeOptimization), lifetimeFrequencyCap, name, hashCodeNullable(optimizationGoalMetadata), placementGroup, hashCodeNullable(promotionApplicationLevel), hashCodeNullable(promotionId), promotionIds, hashCodeNullable(startTime), status, targetingSpec, hashCodeNullable(targetingTemplateIds), hashCodeNullable(trackingUrls));
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
    sb.append("class AdGroupCreateRequest {\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isCreativeOptimization: ").append(toIndentedString(isCreativeOptimization)).append("\n");
    sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

