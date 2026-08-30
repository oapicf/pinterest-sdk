package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsFeedProcessingScheduleTimezone;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */

@Schema(name = "CatalogsFeedProcessingSchedule", description = "Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedProcessingSchedule {

  private String time;

  private JsonNullable<CatalogsFeedProcessingScheduleTimezone> timezone = JsonNullable.<CatalogsFeedProcessingScheduleTimezone>undefined();

  public CatalogsFeedProcessingSchedule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsFeedProcessingSchedule(String time, CatalogsFeedProcessingScheduleTimezone timezone) {
    this.time = time;
    this.timezone = JsonNullable.of(timezone);
  }

  public CatalogsFeedProcessingSchedule time(String time) {
    this.time = time;
    return this;
  }

  /**
   * A time in format HH:MM with leading 0 (zero)
   * @return time
   */
  @NotNull @Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$") 
  @Schema(name = "time", description = "A time in format HH:MM with leading 0 (zero)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(String time) {
    this.time = time;
  }

  public CatalogsFeedProcessingSchedule timezone(CatalogsFeedProcessingScheduleTimezone timezone) {
    this.timezone = JsonNullable.of(timezone);
    return this;
  }

  /**
   * The timezone considered for the processing schedule time.
   * @return timezone
   */
  @NotNull @Valid 
  @Schema(name = "timezone", description = "The timezone considered for the processing schedule time.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timezone")
  public JsonNullable<CatalogsFeedProcessingScheduleTimezone> getTimezone() {
    return timezone;
  }

  @JsonProperty("timezone")
  public void setTimezone(JsonNullable<CatalogsFeedProcessingScheduleTimezone> timezone) {
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

