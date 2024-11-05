package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateCreate  {
  
 /**
  * Name of targeting template.
  */
  @ApiModelProperty(example = "Gaming", required = true, value = "Name of targeting template.")
  private String name;

 /**
  * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  private Boolean autoTargetingEnabled = true;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private TargetingSpec targetingAttributes;

  @ApiModelProperty(value = "")
  @Valid
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  @Valid
  private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private TrackingUrls trackingUrls;
 /**
  * Name of targeting template.
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
  public TargetingTemplateCreate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
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
  public TargetingTemplateCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
  * Get targetingAttributes
  * @return targetingAttributes
  */
  @JsonProperty("targeting_attributes")
  @NotNull
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  /**
   * Sets the <code>targetingAttributes</code> property.
   */
 public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   * Sets the <code>targetingAttributes</code> property.
   */
  public TargetingTemplateCreate targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
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
  public TargetingTemplateCreate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
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
  public TargetingTemplateCreate keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
  public TargetingTemplateCreate addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    this.keywords.add(keywordsItem);
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
  public TargetingTemplateCreate trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
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
    TargetingTemplateCreate targetingTemplateCreate = (TargetingTemplateCreate) o;
    return Objects.equals(this.name, targetingTemplateCreate.name) &&
        Objects.equals(this.autoTargetingEnabled, targetingTemplateCreate.autoTargetingEnabled) &&
        Objects.equals(this.targetingAttributes, targetingTemplateCreate.targetingAttributes) &&
        Objects.equals(this.placementGroup, targetingTemplateCreate.placementGroup) &&
        Objects.equals(this.keywords, targetingTemplateCreate.keywords) &&
        Objects.equals(this.trackingUrls, targetingTemplateCreate.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, autoTargetingEnabled, targetingAttributes, placementGroup, keywords, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

