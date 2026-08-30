package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingScheduleTimezone;

/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedProcessingSchedule   {
  
  private String time;
  private CatalogsFeedProcessingScheduleTimezone timezone;

  public CatalogsFeedProcessingSchedule () {

  }

  public CatalogsFeedProcessingSchedule (String time, CatalogsFeedProcessingScheduleTimezone timezone) {
    this.time = time;
    this.timezone = timezone;
  }

    
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

    
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
