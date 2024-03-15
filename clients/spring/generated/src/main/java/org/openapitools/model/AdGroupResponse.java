package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupResponse {

  private String name;

  private EntityStatus status;

  private JsonNullable<Integer> budgetInMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> bidInMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<AdGroupCommonOptimizationGoalMetadata> optimizationGoalMetadata = JsonNullable.<AdGroupCommonOptimizationGoalMetadata>undefined();

  private BudgetType budgetType;

  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  private TargetingSpec targetingSpec;

  private Integer lifetimeFrequencyCap;

  private JsonNullable<AdGroupCommonTrackingUrls> trackingUrls = JsonNullable.<AdGroupCommonTrackingUrls>undefined();

  private JsonNullable<Boolean> autoTargetingEnabled = JsonNullable.<Boolean>undefined();

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BidStrategyTypeEnum fromValue(String value) {
      for (BidStrategyTypeEnum b : BidStrategyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<BidStrategyTypeEnum> bidStrategyType = JsonNullable.<BidStrategyTypeEnum>undefined();

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

  private JsonNullable<ConversionLearningModeTypeEnum> conversionLearningModeType = JsonNullable.<ConversionLearningModeTypeEnum>undefined();

  private AdGroupSummaryStatus summaryStatus;

  private String feedProfileId;

  private JsonNullable<Object> dcaAssets = JsonNullable.<Object>undefined();

  public AdGroupResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Ad group name.
   * @return name
  */
  
  @Schema(name = "name", example = "Ad Group For Pin: 687195905986", description = "Ad group name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdGroupResponse status(EntityStatus status) {
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
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdGroupResponse budgetInMicroCurrency(Integer budgetInMicroCurrency) {
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

  public AdGroupResponse bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = JsonNullable.of(bidInMicroCurrency);
    return this;
  }

  /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
  */
  
  @Schema(name = "bid_in_micro_currency", example = "5000000", description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_in_micro_currency")
  public JsonNullable<Integer> getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(JsonNullable<Integer> bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public AdGroupResponse optimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = JsonNullable.of(optimizationGoalMetadata);
    return this;
  }

  /**
   * Get optimizationGoalMetadata
   * @return optimizationGoalMetadata
  */
  @Valid 
  @Schema(name = "optimization_goal_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimization_goal_metadata")
  public JsonNullable<AdGroupCommonOptimizationGoalMetadata> getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(JsonNullable<AdGroupCommonOptimizationGoalMetadata> optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupResponse budgetType(BudgetType budgetType) {
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
  public BudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  public AdGroupResponse startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   * @return startTime
  */
  
  @Schema(name = "start_time", example = "5686848000", description = "Ad group start time. Unix timestamp in seconds. Defaults to current time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public AdGroupResponse endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Ad group end time. Unix timestamp in seconds.
   * @return endTime
  */
  
  @Schema(name = "end_time", example = "5705424000", description = "Ad group end time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public AdGroupResponse targetingSpec(TargetingSpec targetingSpec) {
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
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupResponse lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
   * @return lifetimeFrequencyCap
  */
  
  @Schema(name = "lifetime_frequency_cap", example = "100", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_frequency_cap")
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }

  public AdGroupResponse trackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
  */
  @Valid 
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<AdGroupCommonTrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<AdGroupCommonTrackingUrls> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdGroupResponse autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = JsonNullable.of(autoTargetingEnabled);
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   * @return autoTargetingEnabled
  */
  
  @Schema(name = "auto_targeting_enabled", example = "true", description = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public JsonNullable<Boolean> getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(JsonNullable<Boolean> autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupResponse placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
   * @return placementGroup
  */
  @Valid 
  @Schema(name = "placement_group", description = "<a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupResponse pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
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
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  public AdGroupResponse campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Campaign ID of the ad group.
   * @return campaignId
  */
  @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "campaign_id", example = "626736533506", description = "Campaign ID of the ad group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupResponse billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

  /**
   * Get billableEvent
   * @return billableEvent
  */
  @Valid 
  @Schema(name = "billable_event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billable_event")
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }

  public AdGroupResponse bidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = JsonNullable.of(bidStrategyType);
    return this;
  }

  /**
   * Bid strategy type
   * @return bidStrategyType
  */
  
  @Schema(name = "bid_strategy_type", example = "MAX_BID", description = "Bid strategy type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_strategy_type")
  public JsonNullable<BidStrategyTypeEnum> getBidStrategyType() {
    return bidStrategyType;
  }

  public void setBidStrategyType(JsonNullable<BidStrategyTypeEnum> bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }

  public AdGroupResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Ad group ID.
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "2680060704746", description = "Ad group ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdGroupResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Advertiser ID.
   * @return adAccountId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Advertiser ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdGroupResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Ad group creation time. Unix timestamp in seconds.
   * @return createdTime
  */
  
  @Schema(name = "created_time", example = "1476477189", description = "Ad group creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdGroupResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Ad group last update time. Unix timestamp in seconds.
   * @return updatedTime
  */
  
  @Schema(name = "updated_time", example = "1476477189", description = "Ad group last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdGroupResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"adgroup\".
   * @return type
  */
  
  @Schema(name = "type", description = "Always \"adgroup\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdGroupResponse conversionLearningModeType(ConversionLearningModeTypeEnum conversionLearningModeType) {
    this.conversionLearningModeType = JsonNullable.of(conversionLearningModeType);
    return this;
  }

  /**
   * oCPM learn mode
   * @return conversionLearningModeType
  */
  
  @Schema(name = "conversion_learning_mode_type", example = "ACTIVE", description = "oCPM learn mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_learning_mode_type")
  public JsonNullable<ConversionLearningModeTypeEnum> getConversionLearningModeType() {
    return conversionLearningModeType;
  }

  public void setConversionLearningModeType(JsonNullable<ConversionLearningModeTypeEnum> conversionLearningModeType) {
    this.conversionLearningModeType = conversionLearningModeType;
  }

  public AdGroupResponse summaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Ad group summary status.
   * @return summaryStatus
  */
  @Valid 
  @Schema(name = "summary_status", description = "Ad group summary status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary_status")
  public AdGroupSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(AdGroupSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdGroupResponse feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

  /**
   * Feed Profile ID associated to the adgroup.
   * @return feedProfileId
  */
  
  @Schema(name = "feed_profile_id", example = "626736533506", description = "Feed Profile ID associated to the adgroup.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public AdGroupResponse dcaAssets(Object dcaAssets) {
    this.dcaAssets = JsonNullable.of(dcaAssets);
    return this;
  }

  /**
   * [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
   * @return dcaAssets
  */
  
  @Schema(name = "dca_assets", description = "[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dca_assets")
  public JsonNullable<Object> getDcaAssets() {
    return dcaAssets;
  }

  public void setDcaAssets(JsonNullable<Object> dcaAssets) {
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
        equalsNullable(this.budgetInMicroCurrency, adGroupResponse.budgetInMicroCurrency) &&
        equalsNullable(this.bidInMicroCurrency, adGroupResponse.bidInMicroCurrency) &&
        equalsNullable(this.optimizationGoalMetadata, adGroupResponse.optimizationGoalMetadata) &&
        Objects.equals(this.budgetType, adGroupResponse.budgetType) &&
        equalsNullable(this.startTime, adGroupResponse.startTime) &&
        equalsNullable(this.endTime, adGroupResponse.endTime) &&
        Objects.equals(this.targetingSpec, adGroupResponse.targetingSpec) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupResponse.lifetimeFrequencyCap) &&
        equalsNullable(this.trackingUrls, adGroupResponse.trackingUrls) &&
        equalsNullable(this.autoTargetingEnabled, adGroupResponse.autoTargetingEnabled) &&
        Objects.equals(this.placementGroup, adGroupResponse.placementGroup) &&
        Objects.equals(this.pacingDeliveryType, adGroupResponse.pacingDeliveryType) &&
        Objects.equals(this.campaignId, adGroupResponse.campaignId) &&
        Objects.equals(this.billableEvent, adGroupResponse.billableEvent) &&
        equalsNullable(this.bidStrategyType, adGroupResponse.bidStrategyType) &&
        Objects.equals(this.id, adGroupResponse.id) &&
        Objects.equals(this.adAccountId, adGroupResponse.adAccountId) &&
        Objects.equals(this.createdTime, adGroupResponse.createdTime) &&
        Objects.equals(this.updatedTime, adGroupResponse.updatedTime) &&
        Objects.equals(this.type, adGroupResponse.type) &&
        equalsNullable(this.conversionLearningModeType, adGroupResponse.conversionLearningModeType) &&
        Objects.equals(this.summaryStatus, adGroupResponse.summaryStatus) &&
        Objects.equals(this.feedProfileId, adGroupResponse.feedProfileId) &&
        equalsNullable(this.dcaAssets, adGroupResponse.dcaAssets);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, hashCodeNullable(budgetInMicroCurrency), hashCodeNullable(bidInMicroCurrency), hashCodeNullable(optimizationGoalMetadata), budgetType, hashCodeNullable(startTime), hashCodeNullable(endTime), targetingSpec, lifetimeFrequencyCap, hashCodeNullable(trackingUrls), hashCodeNullable(autoTargetingEnabled), placementGroup, pacingDeliveryType, campaignId, billableEvent, hashCodeNullable(bidStrategyType), id, adAccountId, createdTime, updatedTime, type, hashCodeNullable(conversionLearningModeType), summaryStatus, feedProfileId, hashCodeNullable(dcaAssets));
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

