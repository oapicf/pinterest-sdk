package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupCommonOptimizationGoalMetadata;
import org.openapitools.model.AdGroupCommonTrackingUrls;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupResponse   {
  
  private String name;
  private EntityStatus status;
  private Integer budgetInMicroCurrency;
  private Integer bidInMicroCurrency;
  private AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata;
  private BudgetType budgetType;
  private Integer startTime;
  private Integer endTime;
  private TargetingSpec targetingSpec;
  private Integer lifetimeFrequencyCap;
  private AdGroupCommonTrackingUrls trackingUrls;
  private Boolean autoTargetingEnabled;
  private PlacementGroupType placementGroup;
  private PacingDeliveryType pacingDeliveryType;
  private String campaignId;
  private ActionType billableEvent;

  /**
   * Bid strategy type
   */
  public enum BidStrategyTypeEnum {
    AUTOMATIC_BID("AUTOMATIC_BID"),

        MAX_BID("MAX_BID"),

        TARGET_AVG("TARGET_AVG"),

        NULL("null");
    private String value;

    BidStrategyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private BidStrategyTypeEnum bidStrategyType;
  private String id;
  private String adAccountId;
  private Integer createdTime;
  private Integer updatedTime;
  private String type = "adgroup";

  /**
   * oCPM learn mode
   */
  public enum ConversionLearningModeTypeEnum {
    NOT_ACTIVE("NOT_ACTIVE"),

        ACTIVE("ACTIVE"),

        NULL("null");
    private String value;

    ConversionLearningModeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ConversionLearningModeTypeEnum conversionLearningModeType;
  private AdGroupSummaryStatus summaryStatus;
  private String feedProfileId;
  private Object dcaAssets = null;

  /**
   * Ad group name.
   **/
  
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", value = "Ad group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Ad group/entity status.
   **/
  
  @ApiModelProperty(value = "Ad group/entity status.")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   **/
  
  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   **/
  
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optimization_goal_metadata")
  public AdGroupCommonOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }
  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   **/
  
  @ApiModelProperty(example = "5686848000", value = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Ad group end time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "5705424000", value = "Ad group end time. Unix timestamp in seconds.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   **/
  
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public AdGroupCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   **/
  
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   **/
  
  @ApiModelProperty(value = "<a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * Campaign ID of the ad group.
   **/
  
  @ApiModelProperty(example = "626736533506", value = "Campaign ID of the ad group.")
  @JsonProperty("campaign_id")
 @Pattern(regexp="^[C]?\\d+$")  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }
  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  /**
   * Bid strategy type
   **/
  
  @ApiModelProperty(example = "MAX_BID", value = "Bid strategy type")
  @JsonProperty("bid_strategy_type")
  public BidStrategyTypeEnum getBidStrategyType() {
    return bidStrategyType;
  }
  public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  /**
   * Ad group ID.
   **/
  
  @ApiModelProperty(example = "2680060704746", value = "Ad group ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Advertiser ID.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Advertiser ID.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Ad group creation time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1476477189", value = "Ad group creation time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Ad group last update time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1476477189", value = "Ad group last update time. Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Always \&quot;adgroup\&quot;.
   **/
  
  @ApiModelProperty(value = "Always \"adgroup\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * oCPM learn mode
   **/
  
  @ApiModelProperty(example = "ACTIVE", value = "oCPM learn mode")
  @JsonProperty("conversion_learning_mode_type")
  public ConversionLearningModeTypeEnum getConversionLearningModeType() {
    return conversionLearningModeType;
  }
  public void setConversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

  /**
   * Ad group summary status.
   **/
  
  @ApiModelProperty(value = "Ad group summary status.")
  @JsonProperty("summary_status")
  public AdGroupSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  /**
   * Feed Profile ID associated to the adgroup.
   **/
  
  @ApiModelProperty(example = "626736533506", value = "Feed Profile ID associated to the adgroup.")
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
   **/
  
  @ApiModelProperty(value = "[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.")
  @JsonProperty("dca_assets")
  public Object getDcaAssets() {
    return dcaAssets;
  }
  public void setDcaAssets(Object dcaAssets) {
    this.dcaAssets = dcaAssets;
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
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, optimizationGoalMetadata, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, campaignId, billableEvent, bidStrategyType, id, adAccountId, createdTime, updatedTime, type, conversionLearningModeType, summaryStatus, feedProfileId, dcaAssets);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

