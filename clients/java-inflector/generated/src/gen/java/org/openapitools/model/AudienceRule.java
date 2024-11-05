package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.PinterestTagEventData;



/**
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 **/

@ApiModel(description = "JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceRule   {
  @JsonProperty("country")
  private String country;

  @JsonProperty("customer_list_id")
  private String customerListId;

  @JsonProperty("engagement_domain")
  private List<String> engagementDomain = null;

  @JsonProperty("engagement_type")
  private String engagementType;

  @JsonProperty("event")
  private String event;

  @JsonProperty("event_data")
  private PinterestTagEventData eventData;

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

  @JsonProperty("event_source")
  private Object eventSource;

  @JsonProperty("ingestion_source")
  private Object ingestionSource;

  @JsonProperty("engager_type")
  private Integer engagerType;

  @JsonProperty("campaign_id")
  private List<String> campaignId = null;

  @JsonProperty("ad_id")
  private List<String> adId = null;

  @JsonProperty("objective_type")
  private List<ObjectiveType> objectiveType = null;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * Valid countries include: \"US\", \"CA\", and \"GB\".
   **/
  public AudienceRule country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(example = "US", value = "Valid countries include: \"US\", \"CA\", and \"GB\".")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Customer list ID. For CUSTOMER_LIST `audience_type`.
   **/
  public AudienceRule customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  
  @ApiModelProperty(example = "5497558859876", value = "Customer list ID. For CUSTOMER_LIST `audience_type`.")
  @JsonProperty("customer_list_id")
  public String getCustomerListId() {
    return customerListId;
  }
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
   **/
  public AudienceRule engagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
    return this;
  }

  
  @ApiModelProperty(example = "[\"www.somedomain.com\"]", value = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.")
  @JsonProperty("engagement_domain")
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }
  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  /**
   * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
   **/
  public AudienceRule engagementType(String engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  
  @ApiModelProperty(example = "click", value = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. ")
  @JsonProperty("engagement_type")
  public String getEngagementType() {
    return engagementType;
  }
  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
   **/
  public AudienceRule event(String event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(example = "checkout", value = "A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.")
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }
  public void setEvent(String event) {
    this.event = event;
  }

  /**
   **/
  public AudienceRule eventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event_data")
  public PinterestTagEventData getEventData() {
    return eventData;
  }
  public void setEventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
  }

  /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   **/
  public AudienceRule percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

  
  @ApiModelProperty(example = "3", value = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.")
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
   **/
  public AudienceRule pinId(List<String> pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"34567\"]", value = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")
  @JsonProperty("pin_id")
  public List<String> getPinId() {
    return pinId;
  }
  public void setPinId(List<String> pinId) {
    this.pinId = pinId;
  }

  /**
   * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
   **/
  public AudienceRule prefill(Boolean prefill) {
    this.prefill = prefill;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.")
  @JsonProperty("prefill")
  public Boolean getPrefill() {
    return prefill;
  }
  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
   **/
  public AudienceRule retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  
  @ApiModelProperty(example = "30", value = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.")
  @JsonProperty("retention_days")
  public Integer getRetentionDays() {
    return retentionDays;
  }
  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  /**
   * Audience ID(s). For ACTALIKE `audience_type`. 
   **/
  public AudienceRule seedId(List<String> seedId) {
    this.seedId = seedId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"2542620639259\",\"2542620639261\"]", value = "Audience ID(s). For ACTALIKE `audience_type`. ")
  @JsonProperty("seed_id")
  public List<String> getSeedId() {
    return seedId;
  }
  public void setSeedId(List<String> seedId) {
    this.seedId = seedId;
  }

  /**
   * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
   **/
  public AudienceRule url(List<String> url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}")
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }
  public void setUrl(List<String> url) {
    this.url = url;
  }

  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
   **/
  public AudienceRule visitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")
  @JsonProperty("visitor_source_id")
  public String getVisitorSourceId() {
    return visitorSourceId;
  }
  public void setVisitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }

  /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
   **/
  public AudienceRule eventSource(Object eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  
  @ApiModelProperty(example = "{\"=\":[\"web\",\"mobile\"]}", value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline")
  @JsonProperty("event_source")
  public Object getEventSource() {
    return eventSource;
  }
  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   **/
  public AudienceRule ingestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  
  @ApiModelProperty(example = "{\"=\":[\"tag\"]}", value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api")
  @JsonProperty("ingestion_source")
  public Object getIngestionSource() {
    return ingestionSource;
  }
  public void setIngestionSource(Object ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  /**
   * Optional for ENGAGEMENT. Engager type value should be 1-2.
   **/
  public AudienceRule engagerType(Integer engagerType) {
    this.engagerType = engagerType;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Optional for ENGAGEMENT. Engager type value should be 1-2.")
  @JsonProperty("engager_type")
  public Integer getEngagerType() {
    return engagerType;
  }
  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  /**
   * Campaign ID for engagement audience filter.
   **/
  public AudienceRule campaignId(List<String> campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"626744528398\"]", value = "Campaign ID for engagement audience filter.")
  @JsonProperty("campaign_id")
  public List<String> getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(List<String> campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Ad ID for engagement audience filter.
   **/
  public AudienceRule adId(List<String> adId) {
    this.adId = adId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"687201361754\"]", value = "Ad ID for engagement audience filter.")
  @JsonProperty("ad_id")
  public List<String> getAdId() {
    return adId;
  }
  public void setAdId(List<String> adId) {
    this.adId = adId;
  }

  /**
   * Objective for engagement audience filter.
   **/
  public AudienceRule objectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(example = "[\"AWARENESS\"]", value = "Objective for engagement audience filter.")
  @JsonProperty("objective_type")
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Ad account ID.
   **/
  public AudienceRule adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
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

