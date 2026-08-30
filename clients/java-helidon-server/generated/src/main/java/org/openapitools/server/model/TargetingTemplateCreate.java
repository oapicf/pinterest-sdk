package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PlacementGroupType;
import org.openapitools.server.model.TargetingSpecOptimal;
import org.openapitools.server.model.TargetingTemplateKeyword;
import org.openapitools.server.model.TrackingUrls;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class TargetingTemplateCreate   {

    private Boolean autoTargetingEnabled = true;
    private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();
    private String name;
    private PlacementGroupType placementGroup = PlacementGroupType.ALL;
    private TargetingSpecOptimal targetingAttributes;
    private TrackingUrls trackingUrls;

    /**
     * Default constructor.
     */
    public TargetingTemplateCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingTemplateCreate.
     *
     * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
     * @param keywords keywords
     * @param name targeting template name
     * @param placementGroup placementGroup
     * @param targetingAttributes targeting profile attributes
     * @param trackingUrls trackingUrls
     */
    public TargetingTemplateCreate(
        Boolean autoTargetingEnabled, 
        List<@Valid TargetingTemplateKeyword> keywords, 
        String name, 
        PlacementGroupType placementGroup, 
        TargetingSpecOptimal targetingAttributes, 
        TrackingUrls trackingUrls
    ) {
        this.autoTargetingEnabled = autoTargetingEnabled;
        this.keywords = keywords;
        this.name = name;
        this.placementGroup = placementGroup;
        this.targetingAttributes = targetingAttributes;
        this.trackingUrls = trackingUrls;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingTemplateCreate {\n");
        
        sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
        sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
        sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
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

