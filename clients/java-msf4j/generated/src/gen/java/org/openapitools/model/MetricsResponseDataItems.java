package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MetricsResponseDataItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MetricsResponseDataItems   {
  @JsonProperty("metrics")
  private Object metrics;

  @JsonProperty("targeting_type")
  private String targetingType;

  @JsonProperty("targeting_value")
  private String targetingValue;

  public MetricsResponseDataItems metrics(Object metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
   * @return metrics
  **/
  @ApiModelProperty(required = true, value = "Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).")
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
  **/
  @ApiModelProperty(required = true, value = "The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)")
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
  **/
  @ApiModelProperty(required = true, value = "The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')")
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

