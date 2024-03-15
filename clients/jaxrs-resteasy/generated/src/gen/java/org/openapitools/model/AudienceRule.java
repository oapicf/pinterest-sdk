package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import javax.validation.Valid;

@ApiModel(description="JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceRule   {
  
  private String country;
  private String customerListId;
  private List<String> engagementDomain;
  private String engagementType;
  private String event;
  private PinterestTagEventData eventData;
  private Integer percentage;
  private List<@Pattern(regexp = "^\\d+$")String> pinId;
  private Boolean prefill;
  private Integer retentionDays;
  private List<@Pattern(regexp = "^\\d+$")String> seedId;
  private List<String> url;
  private String visitorSourceId;
  private Object eventSource;
  private Object ingestionSource;
  private Integer engagerType;
  private List<@Pattern(regexp = "^\\d+$")String> campaignId;
  private List<@Pattern(regexp = "^\\d+$")String> adId;
  private List<ObjectiveType> objectiveType;
  private String adAccountId;

  /**
   * Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
   **/
  
  @ApiModelProperty(example = "US", value = "Valid countries include: \"US\", \"CA\", and \"GB\".")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
   **/
  
  @ApiModelProperty(example = "5497558859876", value = "Customer list ID. For CUSTOMER_LIST `audience_type`.")
  @JsonProperty("customer_list_id")
 @Pattern(regexp="^\\d+$")  public String getCustomerListId() {
    return customerListId;
  }
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
   **/
  
  @ApiModelProperty(example = "[\"www.somedomain.com\"]", value = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.")
  @JsonProperty("engagement_domain")
  public List<String> getEngagementDomain() {
    return engagementDomain;
  }
  public void setEngagementDomain(List<String> engagementDomain) {
    this.engagementDomain = engagementDomain;
  }

  /**
   * Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. 
   **/
  
  @ApiModelProperty(example = "click", value = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. ")
  @JsonProperty("engagement_type")
  public String getEngagementType() {
    return engagementType;
  }
  public void setEngagementType(String engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("event_data")
  @Valid
  public PinterestTagEventData getEventData() {
    return eventData;
  }
  public void setEventData(PinterestTagEventData eventData) {
    this.eventData = eventData;
  }

  /**
   * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
   **/
  
  @ApiModelProperty(example = "3", value = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.")
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
   **/
  
  @ApiModelProperty(example = "[\"34567\"]", value = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")
  @JsonProperty("pin_id")
  public List<@Pattern(regexp = "^\\d+$")String> getPinId() {
    return pinId;
  }
  public void setPinId(List<@Pattern(regexp = "^\\d+$")String> pinId) {
    this.pinId = pinId;
  }

  /**
   * Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
   **/
  
  @ApiModelProperty(example = "true", value = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.")
  @JsonProperty("prefill")
  public Boolean getPrefill() {
    return prefill;
  }
  public void setPrefill(Boolean prefill) {
    this.prefill = prefill;
  }

  /**
   * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
   **/
  
  @ApiModelProperty(example = "30", value = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.")
  @JsonProperty("retention_days")
  public Integer getRetentionDays() {
    return retentionDays;
  }
  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  /**
   * Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. 
   **/
  
  @ApiModelProperty(example = "[\"2542620639259\",\"2542620639261\"]", value = "Audience ID(s). For ACTALIKE `audience_type`. ")
  @JsonProperty("seed_id")
  public List<@Pattern(regexp = "^\\d+$")String> getSeedId() {
    return seedId;
  }
  public void setSeedId(List<@Pattern(regexp = "^\\d+$")String> seedId) {
    this.seedId = seedId;
  }

  /**
   * Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
   **/
  
  @ApiModelProperty(value = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}")
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }
  public void setUrl(List<String> url) {
    this.url = url;
  }

  /**
   * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")
  @JsonProperty("visitor_source_id")
 @Pattern(regexp="^\\d+$")  public String getVisitorSourceId() {
    return visitorSourceId;
  }
  public void setVisitorSourceId(String visitorSourceId) {
    this.visitorSourceId = visitorSourceId;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
   **/
  
  @ApiModelProperty(example = "{\"=\":[\"web\",\"mobile\"]}", value = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline")
  @JsonProperty("event_source")
  public Object getEventSource() {
    return eventSource;
  }
  public void setEventSource(Object eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
   **/
  
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
  
  @ApiModelProperty(example = "[\"626744528398\"]", value = "Campaign ID for engagement audience filter.")
  @JsonProperty("campaign_id")
  public List<@Pattern(regexp = "^\\d+$")String> getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(List<@Pattern(regexp = "^\\d+$")String> campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Ad ID for engagement audience filter.
   **/
  
  @ApiModelProperty(example = "[\"687201361754\"]", value = "Ad ID for engagement audience filter.")
  @JsonProperty("ad_id")
  public List<@Pattern(regexp = "^\\d+$")String> getAdId() {
    return adId;
  }
  public void setAdId(List<@Pattern(regexp = "^\\d+$")String> adId) {
    this.adId = adId;
  }

  /**
   * Objective for engagement audience filter.
   **/
  
  @ApiModelProperty(example = "[\"AWARENESS\"]", value = "Objective for engagement audience filter.")
  @JsonProperty("objective_type")
  @Valid
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Ad account ID.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
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

