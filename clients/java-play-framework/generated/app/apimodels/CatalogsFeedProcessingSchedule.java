package apimodels;

import apimodels.CatalogsFeedProcessingScheduleTimezone;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeedProcessingSchedule   {
  @JsonProperty("time")
  @NotNull
@Pattern(regexp="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")

  private String time;

  @JsonProperty("timezone")
  @NotNull
@Valid

  private CatalogsFeedProcessingScheduleTimezone timezone;

  public CatalogsFeedProcessingSchedule time(String time) {
    this.time = time;
    return this;
  }

   /**
   * A time in format HH:MM with leading 0 (zero)
   * @return time
  **/
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public CatalogsFeedProcessingSchedule timezone(CatalogsFeedProcessingScheduleTimezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone considered for the processing schedule time.
   * @return timezone
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

