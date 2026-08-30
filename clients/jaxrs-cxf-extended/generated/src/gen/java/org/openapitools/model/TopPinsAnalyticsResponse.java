package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopPinsSortBy;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TopPinsAnalyticsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid TopPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private TopPinsSortBy sortBy;
 /**
  * Get dateAvailability
  * @return dateAvailability
  */
  @JsonProperty("date_availability")
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  /**
   * Sets the <code>dateAvailability</code> property.
   */
 public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  /**
   * Sets the <code>dateAvailability</code> property.
   */
  public TopPinsAnalyticsResponse dateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

 /**
  * Get pins
  * @return pins
  */
  @JsonProperty("pins")
  public List<@Valid TopPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  /**
   * Sets the <code>pins</code> property.
   */
 public void setPins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  /**
   * Sets the <code>pins</code> property.
   */
  public TopPinsAnalyticsResponse pins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  /**
   * Adds a new item to the <code>pins</code> list.
   */
  public TopPinsAnalyticsResponse addPinsItem(TopPinsAnalyticsResponsePinsItems pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

 /**
  * Get sortBy
  * @return sortBy
  */
  @JsonProperty("sort_by")
  public TopPinsSortBy getSortBy() {
    return sortBy;
  }

  /**
   * Sets the <code>sortBy</code> property.
   */
 public void setSortBy(TopPinsSortBy sortBy) {
    this.sortBy = sortBy;
  }

  /**
   * Sets the <code>sortBy</code> property.
   */
  public TopPinsAnalyticsResponse sortBy(TopPinsSortBy sortBy) {
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
    TopPinsAnalyticsResponse topPinsAnalyticsResponse = (TopPinsAnalyticsResponse) o;
    return Objects.equals(this.dateAvailability, topPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(this.pins, topPinsAnalyticsResponse.pins) &&
        Objects.equals(this.sortBy, topPinsAnalyticsResponse.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAvailability, pins, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponse {\n");
    
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

