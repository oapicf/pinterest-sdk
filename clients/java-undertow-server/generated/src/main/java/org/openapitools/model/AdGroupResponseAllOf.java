/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TrackingUrls;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-07T06:40:09.212272Z[Etc/UTC]")
public class AdGroupResponseAllOf   {
  
  private String name;
  private EntityStatus status;
  private Integer budgetInMicroCurrency;
  private Integer bidInMicroCurrency;


  public enum BudgetTypeEnum {
    DAILY("DAILY"),
    LIFETIME("LIFETIME"),
    CBO_ADGROUP("CBO_ADGROUP");

    private String value;

    BudgetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private BudgetTypeEnum budgetType;
  private Integer startTime;
  private Integer endTime;
  private Map<String, List<String>> targetingSpec = new HashMap<String, List<String>>();
  private Integer lifetimeFrequencyCap;
  private TrackingUrls trackingUrls;
  private Boolean autoTargetingEnabled;
  private PlacementGroupType placementGroup;
  private PacingDeliveryType pacingDeliveryType;


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
      return value;
    }
  }

  private ConversionLearningModeTypeEnum conversionLearningModeType;
  private AdGroupSummaryStatus summaryStatus;
  private String feedProfileId;

  /**
   * Ad group name.
   */
  public AdGroupResponseAllOf name(String name) {
    this.name = name;
    return this;
  }

  
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
   */
  public AdGroupResponseAllOf status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
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
   */
  public AdGroupResponseAllOf budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

  
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
   */
  public AdGroupResponseAllOf bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
   */
  public AdGroupResponseAllOf budgetType(BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
    return this;
  }

  
  @ApiModelProperty(value = "Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.")
  @JsonProperty("budget_type")
  public BudgetTypeEnum getBudgetType() {
    return budgetType;
  }
  public void setBudgetType(BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   */
  public AdGroupResponseAllOf startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
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
   */
  public AdGroupResponseAllOf endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "5705424000", value = "Ad group end time. Unix timestamp in seconds.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
   */
  public AdGroupResponseAllOf targetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'")
  @JsonProperty("targeting_spec")
  public Map<String, List<String>> getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   */
  public AdGroupResponseAllOf lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
   */
  public AdGroupResponseAllOf trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   */
  public AdGroupResponseAllOf autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
   */
  public AdGroupResponseAllOf placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
   */
  public AdGroupResponseAllOf pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

  
  @ApiModelProperty(value = "Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.")
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * oCPM learn mode
   */
  public AdGroupResponseAllOf conversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
    return this;
  }

  
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
   */
  public AdGroupResponseAllOf summaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  
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
   */
  public AdGroupResponseAllOf feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  
  @ApiModelProperty(example = "626736533506", value = "Feed Profile ID associated to the adgroup.")
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupResponseAllOf adGroupResponseAllOf = (AdGroupResponseAllOf) o;
    return Objects.equals(name, adGroupResponseAllOf.name) &&
        Objects.equals(status, adGroupResponseAllOf.status) &&
        Objects.equals(budgetInMicroCurrency, adGroupResponseAllOf.budgetInMicroCurrency) &&
        Objects.equals(bidInMicroCurrency, adGroupResponseAllOf.bidInMicroCurrency) &&
        Objects.equals(budgetType, adGroupResponseAllOf.budgetType) &&
        Objects.equals(startTime, adGroupResponseAllOf.startTime) &&
        Objects.equals(endTime, adGroupResponseAllOf.endTime) &&
        Objects.equals(targetingSpec, adGroupResponseAllOf.targetingSpec) &&
        Objects.equals(lifetimeFrequencyCap, adGroupResponseAllOf.lifetimeFrequencyCap) &&
        Objects.equals(trackingUrls, adGroupResponseAllOf.trackingUrls) &&
        Objects.equals(autoTargetingEnabled, adGroupResponseAllOf.autoTargetingEnabled) &&
        Objects.equals(placementGroup, adGroupResponseAllOf.placementGroup) &&
        Objects.equals(pacingDeliveryType, adGroupResponseAllOf.pacingDeliveryType) &&
        Objects.equals(conversionLearningModeType, adGroupResponseAllOf.conversionLearningModeType) &&
        Objects.equals(summaryStatus, adGroupResponseAllOf.summaryStatus) &&
        Objects.equals(feedProfileId, adGroupResponseAllOf.feedProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, conversionLearningModeType, summaryStatus, feedProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupResponseAllOf {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    budgetInMicroCurrency: ").append(toIndentedString(budgetInMicroCurrency)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    lifetimeFrequencyCap: ").append(toIndentedString(lifetimeFrequencyCap)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
    sb.append("    conversionLearningModeType: ").append(toIndentedString(conversionLearningModeType)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
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

