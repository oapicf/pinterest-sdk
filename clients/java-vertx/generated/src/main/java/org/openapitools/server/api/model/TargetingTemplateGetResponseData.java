package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.PlacementGroupType;
import org.openapitools.server.api.model.TargetingSpec;
import org.openapitools.server.api.model.TargetingTemplateAudienceSizing;
import org.openapitools.server.api.model.TargetingTemplateKeyword;
import org.openapitools.server.api.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingTemplateGetResponseData   {
  
  private String name;
  private Boolean autoTargetingEnabled = true;
  private TargetingSpec targetingAttributes;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private List<TargetingTemplateKeyword> keywords = new ArrayList<>();
  private TrackingUrls trackingUrls;
  private String id;
  private Integer createdTime;
  private Integer updatedTime;
  private String adAccountId;


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
  private TargetingTemplateAudienceSizing sizing;
  private Boolean valid;

  public TargetingTemplateGetResponseData () {

  }

  public TargetingTemplateGetResponseData (String name, Boolean autoTargetingEnabled, TargetingSpec targetingAttributes, PlacementGroupType placementGroup, List<TargetingTemplateKeyword> keywords, TrackingUrls trackingUrls, String id, Integer createdTime, Integer updatedTime, String adAccountId, StatusEnum status, TargetingTemplateAudienceSizing sizing, Boolean valid) {
    this.name = name;
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.targetingAttributes = targetingAttributes;
    this.placementGroup = placementGroup;
    this.keywords = keywords;
    this.trackingUrls = trackingUrls;
    this.id = id;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.adAccountId = adAccountId;
    this.status = status;
    this.sizing = sizing;
    this.valid = valid;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }
  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("keywords")
  public List<TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("sizing")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }
  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
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
    return Objects.equals(name, targetingTemplateGetResponseData.name) &&
        Objects.equals(autoTargetingEnabled, targetingTemplateGetResponseData.autoTargetingEnabled) &&
        Objects.equals(targetingAttributes, targetingTemplateGetResponseData.targetingAttributes) &&
        Objects.equals(placementGroup, targetingTemplateGetResponseData.placementGroup) &&
        Objects.equals(keywords, targetingTemplateGetResponseData.keywords) &&
        Objects.equals(trackingUrls, targetingTemplateGetResponseData.trackingUrls) &&
        Objects.equals(id, targetingTemplateGetResponseData.id) &&
        Objects.equals(createdTime, targetingTemplateGetResponseData.createdTime) &&
        Objects.equals(updatedTime, targetingTemplateGetResponseData.updatedTime) &&
        Objects.equals(adAccountId, targetingTemplateGetResponseData.adAccountId) &&
        Objects.equals(status, targetingTemplateGetResponseData.status) &&
        Objects.equals(sizing, targetingTemplateGetResponseData.sizing) &&
        Objects.equals(valid, targetingTemplateGetResponseData.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, autoTargetingEnabled, targetingAttributes, placementGroup, keywords, trackingUrls, id, createdTime, updatedTime, adAccountId, status, sizing, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateGetResponseData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
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
