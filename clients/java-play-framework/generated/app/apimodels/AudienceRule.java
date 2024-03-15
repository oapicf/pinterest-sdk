package apimodels;

import apimodels.ObjectiveType;
import apimodels.PinterestTagEventData;
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
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceRule   {
  @JsonProperty("country")
  
  private String country;

  @JsonProperty("customer_list_id")
  @Pattern(regexp="^\\d+$")

  private String customerListId;

  @JsonProperty("engagement_domain")
  
  private List<String> engagementDomain = null;

  @JsonProperty("engagement_type")
  
  private String engagementType;

  @JsonProperty("event")
  
  private String event;

  @JsonProperty("event_data")
  @Valid

  private PinterestTagEventData eventData;

  @JsonProperty("percentage")
  
  private Integer percentage;

  @JsonProperty("pin_id")
  
  private List<@Pattern(regexp = "^\\d+$")String> pinId = null;

  @JsonProperty("prefill")
  
  private Boolean prefill;

  @JsonProperty("retention_days")
  
  private Integer retentionDays;

  @JsonProperty("seed_id")
  
  private List<@Pattern(regexp = "^\\d+$")String> seedId = null;

  @JsonProperty("url")
  
  private List<String> url = null;

  @JsonProperty("visitor_source_id")
  @Pattern(regexp="^\\d+$")

  private String visitorSourceId;

  @JsonProperty("event_source")
  
  private Object eventSource;

  @JsonProperty("ingestion_source")
  
  private Object ingestionSource;

  @JsonProperty("engager_type")
  
  private Integer engagerType;

  @JsonProperty("campaign_id")
  
  private List<@Pattern(regexp = "^\\d+$")String> campaignId = null;

  @JsonProperty("ad_id")
  
  private List<@Pattern(regexp = "^\\d+$")String> adId = null;

  @JsonProperty("objective_type")
  @Valid

  private List<ObjectiveType> objectiveType = null;

  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  public AudienceRule country(String country) {
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

  public AudienceRule customerListId(String customerListId) {
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
   * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
   * @return engagementDomain
  **/
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
   * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
   * @return engagementType
  **/
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
   * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
   * @return event
  **/
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
  **/
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
  **/
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public AudienceRule pinId(List<@Pattern(regexp = "^\\d+$")String> pinId) {
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
   * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
   * @return pinId
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getPinId() {
    return pinId;
  }

  public void setPinId(List<@Pattern(regexp = "^\\d+$")String> pinId) {
    this.pinId = pinId;
  }

  public AudienceRule prefill(Boolean prefill) {
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

  public AudienceRule retentionDays(Integer retentionDays) {
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

  public AudienceRule seedId(List<@Pattern(regexp = "^\\d+$")String> seedId) {
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
   * Audience ID(s). For ACTALIKE `audience_type`. 
   * @return seedId
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getSeedId() {
    return seedId;
  }

  public void setSeedId(List<@Pattern(regexp = "^\\d+$")String> seedId) {
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
   * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
   * @return url
  **/
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
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
   * @return visitorSourceId
  **/
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
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
   * @return eventSource
  **/
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
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   * @return ingestionSource
  **/
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
  **/
  public Integer getEngagerType() {
    return engagerType;
  }

  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  public AudienceRule campaignId(List<@Pattern(regexp = "^\\d+$")String> campaignId) {
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
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(List<@Pattern(regexp = "^\\d+$")String> campaignId) {
    this.campaignId = campaignId;
  }

  public AudienceRule adId(List<@Pattern(regexp = "^\\d+$")String> adId) {
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
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAdId() {
    return adId;
  }

  public void setAdId(List<@Pattern(regexp = "^\\d+$")String> adId) {
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
  **/
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
  **/
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
    return Objects.equals(country, audienceRule.country) &&
        Objects.equals(customerListId, audienceRule.customerListId) &&
        Objects.equals(engagementDomain, audienceRule.engagementDomain) &&
        Objects.equals(engagementType, audienceRule.engagementType) &&
        Objects.equals(event, audienceRule.event) &&
        Objects.equals(eventData, audienceRule.eventData) &&
        Objects.equals(percentage, audienceRule.percentage) &&
        Objects.equals(pinId, audienceRule.pinId) &&
        Objects.equals(prefill, audienceRule.prefill) &&
        Objects.equals(retentionDays, audienceRule.retentionDays) &&
        Objects.equals(seedId, audienceRule.seedId) &&
        Objects.equals(url, audienceRule.url) &&
        Objects.equals(visitorSourceId, audienceRule.visitorSourceId) &&
        Objects.equals(eventSource, audienceRule.eventSource) &&
        Objects.equals(ingestionSource, audienceRule.ingestionSource) &&
        Objects.equals(engagerType, audienceRule.engagerType) &&
        Objects.equals(campaignId, audienceRule.campaignId) &&
        Objects.equals(adId, audienceRule.adId) &&
        Objects.equals(objectiveType, audienceRule.objectiveType) &&
        Objects.equals(adAccountId, audienceRule.adAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, customerListId, engagementDomain, engagementType, event, eventData, percentage, pinId, prefill, retentionDays, seedId, url, visitorSourceId, eventSource, ingestionSource, engagerType, campaignId, adId, objectiveType, adAccountId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
}

