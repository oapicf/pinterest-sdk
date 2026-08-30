package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdeColumnType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomConversionEventMetrics
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomConversionEventMetrics {

  private AdeColumnType customEventMetricsType;

  private String customEventName;

  public CustomConversionEventMetrics() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomConversionEventMetrics(AdeColumnType customEventMetricsType, String customEventName) {
    this.customEventMetricsType = customEventMetricsType;
    this.customEventName = customEventName;
  }

  public CustomConversionEventMetrics customEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
    return this;
  }

  /**
   * Get customEventMetricsType
   * @return customEventMetricsType
   */
  @NotNull @Valid 
  @Schema(name = "custom_event_metrics_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("custom_event_metrics_type")
  public AdeColumnType getCustomEventMetricsType() {
    return customEventMetricsType;
  }

  public void setCustomEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
  }

  public CustomConversionEventMetrics customEventName(String customEventName) {
    this.customEventName = customEventName;
    return this;
  }

  /**
   * Name of the advertiser-defined custom conversion event
   * @return customEventName
   */
  @NotNull 
  @Schema(name = "custom_event_name", description = "Name of the advertiser-defined custom conversion event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("custom_event_name")
  public String getCustomEventName() {
    return customEventName;
  }

  public void setCustomEventName(String customEventName) {
    this.customEventName = customEventName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConversionEventMetrics customConversionEventMetrics = (CustomConversionEventMetrics) o;
    return Objects.equals(this.customEventMetricsType, customConversionEventMetrics.customEventMetricsType) &&
        Objects.equals(this.customEventName, customConversionEventMetrics.customEventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customEventMetricsType, customEventName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConversionEventMetrics {\n");
    sb.append("    customEventMetricsType: ").append(toIndentedString(customEventMetricsType)).append("\n");
    sb.append("    customEventName: ").append(toIndentedString(customEventName)).append("\n");
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

