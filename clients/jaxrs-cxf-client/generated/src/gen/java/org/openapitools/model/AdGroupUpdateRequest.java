package org.openapitools.model;

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
import org.openapitools.model.TargetingSpecOperations;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupUpdateRequest  {
  
 /**
  * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  */
  @ApiModelProperty(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.")

  private BigDecimal bidMultiplier;

 /**
  * Ad group ID.
  */
  @ApiModelProperty(required = true, value = "Ad group ID.")

  private String id;

 /**
  * <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
  */
  @ApiModelProperty(value = "<div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>")

  private List<TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();

 /**
  * Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  */
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.")

  private Boolean autoTargetingEnabled;

 /**
  * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
  */
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.")

  private Integer bidInMicroCurrency;

  @ApiModelProperty(value = "")

  private BidStrategyType bidStrategyType;

  @ApiModelProperty(value = "")

  private ActionType billableEvent;

 /**
  * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  */
  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")

  private Integer budgetInMicroCurrency;

  @ApiModelProperty(value = "")

  private BudgetType budgetType;

 /**
  * Campaign ID of the ad group.
  */
  @ApiModelProperty(example = "626736533506", value = "Campaign ID of the ad group.")

  private String campaignId;

 /**
  * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  */
  @ApiModelProperty(example = "5705424000", value = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")

  private Integer endTime;

 /**
  * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  */
  @ApiModelProperty(example = "true", value = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")

  private Boolean isCreativeOptimization;

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  */
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")

  private Integer lifetimeFrequencyCap;

 /**
  * Ad group name.
  */
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", value = "Ad group name.")

  private String name;

 /**
  * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  */
  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")

  private Object optimizationGoalMetadata;

  @ApiModelProperty(value = "")

  private PacingDeliveryType pacingDeliveryType;

 /**
  * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  */
  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")

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
    public String toString() {
        return String.valueOf(value);
    }

    public static PromotionApplicationLevelEnum fromValue(String value) {
        for (PromotionApplicationLevelEnum b : PromotionApplicationLevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * Specify if the promotion is applied at ad group or item level
  */
  @ApiModelProperty(example = "ITEM", value = "Specify if the promotion is applied at ad group or item level")

  private PromotionApplicationLevelEnum promotionApplicationLevel;

 /**
  * Promotion ID. To clear this field, set to null.
  */
  @ApiModelProperty(example = "7834020347906", value = "Promotion ID. To clear this field, set to null.")

  private String promotionId = "0";

 /**
  * Promotion IDs list. To clear this field, set to an empty array [].
  */
  @ApiModelProperty(example = "[\"7834020347906\",\"7834020347907\"]", value = "Promotion IDs list. To clear this field, set to an empty array [].")

  private List<String> promotionIds = new ArrayList<>();

 /**
  * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  */
  @ApiModelProperty(example = "5686848000", value = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")

  private Integer startTime;

 /**
  * Ad group/entity status.
  */
  @ApiModelProperty(value = "Ad group/entity status.")

  private EntityStatus status;

  @ApiModelProperty(value = "")

  private TargetingSpec targetingSpec;

 /**
  * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  */
  @ApiModelProperty(value = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")

  private List<String> targetingTemplateIds;

 /**
  * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  */
  @ApiModelProperty(value = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")

  private Object trackingUrls;
 /**
   * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.
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

  public AdGroupUpdateRequest bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
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

  public AdGroupUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

 /**
   * &lt;div&gt;Targeting spec operations define modifications to apply to the targeting spec.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;&lt;strong&gt;NOTE:&lt;/strong&gt; The &lt;code&gt;targeting_spec&lt;/code&gt; and &lt;code&gt;targeting_spec_operations&lt;/code&gt; cannot be sent at the same time.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;The supported operations are:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;SET&lt;/code&gt;: sets the field with the given values. If value is set to &lt;code&gt;null&lt;/code&gt;, the field will be removed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ADD&lt;/code&gt;: adds the given values to the field.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMOVE&lt;/code&gt;: removes the given values from the field.&lt;/li&gt; &lt;/ul&gt; &lt;div&gt;Note the following:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;Same items are not added and removed at the same time.&lt;/li&gt; &lt;li&gt;For a given field, only &lt;code&gt;ADD&lt;/code&gt;/&lt;code&gt;REMOVE&lt;/code&gt; or &lt;code&gt;SET&lt;/code&gt; operations are allowed, not a mix of them.&lt;/li&gt; &lt;li&gt;Only one SET operation is allowed for a given field.&lt;/li&gt; &lt;li&gt;The &lt;code&gt;AGE_BUCKET&lt;/code&gt;, &lt;code&gt;MAXIMUM_AGE&lt;/code&gt;, &lt;code&gt;MINIMUM_AGE&lt;/code&gt; and &lt;code&gt;SHOPPING_RETARGETING&lt;/code&gt; fields only support the &lt;code&gt;SET&lt;/code&gt; operation.&lt;/li&gt; &lt;/ul&gt;
   * @return targetingSpecOperations
  **/
  @JsonProperty("targeting_spec_operations")
  public List<TargetingSpecOperations> getTargetingSpecOperations() {
    return targetingSpecOperations;
  }

  public void setTargetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
  }

  public AdGroupUpdateRequest targetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
    return this;
  }

  public AdGroupUpdateRequest addTargetingSpecOperationsItem(TargetingSpecOperations targetingSpecOperationsItem) {
    this.targetingSpecOperations.add(targetingSpecOperationsItem);
    return this;
  }

 /**
   * Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupUpdateRequest autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
   * @return bidInMicroCurrency
  **/
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupUpdateRequest bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
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

  public AdGroupUpdateRequest bidStrategyType(BidStrategyType bidStrategyType) {
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

  public AdGroupUpdateRequest billableEvent(ActionType billableEvent) {
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

  public AdGroupUpdateRequest budgetInMicroCurrency(Integer budgetInMicroCurrency) {
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

  public AdGroupUpdateRequest budgetType(BudgetType budgetType) {
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

  public AdGroupUpdateRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public AdGroupUpdateRequest endTime(Integer endTime) {
    this.endTime = endTime;
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

  public AdGroupUpdateRequest isCreativeOptimization(Boolean isCreativeOptimization) {
    this.isCreativeOptimization = isCreativeOptimization;
    return this;
  }

 /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   * @return lifetimeFrequencyCap
  **/
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupUpdateRequest lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
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

  public AdGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
   * @return optimizationGoalMetadata
  **/
  @JsonProperty("optimization_goal_metadata")
  public Object getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(Object optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupUpdateRequest optimizationGoalMetadata(Object optimizationGoalMetadata) {
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

  public AdGroupUpdateRequest pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

 /**
   * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   * @return placementGroup
  **/
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupUpdateRequest placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
   * Specify if the promotion is applied at ad group or item level
   * @return promotionApplicationLevel
  **/
  @JsonProperty("promotion_application_level")
  public String getPromotionApplicationLevel() {
    if (promotionApplicationLevel == null) {
      return null;
    }
    return promotionApplicationLevel.value();
  }

  public void setPromotionApplicationLevel(PromotionApplicationLevelEnum promotionApplicationLevel) {
    this.promotionApplicationLevel = promotionApplicationLevel;
  }

  public AdGroupUpdateRequest promotionApplicationLevel(PromotionApplicationLevelEnum promotionApplicationLevel) {
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

  public AdGroupUpdateRequest promotionId(String promotionId) {
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

  public AdGroupUpdateRequest promotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

  public AdGroupUpdateRequest addPromotionIdsItem(String promotionIdsItem) {
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

 /**
   * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public AdGroupUpdateRequest startTime(Integer startTime) {
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

  public AdGroupUpdateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupUpdateRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
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

  public AdGroupUpdateRequest targetingTemplateIds(List<String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
    return this;
  }

  public AdGroupUpdateRequest addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    this.targetingTemplateIds.add(targetingTemplateIdsItem);
    return this;
  }

 /**
   * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public Object getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdGroupUpdateRequest trackingUrls(Object trackingUrls) {
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
    AdGroupUpdateRequest adGroupUpdateRequest = (AdGroupUpdateRequest) o;
    return Objects.equals(this.bidMultiplier, adGroupUpdateRequest.bidMultiplier) &&
        Objects.equals(this.id, adGroupUpdateRequest.id) &&
        Objects.equals(this.targetingSpecOperations, adGroupUpdateRequest.targetingSpecOperations) &&
        Objects.equals(this.autoTargetingEnabled, adGroupUpdateRequest.autoTargetingEnabled) &&
        Objects.equals(this.bidInMicroCurrency, adGroupUpdateRequest.bidInMicroCurrency) &&
        Objects.equals(this.bidStrategyType, adGroupUpdateRequest.bidStrategyType) &&
        Objects.equals(this.billableEvent, adGroupUpdateRequest.billableEvent) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupUpdateRequest.budgetInMicroCurrency) &&
        Objects.equals(this.budgetType, adGroupUpdateRequest.budgetType) &&
        Objects.equals(this.campaignId, adGroupUpdateRequest.campaignId) &&
        Objects.equals(this.endTime, adGroupUpdateRequest.endTime) &&
        Objects.equals(this.isCreativeOptimization, adGroupUpdateRequest.isCreativeOptimization) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupUpdateRequest.lifetimeFrequencyCap) &&
        Objects.equals(this.name, adGroupUpdateRequest.name) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupUpdateRequest.optimizationGoalMetadata) &&
        Objects.equals(this.pacingDeliveryType, adGroupUpdateRequest.pacingDeliveryType) &&
        Objects.equals(this.placementGroup, adGroupUpdateRequest.placementGroup) &&
        Objects.equals(this.promotionApplicationLevel, adGroupUpdateRequest.promotionApplicationLevel) &&
        Objects.equals(this.promotionId, adGroupUpdateRequest.promotionId) &&
        Objects.equals(this.promotionIds, adGroupUpdateRequest.promotionIds) &&
        Objects.equals(this.startTime, adGroupUpdateRequest.startTime) &&
        Objects.equals(this.status, adGroupUpdateRequest.status) &&
        Objects.equals(this.targetingSpec, adGroupUpdateRequest.targetingSpec) &&
        Objects.equals(this.targetingTemplateIds, adGroupUpdateRequest.targetingTemplateIds) &&
        Objects.equals(this.trackingUrls, adGroupUpdateRequest.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidMultiplier, id, targetingSpecOperations, autoTargetingEnabled, bidInMicroCurrency, bidStrategyType, billableEvent, budgetInMicroCurrency, budgetType, campaignId, endTime, isCreativeOptimization, lifetimeFrequencyCap, name, optimizationGoalMetadata, pacingDeliveryType, placementGroup, promotionApplicationLevel, promotionId, promotionIds, startTime, status, targetingSpec, targetingTemplateIds, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupUpdateRequest {\n");
    
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetingSpecOperations: ").append(toIndentedString(targetingSpecOperations)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isCreativeOptimization: ").append(toIndentedString(isCreativeOptimization)).append("\n");
    sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

