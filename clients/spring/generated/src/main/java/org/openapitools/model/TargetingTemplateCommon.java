package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TargetingTemplateCommon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateCommon {

  private String name;

  private Boolean autoTargetingEnabled = true;

  private TargetingSpec targetingAttributes;

  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @Valid
  private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();

  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

  public TargetingTemplateCommon name(String name) {
    this.name = name;
    return this;
  }

  /**
   * targeting template name
   * @return name
   */
  
  @Schema(name = "name", example = "Gaming", description = "targeting template name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplateCommon autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", description = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplateCommon targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  /**
   * Get targetingAttributes
   * @return targetingAttributes
   */
  @Valid 
  @Schema(name = "targeting_attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplateCommon placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * Get placementGroup
   * @return placementGroup
   */
  @Valid 
  @Schema(name = "placement_group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public TargetingTemplateCommon keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplateCommon addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
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
  @Valid 
  @Schema(name = "keywords", example = "[{\"value\":\"cats\",\"match_type\":\"EXACT_NEGATIVE\"}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateCommon trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @Valid 
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<TrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<TrackingUrls> trackingUrls) {
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
        equalsNullable(this.trackingUrls, targetingTemplateCommon.trackingUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, autoTargetingEnabled, targetingAttributes, placementGroup, keywords, hashCodeNullable(trackingUrls));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

