package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceObjectiveType;
import org.openapitools.model.EventData;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&lt;customer list ID&gt;\&quot;} ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&lt;audience ID&gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&lt;conversion tag ID&gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */

@Schema(name = "AdAccountsAudienceRule", description = "JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudienceRule {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> adId = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> campaignId = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String country;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String customerListId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> engagementDomain = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String engagementType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer engagerType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String event;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EventData eventData;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Object eventSource;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Object ingestionSource;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<AudienceObjectiveType> objectiveType = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer percentage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> pinId = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean prefill;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer retentionDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> seedId = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> url = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String visitorSourceId;

  public AdAccountsAudienceRule adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountsAudienceRule adId(List<String> adId) {
    this.adId = adId;
    return this;
  }

  public AdAccountsAudienceRule addAdIdItem(String adIdItem) {
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
  
  @Schema(name = "ad_id", description = "Ad ID for engagement audience filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_id")
  public List<String> getAdId() {
    return adId;
  }

  @JsonProperty("ad_id")
  public void setAdId(List<String> adId) {
    this.adId = adId;
  }

  public AdAccountsAudienceRule campaignId(List<String> campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdAccountsAudienceRule addCampaignIdItem(String campaignIdItem) {
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
  
  @Schema(name = "campaign_id", description = "Campaign ID for engagement audience filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_id")
  public List<String> getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaign_id")
  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }

  public AdAccountsAudienceRule country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Valid countries include: \"US\", \"CA\", and \"GB\".
   * @return country
   */
  
  @Schema(name = "country", description = "Valid countries include: \"US\", \"CA\", and \"GB\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public AdAccountsAudienceRule customerListId(@Nullable String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  /**
   * Customer list ID. For CUSTOMER_LIST `audience_type`.
   * @return customerListId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "customer_list_id", description = "Customer list ID. For CUSTOMER_LIST `audience_type`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer_list_id")
  public @Nullable String getCustomerListId() {
    return customerListId;
  }

  @JsonProperty("customer_list_id")
  public void setCustomerListId(@Nullable String customerListId) {
    this.customerListId = customerListId;
  }

  public AdAccountsAudienceRule engagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
    return this;
  }

  public AdAccountsAudienceRule addEngagementDomainItem(String engagementDomainItem) {
    if (this.engagementDomain == null) {
      this.engagementDomain = new ArrayList<>();
    }
    this.engagementDomain.add(engagementDomainItem);
    return this;
  }

  /**
   * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
   * @return engagementDomain
   */
  
  @Schema(name = "engagement_domain", description = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_domain")
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }

  @JsonProperty("engagement_domain")
  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  public AdAccountsAudienceRule engagementType(@Nullable String engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  /**
   * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
   * @return engagementType
   */
  
  @Schema(name = "engagement_type", description = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_type")
  public @Nullable String getEngagementType() {
    return engagementType;
  }

  @JsonProperty("engagement_type")
  public void setEngagementType(@Nullable String engagementType) {
    this.engagementType = engagementType;
  }

  public AdAccountsAudienceRule engagerType(@Nullable Integer engagerType) {
    this.engagerType = engagerType;
    return this;
  }

  /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   * @return engagerType
   */
  
  @Schema(name = "engager_type", description = "Optional for ENGAGEMENT. Engager type value should be 1-2.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engager_type")
  public @Nullable Integer getEngagerType() {
    return engagerType;
  }

  @JsonProperty("engager_type")
  public void setEngagerType(@Nullable Integer engagerType) {
    this.engagerType = engagerType;
  }

  public AdAccountsAudienceRule event(@Nullable String event) {
    this.event = event;
    return this;
  }

  /**
   * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
   * @return event
   */
  
  @Schema(name = "event", description = "A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public @Nullable String getEvent() {
    return event;
  }

  @JsonProperty("event")
  public void setEvent(@Nullable String event) {
    this.event = event;
  }

  public AdAccountsAudienceRule eventData(@Nullable EventData eventData) {
    this.eventData = eventData;
    return this;
  }

  /**
   * Get eventData
   * @return eventData
   */
  @Valid 
  @Schema(name = "event_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_data")
  public @Nullable EventData getEventData() {
    return eventData;
  }

  @JsonProperty("event_data")
  public void setEventData(@Nullable EventData eventData) {
    this.eventData = eventData;
  }

  public AdAccountsAudienceRule eventSource(@Nullable Object eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
   * @return eventSource
   */
  
  @Schema(name = "event_source", description = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_source")
  public @Nullable Object getEventSource() {
    return eventSource;
  }

  @JsonProperty("event_source")
  public void setEventSource(@Nullable Object eventSource) {
    this.eventSource = eventSource;
  }

  public AdAccountsAudienceRule ingestionSource(@Nullable Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   * @return ingestionSource
   */
  
  @Schema(name = "ingestion_source", description = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ingestion_source")
  public @Nullable Object getIngestionSource() {
    return ingestionSource;
  }

  @JsonProperty("ingestion_source")
  public void setIngestionSource(@Nullable Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  public AdAccountsAudienceRule objectiveType(List<AudienceObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  public AdAccountsAudienceRule addObjectiveTypeItem(AudienceObjectiveType objectiveTypeItem) {
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
  @Valid 
  @Schema(name = "objective_type", description = "Objective for engagement audience filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objective_type")
  public List<AudienceObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
  public void setObjectiveType(List<AudienceObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public AdAccountsAudienceRule percentage(@Nullable Integer percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   * @return percentage
   */
  
  @Schema(name = "percentage", description = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentage")
  public @Nullable Integer getPercentage() {
    return percentage;
  }

  @JsonProperty("percentage")
  public void setPercentage(@Nullable Integer percentage) {
    this.percentage = percentage;
  }

  public AdAccountsAudienceRule pinId(List<String> pinId) {
    this.pinId = pinId;
    return this;
  }

  public AdAccountsAudienceRule addPinIdItem(String pinIdItem) {
    if (this.pinId == null) {
      this.pinId = new ArrayList<>();
    }
    this.pinId.add(pinIdItem);
    return this;
  }

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
   * @return pinId
   */
  
  @Schema(name = "pin_id", description = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_id")
  public List<String> getPinId() {
    return pinId;
  }

  @JsonProperty("pin_id")
  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }

  public AdAccountsAudienceRule prefill(@Nullable Boolean prefill) {
    this.prefill = prefill;
    return this;
  }

  /**
   * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
   * @return prefill
   */
  
  @Schema(name = "prefill", description = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefill")
  public @Nullable Boolean getPrefill() {
    return prefill;
  }

  @JsonProperty("prefill")
  public void setPrefill(@Nullable Boolean prefill) {
    this.prefill = prefill;
  }

  public AdAccountsAudienceRule retentionDays(@Nullable Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
   * @return retentionDays
   */
  
  @Schema(name = "retention_days", description = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retention_days")
  public @Nullable Integer getRetentionDays() {
    return retentionDays;
  }

  @JsonProperty("retention_days")
  public void setRetentionDays(@Nullable Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public AdAccountsAudienceRule seedId(List<String> seedId) {
    this.seedId = seedId;
    return this;
  }

  public AdAccountsAudienceRule addSeedIdItem(String seedIdItem) {
    if (this.seedId == null) {
      this.seedId = new ArrayList<>();
    }
    this.seedId.add(seedIdItem);
    return this;
  }

  /**
   * Audience ID(s). For ACTALIKE `audience_type`.
   * @return seedId
   */
  
  @Schema(name = "seed_id", description = "Audience ID(s). For ACTALIKE `audience_type`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seed_id")
  public List<String> getSeedId() {
    return seedId;
  }

  @JsonProperty("seed_id")
  public void setSeedId(List<String> seedId) {
    this.seedId = seedId;
  }

  public AdAccountsAudienceRule url(List<String> url) {
    this.url = url;
    return this;
  }

  public AdAccountsAudienceRule addUrlItem(String urlItem) {
    if (this.url == null) {
      this.url = new ArrayList<>();
    }
    this.url.add(urlItem);
    return this;
  }

  /**
   * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
   * @return url
   */
  
  @Schema(name = "url", description = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(List<String> url) {
    this.url = url;
  }

  public AdAccountsAudienceRule visitorSourceId(@Nullable String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
  }

  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
   * @return visitorSourceId
   */
  
  @Schema(name = "visitor_source_id", description = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visitor_source_id")
  public @Nullable String getVisitorSourceId() {
    return visitorSourceId;
  }

  @JsonProperty("visitor_source_id")
  public void setVisitorSourceId(@Nullable String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountsAudienceRule adAccountsAudienceRule = (AdAccountsAudienceRule) o;
    return Objects.equals(this.adAccountId, adAccountsAudienceRule.adAccountId) &&
        Objects.equals(this.adId, adAccountsAudienceRule.adId) &&
        Objects.equals(this.campaignId, adAccountsAudienceRule.campaignId) &&
        Objects.equals(this.country, adAccountsAudienceRule.country) &&
        Objects.equals(this.customerListId, adAccountsAudienceRule.customerListId) &&
        Objects.equals(this.engagementDomain, adAccountsAudienceRule.engagementDomain) &&
        Objects.equals(this.engagementType, adAccountsAudienceRule.engagementType) &&
        Objects.equals(this.engagerType, adAccountsAudienceRule.engagerType) &&
        Objects.equals(this.event, adAccountsAudienceRule.event) &&
        Objects.equals(this.eventData, adAccountsAudienceRule.eventData) &&
        Objects.equals(this.eventSource, adAccountsAudienceRule.eventSource) &&
        Objects.equals(this.ingestionSource, adAccountsAudienceRule.ingestionSource) &&
        Objects.equals(this.objectiveType, adAccountsAudienceRule.objectiveType) &&
        Objects.equals(this.percentage, adAccountsAudienceRule.percentage) &&
        Objects.equals(this.pinId, adAccountsAudienceRule.pinId) &&
        Objects.equals(this.prefill, adAccountsAudienceRule.prefill) &&
        Objects.equals(this.retentionDays, adAccountsAudienceRule.retentionDays) &&
        Objects.equals(this.seedId, adAccountsAudienceRule.seedId) &&
        Objects.equals(this.url, adAccountsAudienceRule.url) &&
        Objects.equals(this.visitorSourceId, adAccountsAudienceRule.visitorSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adId, campaignId, country, customerListId, engagementDomain, engagementType, engagerType, event, eventData, eventSource, ingestionSource, objectiveType, percentage, pinId, prefill, retentionDays, seedId, url, visitorSourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsAudienceRule {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customerListId: ").append(toIndentedString(customerListId)).append("\n");
    sb.append("    engagementDomain: ").append(toIndentedString(engagementDomain)).append("\n");
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    engagerType: ").append(toIndentedString(engagerType)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    prefill: ").append(toIndentedString(prefill)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    seedId: ").append(toIndentedString(seedId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visitorSourceId: ").append(toIndentedString(visitorSourceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

