package org.openapitools.model;

import org.openapitools.model.CatalogsFeedProcessingScheduleTimezone;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */
public class CatalogsFeedProcessingSchedule implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A time in format HH:MM with leading 0 (zero)
   */
  @JsonProperty("time")
  private String time;

  /**
   * The timezone considered for the processing schedule time.
   */
  @JsonProperty("timezone")
  private CatalogsFeedProcessingScheduleTimezone timezone;

  /**
   * A time in format HH:MM with leading 0 (zero)
   * @return time
   */
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  /**
   * The timezone considered for the processing schedule time.
   * @return timezone
   */
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
