package org.openapitools.model;

import org.openapitools.model.AdeColumnType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CustomConversionEventMetrics implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("custom_event_metrics_type")
  private AdeColumnType customEventMetricsType;

  /**
   * Name of the advertiser-defined custom conversion event
   */
  @JsonProperty("custom_event_name")
  private String customEventName;

  /**
   * 
   * @return customEventMetricsType
   */
  public AdeColumnType getCustomEventMetricsType() {
    return customEventMetricsType;
  }

  public void setCustomEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
  }

  /**
   * Name of the advertiser-defined custom conversion event
   * @return customEventName
   */
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
