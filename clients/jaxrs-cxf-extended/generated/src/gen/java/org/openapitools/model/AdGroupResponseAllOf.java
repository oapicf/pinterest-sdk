package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupResponseAllOf  {
  
 /**
  * Ad group name.
  */
  @ApiModelProperty(example = "Ad Group For Pin: 687195905986", value = "Ad group name.")
  private String name;

 /**
  * Ad group/entity status.
  */
  @ApiModelProperty(value = "Ad group/entity status.")
  private EntityStatus status;

 /**
  * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  */
  @ApiModelProperty(example = "5000000", value = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
  private Integer budgetInMicroCurrency;

 /**
  * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  */
  @ApiModelProperty(example = "5000000", value = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
  private Integer bidInMicroCurrency;

public enum BudgetTypeEnum {

    @JsonProperty("DAILY") DAILY(String.valueOf("DAILY")),
    @JsonProperty("LIFETIME") LIFETIME(String.valueOf("LIFETIME")),
    @JsonProperty("CBO_ADGROUP") CBO_ADGROUP(String.valueOf("CBO_ADGROUP"));

    private String value;

    BudgetTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BudgetTypeEnum fromValue(String value) {
        for (BudgetTypeEnum b : BudgetTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
  */
  @ApiModelProperty(value = "Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.")
  private BudgetTypeEnum budgetType;

 /**
  * Ad group start time. Unix timestamp in seconds. Defaults to current time.
  */
  @ApiModelProperty(example = "5686848000", value = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
  private Integer startTime;

 /**
  * Ad group end time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "5705424000", value = "Ad group end time. Unix timestamp in seconds.")
  private Integer endTime;

 /**
  * Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
  */
  @ApiModelProperty(value = "Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'")
  @Valid
  private Map<String, List<String>> targetingSpec = null;

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  */
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  private Integer lifetimeFrequencyCap;

 /**
  * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  */
  @ApiModelProperty(value = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
  @Valid
  private TrackingUrls trackingUrls;

 /**
  * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  */
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  private Boolean autoTargetingEnabled;

 /**
  * <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
  */
  @ApiModelProperty(value = "<a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.")
  private PlacementGroupType placementGroup;

 /**
  * Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
  */
  @ApiModelProperty(value = "Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.")
  private PacingDeliveryType pacingDeliveryType;

public enum ConversionLearningModeTypeEnum {

    @JsonProperty("NOT_ACTIVE") NOT_ACTIVE(String.valueOf("NOT_ACTIVE")),
    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")),
    @JsonProperty("null") NULL(String.valueOf("null"));

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

 /**
  * oCPM learn mode
  */
  @ApiModelProperty(example = "ACTIVE", value = "oCPM learn mode")
  private ConversionLearningModeTypeEnum conversionLearningModeType;

 /**
  * Ad group summary status.
  */
  @ApiModelProperty(value = "Ad group summary status.")
  private AdGroupSummaryStatus summaryStatus;

 /**
  * Feed Profile ID associated to the adgroup.
  */
  @ApiModelProperty(example = "626736533506", value = "Feed Profile ID associated to the adgroup.")
  private String feedProfileId;
 /**
  * Ad group name.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AdGroupResponseAllOf name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Ad group/entity status.
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public AdGroupResponseAllOf status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  * @return budgetInMicroCurrency
  */
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  /**
   * Sets the <code>budgetInMicroCurrency</code> property.
   */
 public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  /**
   * Sets the <code>budgetInMicroCurrency</code> property.
   */
  public AdGroupResponseAllOf budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

 /**
  * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  * @return bidInMicroCurrency
  */
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  /**
   * Sets the <code>bidInMicroCurrency</code> property.
   */
 public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * Sets the <code>bidInMicroCurrency</code> property.
   */
  public AdGroupResponseAllOf bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
  * Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
  * @return budgetType
  */
  @JsonProperty("budget_type")
  public String getBudgetType() {
    return budgetType == null ? null : budgetType.value();
  }

  /**
   * Sets the <code>budgetType</code> property.
   */
 public void setBudgetType(BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Sets the <code>budgetType</code> property.
   */
  public AdGroupResponseAllOf budgetType(BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
    return this;
  }

 /**
  * Ad group start time. Unix timestamp in seconds. Defaults to current time.
  * @return startTime
  */
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public AdGroupResponseAllOf startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * Ad group end time. Unix timestamp in seconds.
  * @return endTime
  */
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
 public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
  public AdGroupResponseAllOf endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;
  * @return targetingSpec
  */
  @JsonProperty("targeting_spec")
  public Map<String, List<String>> getTargetingSpec() {
    return targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
 public void setTargetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
  public AdGroupResponseAllOf targetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  /**
   * Puts a new item into the <code>targetingSpec</code> map.
   */
  public AdGroupResponseAllOf putTargetingSpecItem(String key, List<String> targetingSpecItem) {
    this.targetingSpec.put(key, targetingSpecItem);
    return this;
  }

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
  * @return lifetimeFrequencyCap
  */
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  /**
   * Sets the <code>lifetimeFrequencyCap</code> property.
   */
 public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * Sets the <code>lifetimeFrequencyCap</code> property.
   */
  public AdGroupResponseAllOf lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

 /**
  * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public AdGroupResponseAllOf trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  /**
   * Puts a new item into the <code>trackingUrls</code> map.
   */
  public AdGroupResponseAllOf putTrackingUrlsItem(String key,  trackingUrlsItem) {
    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
  }

 /**
  * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
  * @return autoTargetingEnabled
  */
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
 public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
  public AdGroupResponseAllOf autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
  * &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;.
  * @return placementGroup
  */
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
 public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
  public AdGroupResponseAllOf placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
  * Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
  * @return pacingDeliveryType
  */
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  /**
   * Sets the <code>pacingDeliveryType</code> property.
   */
 public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * Sets the <code>pacingDeliveryType</code> property.
   */
  public AdGroupResponseAllOf pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

 /**
  * oCPM learn mode
  * @return conversionLearningModeType
  */
  @JsonProperty("conversion_learning_mode_type")
  public String getConversionLearningModeType() {
    return conversionLearningModeType == null ? null : conversionLearningModeType.value();
  }

  /**
   * Sets the <code>conversionLearningModeType</code> property.
   */
 public void setConversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

  /**
   * Sets the <code>conversionLearningModeType</code> property.
   */
  public AdGroupResponseAllOf conversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
    return this;
  }

 /**
  * Ad group summary status.
  * @return summaryStatus
  */
  @JsonProperty("summary_status")
  public AdGroupSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  /**
   * Sets the <code>summaryStatus</code> property.
   */
 public void setSummaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  /**
   * Sets the <code>summaryStatus</code> property.
   */
  public AdGroupResponseAllOf summaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

 /**
  * Feed Profile ID associated to the adgroup.
  * @return feedProfileId
  */
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
 public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  /**
   * Sets the <code>feedProfileId</code> property.
   */
  public AdGroupResponseAllOf feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

