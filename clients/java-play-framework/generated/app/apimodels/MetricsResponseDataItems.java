package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MetricsResponseDataItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MetricsResponseDataItems   {
  @JsonProperty("metrics")
  @NotNull

  private Object metrics;

  @JsonProperty("targeting_type")
  @NotNull

  private String targetingType;

  @JsonProperty("targeting_value")
  @NotNull

  private String targetingValue;

  public MetricsResponseDataItems metrics(Object metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
   * @return metrics
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

