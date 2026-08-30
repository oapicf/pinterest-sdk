package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
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
 * MetricsResponseDataItems
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MetricsResponseDataItems {

  private Object metrics;

  private String targetingType;

  private String targetingValue;

  public MetricsResponseDataItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MetricsResponseDataItems(Object metrics, String targetingType, String targetingValue) {
    this.metrics = metrics;
    this.targetingType = targetingType;
    this.targetingValue = targetingValue;
  }

  public MetricsResponseDataItems metrics(Object metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
   * @return metrics
   */
  @NotNull 
  @Schema(name = "metrics", description = "Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("metrics")
  public Object getMetrics() {
    return metrics;
  }

  public void setMetrics(Object metrics) {
    this.metrics = metrics;
  }

  public MetricsResponseDataItems targetingType(String targetingType) {
    this.targetingType = targetingType;
    return this;
  }

  /**
   * The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
   * @return targetingType
   */
  @NotNull 
  @Schema(name = "targeting_type", description = "The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targeting_type")
  public String getTargetingType() {
    return targetingType;
  }

  public void setTargetingType(String targetingType) {
    this.targetingType = targetingType;
  }

  public MetricsResponseDataItems targetingValue(String targetingValue) {
    this.targetingValue = targetingValue;
    return this;
  }

  /**
   * The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
   * @return targetingValue
   */
  @NotNull 
  @Schema(name = "targeting_value", description = "The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targeting_value")
  public String getTargetingValue() {
    return targetingValue;
  }

  public void setTargetingValue(String targetingValue) {
    this.targetingValue = targetingValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsResponseDataItems metricsResponseDataItems = (MetricsResponseDataItems) o;
    return Objects.equals(this.metrics, metricsResponseDataItems.metrics) &&
        Objects.equals(this.targetingType, metricsResponseDataItems.targetingType) &&
        Objects.equals(this.targetingValue, metricsResponseDataItems.targetingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, targetingType, targetingValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsResponseDataItems {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    targetingType: ").append(toIndentedString(targetingType)).append("\n");
    sb.append("    targetingValue: ").append(toIndentedString(targetingValue)).append("\n");
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

