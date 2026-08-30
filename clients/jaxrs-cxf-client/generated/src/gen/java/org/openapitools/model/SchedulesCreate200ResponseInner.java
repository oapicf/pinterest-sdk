package org.openapitools.model;

import org.openapitools.model.SchedulesCreate200ResponseInnerData;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SchedulesCreate200ResponseInner  {
  
  @ApiModelProperty(required = true, value = "")

  private SchedulesCreate200ResponseInnerData data;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public SchedulesCreate200ResponseInnerData getData() {
    return data;
  }

  public void setData(SchedulesCreate200ResponseInnerData data) {
    this.data = data;
  }

  public SchedulesCreate200ResponseInner data(SchedulesCreate200ResponseInnerData data) {
    this.data = data;
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
    SchedulesCreate200ResponseInner schedulesCreate200ResponseInner = (SchedulesCreate200ResponseInner) o;
    return Objects.equals(this.data, schedulesCreate200ResponseInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulesCreate200ResponseInner {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

