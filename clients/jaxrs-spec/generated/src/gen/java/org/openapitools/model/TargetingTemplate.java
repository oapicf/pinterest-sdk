package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;
import org.openapitools.model.TargetingTemplateAudienceSizing;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TargetingTemplateStatus;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TargetingTemplate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplate   {
  private String adAccountId;
  private Boolean autoTargetingEnabled = true;
  private Integer createdTime;
  private String id;
  private @Valid List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();
  private String name;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private TargetingTemplateAudienceSizing sizing;
  private TargetingTemplateStatus status;
  private TargetingSpecOptimal targetingAttributes;
  private TrackingUrls trackingUrls;
  private Integer updatedTime;
  private Boolean valid;

  public TargetingTemplate() {
  }

  @JsonCreator
  public TargetingTemplate(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "targeting_attributes") TargetingSpecOptimal targetingAttributes
  ) {
    this.name = name;
    this.targetingAttributes = targetingAttributes;
  }

  /**
   * The ID of the advertiser that this targeting template belongs to.
   **/
  public TargetingTemplate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the advertiser that this targeting template belongs to.")
  @JsonProperty("ad_account_id")
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
   **/
  public TargetingTemplate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   **/
  public TargetingTemplate createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(value = "Targeting template created time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Targeting template ID.
   **/
  public TargetingTemplate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Targeting template ID.")
  @JsonProperty("id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public TargetingTemplate keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  @Valid public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplate addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public TargetingTemplate removeKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

    return this;
  }
  /**
   * targeting template name
   **/
  public TargetingTemplate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "targeting template name")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public TargetingTemplate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   **/
  public TargetingTemplate sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sizing")
  @Valid public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }

  @JsonProperty("sizing")
  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

  /**
   * Indicate targeting template is active or Deleted
   **/
  public TargetingTemplate status(TargetingTemplateStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Indicate targeting template is active or Deleted")
  @JsonProperty("status")
  public TargetingTemplateStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(TargetingTemplateStatus status) {
    this.status = status;
  }

  /**
   * targeting profile attributes
   **/
  public TargetingTemplate targetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "targeting profile attributes")
  @JsonProperty(required = true, value = "targeting_attributes")
  @NotNull @Valid public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  @JsonProperty(required = true, value = "targeting_attributes")
  public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   **/
  public TargetingTemplate trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  @Valid public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  @JsonProperty("tracking_urls")
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Targeting template updated time.Unix timestamp in seconds.
   **/
  public TargetingTemplate updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Targeting template updated time.Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   **/
  public TargetingTemplate valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  
  @ApiModelProperty(value = "Inform if the targeting template is valid (ex. would be false if has revoked audience)")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  @JsonProperty("valid")
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
