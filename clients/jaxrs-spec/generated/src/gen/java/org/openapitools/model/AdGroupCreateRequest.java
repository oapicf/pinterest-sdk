package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdGroupCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupCreateRequest   {
  private Boolean autoTargetingEnabled;
  private BigDecimal bidMultiplier;
  private BudgetType budgetType;
  private PacingDeliveryType pacingDeliveryType;
  private Integer bidInMicroCurrency;
  private BidStrategyType bidStrategyType;
  private ActionType billableEvent;
  private Integer budgetInMicroCurrency;
  private String campaignId;
  private Integer endTime;
  private Boolean isCreativeOptimization;
  private Integer lifetimeFrequencyCap;
  private String name;
  private Object optimizationGoalMetadata;
  private PlacementGroupType placementGroup;
  public enum PromotionApplicationLevelEnum {

    NONE(String.valueOf("NONE")), ITEM(String.valueOf("ITEM")), AD_GROUP(String.valueOf("AD_GROUP"));


    private String value;

    PromotionApplicationLevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static PromotionApplicationLevelEnum fromString(String s) {
        for (PromotionApplicationLevelEnum b : PromotionApplicationLevelEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        return null;
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

  private PromotionApplicationLevelEnum promotionApplicationLevel;
  private String promotionId = "0";
  private @Valid List<String> promotionIds = new ArrayList<>();
  private Integer startTime;
  private EntityStatus status;
  private TargetingSpec targetingSpec;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds;
  private Object trackingUrls;

  public AdGroupCreateRequest() {
  }

  @JsonCreator
  public AdGroupCreateRequest(
    @JsonProperty(required = true, value = "billable_event") ActionType billableEvent,
    @JsonProperty(required = true, value = "campaign_id") String campaignId,
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.billableEvent = billableEvent;
    this.campaignId = campaignId;
    this.name = name;
  }

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.
   **/
  public AdGroupCreateRequest autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.
   * minimum: 0
   * maximum: 10
   **/
  public AdGroupCreateRequest bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.")
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
  public AdGroupCreateRequest budgetType(BudgetType budgetType) {
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
   **/
  public AdGroupCreateRequest pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
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
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
   **/
  public AdGroupCreateRequest bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  @JsonProperty("bid_in_micro_currency")
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   **/
  public AdGroupCreateRequest bidStrategyType(BidStrategyType bidStrategyType) {
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
  public AdGroupCreateRequest billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "billable_event")
  @NotNull public ActionType getBillableEvent() {
    return billableEvent;
  }

  @JsonProperty(required = true, value = "billable_event")
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   **/
  public AdGroupCreateRequest budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  @JsonProperty("budget_in_micro_currency")
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  /**
   * Campaign ID of the ad group.
   **/
  public AdGroupCreateRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(example = "626736533506", required = true, value = "Campaign ID of the ad group.")
  @JsonProperty(required = true, value = "campaign_id")
  @NotNull  @Pattern(regexp="^[C]?\\d+$")public String getCampaignId() {
    return campaignId;
  }

  @JsonProperty(required = true, value = "campaign_id")
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   **/
  public AdGroupCreateRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "5705424000", value = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  @JsonProperty("end_time")
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
   **/
  public AdGroupCreateRequest isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")
  @JsonProperty("is_creative_optimization")
  public Boolean getIsCreativeOptimization() {
    return isCreativeOptimization;
  }

  @JsonProperty("is_creative_optimization")
  public void setIsCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   **/
  public AdGroupCreateRequest lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  @JsonProperty("lifetime_frequency_cap")
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * Ad group name.
   **/
  public AdGroupCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", required = true, value = "Ad group name.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
   **/
  public AdGroupCreateRequest optimizationGoalMetadata(Object optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
  @JsonProperty("optimization_goal_metadata")
  public Object getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  @JsonProperty("optimization_goal_metadata")
  public void setOptimizationGoalMetadata(Object optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   **/
  public AdGroupCreateRequest placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Specify if the promotion is applied at ad group or item level
   **/
  public AdGroupCreateRequest promotionApplicationLevel(PromotionApplicationLevelEnum promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
    return this;
  }

  
  @ApiModelProperty(example = "ITEM", value = "Specify if the promotion is applied at ad group or item level")
  @JsonProperty("promotion_application_level")
  public PromotionApplicationLevelEnum getPromotionApplicationLevel() {
    return promotionApplicationLevel;
  }

  @JsonProperty("promotion_application_level")
  public void setPromotionApplicationLevel(PromotionApplicationLevelEnum promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  /**
   * Promotion ID. To clear this field, set to null.
   **/
  public AdGroupCreateRequest promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  
  @ApiModelProperty(example = "7834020347906", value = "Promotion ID. To clear this field, set to null.")
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
  public AdGroupCreateRequest promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"7834020347906\",\"7834020347907\"]", value = "Promotion IDs list. To clear this field, set to an empty array [].")
  @JsonProperty("promotion_ids")
  public List<String> getPromotionIds() {
    return promotionIds;
  }

  @JsonProperty("promotion_ids")
  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }

  public AdGroupCreateRequest addPromotionIdsItem(String promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }

    this.promotionIds.add(promotionIdsItem);
    return this;
  }

  public AdGroupCreateRequest removePromotionIdsItem(String promotionIdsItem) {
    if (promotionIdsItem != null && this.promotionIds != null) {
      this.promotionIds.remove(promotionIdsItem);
    }

    return this;
  }
  /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   **/
  public AdGroupCreateRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "5686848000", value = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
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
  public AdGroupCreateRequest status(EntityStatus status) {
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
  public AdGroupCreateRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  @Valid public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  @JsonProperty("targeting_spec")
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
   **/
  public AdGroupCreateRequest targetingTemplateIds(List<@Pattern(regexp = "^\\d+$")String> targetingTemplateIds) {
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

  public AdGroupCreateRequest addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    if (this.targetingTemplateIds == null) {
      this.targetingTemplateIds = new ArrayList<>();
    }

    this.targetingTemplateIds.add(targetingTemplateIdsItem);
    return this;
  }

  public AdGroupCreateRequest removeTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    if (targetingTemplateIdsItem != null && this.targetingTemplateIds != null) {
      this.targetingTemplateIds.remove(targetingTemplateIdsItem);
    }

    return this;
  }
  /**
   * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
   **/
  public AdGroupCreateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
  @JsonProperty("tracking_urls")
  public Object getTrackingUrls() {
    return trackingUrls;
  }

  @JsonProperty("tracking_urls")
  public void setTrackingUrls(Object trackingUrls) {
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
        Objects.equals(this.bidInMicroCurrency, adGroupCreateRequest.bidInMicroCurrency) &&
        Objects.equals(this.bidStrategyType, adGroupCreateRequest.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroupCreateRequest.billableEvent) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupCreateRequest.budgetInMicroCurrency) &&
        Objects.equals(this.campaignId, adGroupCreateRequest.campaignId) &&
        Objects.equals(this.endTime, adGroupCreateRequest.endTime) &&
        Objects.equals(this.isCreativeOptimization, adGroupCreateRequest.isCreativeOptimization) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupCreateRequest.lifetimeFrequencyCap) &&
        Objects.equals(this.name, adGroupCreateRequest.name) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupCreateRequest.optimizationGoalMetadata) &&
        Objects.equals(this.placementGroup, adGroupCreateRequest.placementGroup) &&
        Objects.equals(this.promotionApplicationLevel, adGroupCreateRequest.promotionApplicationLevel) &&
        Objects.equals(this.promotionId, adGroupCreateRequest.promotionId) &&
        Objects.equals(this.promotionIds, adGroupCreateRequest.promotionIds) &&
        Objects.equals(this.startTime, adGroupCreateRequest.startTime) &&
        Objects.equals(this.status, adGroupCreateRequest.status) &&
        Objects.equals(this.targetingSpec, adGroupCreateRequest.targetingSpec) &&
        Objects.equals(this.targetingTemplateIds, adGroupCreateRequest.targetingTemplateIds) &&
        Objects.equals(this.trackingUrls, adGroupCreateRequest.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, bidMultiplier, budgetType, pacingDeliveryType, bidInMicroCurrency, bidStrategyType, billableEvent, budgetInMicroCurrency, campaignId, endTime, isCreativeOptimization, lifetimeFrequencyCap, name, optimizationGoalMetadata, placementGroup, promotionApplicationLevel, promotionId, promotionIds, startTime, status, targetingSpec, targetingTemplateIds, trackingUrls);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
