package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopVideoPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopVideoPinsSortBy;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TopVideoPinsAnalyticsResponse  {
  
  @ApiModelProperty(value = "")

  private TopVideoPinsAnalyticsResponseDateAvailability dateAvailability;

  @ApiModelProperty(value = "")

  private List<TopVideoPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();

  @ApiModelProperty(value = "")

  private TopVideoPinsSortBy sortBy;
 /**
   * Get dateAvailability
   * @return dateAvailability
  **/
  @JsonProperty("date_availability")
  public TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  public TopVideoPinsAnalyticsResponse dateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

 /**
   * Get pins
   * @return pins
  **/
  @JsonProperty("pins")
  public List<TopVideoPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  public void setPins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  public TopVideoPinsAnalyticsResponse pins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  public TopVideoPinsAnalyticsResponse addPinsItem(TopVideoPinsAnalyticsResponsePinsItems pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

 /**
   * Get sortBy
   * @return sortBy
  **/
  @JsonProperty("sort_by")
  public TopVideoPinsSortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(TopVideoPinsSortBy sortBy) {
    this.sortBy = sortBy;
  }

  public TopVideoPinsAnalyticsResponse sortBy(TopVideoPinsSortBy sortBy) {
    this.sortBy = sortBy;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

