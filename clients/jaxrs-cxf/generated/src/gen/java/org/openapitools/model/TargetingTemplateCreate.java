package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class TargetingTemplateCreate  {
  
 /**
  * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
  */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).")

  private Boolean autoTargetingEnabled = true;

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
   * Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplateCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
   * Get keywords
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateCreate keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplateCreate addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
   * targeting template name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplateCreate name(String name) {
    this.name = name;
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

  public TargetingTemplateCreate placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
   * targeting profile attributes
   * @return targetingAttributes
  **/
  @JsonProperty("targeting_attributes")
  @NotNull
  public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplateCreate targetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
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
    return Objects.equals(this.autoTargetingEnabled, targetingTemplateCreate.autoTargetingEnabled) &&
        Objects.equals(this.keywords, targetingTemplateCreate.keywords) &&
        Objects.equals(this.name, targetingTemplateCreate.name) &&
        Objects.equals(this.placementGroup, targetingTemplateCreate.placementGroup) &&
        Objects.equals(this.targetingAttributes, targetingTemplateCreate.targetingAttributes) &&
        Objects.equals(this.trackingUrls, targetingTemplateCreate.trackingUrls);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

