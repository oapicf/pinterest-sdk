package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PinterestLibError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("schedules_create_200_response_inner_data_oneOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulesCreate200ResponseInnerDataOneOf   {
  private String id;
  private String scheduleId;
  private PinterestLibError exceptions;

  public SchedulesCreate200ResponseInnerDataOneOf() {
  }

  @JsonCreator
  public SchedulesCreate200ResponseInnerDataOneOf(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "schedule_id") String scheduleId,
    @JsonProperty(required = true, value = "exceptions") PinterestLibError exceptions
  ) {
    this.id = id;
    this.scheduleId = scheduleId;
    this.exceptions = exceptions;
  }

  /**
   **/
  public SchedulesCreate200ResponseInnerDataOneOf id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Schedule ID.
   **/
  public SchedulesCreate200ResponseInnerDataOneOf scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schedule ID.")
  @JsonProperty(required = true, value = "schedule_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getScheduleId() {
    return scheduleId;
  }

  @JsonProperty(required = true, value = "schedule_id")
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   **/
  public SchedulesCreate200ResponseInnerDataOneOf exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "exceptions")
  @NotNull @Valid public PinterestLibError getExceptions() {
    return exceptions;
  }

  @JsonProperty(required = true, value = "exceptions")
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
