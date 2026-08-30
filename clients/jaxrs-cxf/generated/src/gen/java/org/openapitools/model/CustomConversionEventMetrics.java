package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdeColumnType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomConversionEventMetrics  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private AdeColumnType customEventMetricsType;

 /**
  * Name of the advertiser-defined custom conversion event
  */
  @ApiModelProperty(required = true, value = "Name of the advertiser-defined custom conversion event")

  private String customEventName;
 /**
   * Get customEventMetricsType
   * @return customEventMetricsType
  **/
  @JsonProperty("custom_event_metrics_type")
  @NotNull
  public AdeColumnType getCustomEventMetricsType() {
    return customEventMetricsType;
  }

  public void setCustomEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
  }

  public CustomConversionEventMetrics customEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
    return this;
  }

 /**
   * Name of the advertiser-defined custom conversion event
   * @return customEventName
  **/
  @JsonProperty("custom_event_name")
  @NotNull
  public String getCustomEventName() {
    return customEventName;
  }

  public void setCustomEventName(String customEventName) {
    this.customEventName = customEventName;
  }

  public CustomConversionEventMetrics customEventName(String customEventName) {
    this.customEventName = customEventName;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

