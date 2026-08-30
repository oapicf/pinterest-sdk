package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MetricsResponseDataItems")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MetricsResponseDataItems   {
  private Object metrics;
  private String targetingType;
  private String targetingValue;

  public MetricsResponseDataItems() {
  }

  @JsonCreator
  public MetricsResponseDataItems(
    @JsonProperty(required = true, value = "metrics") Object metrics,
    @JsonProperty(required = true, value = "targeting_type") String targetingType,
    @JsonProperty(required = true, value = "targeting_value") String targetingValue
  ) {
    this.metrics = metrics;
    this.targetingType = targetingType;
    this.targetingValue = targetingValue;
  }

  /**
   * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
   **/
  public MetricsResponseDataItems metrics(Object metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).")
  @JsonProperty(required = true, value = "metrics")
  @NotNull public Object getMetrics() {
    return metrics;
  }

  @JsonProperty(required = true, value = "metrics")
  public void setMetrics(Object metrics) {
    this.metrics = metrics;
  }

  /**
   * The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
   **/
  public MetricsResponseDataItems targetingType(String targetingType) {
    this.targetingType = targetingType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)")
  @JsonProperty(required = true, value = "targeting_type")
  @NotNull public String getTargetingType() {
    return targetingType;
  }

  @JsonProperty(required = true, value = "targeting_type")
  public void setTargetingType(String targetingType) {
    this.targetingType = targetingType;
  }

  /**
   * The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;)
   **/
  public MetricsResponseDataItems targetingValue(String targetingValue) {
    this.targetingValue = targetingValue;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')")
  @JsonProperty(required = true, value = "targeting_value")
  @NotNull public String getTargetingValue() {
    return targetingValue;
  }

  @JsonProperty(required = true, value = "targeting_value")
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
