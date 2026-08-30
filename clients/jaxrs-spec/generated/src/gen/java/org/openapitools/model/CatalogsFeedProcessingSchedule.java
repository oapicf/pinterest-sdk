package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedProcessingScheduleTimezone;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 **/
@ApiModel(description = "Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).")
@JsonTypeName("CatalogsFeedProcessingSchedule")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedProcessingSchedule   {
  private String time;
  private CatalogsFeedProcessingScheduleTimezone timezone;

  public CatalogsFeedProcessingSchedule() {
  }

  @JsonCreator
  public CatalogsFeedProcessingSchedule(
    @JsonProperty(required = true, value = "time") String time,
    @JsonProperty(required = true, value = "timezone") CatalogsFeedProcessingScheduleTimezone timezone
  ) {
    this.time = time;
    this.timezone = timezone;
  }

  /**
   * A time in format HH:MM with leading 0 (zero)
   **/
  public CatalogsFeedProcessingSchedule time(String time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A time in format HH:MM with leading 0 (zero)")
  @JsonProperty(required = true, value = "time")
  @NotNull  @Pattern(regexp="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")public String getTime() {
    return time;
  }

  @JsonProperty(required = true, value = "time")
  public void setTime(String time) {
    this.time = time;
  }

  /**
   * The timezone considered for the processing schedule time.
   **/
  public CatalogsFeedProcessingSchedule timezone(CatalogsFeedProcessingScheduleTimezone timezone) {
    this.timezone = timezone;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timezone considered for the processing schedule time.")
  @JsonProperty(required = true, value = "timezone")
  @NotNull public CatalogsFeedProcessingScheduleTimezone getTimezone() {
    return timezone;
  }

  @JsonProperty(required = true, value = "timezone")
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
    return Objects.equals(this.time, catalogsFeedProcessingSchedule.time) &&
        Objects.equals(this.timezone, catalogsFeedProcessingSchedule.timezone);
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
