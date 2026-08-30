package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TopVideoPinsAnalyticsResponseDateAvailability;
import org.openapitools.vertxweb.server.model.TopVideoPinsAnalyticsResponsePinsItems;
import org.openapitools.vertxweb.server.model.TopVideoPinsSortBy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopVideoPinsAnalyticsResponse   {
  
  private TopVideoPinsAnalyticsResponseDateAvailability dateAvailability;
  private List<TopVideoPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();
  private TopVideoPinsSortBy sortBy;

  public TopVideoPinsAnalyticsResponse () {

  }

  public TopVideoPinsAnalyticsResponse (TopVideoPinsAnalyticsResponseDateAvailability dateAvailability, List<TopVideoPinsAnalyticsResponsePinsItems> pins, TopVideoPinsSortBy sortBy) {
    this.dateAvailability = dateAvailability;
    this.pins = pins;
    this.sortBy = sortBy;
  }

    
  @JsonProperty("date_availability")
  public TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }
  public void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

    
  @JsonProperty("pins")
  public List<TopVideoPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }
  public void setPins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

    
  @JsonProperty("sort_by")
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
    return Objects.equals(dateAvailability, topVideoPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(pins, topVideoPinsAnalyticsResponse.pins) &&
        Objects.equals(sortBy, topVideoPinsAnalyticsResponse.sortBy);
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
