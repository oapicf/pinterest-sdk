package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TimeSeries extends HashMap<String, Integer> {
  
  @ApiModelProperty(value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate date;
 /**
  * Get date
  * @return date
  */
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(LocalDate date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public TimeSeries date(LocalDate date) {
    this.date = date;
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
    TimeSeries timeSeries = (TimeSeries) o;
    return super.equals(o) && Objects.equals(this.date, timeSeries.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeries {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

