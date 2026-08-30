package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplate  {
  
 /**
  * The ID of the advertiser that this targeting template belongs to.
  */
  @ApiModelProperty(value = "The ID of the advertiser that this targeting template belongs to.")
  private String adAccountId;

 /**
  * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
  */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).")
  private Boolean autoTargetingEnabled = true;

 /**
  * Targeting template created time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Targeting template created time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * Targeting template ID.
  */
  @ApiModelProperty(value = "Targeting template ID.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();

 /**
  * targeting template name
  */
  @ApiModelProperty(required = true, value = "targeting template name")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @ApiModelProperty(value = "")
  @Valid
  private TargetingTemplateAudienceSizing sizing;

 /**
  * Indicate targeting template is active or Deleted
  */
  @ApiModelProperty(value = "Indicate targeting template is active or Deleted")
  @Valid
  private TargetingTemplateStatus status;

 /**
  * targeting profile attributes
  */
  @ApiModelProperty(required = true, value = "targeting profile attributes")
  @Valid
  private TargetingSpecOptimal targetingAttributes;

  @ApiModelProperty(value = "")
  @Valid
  private TrackingUrls trackingUrls;

 /**
  * Targeting template updated time.Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Targeting template updated time.Unix timestamp in seconds.")
  private Integer updatedTime;

 /**
  * Inform if the targeting template is valid (ex. would be false if has revoked audience)
  */
  @ApiModelProperty(value = "Inform if the targeting template is valid (ex. would be false if has revoked audience)")
  private Boolean valid;
 /**
  * The ID of the advertiser that this targeting template belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TargetingTemplate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
  * @return autoTargetingEnabled
  */
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
 public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
  public TargetingTemplate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
  * Targeting template created time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TargetingTemplate createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Targeting template ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TargetingTemplate id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get keywords
  * @return keywords
  */
  @JsonProperty("keywords")
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
 public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
  public TargetingTemplate keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
  public TargetingTemplate addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
  * targeting template name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public TargetingTemplate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get placementGroup
  * @return placementGroup
  */
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
 public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
  public TargetingTemplate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
  * Get sizing
  * @return sizing
  */
  @JsonProperty("sizing")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }

  /**
   * Sets the <code>sizing</code> property.
   * <br><em>N.B. <code>sizing</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

  /**
   * Sets the <code>sizing</code> property.
   * <br><em>N.B. <code>sizing</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TargetingTemplate sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
    return this;
  }

 /**
  * Indicate targeting template is active or Deleted
  * @return status
  */
  @JsonProperty("status")
  public TargetingTemplateStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(TargetingTemplateStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TargetingTemplate status(TargetingTemplateStatus status) {
    this.status = status;
    return this;
  }

 /**
  * targeting profile attributes
  * @return targetingAttributes
  */
  @JsonProperty("targeting_attributes")
  @NotNull
  public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  /**
   * Sets the <code>targetingAttributes</code> property.
   */
 public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   * Sets the <code>targetingAttributes</code> property.
   */
  public TargetingTemplate targetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

 /**
  * Get trackingUrls
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public TargetingTemplate trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
  * Targeting template updated time.Unix timestamp in seconds.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TargetingTemplate updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * Inform if the targeting template is valid (ex. would be false if has revoked audience)
  * @return valid
  */
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  /**
   * Sets the <code>valid</code> property.
   * <br><em>N.B. <code>valid</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   * Sets the <code>valid</code> property.
   * <br><em>N.B. <code>valid</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public TargetingTemplate valid(Boolean valid) {
    this.valid = valid;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

