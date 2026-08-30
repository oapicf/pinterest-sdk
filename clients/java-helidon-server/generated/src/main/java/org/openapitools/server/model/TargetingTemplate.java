package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PlacementGroupType;
import org.openapitools.server.model.TargetingSpecOptimal;
import org.openapitools.server.model.TargetingTemplateAudienceSizing;
import org.openapitools.server.model.TargetingTemplateKeyword;
import org.openapitools.server.model.TargetingTemplateStatus;
import org.openapitools.server.model.TrackingUrls;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TargetingTemplate   {

    private String adAccountId;
    private Boolean autoTargetingEnabled = true;
    private Integer createdTime;
    private String id;
    private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();
    private String name;
    private PlacementGroupType placementGroup = PlacementGroupType.ALL;
    private TargetingTemplateAudienceSizing sizing;
    private TargetingTemplateStatus status;
    private TargetingSpecOptimal targetingAttributes;
    private TrackingUrls trackingUrls;
    private Integer updatedTime;
    private Boolean valid;

    /**
     * Default constructor.
     */
    public TargetingTemplate() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingTemplate.
     *
     * @param adAccountId The ID of the advertiser that this targeting template belongs to.
     * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
     * @param createdTime Targeting template created time. Unix timestamp in seconds.
     * @param id Targeting template ID.
     * @param keywords keywords
     * @param name targeting template name
     * @param placementGroup placementGroup
     * @param sizing sizing
     * @param status Indicate targeting template is active or Deleted
     * @param targetingAttributes targeting profile attributes
     * @param trackingUrls trackingUrls
     * @param updatedTime Targeting template updated time.Unix timestamp in seconds.
     * @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience)
     */
    public TargetingTemplate(
        String adAccountId, 
        Boolean autoTargetingEnabled, 
        Integer createdTime, 
        String id, 
        List<@Valid TargetingTemplateKeyword> keywords, 
        String name, 
        PlacementGroupType placementGroup, 
        TargetingTemplateAudienceSizing sizing, 
        TargetingTemplateStatus status, 
        TargetingSpecOptimal targetingAttributes, 
        TrackingUrls trackingUrls, 
        Integer updatedTime, 
        Boolean valid
    ) {
        this.adAccountId = adAccountId;
        this.autoTargetingEnabled = autoTargetingEnabled;
        this.createdTime = createdTime;
        this.id = id;
        this.keywords = keywords;
        this.name = name;
        this.placementGroup = placementGroup;
        this.sizing = sizing;
        this.status = status;
        this.targetingAttributes = targetingAttributes;
        this.trackingUrls = trackingUrls;
        this.updatedTime = updatedTime;
        this.valid = valid;
    }



    /**
     * The ID of the advertiser that this targeting template belongs to.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
     * @return autoTargetingEnabled
     */
    public Boolean getAutoTargetingEnabled() {
        return autoTargetingEnabled;
    }

    public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
        this.autoTargetingEnabled = autoTargetingEnabled;
    }

    /**
     * Targeting template created time. Unix timestamp in seconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Targeting template ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get keywords
     * @return keywords
     */
    public List<@Valid TargetingTemplateKeyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
        this.keywords = keywords;
    }

    /**
     * targeting template name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get placementGroup
     * @return placementGroup
     */
    public PlacementGroupType getPlacementGroup() {
        return placementGroup;
    }

    public void setPlacementGroup(PlacementGroupType placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * Get sizing
     * @return sizing
     */
    public TargetingTemplateAudienceSizing getSizing() {
        return sizing;
    }

    public void setSizing(TargetingTemplateAudienceSizing sizing) {
        this.sizing = sizing;
    }

    /**
     * Indicate targeting template is active or Deleted
     * @return status
     */
    public TargetingTemplateStatus getStatus() {
        return status;
    }

    public void setStatus(TargetingTemplateStatus status) {
        this.status = status;
    }

    /**
     * targeting profile attributes
     * @return targetingAttributes
     */
    public TargetingSpecOptimal getTargetingAttributes() {
        return targetingAttributes;
    }

    public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
        this.targetingAttributes = targetingAttributes;
    }

    /**
     * Get trackingUrls
     * @return trackingUrls
     */
    public TrackingUrls getTrackingUrls() {
        return trackingUrls;
    }

    public void setTrackingUrls(TrackingUrls trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    /**
     * Targeting template updated time.Unix timestamp in seconds.
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * Inform if the targeting template is valid (ex. would be false if has revoked audience)
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingTemplate {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
        sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
        sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

