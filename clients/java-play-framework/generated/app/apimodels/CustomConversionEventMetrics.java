package apimodels;

import apimodels.AdeColumnType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomConversionEventMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomConversionEventMetrics   {
  @JsonProperty("custom_event_metrics_type")
  @NotNull
@Valid

  private AdeColumnType customEventMetricsType;

  @JsonProperty("custom_event_name")
  @NotNull

  private String customEventName;

  public CustomConversionEventMetrics customEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
    return this;
  }

   /**
   * Get customEventMetricsType
   * @return customEventMetricsType
  **/
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
  **/
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
    return Objects.equals(customEventMetricsType, customConversionEventMetrics.customEventMetricsType) &&
        Objects.equals(customEventName, customConversionEventMetrics.customEventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customEventMetricsType, customEventName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

