package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ObjectiveType;
import org.openapitools.server.api.model.PinterestTagEventData;

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceRule   {
  
  private String country;
  private String customerListId;
  private List<String> engagementDomain;
  private String engagementType;
  private String event;
  private PinterestTagEventData eventData;
  private Integer percentage;
  private List<String> pinId;
  private Boolean prefill;
  private Integer retentionDays;
  private List<String> seedId;
  private List<String> url;
  private String visitorSourceId;
  private Object eventSource;
  private Object ingestionSource;
  private Integer engagerType;
  private List<String> campaignId;
  private List<String> adId;
  private List<ObjectiveType> objectiveType;
  private String adAccountId;

  public AudienceRule () {

  }

  public AudienceRule (String country, String customerListId, List<String> engagementDomain, String engagementType, String event, PinterestTagEventData eventData, Integer percentage, List<String> pinId, Boolean prefill, Integer retentionDays, List<String> seedId, List<String> url, String visitorSourceId, Object eventSource, Object ingestionSource, Integer engagerType, List<String> campaignId, List<String> adId, List<ObjectiveType> objectiveType, String adAccountId) {
    this.country = country;
    this.customerListId = customerListId;
    this.engagementDomain = engagementDomain;
    this.engagementType = engagementType;
    this.event = event;
    this.eventData = eventData;
    this.percentage = percentage;
    this.pinId = pinId;
    this.prefill = prefill;
    this.retentionDays = retentionDays;
    this.seedId = seedId;
    this.url = url;
    this.visitorSourceId = visitorSourceId;
    this.eventSource = eventSource;
    this.ingestionSource = ingestionSource;
    this.engagerType = engagerType;
    this.campaignId = campaignId;
    this.adId = adId;
    this.objectiveType = objectiveType;
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

    
  @JsonProperty("customer_list_id")
  public String getCustomerListId() {
    return customerListId;
  }
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

    
  @JsonProperty("engagement_domain")
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }
  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

    
  @JsonProperty("engagement_type")
  public String getEngagementType() {
    return engagementType;
  }
  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

    
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }
  public void setEvent(String event) {
    this.event = event;
  }

    
  @JsonProperty("event_data")
  public PinterestTagEventData getEventData() {
    return eventData;
  }
  public void setEventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
  }

    
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

    
  @JsonProperty("pin_id")
  public List<String> getPinId() {
    return pinId;
  }
  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }

    
  @JsonProperty("prefill")
  public Boolean getPrefill() {
    return prefill;
  }
  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

    
  @JsonProperty("retention_days")
  public Integer getRetentionDays() {
    return retentionDays;
  }
  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

    
  @JsonProperty("seed_id")
  public List<String> getSeedId() {
    return seedId;
  }
  public void setSeedId(List<String> seedId) {
    this.seedId = seedId;
  }

    
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }
  public void setUrl(List<String> url) {
    this.url = url;
  }

    
  @JsonProperty("visitor_source_id")
  public String getVisitorSourceId() {
    return visitorSourceId;
  }
  public void setVisitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }

    
  @JsonProperty("event_source")
  public Object getEventSource() {
    return eventSource;
  }
  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

    
  @JsonProperty("ingestion_source")
  public Object getIngestionSource() {
    return ingestionSource;
  }
  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

    
  @JsonProperty("engager_type")
  public Integer getEngagerType() {
    return engagerType;
  }
  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

    
  @JsonProperty("campaign_id")
  public List<String> getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("ad_id")
  public List<String> getAdId() {
    return adId;
  }
  public void setAdId(List<String> adId) {
    this.adId = adId;
  }

    
  @JsonProperty("objective_type")
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("ad_account_id")
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
