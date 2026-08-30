package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EventData;
import org.openapitools.server.model.ObjectiveType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}  ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 */
public class AudienceRule   {

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
    private List<ObjectiveType> objectiveType = new ArrayList<>();
    private Integer percentage;
    private List<String> pinId = new ArrayList<>();
    private Boolean prefill;
    private Integer retentionDays;
    private List<String> seedId = new ArrayList<>();
    private List<String> url = new ArrayList<>();
    private String visitorSourceId;

    /**
     * Default constructor.
     */
    public AudienceRule() {
    // JSON-B / Jackson
    }

    /**
     * Create AudienceRule.
     *
     * @param adAccountId Ad account ID.
     * @param adId Ad ID for engagement audience filter.
     * @param campaignId Campaign ID for engagement audience filter.
     * @param country Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.
     * @param customerListId Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.
     * @param engagementDomain The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.
     * @param engagementType Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.
     * @param engagerType Optional for ENGAGEMENT. Engager type value should be 1-2.
     * @param event A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.
     * @param eventData eventData
     * @param eventSource Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline
     * @param ingestionSource Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api
     * @param objectiveType Objective for engagement audience filter.
     * @param percentage Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
     * @param pinId IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]
     * @param prefill Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.
     * @param retentionDays Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.
     * @param seedId Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.
     * @param url Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}
     * @param visitorSourceId The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.
     */
    public AudienceRule(
        String adAccountId, 
        List<String> adId, 
        List<String> campaignId, 
        String country, 
        String customerListId, 
        List<String> engagementDomain, 
        String engagementType, 
        Integer engagerType, 
        String event, 
        EventData eventData, 
        Object eventSource, 
        Object ingestionSource, 
        List<ObjectiveType> objectiveType, 
        Integer percentage, 
        List<String> pinId, 
        Boolean prefill, 
        Integer retentionDays, 
        List<String> seedId, 
        List<String> url, 
        String visitorSourceId
    ) {
        this.adAccountId = adAccountId;
        this.adId = adId;
        this.campaignId = campaignId;
        this.country = country;
        this.customerListId = customerListId;
        this.engagementDomain = engagementDomain;
        this.engagementType = engagementType;
        this.engagerType = engagerType;
        this.event = event;
        this.eventData = eventData;
        this.eventSource = eventSource;
        this.ingestionSource = ingestionSource;
        this.objectiveType = objectiveType;
        this.percentage = percentage;
        this.pinId = pinId;
        this.prefill = prefill;
        this.retentionDays = retentionDays;
        this.seedId = seedId;
        this.url = url;
        this.visitorSourceId = visitorSourceId;
    }



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
     * Valid countries include: \"US\", \"CA\", and \"GB\".
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Customer list ID. For CUSTOMER_LIST `audience_type`.
     * @return customerListId
     */
    public String getCustomerListId() {
        return customerListId;
    }

    public void setCustomerListId(String customerListId) {
        this.customerListId = customerListId;
    }

    /**
     * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
     * @return engagementDomain
     */
    public List<String> getEngagementDomain() {
        return engagementDomain;
    }

    public void setEngagementDomain(List<String> engagementDomain) {
        this.engagementDomain = engagementDomain;
    }

    /**
     * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
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
     * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
     * @return event
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Get eventData
     * @return eventData
     */
    public EventData getEventData() {
        return eventData;
    }

    public void setEventData(EventData eventData) {
        this.eventData = eventData;
    }

    /**
     * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
     * @return eventSource
     */
    public Object getEventSource() {
        return eventSource;
    }

    public void setEventSource(Object eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
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
     * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
     * @return pinId
     */
    public List<String> getPinId() {
        return pinId;
    }

    public void setPinId(List<String> pinId) {
        this.pinId = pinId;
    }

    /**
     * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
     * @return prefill
     */
    public Boolean getPrefill() {
        return prefill;
    }

    public void setPrefill(Boolean prefill) {
        this.prefill = prefill;
    }

    /**
     * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    /**
     * Audience ID(s). For ACTALIKE `audience_type`.
     * @return seedId
     */
    public List<String> getSeedId() {
        return seedId;
    }

    public void setSeedId(List<String> seedId) {
        this.seedId = seedId;
    }

    /**
     * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
     * @return url
     */
    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    /**
     * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
     * @return visitorSourceId
     */
    public String getVisitorSourceId() {
        return visitorSourceId;
    }

    public void setVisitorSourceId(String visitorSourceId) {
        this.visitorSourceId = visitorSourceId;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

