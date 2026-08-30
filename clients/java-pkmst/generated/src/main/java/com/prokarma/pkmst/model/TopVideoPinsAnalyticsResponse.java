package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.TopVideoPinsAnalyticsResponseDateAvailability;
import com.prokarma.pkmst.model.TopVideoPinsAnalyticsResponsePinsItems;
import com.prokarma.pkmst.model.TopVideoPinsSortBy;
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
 * TopVideoPinsAnalyticsResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopVideoPinsAnalyticsResponse   {
  @JsonProperty("date_availability")
  private TopVideoPinsAnalyticsResponseDateAvailability dateAvailability;

  @JsonProperty("pins")
  
  private List<TopVideoPinsAnalyticsResponsePinsItems> pins = null;

  @JsonProperty("sort_by")
  private TopVideoPinsSortBy sortBy;

  public TopVideoPinsAnalyticsResponse dateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

  /**
   * Get dateAvailability
   * @return dateAvailability
   */
  @ApiModelProperty(value = "")
  public TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  public TopVideoPinsAnalyticsResponse pins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  public TopVideoPinsAnalyticsResponse addPinsItem(TopVideoPinsAnalyticsResponsePinsItems pinsItem) {
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
  public List<TopVideoPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  public void setPins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  public TopVideoPinsAnalyticsResponse sortBy(TopVideoPinsSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
   */
  @ApiModelProperty(value = "")
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

