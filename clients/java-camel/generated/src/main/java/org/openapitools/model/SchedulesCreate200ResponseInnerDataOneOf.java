package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PinterestLibError;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SchedulesCreate200ResponseInnerDataOneOf
 */

@JsonTypeName("schedules_create_200_response_inner_data_oneOf")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulesCreate200ResponseInnerDataOneOf implements SchedulesCreate200ResponseInnerData {

  private String id;

  private String scheduleId;

  private PinterestLibError exceptions;

  public SchedulesCreate200ResponseInnerDataOneOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SchedulesCreate200ResponseInnerDataOneOf(String id, String scheduleId, PinterestLibError exceptions) {
    this.id = id;
    this.scheduleId = scheduleId;
    this.exceptions = exceptions;
  }

  public SchedulesCreate200ResponseInnerDataOneOf id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchedulesCreate200ResponseInnerDataOneOf scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Schedule ID.
   * @return scheduleId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "schedule_id", description = "Schedule ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule_id")
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public SchedulesCreate200ResponseInnerDataOneOf exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Get exceptions
   * @return exceptions
   */
  @NotNull @Valid 
  @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulesCreate200ResponseInnerDataOneOf schedulesCreate200ResponseInnerDataOneOf = (SchedulesCreate200ResponseInnerDataOneOf) o;
    return Objects.equals(this.id, schedulesCreate200ResponseInnerDataOneOf.id) &&
        Objects.equals(this.scheduleId, schedulesCreate200ResponseInnerDataOneOf.scheduleId) &&
        Objects.equals(this.exceptions, schedulesCreate200ResponseInnerDataOneOf.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scheduleId, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulesCreate200ResponseInnerDataOneOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

