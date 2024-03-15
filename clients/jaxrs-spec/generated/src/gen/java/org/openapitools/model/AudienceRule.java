package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.PinterestTagEventData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 **/
@ApiModel(description = "JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.")
@JsonTypeName("AudienceRule")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceRule   {
  private @Valid String country;
  private @Valid String customerListId;
  private @Valid List<String> engagementDomain;
  private @Valid String engagementType;
  private @Valid String event;
  private @Valid PinterestTagEventData eventData;
  private @Valid Integer percentage;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> pinId;
  private @Valid Boolean prefill;
  private @Valid Integer retentionDays;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> seedId;
  private @Valid List<String> url;
  private @Valid String visitorSourceId;
  private @Valid Object eventSource;
  private @Valid Object ingestionSource;
  private @Valid Integer engagerType;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> campaignId;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> adId;
  private @Valid List<ObjectiveType> objectiveType;
  private @Valid String adAccountId;

  /**
   * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
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

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
   **/
  public AudienceRule customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  
  @ApiModelProperty(example = "5497558859876", value = "Customer list ID. For CUSTOMER_LIST `audience_type`.")
  @JsonProperty("customer_list_id")
 @Pattern(regexp="^\\d+$")  public String getCustomerListId() {
    return customerListId;
  }

  @JsonProperty("customer_list_id")
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
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

  @JsonProperty("engagement_domain")
  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  public AudienceRule addEngagementDomainItem(String engagementDomainItem) {
    if (this.engagementDomain == null) {
      this.engagementDomain = new ArrayList<>();
    }

    this.engagementDomain.add(engagementDomainItem);
    return this;
  }

  public AudienceRule removeEngagementDomainItem(String engagementDomainItem) {
    if (engagementDomainItem != null && this.engagementDomain != null) {
      this.engagementDomain.remove(engagementDomainItem);
    }

    return this;
  }
  /**
   * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. 
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

  @JsonProperty("engagement_type")
  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
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

  @JsonProperty("event")
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

  @JsonProperty("event_data")
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

  @JsonProperty("percentage")
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
   **/
  public AudienceRule pinId(List<@Pattern(regexp = "^\\d+$")String> pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"34567\"]", value = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")
  @JsonProperty("pin_id")
  public List< @Pattern(regexp="^\\d+$")String> getPinId() {
    return pinId;
  }

  @JsonProperty("pin_id")
  public void setPinId(List<@Pattern(regexp = "^\\d+$")String> pinId) {
    this.pinId = pinId;
  }

  public AudienceRule addPinIdItem(String pinIdItem) {
    if (this.pinId == null) {
      this.pinId = new ArrayList<>();
    }

    this.pinId.add(pinIdItem);
    return this;
  }

  public AudienceRule removePinIdItem(String pinIdItem) {
    if (pinIdItem != null && this.pinId != null) {
      this.pinId.remove(pinIdItem);
    }

    return this;
  }
  /**
   * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
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

  @JsonProperty("prefill")
  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
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

  @JsonProperty("retention_days")
  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  /**
   * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. 
   **/
  public AudienceRule seedId(List<@Pattern(regexp = "^\\d+$")String> seedId) {
    this.seedId = seedId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"2542620639259\",\"2542620639261\"]", value = "Audience ID(s). For ACTALIKE `audience_type`. ")
  @JsonProperty("seed_id")
  public List< @Pattern(regexp="^\\d+$")String> getSeedId() {
    return seedId;
  }

  @JsonProperty("seed_id")
  public void setSeedId(List<@Pattern(regexp = "^\\d+$")String> seedId) {
    this.seedId = seedId;
  }

  public AudienceRule addSeedIdItem(String seedIdItem) {
    if (this.seedId == null) {
      this.seedId = new ArrayList<>();
    }

    this.seedId.add(seedIdItem);
    return this;
  }

  public AudienceRule removeSeedIdItem(String seedIdItem) {
    if (seedIdItem != null && this.seedId != null) {
      this.seedId.remove(seedIdItem);
    }

    return this;
  }
  /**
   * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
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

  @JsonProperty("url")
  public void setUrl(List<String> url) {
    this.url = url;
  }

  public AudienceRule addUrlItem(String urlItem) {
    if (this.url == null) {
      this.url = new ArrayList<>();
    }

    this.url.add(urlItem);
    return this;
  }

  public AudienceRule removeUrlItem(String urlItem) {
    if (urlItem != null && this.url != null) {
      this.url.remove(urlItem);
    }

    return this;
  }
  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
   **/
  public AudienceRule visitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")
  @JsonProperty("visitor_source_id")
 @Pattern(regexp="^\\d+$")  public String getVisitorSourceId() {
    return visitorSourceId;
  }

  @JsonProperty("visitor_source_id")
  public void setVisitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
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

  @JsonProperty("event_source")
  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
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

  @JsonProperty("ingestion_source")
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

  @JsonProperty("engager_type")
  public void setEngagerType(Integer engagerType) {
    this.engagerType = engagerType;
  }

  /**
   * Campaign ID for engagement audience filter.
   **/
  public AudienceRule campaignId(List<@Pattern(regexp = "^\\d+$")String> campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"626744528398\"]", value = "Campaign ID for engagement audience filter.")
  @JsonProperty("campaign_id")
  public List< @Pattern(regexp="^\\d+$")String> getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaign_id")
  public void setCampaignId(List<@Pattern(regexp = "^\\d+$")String> campaignId) {
    this.campaignId = campaignId;
  }

  public AudienceRule addCampaignIdItem(String campaignIdItem) {
    if (this.campaignId == null) {
      this.campaignId = new ArrayList<>();
    }

    this.campaignId.add(campaignIdItem);
    return this;
  }

  public AudienceRule removeCampaignIdItem(String campaignIdItem) {
    if (campaignIdItem != null && this.campaignId != null) {
      this.campaignId.remove(campaignIdItem);
    }

    return this;
  }
  /**
   * Ad ID for engagement audience filter.
   **/
  public AudienceRule adId(List<@Pattern(regexp = "^\\d+$")String> adId) {
    this.adId = adId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"687201361754\"]", value = "Ad ID for engagement audience filter.")
  @JsonProperty("ad_id")
  public List< @Pattern(regexp="^\\d+$")String> getAdId() {
    return adId;
  }

  @JsonProperty("ad_id")
  public void setAdId(List<@Pattern(regexp = "^\\d+$")String> adId) {
    this.adId = adId;
  }

  public AudienceRule addAdIdItem(String adIdItem) {
    if (this.adId == null) {
      this.adId = new ArrayList<>();
    }

    this.adId.add(adIdItem);
    return this;
  }

  public AudienceRule removeAdIdItem(String adIdItem) {
    if (adIdItem != null && this.adId != null) {
      this.adId.remove(adIdItem);
    }

    return this;
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

  @JsonProperty("objective_type")
  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public AudienceRule addObjectiveTypeItem(ObjectiveType objectiveTypeItem) {
    if (this.objectiveType == null) {
      this.objectiveType = new ArrayList<>();
    }

    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

  public AudienceRule removeObjectiveTypeItem(ObjectiveType objectiveTypeItem) {
    if (objectiveTypeItem != null && this.objectiveType != null) {
      this.objectiveType.remove(objectiveTypeItem);
    }

    return this;
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
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
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


}

