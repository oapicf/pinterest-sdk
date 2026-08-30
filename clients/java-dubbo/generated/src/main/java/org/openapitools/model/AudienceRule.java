package org.openapitools.model;

import org.openapitools.model.EventData;
import org.openapitools.model.ObjectiveType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}  ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */
public class AudienceRule implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Ad account ID.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * Ad ID for engagement audience filter.
   */
  @JsonProperty("ad_id")
  private List<String> adId = new ArrayList<>();

  /**
   * Campaign ID for engagement audience filter.
   */
  @JsonProperty("campaign_id")
  private List<String> campaignId = new ArrayList<>();

  /**
   * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
   */
  @JsonProperty("country")
  private String country;

  /**
   * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
   */
  @JsonProperty("customer_list_id")
  private String customerListId;

  /**
   * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
   */
  @JsonProperty("engagement_domain")
  private List<String> engagementDomain = new ArrayList<>();

  /**
   * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.
   */
  @JsonProperty("engagement_type")
  private String engagementType;

  /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   */
  @JsonProperty("engager_type")
  private Integer engagerType;

  /**
   * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
   */
  @JsonProperty("event")
  private String event;

  @JsonProperty("event_data")
  private EventData eventData;

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
   */
  @JsonProperty("event_source")
  private Object eventSource;

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   */
  @JsonProperty("ingestion_source")
  private Object ingestionSource;

  /**
   * Objective for engagement audience filter.
   */
  @JsonProperty("objective_type")
  private List<ObjectiveType> objectiveType = new ArrayList<>();

  /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   */
  @JsonProperty("percentage")
  private Integer percentage;

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
   */
  @JsonProperty("pin_id")
  private List<String> pinId = new ArrayList<>();

  /**
   * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
   */
  @JsonProperty("prefill")
  private Boolean prefill;

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
   */
  @JsonProperty("retention_days")
  private Integer retentionDays;

  /**
   * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.
   */
  @JsonProperty("seed_id")
  private List<String> seedId = new ArrayList<>();

  /**
   * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
   */
  @JsonProperty("url")
  private List<String> url = new ArrayList<>();

  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
   */
  @JsonProperty("visitor_source_id")
  private String visitorSourceId;

  /**
   * Ad account ID.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Ad ID for engagement audience filter.
   * @return adId
   */
  public List<String> getAdId() {
    return adId;
  }

  public void setAdId(List<String> adId) {
    this.adId = adId;
  }

  /**
   * Campaign ID for engagement audience filter.
   * @return campaignId
   */
  public List<String> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
   * @return country
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
   * @return customerListId
   */
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
   * @return engagementDomain
   */
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }

  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  /**
   * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.
   * @return engagementType
   */
  public String getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   * @return engagerType
   */
  public Integer getEngagerType() {
    return engagerType;
  }

  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  /**
   * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
   * @return event
   */
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  /**
   * 
   * @return eventData
   */
  public EventData getEventData() {
    return eventData;
  }

  public void setEventData(EventData eventData) {
    this.eventData = eventData;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
   * @return eventSource
   */
  public Object getEventSource() {
    return eventSource;
  }

  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   * @return ingestionSource
   */
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Objective for engagement audience filter.
   * @return objectiveType
   */
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   * @return percentage
   */
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
   * @return pinId
   */
  public List<String> getPinId() {
    return pinId;
  }

  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }

  /**
   * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
   * @return prefill
   */
  public Boolean getPrefill() {
    return prefill;
  }

  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
   * @return retentionDays
   */
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  /**
   * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.
   * @return seedId
   */
  public List<String> getSeedId() {
    return seedId;
  }

  public void setSeedId(List<String> seedId) {
    this.seedId = seedId;
  }

  /**
   * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
   * @return url
   */
  public List<String> getUrl() {
    return url;
  }

  public void setUrl(List<String> url) {
    this.url = url;
  }

  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
   * @return visitorSourceId
   */
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
    AudienceRule audienceRule = (AudienceRule) o;
    return Objects.equals(this.adAccountId, audienceRule.adAccountId) &&
        Objects.equals(this.adId, audienceRule.adId) &&
        Objects.equals(this.campaignId, audienceRule.campaignId) &&
        Objects.equals(this.country, audienceRule.country) &&
        Objects.equals(this.customerListId, audienceRule.customerListId) &&
        Objects.equals(this.engagementDomain, audienceRule.engagementDomain) &&
        Objects.equals(this.engagementType, audienceRule.engagementType) &&
        Objects.equals(this.engagerType, audienceRule.engagerType) &&
        Objects.equals(this.event, audienceRule.event) &&
        Objects.equals(this.eventData, audienceRule.eventData) &&
        Objects.equals(this.eventSource, audienceRule.eventSource) &&
        Objects.equals(this.ingestionSource, audienceRule.ingestionSource) &&
        Objects.equals(this.objectiveType, audienceRule.objectiveType) &&
        Objects.equals(this.percentage, audienceRule.percentage) &&
        Objects.equals(this.pinId, audienceRule.pinId) &&
        Objects.equals(this.prefill, audienceRule.prefill) &&
        Objects.equals(this.retentionDays, audienceRule.retentionDays) &&
        Objects.equals(this.seedId, audienceRule.seedId) &&
        Objects.equals(this.url, audienceRule.url) &&
        Objects.equals(this.visitorSourceId, audienceRule.visitorSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adId, campaignId, country, customerListId, engagementDomain, engagementType, engagerType, event, eventData, eventSource, ingestionSource, objectiveType, percentage, pinId, prefill, retentionDays, seedId, url, visitorSourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceRule {\n");
    
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
