package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceObjectiveType;
import org.openapitools.model.EventData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */
@ApiModel(description="JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).")

public class AdAccountsAudienceRule  {
  
 /**
  * Ad account ID.
  */
  @ApiModelProperty(value = "Ad account ID.")

  private String adAccountId;

 /**
  * Ad ID for engagement audience filter.
  */
  @ApiModelProperty(value = "Ad ID for engagement audience filter.")

  private List<String> adId = new ArrayList<>();

 /**
  * Campaign ID for engagement audience filter.
  */
  @ApiModelProperty(value = "Campaign ID for engagement audience filter.")

  private List<String> campaignId = new ArrayList<>();

 /**
  * Valid countries include: \"US\", \"CA\", and \"GB\".
  */
  @ApiModelProperty(value = "Valid countries include: \"US\", \"CA\", and \"GB\".")

  private String country;

 /**
  * Customer list ID. For CUSTOMER_LIST `audience_type`.
  */
  @ApiModelProperty(value = "Customer list ID. For CUSTOMER_LIST `audience_type`.")

  private String customerListId;

 /**
  * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
  */
  @ApiModelProperty(value = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.")

  private List<String> engagementDomain = new ArrayList<>();

 /**
  * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
  */
  @ApiModelProperty(value = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.")

  private String engagementType;

 /**
  * Optional for ENGAGEMENT. Engager type value should be 1-2.
  */
  @ApiModelProperty(value = "Optional for ENGAGEMENT. Engager type value should be 1-2.")

  private Integer engagerType;

 /**
  * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
  */
  @ApiModelProperty(value = "A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.")

  private String event;

  @ApiModelProperty(value = "")

  @Valid

  private EventData eventData;

 /**
  * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
  */
  @ApiModelProperty(value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline")

  private Object eventSource;

 /**
  * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
  */
  @ApiModelProperty(value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api")

  private Object ingestionSource;

 /**
  * Objective for engagement audience filter.
  */
  @ApiModelProperty(value = "Objective for engagement audience filter.")

  @Valid

  private List<AudienceObjectiveType> objectiveType = new ArrayList<>();

 /**
  * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
  */
  @ApiModelProperty(value = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.")

  private Integer percentage;

 /**
  * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
  */
  @ApiModelProperty(value = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")

  private List<String> pinId = new ArrayList<>();

 /**
  * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
  */
  @ApiModelProperty(value = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.")

  private Boolean prefill;

 /**
  * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
  */
  @ApiModelProperty(value = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.")

  private Integer retentionDays;

 /**
  * Audience ID(s). For ACTALIKE `audience_type`.
  */
  @ApiModelProperty(value = "Audience ID(s). For ACTALIKE `audience_type`.")

  private List<String> seedId = new ArrayList<>();

 /**
  * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
  */
  @ApiModelProperty(value = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}")

  private List<String> url = new ArrayList<>();

 /**
  * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
  */
  @ApiModelProperty(value = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")

  private String visitorSourceId;
 /**
   * Ad account ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountsAudienceRule adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Ad ID for engagement audience filter.
   * @return adId
  **/
  @JsonProperty("ad_id")
  public List<String> getAdId() {
    return adId;
  }

  public void setAdId(List<String> adId) {
    this.adId = adId;
  }

  public AdAccountsAudienceRule adId(List<String> adId) {
    this.adId = adId;
    return this;
  }

  public AdAccountsAudienceRule addAdIdItem(String adIdItem) {
    this.adId.add(adIdItem);
    return this;
  }

 /**
   * Campaign ID for engagement audience filter.
   * @return campaignId
  **/
  @JsonProperty("campaign_id")
  public List<String> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }

  public AdAccountsAudienceRule campaignId(List<String> campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdAccountsAudienceRule addCampaignIdItem(String campaignIdItem) {
    this.campaignId.add(campaignIdItem);
    return this;
  }

 /**
   * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AdAccountsAudienceRule country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
   * @return customerListId
  **/
  @JsonProperty("customer_list_id")
 @Pattern(regexp="^\\d+$")  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  public AdAccountsAudienceRule customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

 /**
   * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
   * @return engagementDomain
  **/
  @JsonProperty("engagement_domain")
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }

  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  public AdAccountsAudienceRule engagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
    return this;
  }

  public AdAccountsAudienceRule addEngagementDomainItem(String engagementDomainItem) {
    this.engagementDomain.add(engagementDomainItem);
    return this;
  }

 /**
   * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.
   * @return engagementType
  **/
  @JsonProperty("engagement_type")
  public String getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  public AdAccountsAudienceRule engagementType(String engagementType) {
    this.engagementType = engagementType;
    return this;
  }

 /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   * @return engagerType
  **/
  @JsonProperty("engager_type")
  public Integer getEngagerType() {
    return engagerType;
  }

  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  public AdAccountsAudienceRule engagerType(Integer engagerType) {
    this.engagerType = engagerType;
    return this;
  }

 /**
   * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
   * @return event
  **/
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public AdAccountsAudienceRule event(String event) {
    this.event = event;
    return this;
  }

 /**
   * Get eventData
   * @return eventData
  **/
  @JsonProperty("event_data")
  public EventData getEventData() {
    return eventData;
  }

  public void setEventData(EventData eventData) {
    this.eventData = eventData;
  }

  public AdAccountsAudienceRule eventData(EventData eventData) {
    this.eventData = eventData;
    return this;
  }

 /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
   * @return eventSource
  **/
  @JsonProperty("event_source")
  public Object getEventSource() {
    return eventSource;
  }

  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  public AdAccountsAudienceRule eventSource(Object eventSource) {
    this.eventSource = eventSource;
    return this;
  }

 /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   * @return ingestionSource
  **/
  @JsonProperty("ingestion_source")
  public Object getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  public AdAccountsAudienceRule ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

 /**
   * Objective for engagement audience filter.
   * @return objectiveType
  **/
  @JsonProperty("objective_type")
  public List<AudienceObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(List<AudienceObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public AdAccountsAudienceRule objectiveType(List<AudienceObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  public AdAccountsAudienceRule addObjectiveTypeItem(AudienceObjectiveType objectiveTypeItem) {
    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

 /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   * @return percentage
  **/
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public AdAccountsAudienceRule percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

 /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
   * @return pinId
  **/
  @JsonProperty("pin_id")
  public List<String> getPinId() {
    return pinId;
  }

  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }

  public AdAccountsAudienceRule pinId(List<String> pinId) {
    this.pinId = pinId;
    return this;
  }

  public AdAccountsAudienceRule addPinIdItem(String pinIdItem) {
    this.pinId.add(pinIdItem);
    return this;
  }

 /**
   * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
   * @return prefill
  **/
  @JsonProperty("prefill")
  public Boolean getPrefill() {
    return prefill;
  }

  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  public AdAccountsAudienceRule prefill(Boolean prefill) {
    this.prefill = prefill;
    return this;
  }

 /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
   * @return retentionDays
  **/
  @JsonProperty("retention_days")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public AdAccountsAudienceRule retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

 /**
   * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.
   * @return seedId
  **/
  @JsonProperty("seed_id")
  public List<String> getSeedId() {
    return seedId;
  }

  public void setSeedId(List<String> seedId) {
    this.seedId = seedId;
  }

  public AdAccountsAudienceRule seedId(List<String> seedId) {
    this.seedId = seedId;
    return this;
  }

  public AdAccountsAudienceRule addSeedIdItem(String seedIdItem) {
    this.seedId.add(seedIdItem);
    return this;
  }

 /**
   * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
   * @return url
  **/
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }

  public void setUrl(List<String> url) {
    this.url = url;
  }

  public AdAccountsAudienceRule url(List<String> url) {
    this.url = url;
    return this;
  }

  public AdAccountsAudienceRule addUrlItem(String urlItem) {
    this.url.add(urlItem);
    return this;
  }

 /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
   * @return visitorSourceId
  **/
  @JsonProperty("visitor_source_id")
  public String getVisitorSourceId() {
    return visitorSourceId;
  }

  public void setVisitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }

  public AdAccountsAudienceRule visitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

