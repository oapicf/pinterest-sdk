/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.pinterestsdk.model;

import java.util.Objects;
import com.github.oapicf.pinterestsdk.model.ActionType;
import com.github.oapicf.pinterestsdk.model.AdGroupCommonOptimizationGoalMetadata;
import com.github.oapicf.pinterestsdk.model.AdGroupCommonTrackingUrls;
import com.github.oapicf.pinterestsdk.model.BudgetType;
import com.github.oapicf.pinterestsdk.model.EntityStatus;
import com.github.oapicf.pinterestsdk.model.PacingDeliveryType;
import com.github.oapicf.pinterestsdk.model.PlacementGroupType;
import com.github.oapicf.pinterestsdk.model.TargetingSpec;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.pinterestsdk.JSON;

/**
 * AdGroupCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T23:01:05.225954683Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupCommon {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EntityStatus status;

  public static final String SERIALIZED_NAME_BUDGET_IN_MICRO_CURRENCY = "budget_in_micro_currency";
  @SerializedName(SERIALIZED_NAME_BUDGET_IN_MICRO_CURRENCY)
  private Integer budgetInMicroCurrency;

  public static final String SERIALIZED_NAME_BID_IN_MICRO_CURRENCY = "bid_in_micro_currency";
  @SerializedName(SERIALIZED_NAME_BID_IN_MICRO_CURRENCY)
  private Integer bidInMicroCurrency;

  public static final String SERIALIZED_NAME_OPTIMIZATION_GOAL_METADATA = "optimization_goal_metadata";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_GOAL_METADATA)
  private AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata;

  public static final String SERIALIZED_NAME_BUDGET_TYPE = "budget_type";
  @SerializedName(SERIALIZED_NAME_BUDGET_TYPE)
  private BudgetType budgetType;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Integer startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Integer endTime;

  public static final String SERIALIZED_NAME_TARGETING_SPEC = "targeting_spec";
  @SerializedName(SERIALIZED_NAME_TARGETING_SPEC)
  private TargetingSpec targetingSpec;

  public static final String SERIALIZED_NAME_LIFETIME_FREQUENCY_CAP = "lifetime_frequency_cap";
  @SerializedName(SERIALIZED_NAME_LIFETIME_FREQUENCY_CAP)
  private Integer lifetimeFrequencyCap;

  public static final String SERIALIZED_NAME_TRACKING_URLS = "tracking_urls";
  @SerializedName(SERIALIZED_NAME_TRACKING_URLS)
  private AdGroupCommonTrackingUrls trackingUrls;

  public static final String SERIALIZED_NAME_AUTO_TARGETING_ENABLED = "auto_targeting_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_TARGETING_ENABLED)
  private Boolean autoTargetingEnabled;

  public static final String SERIALIZED_NAME_PLACEMENT_GROUP = "placement_group";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_GROUP)
  private PlacementGroupType placementGroup;

  public static final String SERIALIZED_NAME_PACING_DELIVERY_TYPE = "pacing_delivery_type";
  @SerializedName(SERIALIZED_NAME_PACING_DELIVERY_TYPE)
  private PacingDeliveryType pacingDeliveryType;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_BILLABLE_EVENT = "billable_event";
  @SerializedName(SERIALIZED_NAME_BILLABLE_EVENT)
  private ActionType billableEvent;

  /**
   * Bid strategy type
   */
  @JsonAdapter(BidStrategyTypeEnum.Adapter.class)
  public enum BidStrategyTypeEnum {
    AUTOMATIC_BID("AUTOMATIC_BID"),
    
    MAX_BID("MAX_BID"),
    
    TARGET_AVG("TARGET_AVG"),
    
    NULL("null");

    private String value;

    BidStrategyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
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

    public static class Adapter extends TypeAdapter<BidStrategyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BidStrategyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BidStrategyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BidStrategyTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BidStrategyTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BID_STRATEGY_TYPE = "bid_strategy_type";
  @SerializedName(SERIALIZED_NAME_BID_STRATEGY_TYPE)
  private BidStrategyTypeEnum bidStrategyType;

  public AdGroupCommon() {
  }

  public AdGroupCommon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Ad group name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AdGroupCommon status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Ad group/entity status.
   * @return status
  **/
  @javax.annotation.Nullable
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  public AdGroupCommon budgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
    return this;
  }

   /**
   * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
   * @return budgetInMicroCurrency
  **/
  @javax.annotation.Nullable
  public Integer getBudgetInMicroCurrency() {
    return budgetInMicroCurrency;
  }

  public void setBudgetInMicroCurrency(Integer budgetInMicroCurrency) {
    this.budgetInMicroCurrency = budgetInMicroCurrency;
  }


  public AdGroupCommon bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

   /**
   * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
   * @return bidInMicroCurrency
  **/
  @javax.annotation.Nullable
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }


  public AdGroupCommon optimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

   /**
   * Get optimizationGoalMetadata
   * @return optimizationGoalMetadata
  **/
  @javax.annotation.Nullable
  public AdGroupCommonOptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }


  public AdGroupCommon budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

   /**
   * Get budgetType
   * @return budgetType
  **/
  @javax.annotation.Nullable
  public BudgetType getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }


  public AdGroupCommon startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Ad group start time. Unix timestamp in seconds. Defaults to current time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  public AdGroupCommon endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Ad group end time. Unix timestamp in seconds.
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }


  public AdGroupCommon targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @javax.annotation.Nullable
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }


  public AdGroupCommon lifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
    return this;
  }

   /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
   * @return lifetimeFrequencyCap
  **/
  @javax.annotation.Nullable
  public Integer getLifetimeFrequencyCap() {
    return lifetimeFrequencyCap;
  }

  public void setLifetimeFrequencyCap(Integer lifetimeFrequencyCap) {
    this.lifetimeFrequencyCap = lifetimeFrequencyCap;
  }


  public AdGroupCommon trackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @javax.annotation.Nullable
  public AdGroupCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdGroupCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }


  public AdGroupCommon autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

   /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   * @return autoTargetingEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }


  public AdGroupCommon placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

   /**
   * &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   * @return placementGroup
  **/
  @javax.annotation.Nullable
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }


  public AdGroupCommon pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }

   /**
   * Get pacingDeliveryType
   * @return pacingDeliveryType
  **/
  @javax.annotation.Nullable
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }


  public AdGroupCommon campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign ID of the ad group.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public AdGroupCommon billableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
    return this;
  }

   /**
   * Get billableEvent
   * @return billableEvent
  **/
  @javax.annotation.Nullable
  public ActionType getBillableEvent() {
    return billableEvent;
  }

  public void setBillableEvent(ActionType billableEvent) {
    this.billableEvent = billableEvent;
  }


  public AdGroupCommon bidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
    return this;
  }

   /**
   * Bid strategy type
   * @return bidStrategyType
  **/
  @javax.annotation.Nullable
  public BidStrategyTypeEnum getBidStrategyType() {
    return bidStrategyType;
  }

  public void setBidStrategyType(BidStrategyTypeEnum bidStrategyType) {
    this.bidStrategyType = bidStrategyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCommon adGroupCommon = (AdGroupCommon) o;
    return Objects.equals(this.name, adGroupCommon.name) &&
        Objects.equals(this.status, adGroupCommon.status) &&
        Objects.equals(this.budgetInMicroCurrency, adGroupCommon.budgetInMicroCurrency) &&
        Objects.equals(this.bidInMicroCurrency, adGroupCommon.bidInMicroCurrency) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupCommon.optimizationGoalMetadata) &&
        Objects.equals(this.budgetType, adGroupCommon.budgetType) &&
        Objects.equals(this.startTime, adGroupCommon.startTime) &&
        Objects.equals(this.endTime, adGroupCommon.endTime) &&
        Objects.equals(this.targetingSpec, adGroupCommon.targetingSpec) &&
        Objects.equals(this.lifetimeFrequencyCap, adGroupCommon.lifetimeFrequencyCap) &&
        Objects.equals(this.trackingUrls, adGroupCommon.trackingUrls) &&
        Objects.equals(this.autoTargetingEnabled, adGroupCommon.autoTargetingEnabled) &&
        Objects.equals(this.placementGroup, adGroupCommon.placementGroup) &&
        Objects.equals(this.pacingDeliveryType, adGroupCommon.pacingDeliveryType) &&
        Objects.equals(this.campaignId, adGroupCommon.campaignId) &&
        Objects.equals(this.billableEvent, adGroupCommon.billableEvent) &&
        Objects.equals(this.bidStrategyType, adGroupCommon.bidStrategyType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, budgetInMicroCurrency, bidInMicroCurrency, optimizationGoalMetadata, budgetType, startTime, endTime, targetingSpec, lifetimeFrequencyCap, trackingUrls, autoTargetingEnabled, placementGroup, pacingDeliveryType, campaignId, billableEvent, bidStrategyType);
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
    sb.append("class AdGroupCommon {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("budget_in_micro_currency");
    openapiFields.add("bid_in_micro_currency");
    openapiFields.add("optimization_goal_metadata");
    openapiFields.add("budget_type");
    openapiFields.add("start_time");
    openapiFields.add("end_time");
    openapiFields.add("targeting_spec");
    openapiFields.add("lifetime_frequency_cap");
    openapiFields.add("tracking_urls");
    openapiFields.add("auto_targeting_enabled");
    openapiFields.add("placement_group");
    openapiFields.add("pacing_delivery_type");
    openapiFields.add("campaign_id");
    openapiFields.add("billable_event");
    openapiFields.add("bid_strategy_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdGroupCommon
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdGroupCommon.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdGroupCommon is not found in the empty JSON string", AdGroupCommon.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdGroupCommon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdGroupCommon` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        EntityStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `optimization_goal_metadata`
      if (jsonObj.get("optimization_goal_metadata") != null && !jsonObj.get("optimization_goal_metadata").isJsonNull()) {
        AdGroupCommonOptimizationGoalMetadata.validateJsonElement(jsonObj.get("optimization_goal_metadata"));
      }
      // validate the optional field `budget_type`
      if (jsonObj.get("budget_type") != null && !jsonObj.get("budget_type").isJsonNull()) {
        BudgetType.validateJsonElement(jsonObj.get("budget_type"));
      }
      // validate the optional field `targeting_spec`
      if (jsonObj.get("targeting_spec") != null && !jsonObj.get("targeting_spec").isJsonNull()) {
        TargetingSpec.validateJsonElement(jsonObj.get("targeting_spec"));
      }
      // validate the optional field `tracking_urls`
      if (jsonObj.get("tracking_urls") != null && !jsonObj.get("tracking_urls").isJsonNull()) {
        AdGroupCommonTrackingUrls.validateJsonElement(jsonObj.get("tracking_urls"));
      }
      // validate the optional field `placement_group`
      if (jsonObj.get("placement_group") != null && !jsonObj.get("placement_group").isJsonNull()) {
        PlacementGroupType.validateJsonElement(jsonObj.get("placement_group"));
      }
      // validate the optional field `pacing_delivery_type`
      if (jsonObj.get("pacing_delivery_type") != null && !jsonObj.get("pacing_delivery_type").isJsonNull()) {
        PacingDeliveryType.validateJsonElement(jsonObj.get("pacing_delivery_type"));
      }
      if ((jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      // validate the optional field `billable_event`
      if (jsonObj.get("billable_event") != null && !jsonObj.get("billable_event").isJsonNull()) {
        ActionType.validateJsonElement(jsonObj.get("billable_event"));
      }
      if ((jsonObj.get("bid_strategy_type") != null && !jsonObj.get("bid_strategy_type").isJsonNull()) && !jsonObj.get("bid_strategy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bid_strategy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bid_strategy_type").toString()));
      }
      // validate the optional field `bid_strategy_type`
      if (jsonObj.get("bid_strategy_type") != null && !jsonObj.get("bid_strategy_type").isJsonNull()) {
        BidStrategyTypeEnum.validateJsonElement(jsonObj.get("bid_strategy_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdGroupCommon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdGroupCommon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdGroupCommon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdGroupCommon.class));

       return (TypeAdapter<T>) new TypeAdapter<AdGroupCommon>() {
           @Override
           public void write(JsonWriter out, AdGroupCommon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdGroupCommon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdGroupCommon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdGroupCommon
  * @throws IOException if the JSON string is invalid with respect to AdGroupCommon
  */
  public static AdGroupCommon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdGroupCommon.class);
  }

 /**
  * Convert an instance of AdGroupCommon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
