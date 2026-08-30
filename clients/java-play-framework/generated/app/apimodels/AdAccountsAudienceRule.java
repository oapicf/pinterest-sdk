package apimodels;

import apimodels.AudienceObjectiveType;
import apimodels.EventData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&lt;customer list ID&gt;\&quot;} ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&lt;audience ID&gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&lt;conversion tag ID&gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccountsAudienceRule   {
  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("ad_id")
  
  private List<String> adId = null;

  @JsonProperty("campaign_id")
  
  private List<String> campaignId = null;

  @JsonProperty("country")
  
  private String country;

  @JsonProperty("customer_list_id")
  @Pattern(regexp="^\\d+$")

  private String customerListId;

  @JsonProperty("engagement_domain")
  
  private List<String> engagementDomain = null;

  @JsonProperty("engagement_type")
  
  private String engagementType;

  @JsonProperty("engager_type")
  
  private Integer engagerType;

  @JsonProperty("event")
  
  private String event;

  @JsonProperty("event_data")
  @Valid

  private EventData eventData;

  @JsonProperty("event_source")
  
  private Object eventSource;

  @JsonProperty("ingestion_source")
  
  private Object ingestionSource;

  @JsonProperty("objective_type")
  @Valid

  private List<AudienceObjectiveType> objectiveType = null;

  @JsonProperty("percentage")
  
  private Integer percentage;

  @JsonProperty("pin_id")
  
  private List<String> pinId = null;

  @JsonProperty("prefill")
  
  private Boolean prefill;

  @JsonProperty("retention_days")
  
  private Integer retentionDays;

  @JsonProperty("seed_id")
  
  private List<String> seedId = null;

  @JsonProperty("url")
  
  private List<String> url = null;

  @JsonProperty("visitor_source_id")
  
  private String visitorSourceId;

  public AdAccountsAudienceRule adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
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
  **/
  public List<String> getAdId() {
    return adId;
  }

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
  **/
  public List<String> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }

  public AdAccountsAudienceRule country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Valid countries include: \"US\", \"CA\", and \"GB\".
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AdAccountsAudienceRule customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

   /**
   * Customer list ID. For CUSTOMER_LIST `audience_type`.
   * @return customerListId
  **/
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
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
  **/
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }

  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  public AdAccountsAudienceRule engagementType(String engagementType) {
    this.engagementType = engagementType;
    return this;
  }

   /**
   * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
   * @return engagementType
  **/
  public String getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  public AdAccountsAudienceRule engagerType(Integer engagerType) {
    this.engagerType = engagerType;
    return this;
  }

   /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   * @return engagerType
  **/
  public Integer getEngagerType() {
    return engagerType;
  }

  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  public AdAccountsAudienceRule event(String event) {
    this.event = event;
    return this;
  }

   /**
   * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
   * @return event
  **/
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public AdAccountsAudienceRule eventData(EventData eventData) {
    this.eventData = eventData;
    return this;
  }

   /**
   * Get eventData
   * @return eventData
  **/
  public EventData getEventData() {
    return eventData;
  }

  public void setEventData(EventData eventData) {
    this.eventData = eventData;
  }

  public AdAccountsAudienceRule eventSource(Object eventSource) {
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
   * @return eventSource
  **/
  public Object getEventSource() {
    return eventSource;
  }

  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  public AdAccountsAudienceRule ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

   /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   * @return ingestionSource
  **/
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
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
  **/
  public List<AudienceObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(List<AudienceObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public AdAccountsAudienceRule percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   * @return percentage
  **/
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
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
  **/
  public List<String> getPinId() {
    return pinId;
  }

  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }

  public AdAccountsAudienceRule prefill(Boolean prefill) {
    this.prefill = prefill;
    return this;
  }

   /**
   * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
   * @return prefill
  **/
  public Boolean getPrefill() {
    return prefill;
  }

  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  public AdAccountsAudienceRule retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

   /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
   * @return retentionDays
  **/
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
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
  **/
  public List<String> getSeedId() {
    return seedId;
  }

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
  **/
  public List<String> getUrl() {
    return url;
  }

  public void setUrl(List<String> url) {
    this.url = url;
  }

  public AdAccountsAudienceRule visitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
  }

   /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
   * @return visitorSourceId
  **/
  public String getVisitorSourceId() {
    return visitorSourceId;
  }

  public void setVisitorSourceId(String visitorSourceId) {
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
    return Objects.equals(adAccountId, adAccountsAudienceRule.adAccountId) &&
        Objects.equals(adId, adAccountsAudienceRule.adId) &&
        Objects.equals(campaignId, adAccountsAudienceRule.campaignId) &&
        Objects.equals(country, adAccountsAudienceRule.country) &&
        Objects.equals(customerListId, adAccountsAudienceRule.customerListId) &&
        Objects.equals(engagementDomain, adAccountsAudienceRule.engagementDomain) &&
        Objects.equals(engagementType, adAccountsAudienceRule.engagementType) &&
        Objects.equals(engagerType, adAccountsAudienceRule.engagerType) &&
        Objects.equals(event, adAccountsAudienceRule.event) &&
        Objects.equals(eventData, adAccountsAudienceRule.eventData) &&
        Objects.equals(eventSource, adAccountsAudienceRule.eventSource) &&
        Objects.equals(ingestionSource, adAccountsAudienceRule.ingestionSource) &&
        Objects.equals(objectiveType, adAccountsAudienceRule.objectiveType) &&
        Objects.equals(percentage, adAccountsAudienceRule.percentage) &&
        Objects.equals(pinId, adAccountsAudienceRule.pinId) &&
        Objects.equals(prefill, adAccountsAudienceRule.prefill) &&
        Objects.equals(retentionDays, adAccountsAudienceRule.retentionDays) &&
        Objects.equals(seedId, adAccountsAudienceRule.seedId) &&
        Objects.equals(url, adAccountsAudienceRule.url) &&
        Objects.equals(visitorSourceId, adAccountsAudienceRule.visitorSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adId, campaignId, country, customerListId, engagementDomain, engagementType, engagerType, event, eventData, eventSource, ingestionSource, objectiveType, percentage, pinId, prefill, retentionDays, seedId, url, visitorSourceId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

