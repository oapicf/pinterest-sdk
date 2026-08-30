package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PinterestLibError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SchedulesCreate200ResponseInnerDataOneOf  {
  
  @ApiModelProperty(required = true, value = "")

  private String id;

 /**
  * Schedule ID.
  */
  @ApiModelProperty(required = true, value = "Schedule ID.")

  private String scheduleId;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private PinterestLibError exceptions;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchedulesCreate200ResponseInnerDataOneOf id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Schedule ID.
   * @return scheduleId
  **/
  @JsonProperty("schedule_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public SchedulesCreate200ResponseInnerDataOneOf scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

 /**
   * Get exceptions
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  @NotNull
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  public SchedulesCreate200ResponseInnerDataOneOf exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

