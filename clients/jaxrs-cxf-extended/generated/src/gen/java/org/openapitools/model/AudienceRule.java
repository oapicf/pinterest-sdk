package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.PinterestTagEventData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
 */
@ApiModel(description="JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.")

public class AudienceRule  {
  
 /**
  * Valid countries include: \"US\", \"CA\", and \"GB\".
  */
  @ApiModelProperty(example = "US", value = "Valid countries include: \"US\", \"CA\", and \"GB\".")
  private String country;

 /**
  * Customer list ID. For CUSTOMER_LIST `audience_type`.
  */
  @ApiModelProperty(example = "5497558859876", value = "Customer list ID. For CUSTOMER_LIST `audience_type`.")
  private String customerListId;

 /**
  * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
  */
  @ApiModelProperty(example = "[\"www.somedomain.com\"]", value = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.")
  private List<String> engagementDomain = new ArrayList<>();

 /**
  * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
  */
  @ApiModelProperty(example = "click", value = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. ")
  private String engagementType;

 /**
  * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
  */
  @ApiModelProperty(example = "checkout", value = "A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.")
  private String event;

  @ApiModelProperty(value = "")
  @Valid
  private PinterestTagEventData eventData;

 /**
  * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
  */
  @ApiModelProperty(example = "3", value = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.")
  private Integer percentage;

 /**
  * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
  */
  @ApiModelProperty(example = "[\"34567\"]", value = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")
  private List<@Pattern(regexp = "^\\d+$")String> pinId = new ArrayList<>();

 /**
  * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
  */
  @ApiModelProperty(example = "true", value = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.")
  private Boolean prefill;

 /**
  * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
  */
  @ApiModelProperty(example = "30", value = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.")
  private Integer retentionDays;

 /**
  * Audience ID(s). For ACTALIKE `audience_type`. 
  */
  @ApiModelProperty(example = "[\"2542620639259\",\"2542620639261\"]", value = "Audience ID(s). For ACTALIKE `audience_type`. ")
  private List<@Pattern(regexp = "^\\d+$")String> seedId = new ArrayList<>();

 /**
  * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
  */
  @ApiModelProperty(value = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}")
  private List<String> url = new ArrayList<>();

 /**
  * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
  */
  @ApiModelProperty(example = "549755885175", value = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")
  private String visitorSourceId;

 /**
  * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
  */
  @ApiModelProperty(example = "{\"=\":[\"web\",\"mobile\"]}", value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline")
  private Object eventSource;

 /**
  * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
  */
  @ApiModelProperty(example = "{\"=\":[\"tag\"]}", value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api")
  private Object ingestionSource;

 /**
  * Optional for ENGAGEMENT. Engager type value should be 1-2.
  */
  @ApiModelProperty(example = "1", value = "Optional for ENGAGEMENT. Engager type value should be 1-2.")
  private Integer engagerType;

 /**
  * Campaign ID for engagement audience filter.
  */
  @ApiModelProperty(example = "[\"626744528398\"]", value = "Campaign ID for engagement audience filter.")
  private List<@Pattern(regexp = "^\\d+$")String> campaignId = new ArrayList<>();

 /**
  * Ad ID for engagement audience filter.
  */
  @ApiModelProperty(example = "[\"687201361754\"]", value = "Ad ID for engagement audience filter.")
  private List<@Pattern(regexp = "^\\d+$")String> adId = new ArrayList<>();

 /**
  * Objective for engagement audience filter.
  */
  @ApiModelProperty(example = "[\"AWARENESS\"]", value = "Objective for engagement audience filter.")
  @Valid
  private List<ObjectiveType> objectiveType = new ArrayList<>();

 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  private String adAccountId;
 /**
  * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
  * @return country
  */
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public AudienceRule country(String country) {
    this.country = country;
    return this;
  }

 /**
  * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
  * @return customerListId
  */
  @JsonProperty("customer_list_id")
 @Pattern(regexp="^\\d+$")  public String getCustomerListId() {
    return customerListId;
  }

  /**
   * Sets the <code>customerListId</code> property.
   */
 public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * Sets the <code>customerListId</code> property.
   */
  public AudienceRule customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

 /**
  * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
  * @return engagementDomain
  */
  @JsonProperty("engagement_domain")
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }

  /**
   * Sets the <code>engagementDomain</code> property.
   */
 public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  /**
   * Sets the <code>engagementDomain</code> property.
   */
  public AudienceRule engagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
    return this;
  }

  /**
   * Adds a new item to the <code>engagementDomain</code> list.
   */
  public AudienceRule addEngagementDomainItem(String engagementDomainItem) {
    this.engagementDomain.add(engagementDomainItem);
    return this;
  }

 /**
  * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. 
  * @return engagementType
  */
  @JsonProperty("engagement_type")
  public String getEngagementType() {
    return engagementType;
  }

  /**
   * Sets the <code>engagementType</code> property.
   */
 public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * Sets the <code>engagementType</code> property.
   */
  public AudienceRule engagementType(String engagementType) {
    this.engagementType = engagementType;
    return this;
  }

 /**
  * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
  * @return event
  */
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }

  /**
   * Sets the <code>event</code> property.
   */
 public void setEvent(String event) {
    this.event = event;
  }

  /**
   * Sets the <code>event</code> property.
   */
  public AudienceRule event(String event) {
    this.event = event;
    return this;
  }

 /**
  * Get eventData
  * @return eventData
  */
  @JsonProperty("event_data")
  public PinterestTagEventData getEventData() {
    return eventData;
  }

  /**
   * Sets the <code>eventData</code> property.
   */
 public void setEventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
  }

  /**
   * Sets the <code>eventData</code> property.
   */
  public AudienceRule eventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
    return this;
  }

 /**
  * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
  * @return percentage
  */
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }

  /**
   * Sets the <code>percentage</code> property.
   */
 public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * Sets the <code>percentage</code> property.
   */
  public AudienceRule percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

 /**
  * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
  * @return pinId
  */
  @JsonProperty("pin_id")
  public List<@Pattern(regexp = "^\\d+$")String> getPinId() {
    return pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   */
 public void setPinId(List<@Pattern(regexp = "^\\d+$")String> pinId) {
    this.pinId = pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   */
  public AudienceRule pinId(List<@Pattern(regexp = "^\\d+$")String> pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Adds a new item to the <code>pinId</code> list.
   */
  public AudienceRule addPinIdItem(String pinIdItem) {
    this.pinId.add(pinIdItem);
    return this;
  }

 /**
  * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
  * @return prefill
  */
  @JsonProperty("prefill")
  public Boolean getPrefill() {
    return prefill;
  }

  /**
   * Sets the <code>prefill</code> property.
   */
 public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  /**
   * Sets the <code>prefill</code> property.
   */
  public AudienceRule prefill(Boolean prefill) {
    this.prefill = prefill;
    return this;
  }

 /**
  * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
  * @return retentionDays
  */
  @JsonProperty("retention_days")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  /**
   * Sets the <code>retentionDays</code> property.
   */
 public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  /**
   * Sets the <code>retentionDays</code> property.
   */
  public AudienceRule retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

 /**
  * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. 
  * @return seedId
  */
  @JsonProperty("seed_id")
  public List<@Pattern(regexp = "^\\d+$")String> getSeedId() {
    return seedId;
  }

  /**
   * Sets the <code>seedId</code> property.
   */
 public void setSeedId(List<@Pattern(regexp = "^\\d+$")String> seedId) {
    this.seedId = seedId;
  }

  /**
   * Sets the <code>seedId</code> property.
   */
  public AudienceRule seedId(List<@Pattern(regexp = "^\\d+$")String> seedId) {
    this.seedId = seedId;
    return this;
  }

  /**
   * Adds a new item to the <code>seedId</code> list.
   */
  public AudienceRule addSeedIdItem(String seedIdItem) {
    this.seedId.add(seedIdItem);
    return this;
  }

 /**
  * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
  * @return url
  */
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(List<String> url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public AudienceRule url(List<String> url) {
    this.url = url;
    return this;
  }

  /**
   * Adds a new item to the <code>url</code> list.
   */
  public AudienceRule addUrlItem(String urlItem) {
    this.url.add(urlItem);
    return this;
  }

 /**
  * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
  * @return visitorSourceId
  */
  @JsonProperty("visitor_source_id")
 @Pattern(regexp="^\\d+$")  public String getVisitorSourceId() {
    return visitorSourceId;
  }

  /**
   * Sets the <code>visitorSourceId</code> property.
   */
 public void setVisitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }

  /**
   * Sets the <code>visitorSourceId</code> property.
   */
  public AudienceRule visitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
  }

 /**
  * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
  * @return eventSource
  */
  @JsonProperty("event_source")
  public Object getEventSource() {
    return eventSource;
  }

  /**
   * Sets the <code>eventSource</code> property.
   */
 public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Sets the <code>eventSource</code> property.
   */
  public AudienceRule eventSource(Object eventSource) {
    this.eventSource = eventSource;
    return this;
  }

 /**
  * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
  * @return ingestionSource
  */
  @JsonProperty("ingestion_source")
  public Object getIngestionSource() {
    return ingestionSource;
  }

  /**
   * Sets the <code>ingestionSource</code> property.
   */
 public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Sets the <code>ingestionSource</code> property.
   */
  public AudienceRule ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

 /**
  * Optional for ENGAGEMENT. Engager type value should be 1-2.
  * @return engagerType
  */
  @JsonProperty("engager_type")
  public Integer getEngagerType() {
    return engagerType;
  }

  /**
   * Sets the <code>engagerType</code> property.
   */
 public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  /**
   * Sets the <code>engagerType</code> property.
   */
  public AudienceRule engagerType(Integer engagerType) {
    this.engagerType = engagerType;
    return this;
  }

 /**
  * Campaign ID for engagement audience filter.
  * @return campaignId
  */
  @JsonProperty("campaign_id")
  public List<@Pattern(regexp = "^\\d+$")String> getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(List<@Pattern(regexp = "^\\d+$")String> campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public AudienceRule campaignId(List<@Pattern(regexp = "^\\d+$")String> campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignId</code> list.
   */
  public AudienceRule addCampaignIdItem(String campaignIdItem) {
    this.campaignId.add(campaignIdItem);
    return this;
  }

 /**
  * Ad ID for engagement audience filter.
  * @return adId
  */
  @JsonProperty("ad_id")
  public List<@Pattern(regexp = "^\\d+$")String> getAdId() {
    return adId;
  }

  /**
   * Sets the <code>adId</code> property.
   */
 public void setAdId(List<@Pattern(regexp = "^\\d+$")String> adId) {
    this.adId = adId;
  }

  /**
   * Sets the <code>adId</code> property.
   */
  public AudienceRule adId(List<@Pattern(regexp = "^\\d+$")String> adId) {
    this.adId = adId;
    return this;
  }

  /**
   * Adds a new item to the <code>adId</code> list.
   */
  public AudienceRule addAdIdItem(String adIdItem) {
    this.adId.add(adIdItem);
    return this;
  }

 /**
  * Objective for engagement audience filter.
  * @return objectiveType
  */
  @JsonProperty("objective_type")
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
 public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
  public AudienceRule objectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Adds a new item to the <code>objectiveType</code> list.
   */
  public AudienceRule addObjectiveTypeItem(ObjectiveType objectiveTypeItem) {
    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

 /**
  * Ad account ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public AudienceRule adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

