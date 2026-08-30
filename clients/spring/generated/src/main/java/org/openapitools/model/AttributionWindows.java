package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AttributionWindows {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer clickWindowDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer engagementWindowDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer viewWindowDays;

  public AttributionWindows clickWindowDays(@Nullable Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Get clickWindowDays
   * @return clickWindowDays
   */
  
  @Schema(name = "click_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window_days")
  public @Nullable Integer getClickWindowDays() {
    return clickWindowDays;
  }

  @JsonProperty("click_window_days")
  public void setClickWindowDays(@Nullable Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AttributionWindows engagementWindowDays(@Nullable Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * Get engagementWindowDays
   * @return engagementWindowDays
   */
  
  @Schema(name = "engagement_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_window_days")
  public @Nullable Integer getEngagementWindowDays() {
    return engagementWindowDays;
  }

  @JsonProperty("engagement_window_days")
  public void setEngagementWindowDays(@Nullable Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AttributionWindows viewWindowDays(@Nullable Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Get viewWindowDays
   * @return viewWindowDays
   */
  
  @Schema(name = "view_window_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window_days")
  public @Nullable Integer getViewWindowDays() {
    return viewWindowDays;
  }

  @JsonProperty("view_window_days")
  public void setViewWindowDays(@Nullable Integer viewWindowDays) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

