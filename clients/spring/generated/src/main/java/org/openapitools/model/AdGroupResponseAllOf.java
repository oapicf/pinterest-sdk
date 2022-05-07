package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TrackingUrls;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdGroupResponseAllOf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class AdGroupResponseAllOf   {

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("budget_in_micro_currency")
  private JsonNullable<Integer> budgetInMicroCurrency = JsonNullable.undefined();

  @JsonProperty("bid_in_micro_currency")
  private JsonNullable<Integer> bidInMicroCurrency = JsonNullable.undefined();

  /**
   * Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
   */
  public enum BudgetTypeEnum {
    DAILY("DAILY"),
    
    LIFETIME("LIFETIME"),
    
    CBO_ADGROUP("CBO_ADGROUP");

    private String value;

    BudgetTypeEnum(String value) {
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
    public static BudgetTypeEnum fromValue(String value) {
      for (BudgetTypeEnum b : BudgetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("budget_type")
  private BudgetTypeEnum budgetType;

  @JsonProperty("start_time")
  private JsonNullable<Integer> startTime = JsonNullable.undefined();

  @JsonProperty("end_time")
  private JsonNullable<Integer> endTime = JsonNullable.undefined();

  @JsonProperty("targeting_spec")
  @Valid
  private Map<String, List<String>> targetingSpec = null;

  @JsonProperty("lifetime_frequency_cap")
  private Integer lifetimeFrequencyCap;

  @JsonProperty("tracking_urls")
  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.undefined();

  @JsonProperty("auto_targeting_enabled")
  private JsonNullable<Boolean> autoTargetingEnabled = JsonNullable.undefined();

  @JsonProperty("placement_group")
  private PlacementGroupType placementGroup;

  @JsonProperty("pacing_delivery_type")
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConversionLearningModeTypeEnum fromValue(String value) {
      for (ConversionLearningModeTypeEnum b : ConversionLearningModeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("conversion_learning_mode_type")
  private JsonNullable<ConversionLearningModeTypeEnum> conversionLearningModeType = JsonNullable.undefined();

  @JsonProperty("summary_status")
  private AdGroupSummaryStatus summaryStatus;

  @JsonProperty("feed_profile_id")
  private String feedProfileId;

  public AdGroupResponseAllOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Ad group name.
   * @return name
  */
  
  @Schema(name = "name", example = "Ad Group For Pin: 687195905986", description = "Ad group name.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdGroupResponseAllOf status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Ad group/entity status.
   * @return status
  */
  @Valid 
  @Schema(name = "status", description = "Ad group/entity status.", required = false)
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdGroupResponseAllOf budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = JsonNullable.of(budgetInMicroCurrency);
    return this;
  }

  /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
  */
  
  @Schema(name = "budget_in_micro_currency", example = "5000000", description = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.", required = false)
  public JsonNullable<Integer> getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(JsonNullable<Integer> budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

  public AdGroupResponseAllOf bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = JsonNullable.of(bidInMicroCurrency);
    return this;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
  */
  
  @Schema(name = "bid_in_micro_currency", example = "5000000", description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.", required = false)
  public JsonNullable<Integer> getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(JsonNullable<Integer> bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupResponseAllOf budgetType(BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
    return this;
  }

  /**
   * Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
   * @return budgetType
  */
  
  @Schema(name = "budget_type", description = "Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.", required = false)
  public BudgetTypeEnum getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
  }

  public AdGroupResponseAllOf startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   * @return startTime
  */
  
  @Schema(name = "start_time", example = "5686848000", description = "Ad group start time. Unix timestamp in seconds. Defaults to current time.", required = false)
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public AdGroupResponseAllOf endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Ad group end time. Unix timestamp in seconds.
   * @return endTime
  */
  
  @Schema(name = "end_time", example = "5705424000", description = "Ad group end time. Unix timestamp in seconds.", required = false)
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public AdGroupResponseAllOf targetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  public AdGroupResponseAllOf putTargetingSpecItem(String key, List<String> targetingSpecItem) {
    if (this.targetingSpec == null) {
      this.targetingSpec = new HashMap<>();
    }
    this.targetingSpec.put(key, targetingSpecItem);
    return this;
  }

  /**
   * Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
   * @return targetingSpec
  */
  @Valid 
  @Schema(name = "targeting_spec", description = "Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'", required = false)
  public Map<String, List<String>> getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupResponseAllOf lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   * @return lifetimeFrequencyCap
  */
  
  @Schema(name = "lifetime_frequency_cap", example = "100", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.", required = false)
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupResponseAllOf trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  public AdGroupResponseAllOf putTrackingUrlsItem(String key,  trackingUrlsItem) {
    if (this.trackingUrls == null) {
      this.trackingUrls = ;
    }
    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
  }

  /**
   * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
   * @return trackingUrls
  */
  @Valid 
  @Schema(name = "tracking_urls", description = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.", required = false)
  public JsonNullable<TrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<TrackingUrls> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdGroupResponseAllOf autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = JsonNullable.of(autoTargetingEnabled);
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   * @return autoTargetingEnabled
  */
  
  @Schema(name = "auto_targeting_enabled", example = "true", description = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.", required = false)
  public JsonNullable<Boolean> getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(JsonNullable<Boolean> autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupResponseAllOf placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
   * @return placementGroup
  */
  @Valid 
  @Schema(name = "placement_group", description = "<a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.", required = false)
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupResponseAllOf pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

  /**
   * Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
   * @return pacingDeliveryType
  */
  @Valid 
  @Schema(name = "pacing_delivery_type", description = "Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.", required = false)
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  public AdGroupResponseAllOf conversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = JsonNullable.of(conversionLearningModeType);
    return this;
  }

  /**
   * oCPM learn mode
   * @return conversionLearningModeType
  */
  
  @Schema(name = "conversion_learning_mode_type", example = "ACTIVE", description = "oCPM learn mode", required = false)
  public JsonNullable<ConversionLearningModeTypeEnum> getConversionLearningModeType() {
    return conversionLearningModeType;
  }

  public void setConversionLearningModeType(JsonNullable<ConversionLearningModeTypeEnum> conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

  public AdGroupResponseAllOf summaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Ad group summary status.
   * @return summaryStatus
  */
  @Valid 
  @Schema(name = "summary_status", description = "Ad group summary status.", required = false)
  public AdGroupSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdGroupResponseAllOf feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  /**
   * Feed Profile ID associated to the adgroup.
   * @return feedProfileId
  */
  
  @Schema(name = "feed_profile_id", example = "626736533506", description = "Feed Profile ID associated to the adgroup.", required = false)
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
    return Objects.equals(this.name, adGroupResponseAllOf.name) &&
        Objects.equals(this.status, adGroupResponseAllOf.status) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupResponseAllOf.budgetInMicroCurrency) &&
        Objects.equals(this.bidInMicroCurrency, adGroupResponseAllOf.bidInMicroCurrency) &&
        Objects.equals(this.budgetType, adGroupResponseAllOf.budgetType) &&
        Objects.equals(this.startTime, adGroupResponseAllOf.startTime) &&
        Objects.equals(this.endTime, adGroupResponseAllOf.endTime) &&
        Objects.equals(this.targetingSpec, adGroupResponseAllOf.targetingSpec) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupResponseAllOf.lifetimeFrequencyCap) &&
        Objects.equals(this.trackingUrls, adGroupResponseAllOf.trackingUrls) &&
        Objects.equals(this.autoTargetingEnabled, adGroupResponseAllOf.autoTargetingEnabled) &&
        Objects.equals(this.placementGroup, adGroupResponseAllOf.placementGroup) &&
        Objects.equals(this.pacingDeliveryType, adGroupResponseAllOf.pacingDeliveryType) &&
        Objects.equals(this.conversionLearningModeType, adGroupResponseAllOf.conversionLearningModeType) &&
        Objects.equals(this.summaryStatus, adGroupResponseAllOf.summaryStatus) &&
        Objects.equals(this.feedProfileId, adGroupResponseAllOf.feedProfileId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, conversionLearningModeType, summaryStatus, feedProfileId);
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

