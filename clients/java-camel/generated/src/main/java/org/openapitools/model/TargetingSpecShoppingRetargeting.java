package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TargetingSpecShoppingRetargeting
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpecShoppingRetargeting {

  private Integer exclusionWindow;

  private Integer lookbackWindow;

  @Valid
  private List<Integer> tagTypes = new ArrayList<>();

  public TargetingSpecShoppingRetargeting exclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
    return this;
  }

  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   * @return exclusionWindow
   */
  
  @Schema(name = "exclusion_window", example = "14", description = "Number of days ago to stop lookback timeframe for dynamic retargeting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclusion_window")
  public Integer getExclusionWindow() {
    return exclusionWindow;
  }

  public void setExclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
  }

  public TargetingSpecShoppingRetargeting lookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
    return this;
  }

  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   * @return lookbackWindow
   */
  
  @Schema(name = "lookback_window", example = "30", description = "Number of days ago to start lookback timeframe for dynamic retargeting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lookback_window")
  public Integer getLookbackWindow() {
    return lookbackWindow;
  }

  public void setLookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }

  public TargetingSpecShoppingRetargeting tagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
    return this;
  }

  public TargetingSpecShoppingRetargeting addTagTypesItem(Integer tagTypesItem) {
    if (this.tagTypes == null) {
      this.tagTypes = new ArrayList<>();
    }
    this.tagTypes.add(tagTypesItem);
    return this;
  }

  /**
   * Event types to target for dynamic retargeting
   * @return tagTypes
   */
  
  @Schema(name = "tag_types", example = "[0,6]", description = "Event types to target for dynamic retargeting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag_types")
  public List<Integer> getTagTypes() {
    return tagTypes;
  }

  public void setTagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting = (TargetingSpecShoppingRetargeting) o;
    return Objects.equals(this.exclusionWindow, targetingSpecShoppingRetargeting.exclusionWindow) &&
        Objects.equals(this.lookbackWindow, targetingSpecShoppingRetargeting.lookbackWindow) &&
        Objects.equals(this.tagTypes, targetingSpecShoppingRetargeting.tagTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionWindow, lookbackWindow, tagTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecShoppingRetargeting {\n");
    sb.append("    exclusionWindow: ").append(toIndentedString(exclusionWindow)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    tagTypes: ").append(toIndentedString(tagTypes)).append("\n");
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

