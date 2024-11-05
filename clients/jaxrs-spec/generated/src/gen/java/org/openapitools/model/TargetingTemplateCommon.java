package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TargetingTemplateCommon")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateCommon   {
  private String name;
  private Boolean autoTargetingEnabled = true;
  private TargetingSpec targetingAttributes;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private @Valid List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();
  private TrackingUrls trackingUrls;

  /**
   * targeting template name
   **/
  public TargetingTemplateCommon name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   **/
  public TargetingTemplateCommon autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   **/
  public TargetingTemplateCommon targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_attributes")
  @Valid public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  @JsonProperty("targeting_attributes")
  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   **/
  public TargetingTemplateCommon placementGroup(PlacementGroupType placementGroup) {
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
  public TargetingTemplateCommon keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"value\":\"cats\",\"match_type\":\"EXACT_NEGATIVE\"}]", value = "")
  @JsonProperty("keywords")
  @Valid public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateCommon addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public TargetingTemplateCommon removeKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

    return this;
  }
  /**
   **/
  public TargetingTemplateCommon trackingUrls(TrackingUrls trackingUrls) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

