package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdeColumnType;

/**
 * CustomConversionEventMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomConversionEventMetrics   {
  @JsonProperty("custom_event_metrics_type")
  private AdeColumnType customEventMetricsType;

  @JsonProperty("custom_event_name")
  private String customEventName;

  public CustomConversionEventMetrics customEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
    return this;
  }

   /**
   * Get customEventMetricsType
   * @return customEventMetricsType
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "Name of the advertiser-defined custom conversion event")
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

