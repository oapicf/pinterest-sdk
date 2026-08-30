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
import org.openapitools.vertxweb.server.model.TargetingTemplateAudienceSizing;
import org.openapitools.vertxweb.server.model.TargetingTemplateKeyword;
import org.openapitools.vertxweb.server.model.TargetingTemplateStatus;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingTemplate   {
  
  private String adAccountId;
  private Boolean autoTargetingEnabled = true;
  private Integer createdTime;
  private String id;
  private List<TargetingTemplateKeyword> keywords = new ArrayList<>();
  private String name;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private TargetingTemplateAudienceSizing sizing;
  private TargetingTemplateStatus status;
  private TargetingSpecOptimal targetingAttributes;
  private TrackingUrls trackingUrls;
  private Integer updatedTime;
  private Boolean valid;

  public TargetingTemplate () {

  }

  public TargetingTemplate (String adAccountId, Boolean autoTargetingEnabled, Integer createdTime, String id, List<TargetingTemplateKeyword> keywords, String name, PlacementGroupType placementGroup, TargetingTemplateAudienceSizing sizing, TargetingTemplateStatus status, TargetingSpecOptimal targetingAttributes, TrackingUrls trackingUrls, Integer updatedTime, Boolean valid) {
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

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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

    
  @JsonProperty("sizing")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }
  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

    
  @JsonProperty("status")
  public TargetingTemplateStatus getStatus() {
    return status;
  }
  public void setStatus(TargetingTemplateStatus status) {
    this.status = status;
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

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplate targetingTemplate = (TargetingTemplate) o;
    return Objects.equals(adAccountId, targetingTemplate.adAccountId) &&
        Objects.equals(autoTargetingEnabled, targetingTemplate.autoTargetingEnabled) &&
        Objects.equals(createdTime, targetingTemplate.createdTime) &&
        Objects.equals(id, targetingTemplate.id) &&
        Objects.equals(keywords, targetingTemplate.keywords) &&
        Objects.equals(name, targetingTemplate.name) &&
        Objects.equals(placementGroup, targetingTemplate.placementGroup) &&
        Objects.equals(sizing, targetingTemplate.sizing) &&
        Objects.equals(status, targetingTemplate.status) &&
        Objects.equals(targetingAttributes, targetingTemplate.targetingAttributes) &&
        Objects.equals(trackingUrls, targetingTemplate.trackingUrls) &&
        Objects.equals(updatedTime, targetingTemplate.updatedTime) &&
        Objects.equals(valid, targetingTemplate.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, autoTargetingEnabled, createdTime, id, keywords, name, placementGroup, sizing, status, targetingAttributes, trackingUrls, updatedTime, valid);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
