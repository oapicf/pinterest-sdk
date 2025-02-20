/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.pinterestsdk.model;

import java.util.Objects;
import com.github.oapicf.pinterestsdk.model.ObjectiveType;
import com.github.oapicf.pinterestsdk.model.PinterestTagEventData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.pinterestsdk.JSON;

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceRule {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CUSTOMER_LIST_ID = "customer_list_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LIST_ID)
  private String customerListId;

  public static final String SERIALIZED_NAME_ENGAGEMENT_DOMAIN = "engagement_domain";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENT_DOMAIN)
  private List<String> engagementDomain = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENGAGEMENT_TYPE = "engagement_type";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENT_TYPE)
  private String engagementType;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_EVENT_DATA = "event_data";
  @SerializedName(SERIALIZED_NAME_EVENT_DATA)
  private PinterestTagEventData eventData;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Integer percentage;

  public static final String SERIALIZED_NAME_PIN_ID = "pin_id";
  @SerializedName(SERIALIZED_NAME_PIN_ID)
  private List<String> pinId = new ArrayList<>();

  public static final String SERIALIZED_NAME_PREFILL = "prefill";
  @SerializedName(SERIALIZED_NAME_PREFILL)
  private Boolean prefill;

  public static final String SERIALIZED_NAME_RETENTION_DAYS = "retention_days";
  @SerializedName(SERIALIZED_NAME_RETENTION_DAYS)
  private Integer retentionDays;

  public static final String SERIALIZED_NAME_SEED_ID = "seed_id";
  @SerializedName(SERIALIZED_NAME_SEED_ID)
  private List<String> seedId = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private List<String> url = new ArrayList<>();

  public static final String SERIALIZED_NAME_VISITOR_SOURCE_ID = "visitor_source_id";
  @SerializedName(SERIALIZED_NAME_VISITOR_SOURCE_ID)
  private String visitorSourceId;

  public static final String SERIALIZED_NAME_EVENT_SOURCE = "event_source";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE)
  private Object eventSource;

  public static final String SERIALIZED_NAME_INGESTION_SOURCE = "ingestion_source";
  @SerializedName(SERIALIZED_NAME_INGESTION_SOURCE)
  private Object ingestionSource;

  public static final String SERIALIZED_NAME_ENGAGER_TYPE = "engager_type";
  @SerializedName(SERIALIZED_NAME_ENGAGER_TYPE)
  private Integer engagerType;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private List<String> campaignId = new ArrayList<>();

  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private List<String> adId = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBJECTIVE_TYPE = "objective_type";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE_TYPE)
  private List<ObjectiveType> objectiveType = new ArrayList<>();

  public static final String SERIALIZED_NAME_AD_ACCOUNT_ID = "ad_account_id";
  @SerializedName(SERIALIZED_NAME_AD_ACCOUNT_ID)
  private String adAccountId;

  public AudienceRule() {
  }

  public AudienceRule country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public AudienceRule customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  /**
   * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
   * @return customerListId
   */
  @javax.annotation.Nullable
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }


  public AudienceRule engagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
    return this;
  }

  public AudienceRule addEngagementDomainItem(String engagementDomainItem) {
    if (this.engagementDomain == null) {
      this.engagementDomain = new ArrayList<>();
    }
    this.engagementDomain.add(engagementDomainItem);
    return this;
  }

  /**
   * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
   * @return engagementDomain
   */
  @javax.annotation.Nullable
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }

  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }


  public AudienceRule engagementType(String engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  /**
   * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. 
   * @return engagementType
   */
  @javax.annotation.Nullable
  public String getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }


  public AudienceRule event(String event) {
    this.event = event;
    return this;
  }

  /**
   * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
   * @return event
   */
  @javax.annotation.Nullable
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }


  public AudienceRule eventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
    return this;
  }

  /**
   * Get eventData
   * @return eventData
   */
  @javax.annotation.Nullable
  public PinterestTagEventData getEventData() {
    return eventData;
  }

  public void setEventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
  }


  public AudienceRule percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   * @return percentage
   */
  @javax.annotation.Nullable
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }


  public AudienceRule pinId(List<String> pinId) {
    this.pinId = pinId;
    return this;
  }

  public AudienceRule addPinIdItem(String pinIdItem) {
    if (this.pinId == null) {
      this.pinId = new ArrayList<>();
    }
    this.pinId.add(pinIdItem);
    return this;
  }

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
   * @return pinId
   */
  @javax.annotation.Nullable
  public List<String> getPinId() {
    return pinId;
  }

  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }


  public AudienceRule prefill(Boolean prefill) {
    this.prefill = prefill;
    return this;
  }

  /**
   * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
   * @return prefill
   */
  @javax.annotation.Nullable
  public Boolean getPrefill() {
    return prefill;
  }

  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }


  public AudienceRule retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
   * @return retentionDays
   */
  @javax.annotation.Nullable
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }


  public AudienceRule seedId(List<String> seedId) {
    this.seedId = seedId;
    return this;
  }

  public AudienceRule addSeedIdItem(String seedIdItem) {
    if (this.seedId == null) {
      this.seedId = new ArrayList<>();
    }
    this.seedId.add(seedIdItem);
    return this;
  }

  /**
   * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. 
   * @return seedId
   */
  @javax.annotation.Nullable
  public List<String> getSeedId() {
    return seedId;
  }

  public void setSeedId(List<String> seedId) {
    this.seedId = seedId;
  }


  public AudienceRule url(List<String> url) {
    this.url = url;
    return this;
  }

  public AudienceRule addUrlItem(String urlItem) {
    if (this.url == null) {
      this.url = new ArrayList<>();
    }
    this.url.add(urlItem);
    return this;
  }

  /**
   * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
   * @return url
   */
  @javax.annotation.Nullable
  public List<String> getUrl() {
    return url;
  }

  public void setUrl(List<String> url) {
    this.url = url;
  }


  public AudienceRule visitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
  }

  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
   * @return visitorSourceId
   */
  @javax.annotation.Nullable
  public String getVisitorSourceId() {
    return visitorSourceId;
  }

  public void setVisitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }


  public AudienceRule eventSource(Object eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
   * @return eventSource
   */
  @javax.annotation.Nullable
  public Object getEventSource() {
    return eventSource;
  }

  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }


  public AudienceRule ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   * @return ingestionSource
   */
  @javax.annotation.Nullable
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }


  public AudienceRule engagerType(Integer engagerType) {
    this.engagerType = engagerType;
    return this;
  }

  /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   * @return engagerType
   */
  @javax.annotation.Nullable
  public Integer getEngagerType() {
    return engagerType;
  }

  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }


  public AudienceRule campaignId(List<String> campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AudienceRule addCampaignIdItem(String campaignIdItem) {
    if (this.campaignId == null) {
      this.campaignId = new ArrayList<>();
    }
    this.campaignId.add(campaignIdItem);
    return this;
  }

  /**
   * Campaign ID for engagement audience filter.
   * @return campaignId
   */
  @javax.annotation.Nullable
  public List<String> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }


  public AudienceRule adId(List<String> adId) {
    this.adId = adId;
    return this;
  }

  public AudienceRule addAdIdItem(String adIdItem) {
    if (this.adId == null) {
      this.adId = new ArrayList<>();
    }
    this.adId.add(adIdItem);
    return this;
  }

  /**
   * Ad ID for engagement audience filter.
   * @return adId
   */
  @javax.annotation.Nullable
  public List<String> getAdId() {
    return adId;
  }

  public void setAdId(List<String> adId) {
    this.adId = adId;
  }


  public AudienceRule objectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  public AudienceRule addObjectiveTypeItem(ObjectiveType objectiveTypeItem) {
    if (this.objectiveType == null) {
      this.objectiveType = new ArrayList<>();
    }
    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

  /**
   * Objective for engagement audience filter.
   * @return objectiveType
   */
  @javax.annotation.Nullable
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }


  public AudienceRule adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  @javax.annotation.Nullable
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceRule audienceRule = (AudienceRule) o;
    return Objects.equals(this.country, audienceRule.country) &&
        Objects.equals(this.customerListId, audienceRule.customerListId) &&
        Objects.equals(this.engagementDomain, audienceRule.engagementDomain) &&
        Objects.equals(this.engagementType, audienceRule.engagementType) &&
        Objects.equals(this.event, audienceRule.event) &&
        Objects.equals(this.eventData, audienceRule.eventData) &&
        Objects.equals(this.percentage, audienceRule.percentage) &&
        Objects.equals(this.pinId, audienceRule.pinId) &&
        Objects.equals(this.prefill, audienceRule.prefill) &&
        Objects.equals(this.retentionDays, audienceRule.retentionDays) &&
        Objects.equals(this.seedId, audienceRule.seedId) &&
        Objects.equals(this.url, audienceRule.url) &&
        Objects.equals(this.visitorSourceId, audienceRule.visitorSourceId) &&
        Objects.equals(this.eventSource, audienceRule.eventSource) &&
        Objects.equals(this.ingestionSource, audienceRule.ingestionSource) &&
        Objects.equals(this.engagerType, audienceRule.engagerType) &&
        Objects.equals(this.campaignId, audienceRule.campaignId) &&
        Objects.equals(this.adId, audienceRule.adId) &&
        Objects.equals(this.objectiveType, audienceRule.objectiveType) &&
        Objects.equals(this.adAccountId, audienceRule.adAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, customerListId, engagementDomain, engagementType, event, eventData, percentage, pinId, prefill, retentionDays, seedId, url, visitorSourceId, eventSource, ingestionSource, engagerType, campaignId, adId, objectiveType, adAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceRule {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customerListId: ").append(toIndentedString(customerListId)).append("\n");
    sb.append("    engagementDomain: ").append(toIndentedString(engagementDomain)).append("\n");
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    prefill: ").append(toIndentedString(prefill)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    seedId: ").append(toIndentedString(seedId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visitorSourceId: ").append(toIndentedString(visitorSourceId)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
    sb.append("    engagerType: ").append(toIndentedString(engagerType)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("customer_list_id");
    openapiFields.add("engagement_domain");
    openapiFields.add("engagement_type");
    openapiFields.add("event");
    openapiFields.add("event_data");
    openapiFields.add("percentage");
    openapiFields.add("pin_id");
    openapiFields.add("prefill");
    openapiFields.add("retention_days");
    openapiFields.add("seed_id");
    openapiFields.add("url");
    openapiFields.add("visitor_source_id");
    openapiFields.add("event_source");
    openapiFields.add("ingestion_source");
    openapiFields.add("engager_type");
    openapiFields.add("campaign_id");
    openapiFields.add("ad_id");
    openapiFields.add("objective_type");
    openapiFields.add("ad_account_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AudienceRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AudienceRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudienceRule is not found in the empty JSON string", AudienceRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AudienceRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AudienceRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("customer_list_id") != null && !jsonObj.get("customer_list_id").isJsonNull()) && !jsonObj.get("customer_list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_list_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("engagement_domain") != null && !jsonObj.get("engagement_domain").isJsonNull() && !jsonObj.get("engagement_domain").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `engagement_domain` to be an array in the JSON string but got `%s`", jsonObj.get("engagement_domain").toString()));
      }
      if ((jsonObj.get("engagement_type") != null && !jsonObj.get("engagement_type").isJsonNull()) && !jsonObj.get("engagement_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engagement_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engagement_type").toString()));
      }
      if ((jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      // validate the optional field `event_data`
      if (jsonObj.get("event_data") != null && !jsonObj.get("event_data").isJsonNull()) {
        PinterestTagEventData.validateJsonElement(jsonObj.get("event_data"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("pin_id") != null && !jsonObj.get("pin_id").isJsonNull() && !jsonObj.get("pin_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin_id` to be an array in the JSON string but got `%s`", jsonObj.get("pin_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("seed_id") != null && !jsonObj.get("seed_id").isJsonNull() && !jsonObj.get("seed_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `seed_id` to be an array in the JSON string but got `%s`", jsonObj.get("seed_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull() && !jsonObj.get("url").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be an array in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("visitor_source_id") != null && !jsonObj.get("visitor_source_id").isJsonNull()) && !jsonObj.get("visitor_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visitor_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visitor_source_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull() && !jsonObj.get("campaign_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be an array in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ad_id") != null && !jsonObj.get("ad_id").isJsonNull() && !jsonObj.get("ad_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ad_id` to be an array in the JSON string but got `%s`", jsonObj.get("ad_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("objective_type") != null && !jsonObj.get("objective_type").isJsonNull() && !jsonObj.get("objective_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `objective_type` to be an array in the JSON string but got `%s`", jsonObj.get("objective_type").toString()));
      }
      if ((jsonObj.get("ad_account_id") != null && !jsonObj.get("ad_account_id").isJsonNull()) && !jsonObj.get("ad_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ad_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ad_account_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudienceRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudienceRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudienceRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudienceRule.class));

       return (TypeAdapter<T>) new TypeAdapter<AudienceRule>() {
           @Override
           public void write(JsonWriter out, AudienceRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudienceRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AudienceRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AudienceRule
   * @throws IOException if the JSON string is invalid with respect to AudienceRule
   */
  public static AudienceRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudienceRule.class);
  }

  /**
   * Convert an instance of AudienceRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

