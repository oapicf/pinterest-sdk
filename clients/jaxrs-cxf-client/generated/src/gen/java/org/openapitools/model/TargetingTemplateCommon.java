package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateCommon  {
  
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
 /**
   * targeting template name
  **/
  private String name;

  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
 /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  **/
  private Boolean autoTargetingEnabled = true;

  @ApiModelProperty(value = "")
  private TargetingSpec targetingAttributes;

  @ApiModelProperty(value = "")
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @ApiModelProperty(example = "[{\"value\":\"cats\",\"match_type\":\"EXACT_NEGATIVE\"}]", value = "")
  private List<TargetingTemplateKeyword> keywords = new ArrayList<>();

  @ApiModelProperty(value = "")
  private TrackingUrls trackingUrls;
 /**
   * targeting template name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplateCommon name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplateCommon autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
   * Get targetingAttributes
   * @return targetingAttributes
  **/
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplateCommon targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

 /**
   * Get placementGroup
   * @return placementGroup
  **/
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public TargetingTemplateCommon placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
   * Get keywords
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateCommon keywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplateCommon addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public TargetingTemplateCommon trackingUrls(TrackingUrls trackingUrls) {
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
    TargetingTemplateCommon targetingTemplateCommon = (TargetingTemplateCommon) o;
    return Objects.equals(this.name, targetingTemplateCommon.name) &&
        Objects.equals(this.autoTargetingEnabled, targetingTemplateCommon.autoTargetingEnabled) &&
        Objects.equals(this.targetingAttributes, targetingTemplateCommon.targetingAttributes) &&
        Objects.equals(this.placementGroup, targetingTemplateCommon.placementGroup) &&
        Objects.equals(this.keywords, targetingTemplateCommon.keywords) &&
        Objects.equals(this.trackingUrls, targetingTemplateCommon.trackingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, autoTargetingEnabled, targetingAttributes, placementGroup, keywords, trackingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateCommon {\n");
    
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

