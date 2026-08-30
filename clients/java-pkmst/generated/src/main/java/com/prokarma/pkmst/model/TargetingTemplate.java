package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.PlacementGroupType;
import com.prokarma.pkmst.model.TargetingSpecOptimal;
import com.prokarma.pkmst.model.TargetingTemplateAudienceSizing;
import com.prokarma.pkmst.model.TargetingTemplateKeyword;
import com.prokarma.pkmst.model.TargetingTemplateStatus;
import com.prokarma.pkmst.model.TrackingUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TargetingTemplate
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplate   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled = true;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("id")
  private String id;

  @JsonProperty("keywords")
  
  private List<TargetingTemplateKeyword> keywords = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("placement_group")
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @JsonProperty("sizing")
  private TargetingTemplateAudienceSizing sizing;

  @JsonProperty("status")
  private TargetingTemplateStatus status;

  @JsonProperty("targeting_attributes")
  private TargetingSpecOptimal targetingAttributes;

  @JsonProperty("tracking_urls")
  private TrackingUrls trackingUrls;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("valid")
  private Boolean valid;

  public TargetingTemplate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the advertiser that this targeting template belongs to.
   * @return adAccountId
   */
  @ApiModelProperty(readOnly = true, value = "The ID of the advertiser that this targeting template belongs to.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public TargetingTemplate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
   * @return autoTargetingEnabled
   */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplate createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   * @return createdTime
   */
  @ApiModelProperty(readOnly = true, value = "Targeting template created time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public TargetingTemplate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Targeting template ID.
   * @return id
   */
  @ApiModelProperty(readOnly = true, value = "Targeting template ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TargetingTemplate keywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplate addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
   */
  @ApiModelProperty(value = "")
  public List<TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * targeting template name
   * @return name
   */
  @ApiModelProperty(required = true, value = "targeting template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * Get placementGroup
   * @return placementGroup
   */
  @ApiModelProperty(value = "")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public TargetingTemplate sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
    return this;
  }

  /**
   * Get sizing
   * @return sizing
   */
  @ApiModelProperty(readOnly = true, value = "")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }

  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

  public TargetingTemplate status(TargetingTemplateStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Indicate targeting template is active or Deleted
   * @return status
   */
  @ApiModelProperty(readOnly = true, value = "Indicate targeting template is active or Deleted")
  public TargetingTemplateStatus getStatus() {
    return status;
  }

  public void setStatus(TargetingTemplateStatus status) {
    this.status = status;
  }

  public TargetingTemplate targetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  /**
   * targeting profile attributes
   * @return targetingAttributes
   */
  @ApiModelProperty(required = true, value = "targeting profile attributes")
  public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplate trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @ApiModelProperty(value = "")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public TargetingTemplate updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Targeting template updated time.Unix timestamp in seconds.
   * @return updatedTime
   */
  @ApiModelProperty(readOnly = true, value = "Targeting template updated time.Unix timestamp in seconds.")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public TargetingTemplate valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   * @return valid
   */
  @ApiModelProperty(readOnly = true, value = "Inform if the targeting template is valid (ex. would be false if has revoked audience)")
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
    return Objects.equals(this.adAccountId, targetingTemplate.adAccountId) &&
        Objects.equals(this.autoTargetingEnabled, targetingTemplate.autoTargetingEnabled) &&
        Objects.equals(this.createdTime, targetingTemplate.createdTime) &&
        Objects.equals(this.id, targetingTemplate.id) &&
        Objects.equals(this.keywords, targetingTemplate.keywords) &&
        Objects.equals(this.name, targetingTemplate.name) &&
        Objects.equals(this.placementGroup, targetingTemplate.placementGroup) &&
        Objects.equals(this.sizing, targetingTemplate.sizing) &&
        Objects.equals(this.status, targetingTemplate.status) &&
        Objects.equals(this.targetingAttributes, targetingTemplate.targetingAttributes) &&
        Objects.equals(this.trackingUrls, targetingTemplate.trackingUrls) &&
        Objects.equals(this.updatedTime, targetingTemplate.updatedTime) &&
        Objects.equals(this.valid, targetingTemplate.valid);
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

