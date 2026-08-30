package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AdeColumnType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomConversionEventMetrics   {
  
  private AdeColumnType customEventMetricsType;
  private String customEventName;

  public CustomConversionEventMetrics () {

  }

  public CustomConversionEventMetrics (AdeColumnType customEventMetricsType, String customEventName) {
    this.customEventMetricsType = customEventMetricsType;
    this.customEventName = customEventName;
  }

    
  @JsonProperty("custom_event_metrics_type")
  public AdeColumnType getCustomEventMetricsType() {
    return customEventMetricsType;
  }
  public void setCustomEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
  }

    
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
    return Objects.equals(customEventMetricsType, customConversionEventMetrics.customEventMetricsType) &&
        Objects.equals(customEventName, customConversionEventMetrics.customEventName);
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
