package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MetricsResponseDataItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
   */
  @JsonProperty("metrics")
  private Object metrics;

  /**
   * The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
   */
  @JsonProperty("targeting_type")
  private String targetingType;

  /**
   * The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;)
   */
  @JsonProperty("targeting_value")
  private String targetingValue;

  /**
   * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
   * @return metrics
   */
  public Object getMetrics() {
    return metrics;
  }

  public void setMetrics(Object metrics) {
    this.metrics = metrics;
  }

  /**
   * The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
   * @return targetingType
   */
  public String getTargetingType() {
    return targetingType;
  }

  public void setTargetingType(String targetingType) {
    this.targetingType = targetingType;
  }

  /**
   * The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;)
   * @return targetingValue
   */
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
