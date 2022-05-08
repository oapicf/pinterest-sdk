package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public class AdGroupResponseAllOf   {
  
  private String name;
  private EntityStatus status;
  private Integer budgetInMicroCurrency;
  private Integer bidInMicroCurrency;

  /**
   * Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
   */
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
      return String.valueOf(value);
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
   * Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
   **/
  
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
   * Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;
   **/
  
  @ApiModelProperty(value = "Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'")
  @JsonProperty("targeting_spec")
  public Map<String, List<String>> getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   **/
  
  @ApiModelProperty(example = "100", value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  /**
   * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
   **/
  
  @ApiModelProperty(value = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
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
   * &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;.
   **/
  
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
   **/
  
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

