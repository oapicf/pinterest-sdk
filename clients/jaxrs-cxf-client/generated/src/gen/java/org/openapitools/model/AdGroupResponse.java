package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.OptimizationGoalMetadata;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TrackingUrls;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupResponse  {
  
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", value = "Ad group name.")
 /**
   * Ad group name.
  **/
  private String name;

  @ApiModelProperty(value = "Ad group/entity status.")
 /**
   * Ad group/entity status.
  **/
  private EntityStatus status;

  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
 /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  **/
  private Integer budgetInMicroCurrency;

  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
 /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  **/
  private Integer bidInMicroCurrency;

  @ApiModelProperty(value = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
 /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  **/
  private OptimizationGoalMetadata optimizationGoalMetadata;

  @ApiModelProperty(value = "")
  private BudgetType budgetType;

  @ApiModelProperty(example = "5686848000", value = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
 /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
  **/
  private Integer startTime;

  @ApiModelProperty(example = "5705424000", value = "Ad group end time. Unix timestamp in seconds.")
 /**
   * Ad group end time. Unix timestamp in seconds.
  **/
  private Integer endTime;

  @ApiModelProperty(value = "")
  private TargetingSpec targetingSpec;

  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
 /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  **/
  private Integer lifetimeFrequencyCap;

  @ApiModelProperty(value = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
 /**
   * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  **/
  private TrackingUrls trackingUrls;

  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
 /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  **/
  private Boolean autoTargetingEnabled;

  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
 /**
   * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  **/
  private PlacementGroupType placementGroup;

  @ApiModelProperty(value = "")
  private PacingDeliveryType pacingDeliveryType;

  @ApiModelProperty(example = "626736533506", value = "Campaign ID of the ad group.")
 /**
   * Campaign ID of the ad group.
  **/
  private String campaignId;

  @ApiModelProperty(value = "")
  private ActionType billableEvent;

public enum BidStrategyTypeEnum {

AUTOMATIC_BID(String.valueOf("AUTOMATIC_BID")), MAX_BID(String.valueOf("MAX_BID")), TARGET_AVG(String.valueOf("TARGET_AVG"));


    private String value;

    BidStrategyTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BidStrategyTypeEnum fromValue(String value) {
        for (BidStrategyTypeEnum b : BidStrategyTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "MAX_BID", value = "Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.")
 /**
   * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
  **/
  private BidStrategyTypeEnum bidStrategyType;

  @ApiModelProperty(value = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
 /**
   * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  **/
  private List<String> targetingTemplateIds;

  @ApiModelProperty(example = "2680060704746", value = "Ad group ID.")
 /**
   * Ad group ID.
  **/
  private String id;

  @ApiModelProperty(example = "549755885175", value = "Advertiser ID.")
 /**
   * Advertiser ID.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "1476477189", value = "Ad group creation time. Unix timestamp in seconds.")
 /**
   * Ad group creation time. Unix timestamp in seconds.
  **/
  private Integer createdTime;

  @ApiModelProperty(example = "1476477189", value = "Ad group last update time. Unix timestamp in seconds.")
 /**
   * Ad group last update time. Unix timestamp in seconds.
  **/
  private Integer updatedTime;

  @ApiModelProperty(value = "Always \"adgroup\".")
 /**
   * Always \"adgroup\".
  **/
  private String type = "adgroup";

public enum ConversionLearningModeTypeEnum {

NOT_ACTIVE(String.valueOf("NOT_ACTIVE")), ACTIVE(String.valueOf("ACTIVE"));


    private String value;

    ConversionLearningModeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionLearningModeTypeEnum fromValue(String value) {
        for (ConversionLearningModeTypeEnum b : ConversionLearningModeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "ACTIVE", value = "oCPM learn mode")
 /**
   * oCPM learn mode
  **/
  private ConversionLearningModeTypeEnum conversionLearningModeType;

  @ApiModelProperty(value = "Ad group summary status.")
 /**
   * Ad group summary status.
  **/
  private AdGroupSummaryStatus summaryStatus;

  @ApiModelProperty(example = "626736533506", value = "Feed Profile ID associated to the adgroup.")
 /**
   * Feed Profile ID associated to the adgroup.
  **/
  private String feedProfileId;

  @ApiModelProperty(value = "[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.")
 /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
  **/
  private Object dcaAssets = null;
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

  public AdGroupResponse name(String name) {
    this.name = name;
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

  public AdGroupResponse status(EntityStatus status) {
    this.status = status;
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

  public AdGroupResponse budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
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

  public AdGroupResponse bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
   * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
   * @return optimizationGoalMetadata
  **/
  @JsonProperty("optimization_goal_metadata")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupResponse optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
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

  public AdGroupResponse budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

 /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public AdGroupResponse startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Ad group end time. Unix timestamp in seconds.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public AdGroupResponse endTime(Integer endTime) {
    this.endTime = endTime;
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

  public AdGroupResponse targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
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

  public AdGroupResponse lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

 /**
   * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdGroupResponse trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupResponse autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
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

  public AdGroupResponse placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
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

  public AdGroupResponse pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
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

  public AdGroupResponse campaignId(String campaignId) {
    this.campaignId = campaignId;
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

  public AdGroupResponse billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

 /**
   * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
   * @return bidStrategyType
  **/
  @JsonProperty("bid_strategy_type")
  public String getBidStrategyType() {
    if (bidStrategyType == null) {
      return null;
    }
    return bidStrategyType.value();
  }

  public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  public AdGroupResponse bidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
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

  public AdGroupResponse targetingTemplateIds(List<String> targetingTemplateIds) {
    this.targetingTemplateIds = targetingTemplateIds;
    return this;
  }

  public AdGroupResponse addTargetingTemplateIdsItem(String targetingTemplateIdsItem) {
    this.targetingTemplateIds.add(targetingTemplateIdsItem);
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

  public AdGroupResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Advertiser ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdGroupResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Ad group creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdGroupResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
   * Ad group last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdGroupResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
   * Always \&quot;adgroup\&quot;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdGroupResponse type(String type) {
    this.type = type;
    return this;
  }

 /**
   * oCPM learn mode
   * @return conversionLearningModeType
  **/
  @JsonProperty("conversion_learning_mode_type")
  public String getConversionLearningModeType() {
    if (conversionLearningModeType == null) {
      return null;
    }
    return conversionLearningModeType.value();
  }

  public void setConversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

  public AdGroupResponse conversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
    return this;
  }

 /**
   * Ad group summary status.
   * @return summaryStatus
  **/
  @JsonProperty("summary_status")
  public AdGroupSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdGroupResponse summaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
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

  public AdGroupResponse feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

 /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
   * @return dcaAssets
  **/
  @JsonProperty("dca_assets")
  public Object getDcaAssets() {
    return dcaAssets;
  }

  public void setDcaAssets(Object dcaAssets) {
    this.dcaAssets = dcaAssets;
  }

  public AdGroupResponse dcaAssets(Object dcaAssets) {
    this.dcaAssets = dcaAssets;
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
    AdGroupResponse adGroupResponse = (AdGroupResponse) o;
    return Objects.equals(this.name, adGroupResponse.name) &&
        Objects.equals(this.status, adGroupResponse.status) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupResponse.budgetInMicroCurrency) &&
        Objects.equals(this.bidInMicroCurrency, adGroupResponse.bidInMicroCurrency) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupResponse.optimizationGoalMetadata) &&
        Objects.equals(this.budgetType, adGroupResponse.budgetType) &&
        Objects.equals(this.startTime, adGroupResponse.startTime) &&
        Objects.equals(this.endTime, adGroupResponse.endTime) &&
        Objects.equals(this.targetingSpec, adGroupResponse.targetingSpec) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupResponse.lifetimeFrequencyCap) &&
        Objects.equals(this.trackingUrls, adGroupResponse.trackingUrls) &&
        Objects.equals(this.autoTargetingEnabled, adGroupResponse.autoTargetingEnabled) &&
        Objects.equals(this.placementGroup, adGroupResponse.placementGroup) &&
        Objects.equals(this.pacingDeliveryType, adGroupResponse.pacingDeliveryType) &&
        Objects.equals(this.campaignId, adGroupResponse.campaignId) &&
        Objects.equals(this.billableEvent, adGroupResponse.billableEvent) &&
        Objects.equals(this.bidStrategyType, adGroupResponse.bidStrategyType) &&
        Objects.equals(this.targetingTemplateIds, adGroupResponse.targetingTemplateIds) &&
        Objects.equals(this.id, adGroupResponse.id) &&
        Objects.equals(this.adAccountId, adGroupResponse.adAccountId) &&
        Objects.equals(this.createdTime, adGroupResponse.createdTime) &&
        Objects.equals(this.updatedTime, adGroupResponse.updatedTime) &&
        Objects.equals(this.type, adGroupResponse.type) &&
        Objects.equals(this.conversionLearningModeType, adGroupResponse.conversionLearningModeType) &&
        Objects.equals(this.summaryStatus, adGroupResponse.summaryStatus) &&
        Objects.equals(this.feedProfileId, adGroupResponse.feedProfileId) &&
        Objects.equals(this.dcaAssets, adGroupResponse.dcaAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, optimizationGoalMetadata, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, campaignId, billableEvent, bidStrategyType, targetingTemplateIds, id, adAccountId, createdTime, updatedTime, type, conversionLearningModeType, summaryStatus, feedProfileId, dcaAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    billableEvent: ").append(toIndentedString(billableEvent)).append("\n");
    sb.append("    bidStrategyType: ").append(toIndentedString(bidStrategyType)).append("\n");
    sb.append("    targetingTemplateIds: ").append(toIndentedString(targetingTemplateIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conversionLearningModeType: ").append(toIndentedString(conversionLearningModeType)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
    sb.append("    dcaAssets: ").append(toIndentedString(dcaAssets)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

