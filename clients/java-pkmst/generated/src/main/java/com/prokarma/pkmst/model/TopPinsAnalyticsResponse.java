package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.TopPinsAnalyticsResponseDateAvailability;
import com.prokarma.pkmst.model.TopPinsAnalyticsResponsePinsItems;
import com.prokarma.pkmst.model.TopPinsSortBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TopPinsAnalyticsResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopPinsAnalyticsResponse   {
  @JsonProperty("date_availability")
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;

  @JsonProperty("pins")
  
  private List<TopPinsAnalyticsResponsePinsItems> pins = null;

  @JsonProperty("sort_by")
  private TopPinsSortBy sortBy;

  public TopPinsAnalyticsResponse dateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

  /**
   * Get dateAvailability
   * @return dateAvailability
   */
  @ApiModelProperty(value = "")
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  public TopPinsAnalyticsResponse pins(List<TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  public TopPinsAnalyticsResponse addPinsItem(TopPinsAnalyticsResponsePinsItems pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }

  /**
   * Get pins
   * @return pins
   */
  @ApiModelProperty(value = "")
  public List<TopPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  public void setPins(List<TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  public TopPinsAnalyticsResponse sortBy(TopPinsSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
   */
  @ApiModelProperty(value = "")
  public TopPinsSortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(TopPinsSortBy sortBy) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

