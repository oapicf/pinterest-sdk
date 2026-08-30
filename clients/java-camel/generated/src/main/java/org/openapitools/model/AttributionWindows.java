package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AttributionWindows
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AttributionWindows {

  private Integer clickWindowDays;

  private Integer engagementWindowDays;

  private Integer viewWindowDays;

  public AttributionWindows clickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Get clickWindowDays
   * @return clickWindowDays
   */
  
  @Schema(name = "click_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window_days")
  public Integer getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AttributionWindows engagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * Get engagementWindowDays
   * @return engagementWindowDays
   */
  
  @Schema(name = "engagement_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_window_days")
  public Integer getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AttributionWindows viewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Get viewWindowDays
   * @return viewWindowDays
   */
  
  @Schema(name = "view_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window_days")
  public Integer getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributionWindows attributionWindows = (AttributionWindows) o;
    return Objects.equals(this.clickWindowDays, attributionWindows.clickWindowDays) &&
        Objects.equals(this.engagementWindowDays, attributionWindows.engagementWindowDays) &&
        Objects.equals(this.viewWindowDays, attributionWindows.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickWindowDays, engagementWindowDays, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributionWindows {\n");
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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

