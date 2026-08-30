package org.openapitools.model;

import org.openapitools.model.TopVideoPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopVideoPinsSortBy;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TopVideoPinsAnalyticsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("date_availability")
  private TopVideoPinsAnalyticsResponseDateAvailability dateAvailability;

  @JsonProperty("pins")
  private List<TopVideoPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();

  @JsonProperty("sort_by")
  private TopVideoPinsSortBy sortBy;

  /**
   * 
   * @return dateAvailability
   */
  public TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  /**
   * 
   * @return pins
   */
  public List<TopVideoPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  public void setPins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  /**
   * 
   * @return sortBy
   */
  public TopVideoPinsSortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(TopVideoPinsSortBy sortBy) {
    this.sortBy = sortBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse = (TopVideoPinsAnalyticsResponse) o;
    return Objects.equals(this.dateAvailability, topVideoPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(this.pins, topVideoPinsAnalyticsResponse.pins) &&
        Objects.equals(this.sortBy, topVideoPinsAnalyticsResponse.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAvailability, pins, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopVideoPinsAnalyticsResponse {\n");
    
    sb.append("    dateAvailability: ").append(toIndentedString(dateAvailability)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
