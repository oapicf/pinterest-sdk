/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceObjectiveType;
import org.openapitools.model.EventData;



/**
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */

@ApiModel(description = "JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudienceRule   {
  
  private String adAccountId;
  private List<String> adId = new ArrayList<>();
  private List<String> campaignId = new ArrayList<>();
  private String country;
  private String customerListId;
  private List<String> engagementDomain = new ArrayList<>();
  private String engagementType;
  private Integer engagerType;
  private String event;
  private EventData eventData;
  private Object eventSource;
  private Object ingestionSource;
  private List<AudienceObjectiveType> objectiveType = new ArrayList<>();
  private Integer percentage;
  private List<String> pinId = new ArrayList<>();
  private Boolean prefill;
  private Integer retentionDays;
  private List<String> seedId = new ArrayList<>();
  private List<String> url = new ArrayList<>();
  private String visitorSourceId;

  /**
   * Ad account ID.
   */
  public AdAccountsAudienceRule adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Ad ID for engagement audience filter.
   */
  public AdAccountsAudienceRule adId(List<String> adId) {
    this.adId = adId;
    return this;
  }

  
  @ApiModelProperty(value = "Ad ID for engagement audience filter.")
  @JsonProperty("ad_id")
  public List<String> getAdId() {
    return adId;
  }
  public void setAdId(List<String> adId) {
    this.adId = adId;
  }

  /**
   * Campaign ID for engagement audience filter.
   */
  public AdAccountsAudienceRule campaignId(List<String> campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(value = "Campaign ID for engagement audience filter.")
  @JsonProperty("campaign_id")
  public List<String> getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Valid countries include: \"US\", \"CA\", and \"GB\".
   */
  public AdAccountsAudienceRule country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "Valid countries include: \"US\", \"CA\", and \"GB\".")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Customer list ID. For CUSTOMER_LIST `audience_type`.
   */
  public AdAccountsAudienceRule customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  
  @ApiModelProperty(value = "Customer list ID. For CUSTOMER_LIST `audience_type`.")
  @JsonProperty("customer_list_id")
  public String getCustomerListId() {
    return customerListId;
  }
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
   */
  public AdAccountsAudienceRule engagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
    return this;
  }

  
  @ApiModelProperty(value = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.")
  @JsonProperty("engagement_domain")
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }
  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  /**
   * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
   */
  public AdAccountsAudienceRule engagementType(String engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  
  @ApiModelProperty(value = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.")
  @JsonProperty("engagement_type")
  public String getEngagementType() {
    return engagementType;
  }
  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   */
  public AdAccountsAudienceRule engagerType(Integer engagerType) {
    this.engagerType = engagerType;
    return this;
  }

  
  @ApiModelProperty(value = "Optional for ENGAGEMENT. Engager type value should be 1-2.")
  @JsonProperty("engager_type")
  public Integer getEngagerType() {
    return engagerType;
  }
  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  /**
   * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
   */
  public AdAccountsAudienceRule event(String event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(value = "A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.")
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }
  public void setEvent(String event) {
    this.event = event;
  }

  /**
   */
  public AdAccountsAudienceRule eventData(EventData eventData) {
    this.eventData = eventData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event_data")
  public EventData getEventData() {
    return eventData;
  }
  public void setEventData(EventData eventData) {
    this.eventData = eventData;
  }

  /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
   */
  public AdAccountsAudienceRule eventSource(Object eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  
  @ApiModelProperty(value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline")
  @JsonProperty("event_source")
  public Object getEventSource() {
    return eventSource;
  }
  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   */
  public AdAccountsAudienceRule ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  
  @ApiModelProperty(value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api")
  @JsonProperty("ingestion_source")
  public Object getIngestionSource() {
    return ingestionSource;
  }
  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Objective for engagement audience filter.
   */
  public AdAccountsAudienceRule objectiveType(List<AudienceObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(value = "Objective for engagement audience filter.")
  @JsonProperty("objective_type")
  public List<AudienceObjectiveType> getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(List<AudienceObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   */
  public AdAccountsAudienceRule percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

  
  @ApiModelProperty(value = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.")
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
   */
  public AdAccountsAudienceRule pinId(List<String> pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(value = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")
  @JsonProperty("pin_id")
  public List<String> getPinId() {
    return pinId;
  }
  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }

  /**
   * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
   */
  public AdAccountsAudienceRule prefill(Boolean prefill) {
    this.prefill = prefill;
    return this;
  }

  
  @ApiModelProperty(value = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.")
  @JsonProperty("prefill")
  public Boolean getPrefill() {
    return prefill;
  }
  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
   */
  public AdAccountsAudienceRule retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.")
  @JsonProperty("retention_days")
  public Integer getRetentionDays() {
    return retentionDays;
  }
  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  /**
   * Audience ID(s). For ACTALIKE `audience_type`.
   */
  public AdAccountsAudienceRule seedId(List<String> seedId) {
    this.seedId = seedId;
    return this;
  }

  
  @ApiModelProperty(value = "Audience ID(s). For ACTALIKE `audience_type`.")
  @JsonProperty("seed_id")
  public List<String> getSeedId() {
    return seedId;
  }
  public void setSeedId(List<String> seedId) {
    this.seedId = seedId;
  }

  /**
   * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
   */
  public AdAccountsAudienceRule url(List<String> url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}")
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }
  public void setUrl(List<String> url) {
    this.url = url;
  }

  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
   */
  public AdAccountsAudienceRule visitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
  }

  
  @ApiModelProperty(value = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")
  @JsonProperty("visitor_source_id")
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

