package apimodels;

import apimodels.PinterestLibError;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SchedulesCreate200ResponseInnerDataOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SchedulesCreate200ResponseInnerDataOneOf   {
  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("schedule_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String scheduleId;

  @JsonProperty("exceptions")
  @NotNull
@Valid

  private PinterestLibError exceptions;

  public SchedulesCreate200ResponseInnerDataOneOf id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
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
  **/
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
  **/
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
    return Objects.equals(id, schedulesCreate200ResponseInnerDataOneOf.id) &&
        Objects.equals(scheduleId, schedulesCreate200ResponseInnerDataOneOf.scheduleId) &&
        Objects.equals(exceptions, schedulesCreate200ResponseInnerDataOneOf.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scheduleId, exceptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

