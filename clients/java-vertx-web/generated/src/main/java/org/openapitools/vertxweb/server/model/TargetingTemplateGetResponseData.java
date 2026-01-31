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
import org.openapitools.vertxweb.server.model.TargetingSpec;
import org.openapitools.vertxweb.server.model.TargetingTemplateAudienceSizing;
import org.openapitools.vertxweb.server.model.TargetingTemplateKeyword;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingTemplateGetResponseData   {
  
  private Boolean autoTargetingEnabled = true;
  private List<TargetingTemplateKeyword> keywords = new ArrayList<>();
  private String name;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private TargetingSpec targetingAttributes;
  private TrackingUrls trackingUrls;
  private String adAccountId;
  private Integer createdTime;
  private String id;
  private TargetingTemplateAudienceSizing sizing;


  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = StatusEnum.ACTIVE;
  private Integer updatedTime;
  private Boolean valid;

  public TargetingTemplateGetResponseData () {

  }

  public TargetingTemplateGetResponseData (Boolean autoTargetingEnabled, List<TargetingTemplateKeyword> keywords, String name, PlacementGroupType placementGroup, TargetingSpec targetingAttributes, TrackingUrls trackingUrls, String adAccountId, Integer createdTime, String id, TargetingTemplateAudienceSizing sizing, StatusEnum status, Integer updatedTime, Boolean valid) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.keywords = keywords;
    this.name = name;
    this.placementGroup = placementGroup;
    this.targetingAttributes = targetingAttributes;
    this.trackingUrls = trackingUrls;
    this.adAccountId = adAccountId;
    this.createdTime = createdTime;
    this.id = id;
    this.sizing = sizing;
    this.status = status;
    this.updatedTime = updatedTime;
    this.valid = valid;
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
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }
  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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

    
  @JsonProperty("sizing")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }
  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
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
    TargetingTemplateGetResponseData targetingTemplateGetResponseData = (TargetingTemplateGetResponseData) o;
    return Objects.equals(autoTargetingEnabled, targetingTemplateGetResponseData.autoTargetingEnabled) &&
        Objects.equals(keywords, targetingTemplateGetResponseData.keywords) &&
        Objects.equals(name, targetingTemplateGetResponseData.name) &&
        Objects.equals(placementGroup, targetingTemplateGetResponseData.placementGroup) &&
        Objects.equals(targetingAttributes, targetingTemplateGetResponseData.targetingAttributes) &&
        Objects.equals(trackingUrls, targetingTemplateGetResponseData.trackingUrls) &&
        Objects.equals(adAccountId, targetingTemplateGetResponseData.adAccountId) &&
        Objects.equals(createdTime, targetingTemplateGetResponseData.createdTime) &&
        Objects.equals(id, targetingTemplateGetResponseData.id) &&
        Objects.equals(sizing, targetingTemplateGetResponseData.sizing) &&
        Objects.equals(status, targetingTemplateGetResponseData.status) &&
        Objects.equals(updatedTime, targetingTemplateGetResponseData.updatedTime) &&
        Objects.equals(valid, targetingTemplateGetResponseData.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, keywords, name, placementGroup, targetingAttributes, trackingUrls, adAccountId, createdTime, id, sizing, status, updatedTime, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateGetResponseData {\n");
    
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
