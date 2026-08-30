package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.PlacementGroupType;
import org.openapitools.vertxweb.server.model.TargetingSpecOptimal;
import org.openapitools.vertxweb.server.model.TargetingTemplateKeyword;
import org.openapitools.vertxweb.server.model.TrackingUrls;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingTemplateCreate   {
  
  private Boolean autoTargetingEnabled = true;
  private List<TargetingTemplateKeyword> keywords = new ArrayList<>();
  private String name;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private TargetingSpecOptimal targetingAttributes;
  private TrackingUrls trackingUrls;

  public TargetingTemplateCreate () {

  }

  public TargetingTemplateCreate (Boolean autoTargetingEnabled, List<TargetingTemplateKeyword> keywords, String name, PlacementGroupType placementGroup, TargetingSpecOptimal targetingAttributes, TrackingUrls trackingUrls) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.keywords = keywords;
    this.name = name;
    this.placementGroup = placementGroup;
    this.targetingAttributes = targetingAttributes;
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("keywords")
  public List<TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("targeting_attributes")
  public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }
  public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateCreate targetingTemplateCreate = (TargetingTemplateCreate) o;
    return Objects.equals(autoTargetingEnabled, targetingTemplateCreate.autoTargetingEnabled) &&
        Objects.equals(keywords, targetingTemplateCreate.keywords) &&
        Objects.equals(name, targetingTemplateCreate.name) &&
        Objects.equals(placementGroup, targetingTemplateCreate.placementGroup) &&
        Objects.equals(targetingAttributes, targetingTemplateCreate.targetingAttributes) &&
        Objects.equals(trackingUrls, targetingTemplateCreate.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, keywords, name, placementGroup, targetingAttributes, trackingUrls);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
