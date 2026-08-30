package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsResponseDataItems   {
  
  private Object metrics;
  private String targetingType;
  private String targetingValue;

  public MetricsResponseDataItems () {

  }

  public MetricsResponseDataItems (Object metrics, String targetingType, String targetingValue) {
    this.metrics = metrics;
    this.targetingType = targetingType;
    this.targetingValue = targetingValue;
  }

    
  @JsonProperty("metrics")
  public Object getMetrics() {
    return metrics;
  }
  public void setMetrics(Object metrics) {
    this.metrics = metrics;
  }

    
  @JsonProperty("targeting_type")
  public String getTargetingType() {
    return targetingType;
  }
  public void setTargetingType(String targetingType) {
    this.targetingType = targetingType;
  }

    
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
    return Objects.equals(metrics, metricsResponseDataItems.metrics) &&
        Objects.equals(targetingType, metricsResponseDataItems.targetingType) &&
        Objects.equals(targetingValue, metricsResponseDataItems.targetingValue);
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
