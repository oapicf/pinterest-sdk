package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdeColumnType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CustomConversionEventMetrics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomConversionEventMetrics   {
  private AdeColumnType customEventMetricsType;
  private String customEventName;

  public CustomConversionEventMetrics() {
  }

  @JsonCreator
  public CustomConversionEventMetrics(
    @JsonProperty(required = true, value = "custom_event_metrics_type") AdeColumnType customEventMetricsType,
    @JsonProperty(required = true, value = "custom_event_name") String customEventName
  ) {
    this.customEventMetricsType = customEventMetricsType;
    this.customEventName = customEventName;
  }

  /**
   **/
  public CustomConversionEventMetrics customEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "custom_event_metrics_type")
  @NotNull public AdeColumnType getCustomEventMetricsType() {
    return customEventMetricsType;
  }

  @JsonProperty(required = true, value = "custom_event_metrics_type")
  public void setCustomEventMetricsType(AdeColumnType customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
  }

  /**
   * Name of the advertiser-defined custom conversion event
   **/
  public CustomConversionEventMetrics customEventName(String customEventName) {
    this.customEventName = customEventName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the advertiser-defined custom conversion event")
  @JsonProperty(required = true, value = "custom_event_name")
  @NotNull public String getCustomEventName() {
    return customEventName;
  }

  @JsonProperty(required = true, value = "custom_event_name")
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
