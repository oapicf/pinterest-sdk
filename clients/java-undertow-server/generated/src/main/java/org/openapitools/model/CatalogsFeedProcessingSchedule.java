/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedProcessingScheduleTimezone;



/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */

@ApiModel(description = "Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedProcessingSchedule   {
  
  private String time;
  private CatalogsFeedProcessingScheduleTimezone timezone;

  /**
   * A time in format HH:MM with leading 0 (zero)
   */
  public CatalogsFeedProcessingSchedule time(String time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A time in format HH:MM with leading 0 (zero)")
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  /**
   * The timezone considered for the processing schedule time.
   */
  public CatalogsFeedProcessingSchedule timezone(CatalogsFeedProcessingScheduleTimezone timezone) {
    this.timezone = timezone;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timezone considered for the processing schedule time.")
  @JsonProperty("timezone")
  public CatalogsFeedProcessingScheduleTimezone getTimezone() {
    return timezone;
  }
  public void setTimezone(CatalogsFeedProcessingScheduleTimezone timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule = (CatalogsFeedProcessingSchedule) o;
    return Objects.equals(time, catalogsFeedProcessingSchedule.time) &&
        Objects.equals(timezone, catalogsFeedProcessingSchedule.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProcessingSchedule {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

