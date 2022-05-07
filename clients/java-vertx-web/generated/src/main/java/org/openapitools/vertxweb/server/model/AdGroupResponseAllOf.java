package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdGroupSummaryStatus;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.PacingDeliveryType;
import org.openapitools.vertxweb.server.model.PlacementGroupType;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private Map<String, List<String>> targetingSpec = new HashMap<>();
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

  public AdGroupResponseAllOf () {

  }

  public AdGroupResponseAllOf (String name, EntityStatus status, Integer budgetInMicroCurrency, Integer bidInMicroCurrency, BudgetTypeEnum budgetType, Integer startTime, Integer endTime, Map<String, List<String>> targetingSpec, Integer lifetimeFrequencyCap, TrackingUrls trackingUrls, Boolean autoTargetingEnabled, PlacementGroupType placementGroup, PacingDeliveryType pacingDeliveryType, ConversionLearningModeTypeEnum conversionLearningModeType, AdGroupSummaryStatus summaryStatus, String feedProfileId) {
    this.name = name;
    this.status = status;
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    this.bidInMicroCurrency = bidInMicroCurrency;
    this.budgetType = budgetType;
    this.startTime = startTime;
    this.endTime = endTime;
    this.targetingSpec = targetingSpec;
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    this.trackingUrls = trackingUrls;
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.placementGroup = placementGroup;
    this.pacingDeliveryType = pacingDeliveryType;
    this.conversionLearningModeType = conversionLearningModeType;
    this.summaryStatus = summaryStatus;
    this.feedProfileId = feedProfileId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("budget_in_micro_currency")
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }
  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }

    
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

    
  @JsonProperty("budget_type")
  public BudgetTypeEnum getBudgetType() {
    return budgetType;
  }
  public void setBudgetType(BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
  }

    
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("targeting_spec")
  public Map<String, List<String>> getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(Map<String, List<String>> targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

    
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }
  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }
  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

    
  @JsonProperty("conversion_learning_mode_type")
  public ConversionLearningModeTypeEnum getConversionLearningModeType() {
    return conversionLearningModeType;
  }
  public void setConversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

    
  @JsonProperty("summary_status")
  public AdGroupSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

    
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
